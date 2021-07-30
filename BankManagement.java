
package bankmanagement;

import java.util.Scanner;
public class BankManagement {

    public static void main(String[] args) {
           Scanner aas = new Scanner (System.in);
                    AdminOfficer SadMan = new AdminOfficer(
                "M-02",
                "Mr.Master",
                90000,
                8);

        System.out.print("Input New password: ");
        String pass = aas.nextLine();


        
        User user = new User("SadMan");
        user.checkBalance(SadMan);
        
        SadMan.createAccount(pass);
               Receptionist reception = new Receptionist(
                "E-0054",
                "Abul",
                20000,
                8);

        reception.checkBalance(SadMan);
        reception.Deposit(SadMan);


        
        LoanManager loanManager = new LoanManager(
                "E-0012",
                "Brock",
                30000,
                8);
        loanManager.getLoan(SadMan);


       AccountOfficer accountOfficer = new AccountOfficer(
                "E-0025",
                "Babul",
                65000,
                8);
        accountOfficer.createAccount(pass);


        
    }
}




