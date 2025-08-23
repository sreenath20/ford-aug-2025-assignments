package Online_Digital_Wallet;


import java.util.Collection;
import java.util.Optional;

public interface WalletRepository {
    Customer save(Customer customer);
    Optional<Customer> findById(Integer customerId);
    Optional<Customer> findByEmail(String email);
    Collection<Customer> findAll();
    Customer update(Customer customer);
    boolean existsById(Integer customerId);
    boolean existsByEmail(String email);
    void deleteById(Integer customerId);
}
