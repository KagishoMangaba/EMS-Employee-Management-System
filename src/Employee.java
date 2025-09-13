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

    // Optional fields for performance tracking
    protected double performanceRating;
    protected String lastReviewDate;
    protected boolean isActive;
    protected String startDate;
    protected String contractType;

    // Constructor
    public Employee(String name, long id, String department, double baseSalary,
                    int leaveDays, String email, String birthDate) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.baseSalary = baseSalary;
        this.leaveDays = leaveDays;
        this.email = email;
        this.position = "Employee"; // default

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.birthDate = LocalDate.parse(birthDate, formatter);
        this.isActive = true;
    }

    // Get employee age
    public int getAge() {
        return Period.between(this.birthDate, LocalDate.now()).getYears();
    }

    // Get birthday in dd/MM/yyyy format
    public String getBirthday() {
        return birthDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    // Print basic employee details
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Position: " + position);
        System.out.println("Salary: R" + baseSalary);
        System.out.println("Leave Days: " + leaveDays);
        System.out.println("Email: " + email);
    }

    // Print base salary
    public void getSalary() {
        System.out.println(name + "'s Base Salary is R" + baseSalary);
    }

    // Calculate bonus based on performance
    public double calculateBonus() {
        double bonusPercentage = 0;

        if (performanceRating >= 4.5) bonusPercentage = 0.15; // 15%
        else if (performanceRating >= 4.0) bonusPercentage = 0.10; // 10%
        else if (performanceRating >= 3.5) bonusPercentage = 0.05; // 5%

        return baseSalary * bonusPercentage;
    }

    // Calculate total salary including bonus
    public double calculateTotalSalary() {
        return baseSalary + calculateBonus();
    }

    // Setters for performance and contract info
    public void setPerformanceRating(double rating) {
        this.performanceRating = rating;
    }

    public void setLastReviewDate(String lastReviewDate) {
        this.lastReviewDate = lastReviewDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public void deactivateEmployee() {
        this.isActive = false;
    }

    public boolean isActive() {
        return isActive;
    }
}
