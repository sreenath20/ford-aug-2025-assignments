package Online_Digital_Wallet;


import java.util.Collection;
import java.util.Optional;

public class WalletServiceImpl implements WalletService {
    private WalletRepository walletRepository;

    public WalletServiceImpl() {
        this.walletRepository = new WalletRepositoryImpl();
    }

    @Override
    public Customer registerCustomer(Customer customer) throws UserAlreadyExistsException {
        // Check if customer ID already exists
        if (walletRepository.existsById(customer.getCustomerId())) {
            throw new UserAlreadyExistsException(
                    "Customer with ID " + customer.getCustomerId() + " already exists");
        }

        // Check if email already exists
        if (walletRepository.existsByEmail(customer.getEmail())) {
            throw new UserAlreadyExistsException(
                    "Customer with email " + customer.getEmail() + " already exists");
        }

        return walletRepository.save(customer);
    }

    @Override
    public Customer addFunds(Integer customerId, Double amount)
            throws UserNotFoundException, InvalidAmountException {

        validateAmount(amount);

        Optional<Customer> customerOpt = walletRepository.findById(customerId);
        if (customerOpt.isEmpty()) {
            throw new UserNotFoundException("Customer with ID " + customerId + " not found");
        }

        Customer customer = customerOpt.get();
        customer.setBalance(customer.getBalance() + amount);
        return walletRepository.update(customer);
    }

    @Override
    public Customer withdrawFunds(Integer customerId, Double amount)
            throws UserNotFoundException, InvalidAmountException, InsufficientBalanceException {

        validateAmount(amount);

        Optional<Customer> customerOpt = walletRepository.findById(customerId);
        if (customerOpt.isEmpty()) {
            throw new UserNotFoundException("Customer with ID " + customerId + " not found");
        }

        Customer customer = customerOpt.get();
        if (customer.getBalance() < amount) {
            throw new InsufficientBalanceException(
                    "Insufficient balance. Current balance: " + customer.getBalance() +
                            ", Requested amount: " + amount);
        }

        customer.setBalance(customer.getBalance() - amount);
        return walletRepository.update(customer);
    }

    @Override
    public boolean transferFunds(Integer fromCustomerId, Integer toCustomerId, Double amount)
            throws UserNotFoundException, InvalidAmountException, InsufficientBalanceException {

        validateAmount(amount);

        // Find sender
        Optional<Customer> senderOpt = walletRepository.findById(fromCustomerId);
        if (senderOpt.isEmpty()) {
            throw new UserNotFoundException("Sender with ID " + fromCustomerId + " not found");
        }

        // Find receiver
        Optional<Customer> receiverOpt = walletRepository.findById(toCustomerId);
        if (receiverOpt.isEmpty()) {
            throw new UserNotFoundException("Receiver with ID " + toCustomerId + " not found");
        }

        Customer sender = senderOpt.get();
        Customer receiver = receiverOpt.get();

        // Check sufficient balance
        if (sender.getBalance() < amount) {
            throw new InsufficientBalanceException(
                    "Insufficient balance in sender's account. Current balance: " + sender.getBalance());
        }

        // Perform transfer
        sender.setBalance(sender.getBalance() - amount);
        receiver.setBalance(receiver.getBalance() + amount);

        walletRepository.update(sender);
        walletRepository.update(receiver);

        return true;
    }

    @Override
    public Customer getAccountDetails(Integer customerId) throws UserNotFoundException {
        Optional<Customer> customerOpt = walletRepository.findById(customerId);
        if (customerOpt.isEmpty()) {
            throw new UserNotFoundException("Customer with ID " + customerId + " not found");
        }
        return customerOpt.get();
    }

    @Override
    public Collection<Customer> getAllCustomers() throws NoUsersFoundException {
        Collection<Customer> customers = walletRepository.findAll();
        if (customers.isEmpty()) {
            throw new NoUsersFoundException("No customers found in the system");
        }
        return customers;
    }

    private void validateAmount(Double amount) throws InvalidAmountException {
        if (amount == null || amount <= 0) {
            throw new InvalidAmountException("Amount must be positive and greater than zero");
        }
    }
}
