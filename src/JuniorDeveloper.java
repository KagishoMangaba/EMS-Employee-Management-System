public class JuniorDeveloper extends Employee {


    private String mentor;
    private String projectAssigned;
    private double learningBonus;


    public JuniorDeveloper(String name, long id, int age, String department,
                           double baseSalary, int leaveDays, String email,
                           String mentor, String projectAssigned) {

        super(name, id, age, department, baseSalary, leaveDays, email);

        // Set junior-specific fields
        this.mentor = mentor;
        this.projectAssigned = projectAssigned;
        this.learningBonus = 2000.0;
        this.position = "Junior Developer";
    }


    @Override
    public void getSalary() {
        double totalSalary = baseSalary + learningBonus;
        System.out.println(this.name + "'s Total Salary is R" + totalSalary
                + " (Base: R" + baseSalary + " + Learning Bonus: R" + learningBonus + ")");
    }


    @Override
    public void printDetails() {

        super.printDetails();


        System.out.println("🔹 JUNIOR DEVELOPER INFO:");
        System.out.println("Mentor: " + mentor);
        System.out.println("Assigned Project: " + projectAssigned);
        System.out.println("Learning Bonus: R" + learningBonus);

        double totalSalary = baseSalary + learningBonus;
        System.out.println("Total Salary: R" + totalSalary);
    }


    public String getMentor() {
        return mentor;
    }

    public String getProjectAssigned() {
        return projectAssigned;
    }

    public double getLearningBonus() {
        return learningBonus;
    }


    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public void setProjectAssigned(String projectAssigned) {
        this.projectAssigned = projectAssigned;
    }

    public void setLearningBonus(double learningBonus) {
        this.learningBonus = learningBonus;
    }
}