import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Intern extends Employee {

    private String university;
    private String degreeProgram;
    private String internshipDurationMonths;
    private double performanceScore;
    private int learningLevel;   // new variable
    private int learningBonus;   // bonus based on level

    // Constructor
    public Intern(String name, long id, int age, String department, double baseSalary,
                  int leaveDays, String email, String university, String degreeProgram,
                  String internshipDurationMonths, double performanceScore, int learningLevel) {

        super(name, id, age, department, baseSalary, leaveDays, email);

        this.university = university;
        this.degreeProgram = degreeProgram;
        this.internshipDurationMonths = internshipDurationMonths;
        this.performanceScore = performanceScore;
        this.learningLevel = learningLevel;
        this.learningBonus = getBonusFromFile(learningLevel);

        // Assign bonus based on level

    }

    private int getBonusFromFile(int level) {
        Properties props = new Properties();
        try (FileInputStream fis = new FileInputStream("learnerbonus.properties")) {
            props.load(fis);
            return Integer.parseInt(props.getProperty("level" + level, "0"));
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int getLearningLevel() {
        return learningLevel;
    }

    public int getLearningBonus() {
        return learningBonus;
    }

    public void evaluatePerformance() {
        if (performanceScore >= 80) {
            System.out.println("Intern is eligible for a return offer.");
        } else {
            System.out.println("Performance pending improvement...");
        }
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("University: " + university);
        System.out.println("Degree Program: " + degreeProgram);
        System.out.println("Internship Duration: " + internshipDurationMonths + " months");
        System.out.println("Performance Score: " + performanceScore);
        System.out.println("Learning Level: " + learningLevel);
        System.out.println("Learning Bonus: " + learningBonus);
    }
}