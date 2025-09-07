

public class Employee {

    protected String name;
    protected long id;
    protected int age;
    protected String department;
    protected double baseSalary;
    protected int leaveDays;
    protected String email;
    protected String position;

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

    protected double performanceRating;
    protected String lastReviewDate;
    protected boolean isActive;
    protected String startDate;
    protected String contractType;

    // Method to calculate annual bonus based on performance
    public double calculateBonus() {
        double bonusPercentage = 0;
        if (performanceRating >= 4.5) bonusPercentage = 0.15; // 15% bonus
        else if (performanceRating >= 4.0) bonusPercentage = 0.10; // 10% bonus
        else if (performanceRating >= 3.5) bonusPercentage = 0.05; // 5% bonus


        return baseSalary * bonusPercentage;

    }

    public double calculateTotalSalary() {
        return baseSalary + calculateBonus();
    }
}
