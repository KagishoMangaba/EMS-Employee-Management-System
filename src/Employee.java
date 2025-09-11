import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Employee {

    protected String name;
    protected long id;

    protected String department;
    protected double baseSalary;
    protected int leaveDays;
    protected String email;
    protected String position;
    private LocalDate birthDate;

    Employee(String name, long id, String department, double baseSalary,
             int leaveDays, String email , String birthDate) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.baseSalary = baseSalary;
        this.leaveDays = leaveDays;
        this.email = email;
        this.position = "Employee"; // default, can be overridden in subclass

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.birthDate = LocalDate.parse(birthDate, formatter);
    }
    public int getAge() {
        return Period.between(this.birthDate, LocalDate.now()).getYears();
    }

    // ✅ Get birthday in same format
    public String getBirthday() {
        return birthDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    void getSalary() {
        System.out.println(this.name + "'s Base Salary is R" + this.baseSalary);
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
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
