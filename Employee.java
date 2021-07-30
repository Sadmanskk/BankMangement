
package bankmanagement;


 abstract class Employee {
        private String employeeId;
    private String name;
    private double salary;
    private int workingHour;

    public Employee(String employeeId, String name, double salary, int workingHour) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.workingHour = workingHour;
    }

     abstract void employeeSalary();

    public double getSalary() {
        return salary;
    }
}





