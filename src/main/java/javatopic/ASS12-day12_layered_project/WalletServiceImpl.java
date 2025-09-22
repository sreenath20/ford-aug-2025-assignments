package javatopic.day12_layered_project;

import java.util.*;

public class WalletServiceImpl implements WalletService {

    private Map<String,Wallet> userWalletsMap= new HashMap<String,Wallet>();
    private List<Wallet> allWallets= new ArrayList<Wallet>();
    @Override
    public Wallet registerNewUserWallet(Wallet newWallet) throws WalletException {

       if(this.userWalletsMap.containsKey(newWallet.getEmail())){
           throw new WalletException("User wallet already exists,please check your emailid:"+ newWallet.getEmail());

       }
       this.userWalletsMap.put(newWallet.getEmail(),newWallet);
        //admin data storage --user wallet



        return this.userWalletsMap.get(newWallet.getEmail());
    }

    @Override
    public Double addFundsToWalletByEmailId(String emailId, Double amount) throws WalletException {

        if(!this.userWalletsMap.containsKey(emailId)){
            throw new WalletException("please check the email id you entered (" + emailId + ") its does not match with your existing email id");

        }

        else if(amount<=0){
            throw new WalletException("cannot add fund to your wallet ,your amount should more than 0 rupees to add it to your wallet");

        }
        //    private Double updatedAmount
        Double updatedAmount = this.userWalletsMap.get(emailId).getBalance() + amount;
        this.userWalletsMap.get(emailId).setBalance(updatedAmount);
        return this.userWalletsMap.get(emailId).getBalance();

    }

    @Override
    public Double withdrawFromWalletByEmailId(String emailId, Double amount) throws WalletWithdrawException {
        if(!this.userWalletsMap.containsKey(emailId)){
            throw new WalletWithdrawException("The email you entered for withdrawal of amount does not exist,please check email id again:"+emailId);
        }
        if(this.userWalletsMap.get(emailId).getBalance()<amount){
            throw new WalletWithdrawException("Insufficient funds to withdraw from your wallet,your wallet balance is "+this.userWalletsMap.get(emailId).getBalance());
        }
        Double updatedAmount = this.userWalletsMap.get(emailId).getBalance() - amount;
        this.userWalletsMap.get(emailId).setBalance(updatedAmount);
        return this.userWalletsMap.get(emailId).getBalance();
    }

    @Override
    public Boolean transferFunds(String fromEmailId, String toEmailId, Double amount) throws WalletException {

        if(!this.userWalletsMap.containsKey(fromEmailId)){

            throw new WalletException("The Sender Email Id does not exist please check the email id :"+fromEmailId);
        }
        else if(!this.userWalletsMap.containsKey(toEmailId)){

            throw new WalletException("The Receiver Email Id does not exist please check the email id :"+toEmailId);
        }
        else if(this.userWalletsMap.get(fromEmailId).getBalance()<amount){

            throw new WalletException("Insufficient fund amount current balance of Sender email id :"+this.userWalletsMap.get(fromEmailId).getBalance());

        }
        Double updatedAmountSender = this.userWalletsMap.get(fromEmailId).getBalance() - amount;
        this.userWalletsMap.get(fromEmailId).setBalance(updatedAmountSender);
        Double updatedAmountReceiver= this.userWalletsMap.get(toEmailId).getBalance() + amount;
        this.userWalletsMap.get(toEmailId).setBalance(updatedAmountReceiver);
        return true;
    }

    @Override
    public Wallet getUserWalletByEmailId(String userEmailId) throws WalletException {
        if(!this.userWalletsMap.containsKey(userEmailId)){
            throw new WalletException("please check the email id you entered (" + userEmailId + ") its does not match with your existing email id");
        }
        return this.userWalletsMap.get(userEmailId);
    }

    @Override
    public Collection<Wallet> getAllCustomerWallets() throws WalletException {
        allWallets.addAll(this.userWalletsMap.values());
        return allWallets;
    }

    @Override
    public Wallet userLogin(String emailId, String password) throws WalletException {
        if(!userWalletsMap.containsKey(emailId)) {
            throw new WalletException("user does not exists please check the email id you have enter:  " + emailId);
        }
        if(!userWalletsMap.get(emailId).getPassword().equals(password)){
            throw  new WalletException("invalid password,please try again :( ");
        }





        return this.userWalletsMap.get(emailId);
    }

//    Comparator<Employee> employeeSalaryComparator=(e1, e2) -> e2.getSalary().compareTo(e1.getSalary());
//
//    List<Employee> sortedList=employeeList
//            .stream()
//            .sorted(employeeSalaryComparator)
//            .toList();
//        System.out.println("sorted by salary"+sortedList);
    @Override
    public Collection<Wallet> sortCustomerWallets(String Order) throws WalletException {
        Comparator<Wallet> userBalanceAscendingComparator =(u1, u2) -> u1.getBalance().compareTo(u2.getBalance());
        if(Order.equals("Ascending")){
             return userWalletsMap.values()
                    .stream()
                    .sorted(userBalanceAscendingComparator)
                    .toList();


        }
        else if(Order.equals("Descending")){
            Comparator<Wallet> userBalanceDescendingComparator =(u1, u2) -> u2.getBalance().compareTo(u1.getBalance());

                 return userWalletsMap.values()
                        .stream()
                        .sorted(userBalanceDescendingComparator)
                        .toList();


        }
        else{
            throw new WalletException("invalid order,please try again :( ");

        }


    }

    @Override
    public Collection<Wallet> findWalletsByName(String name) throws WalletException {
        return userWalletsMap.values()
                .stream()
                .filter(userWallet -> userWallet.getName().contains(name))
                .toList();

    }

    @Override
    public Collection<Wallet> findWalletsHavingBalanceBetween(Double fromAmount, Double toAmount) throws WalletException {
        return List.of();
    }

    @Override
    public Boolean updateWalletPassword(String emailId, String newPassword) throws WalletException {
        return null;
    }
}
