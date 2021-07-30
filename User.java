
package bankmanagement;


public class User {
    
          private String name;
    private String accountNum;
    private double balance;


    public User(String name) {
        this.name = name;
    }

    public void checkBalance(AdminOfficer user){
        user.checkBalance();
    }

    public void depositBalance(AdminOfficer ad){
        ad.checkBalance();
    }


    //getter and setter

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }
}



