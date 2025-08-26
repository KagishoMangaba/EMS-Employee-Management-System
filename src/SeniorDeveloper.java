public class SeniorDeveloper extends Employee {
    private int completedProjects;

    public SeniorDeveloper(String name, int yearsOfService, double salary, int completedProjects) {
        super(name, yearsOfService, salary);
        this.completedProjects = completedProjects;
    }

    // New method: calculate project bonus
    public double calculateProjectBonus() {
        double bonus = 0;
        if (completedProjects >= 10) {
            bonus = getSalary() * 0.15; // 15% bonus for 10+ projects
        } else if (completedProjects >= 5) {
            bonus = getSalary() * 0.08; // 8% bonus for 5-9 projects
        }


