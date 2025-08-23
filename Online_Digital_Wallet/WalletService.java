package Online_Digital_Wallet;


import java.util.Collection;

public interface WalletService {
    Customer registerCustomer(Customer customer) throws UserAlreadyExistsException;
    Customer addFunds(Integer customerId, Double amount) throws UserNotFoundException, InvalidAmountException;
    Customer withdrawFunds(Integer customerId, Double amount) throws UserNotFoundException, InvalidAmountException, InsufficientBalanceException;
    boolean transferFunds(Integer fromCustomerId, Integer toCustomerId, Double amount)
            throws UserNotFoundException, InvalidAmountException, InsufficientBalanceException;
    Customer getAccountDetails(Integer customerId) throws UserNotFoundException;
    Collection<Customer> getAllCustomers() throws NoUsersFoundException;
}
