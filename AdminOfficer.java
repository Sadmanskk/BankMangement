
package bankmanagement;

import java.util.Scanner;

public class AdminOfficer extends Employee {
    Scanner aas = new Scanner(System.in);
    private int wrongPass = 0;
    private int amount;
    private String password;

    public AdminOfficer(String employeeId, String name, double salary, int workingHour) {
        super(employeeId, name, salary, workingHour);
    }


    public int getWrongPass() {
        return wrongPass;
    }

    public void setWrongPass(int wrongPass) {
        this.wrongPass = wrongPass;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   

    public void createAccount(String pass) {
        try {
            if (password == null) {
                password = pass;
            } else {
                System.out.println("Sorry! You already set your password");
            }

        } catch (Exception a) {
            System.out.println("Invalid Try :(");
        }

    }

    public void checkBalance() {
        if (wrongPass == 5) {
            System.out.println("Account Blocked!!!");
            System.out.println("Please Contact Our Customer Manger For Active Your Accoount");

        } else {
            System.out.print("Enter Your Password: ");
            aas.nextLine();
            String pas = aas.nextLine();
            if (pas.equals(password)) {
                System.out.println("Your Current Balance is: " + amount);
            } else {
                System.out.println("Thank You for Banking with us :)");
            }
        }
    }

    public void withdrawAmount(Receptionist r, AdminOfficer officer) {
        try {
            if (wrongPass == 5) {
                System.out.println("Account Blocked!!!");
                System.out.println("Please Contuct Our Customer Manger For Active Your Accoount");
            } else {
                System.out.print("Enter Amount: ");
                int taka = aas.nextInt();
                aas.nextLine();
                System.out.print("Enter Password: ");
                String pas = aas.nextLine();

                if (taka > amount) {
                    System.out.println("\n\nYou Have less amount of " + taka + " Taka");
                    System.out.println("Your Current Balance is: " + amount);
                    System.out.println("* Press 2 for Check Balance");
                    System.out.println("* Press 3 for Withdraw");
                    System.out.println("* Press 4 for exit");
                    int ck = aas.nextInt();

                    
                    if (ck == 2)
                        checkBalance();
                    else if (ck == 3)
                        withdrawAmount(r, officer);
                    else {
                        System.out.println("Thank You for Banking with us :)");
                    }
                } else if (taka == 0) {
                    System.out.println("Please Input Valid Amount :/ ");
                    System.out.println("* Press 2 for Check Balance");
                    System.out.println("* Press 3 for Withdraw");
                    System.out.println("* Press 4 for exit");
                    int ck = aas.nextInt();

                 
                    if (ck == 2)
                        checkBalance();
                    else if (ck == 3)
                        withdrawAmount(r, officer);
                    else {
                        System.out.println("Thank You for Banking with us :)");
                    }
                } else {
                    if (pas.equals(password)) {
                        amount -= taka;
                        System.out.println("Success!!!");
                        System.out.println("Your New Balance is: " + amount);
                        System.out.println("* Press 2 for Check Balance");
                        System.out.println("* Press 3 for Withdraw");
                        System.out.println("* Press 4 for exit");

                        int ck = aas.nextInt();
                     
                        if (ck == 2)
                            checkBalance();
                        else if (ck == 3)
                            withdrawAmount(r, officer);
                        else {
                            System.out.println("Thank You for Banking with us :)");
                        }
                    } else {
                        ++wrongPass;
                        int az = 5 - wrongPass;
                        if (az == 0) {
                            System.out.println("\n\n\nAccount Blocked!!!");
                            System.out.println("Please Contuct Our Customer Manger For Active Your Accoount\n\n\n");
                        } else {
                            System.out.println("Inavalid Password." + az + " Chances is Avaiable\n\n");
                            System.out.println("* Press 2 for Check Balance");
                            System.out.println("* Press 3 for Withdraw");
                            System.out.println("* Press 4 for exit");

                            int ck = aas.nextInt();
                            
                            if (ck == 2)
                                checkBalance();
                            else if (ck == 3)
                                withdrawAmount(r, officer);
                            else {
                                System.out.println("Thank You for Banking with us :)");
                            }
                        }

                    }
                }

            }
        } catch (Exception a) {
            System.out.println("Invalid Try!!! :( ");
        }
    }

    @Override
    void employeeSalary() {
        System.out.println("Admin Officer salary: " + getSalary() + (getSalary() * 0.2));
    }
}

    
    

