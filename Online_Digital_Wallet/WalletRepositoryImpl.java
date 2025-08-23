package Online_Digital_Wallet;


import java.util.*;

public class WalletRepositoryImpl implements WalletRepository {
    private Map<Integer, Customer> customerDatabase = new HashMap<>();

    @Override
    public Customer save(Customer customer) {
        customerDatabase.put(customer.getCustomerId(), customer);
        return customerDatabase.get(customer.getCustomerId());
    }

    @Override
    public Optional<Customer> findById(Integer customerId) {
        return Optional.ofNullable(customerDatabase.get(customerId));
    }

    @Override
    public Optional<Customer> findByEmail(String email) {
        return customerDatabase.values().stream()
                .filter(customer -> customer.getEmail().equals(email))
                .findFirst();
    }

    @Override
    public Collection<Customer> findAll() {
        return customerDatabase.values();
    }

    @Override
    public Customer update(Customer customer) {
        if (customerDatabase.containsKey(customer.getCustomerId())) {
            customerDatabase.put(customer.getCustomerId(), customer);
            return customer;
        }
        return null;
    }

    @Override
    public boolean existsById(Integer customerId) {
        return customerDatabase.containsKey(customerId);
    }

    @Override
    public boolean existsByEmail(String email) {
        return customerDatabase.values().stream()
                .anyMatch(customer -> customer.getEmail().equals(email));
    }

    @Override
    public void deleteById(Integer customerId) {
        customerDatabase.remove(customerId);
    }
}
