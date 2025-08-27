public class Intern extends Employee{

    private String University;
    private String DegreeProgram;
    private String internshipDurationMonths;
    private double performanceScore;
    private double LearningPerformace1;





    Intern(String name, long id, int age, String department, double baseSalary,
           int leaveDays, String email , String University , String DegreeProgram , String internshipDurationMonths , double performanceScore) {

        super(name, id, age, department, baseSalary, leaveDays, email);


        this.University = University;
        this.DegreeProgram = DegreeProgram;
        this.internshipDurationMonths = internshipDurationMonths;
        this.performanceRating = performanceScore;



    }

    private String getUniversity(){
        return University;
    }
    private String getDegreeProgram(){
        return DegreeProgram;
    }
    private String getInternshipDurationMonths(){
        return internshipDurationMonths;
    }
    private double getPerformanceScore(){
        return performanceScore;
    }

    public void evaluatePerformance(int performanceScore) {
        if(performanceScore >=80)
            System.out.println("Intern is elegible for a return offer");
        else {
            System.out.println("Pending...");
        }

    }

}
