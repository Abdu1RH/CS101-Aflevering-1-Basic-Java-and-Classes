public class Employee {
    public String firstName;
    public String lastName;
    public double monthlySalary;

    public Employee (String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;

        if (monthlySalary <= 0) {
            this.monthlySalary = 0.0;
        }

        else {
            this.monthlySalary = monthlySalary;
        }

    }

    public void salaryRaise(double raiseBy10){
    monthlySalary += monthlySalary * (raiseBy10 / 100);
    }


    @Override
    public String toString () {
        return "Employee {" + " First Name: " + firstName + ",  Last Name: " + lastName + ",  Monthly Salary: " + monthlySalary + " }";
    }
}
