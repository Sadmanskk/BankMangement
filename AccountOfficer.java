
package bankmanagement;


public class AccountOfficer extends Employee {

    private String password;

    public AccountOfficer(String employeeId, String name, double salary, int workingHour) {
        super(employeeId, name, salary, workingHour);
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    void employeeSalary() {

    }
}







