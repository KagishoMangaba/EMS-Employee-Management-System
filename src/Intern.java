public class Intern extends Employee{

    private String University;
    private String DegreeProgram;
    private String internshipDurationMonths;
    private double performanceScore;
    private int learnerLevel;
    private int learningBonus;





    Intern(String name, long id, int age, String department, double baseSalary,
           int leaveDays, String email , String University , String DegreeProgram , String internshipDurationMonths , double performanceScore,
    String learnerlevel , int learningBonus) {

        super(name, id, age, department, baseSalary, leaveDays, email);


        this.University = University;
        this.DegreeProgram = DegreeProgram;
        this.internshipDurationMonths = internshipDurationMonths;
        this.performanceRating = performanceScore;
        this.performanceScore = performanceScore;

        if(learnerLevel == 1) {
            this.learningBonus = 500;

        }else if(learnerLevel ==  2 ) {
            this.learningBonus = 1000;
        }else if(learnerLevel == 3);
            this.learningBonus = 2000;



    }

     String getUniversity(){
        return University;
    }
     String getDegreeProgram(){
        return DegreeProgram;
    }
     String getInternshipDurationMonths(){
        return internshipDurationMonths;
    }
     double getPerformanceScore(){
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
