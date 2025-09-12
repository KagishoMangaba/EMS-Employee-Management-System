import java.util.ArrayList;
import java.util.List;

public class SeniorDeveloper extends Employee {

    private String[] programmingLanguages;
    private int yearsOfExperience;
    private List<String> projectsAssigned;
    private List<Employee> mentees;

    // Constructor
    public SeniorDeveloper(String name, long id, String department, double baseSalary,
                           int leaveDays, String email, String birthdate,
                           String[] programmingLanguages, int yearsOfExperience, String[] initialProjects) {

        super(name, id, department, baseSalary, leaveDays, email, birthdate);

        this.programmingLanguages = programmingLanguages;
        this.yearsOfExperience = yearsOfExperience;
        this.projectsAssigned = new ArrayList<>();
        if (initialProjects != null) {
            for (String project : initialProjects) {
                this.projectsAssigned.add(project);
            }
        }
        this.mentees = new ArrayList<>();
        this.position = "Senior Developer";
    }

    // --- Getters and Setters ---
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

    public List<String> getProjectsAssigned() {
        return projectsAssigned;
    }

    public void assignProject(String project) {
        this.projectsAssigned.add(project);
    }

    public List<Employee> getMentees() {
        return mentees;
    }

    public void addMentee(Employee e) {
        this.mentees.add(e);
    }

    // --- Override printDetails to show extra info ---
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.print("Programming Languages: ");
        if (programmingLanguages != null) {
            for (String lang : programmingLanguages) {
                System.out.print(lang + " ");
            }
        }
        System.out.println();
        System.out.println("Projects Assigned: " + projectsAssigned);
        System.out.println("Mentees Count: " + mentees.size());
    }
}
