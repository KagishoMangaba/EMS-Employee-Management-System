public class SeniorDeveloper extends Employee {

    private String[] programmingLanguages;
    private int YearsOfExperience;
    private String[] projectsAssigned;

    public SeniorDeveloper(String name, long id, int age, String department, double baseSalary,
                  int leaveDays, String email , String[] programmingLanguages , int YearsOfExperience , String[] projectsAssigned ) {

        super(name, id, age, department, baseSalary, leaveDays, email );

        this.programmingLanguages = programmingLanguages;
        this.YearsOfExperience = YearsOfExperience;
        this.projectsAssigned = projectsAssigned;



    }


}




