public class Employee {
    int employeeid;
    int salary;
    static int countofEmployee;

    public Employee(int employeeid, int salary)
    {
        employeeid = this.employeeid;
        salary = this.salary;
        countofEmployee ++;
    }

    public static void main(String[] args)
    {
        Employee e1 = new Employee(100,2000);
        Employee e2 = new Employee(100,2000);
        Employee e3 = new Employee(100,2000);
        Employee e4 = new Employee(100,2000);

        System.out.println("total no of emplyees: " + Employee.countofEmployee );
    }
}
