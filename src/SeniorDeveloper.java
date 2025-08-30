import java.util.ArrayList;
import java.util.List;

public class SeniorDeveloper extends Employee {

    private String[] programmingLanguages;
    private int YearsOfExperience;
    private List<String> projectsAssigned;
    private List<Employee> mentees;

    public SeniorDeveloper(String name, long id, int age, String department, double baseSalary,
                           int leaveDays, String email, String[] programmingLanguages, int YearsOfExperience, String[] projectsAssigned) {

        super(name, id, age, department, baseSalary, leaveDays, email);

        this.programmingLanguages = programmingLanguages;
        this.YearsOfExperience = YearsOfExperience;
        this.projectsAssigned = new ArrayList<>();








    }

    void AssignProject(String project) {

        AssignProject();


    }


}









