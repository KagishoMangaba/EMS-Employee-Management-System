

public class Employee {

    String name;
    long id;             // changed to long for SA ID
    int age;
    String department;
    String position;
    double baseSalary;
    int leaveDays;
    String email;

    Employee(String name, long id, int age, String department, double baseSalary,
             int leaveDays, String email) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.department = department;
        this.baseSalary = baseSalary;
        this.leaveDays = leaveDays;
        this.email = email;
        this.position = "Employee"; // default, can be overridden in subclass
    }

    void getSalary() {
        System.out.println(this.name + "'s Base Salary is R" + this.baseSalary);
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Position: " + position);
        System.out.println("Salary: R" + baseSalary);
        System.out.println("Leave Days: " + leaveDays);
        System.out.println("Email: " + email);
    }
}
