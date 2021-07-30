
package bankmanagement;

import java.util.Scanner;

public class LoanManager extends Employee{


    public LoanManager (String employeeId, String name, double salary, int workingHour) {
        super(employeeId, name, salary, workingHour);
    }


    public boolean getLoan(AdminOfficer officer){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("How much amount you want for loan: ");
        int loan =  scanner.nextInt();
        if (officer.getAmount() > loan){
            return false;
        }else return true;
    }

    @Override
    void employeeSalary() {
        System.out.println("Admin Officer salary: " + getSalary() + (getSalary() * 0.1));
    }
}









