package day11_layered_project;

public class Wallet implements Comparable<Wallet> {
    private Integer id;
    private String password;
    private String name;
    private Double balance;
    private String email;

    public Wallet(Integer id, String password, String name, Double balance, String email) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.balance = balance;
        this.email = email;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return this.balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Wallet{id=" + this.id + ", password='" + this.password + "', name='" + this.name + "', balance=" + this.balance + ", email='" + this.email + "'}";
    }

    public int compareTo(Wallet o) {
        return this.balance.compareTo(o.getBalance());
    }
}
