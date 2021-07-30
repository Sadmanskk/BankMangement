
package bankmanagement;

import java.util.Scanner;

public class Receptionist extends Employee{
    private Scanner aas = new Scanner(System.in);

        public Receptionist(String employeeId, String name, double salary, int workingHour) {
        super(employeeId, name, salary, workingHour);
    }



    public void Deposit(AdminOfficer officer){
            System.out.print("Enter Deposit Amount: ");
            int am = aas.nextInt();
            officer.setAmount(officer.getAmount()+am);

            System.out.println("Successfully Deposit Money\n\n");
    }

    public void checkBalance(AdminOfficer b) {
        b.checkBalance();
    }

    @Override
    void employeeSalary() {
        System.out.println("Admin Officer salary: " + getSalary() + (getSalary() * 0.05));
    }
}
