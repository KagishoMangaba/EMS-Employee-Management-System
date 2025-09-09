import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class SeniorDeveloper extends Employee {

    private String[] programmingLanguages;
    private int yearsOfExperience;
    private List<String> projectsAssigned;
    private List<Employee> mentees;

    // Constructor
    public SeniorDeveloper(String name, long id, int age, String department, double baseSalary,
                           int leaveDays, String email, String[] programmingLanguages, int yearsOfExperience, String[] initialProjects) {

        super(name, id, age, department, baseSalary, leaveDays, email);

        this.programmingLanguages = programmingLanguages;
        this.yearsOfExperience = yearsOfExperience;
        this.projectsAssigned = new ArrayList<>();
        if (initialProjects != null) {
            for (String project : initialProjects) {
                this.projectsAssigned.add(project);
            }
        }

        this.mentees = new ArrayList<>();
    }

    // Getters and Setters
    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String[] programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }







    }


}












