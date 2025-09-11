public class Manager extends Employee {

    private int teamSize;
    private double allowance; // e.g., extra pay for being a manager

    // === Constructor ===
    public Manager(String name, long id, int age, String department, double baseSalary,
                   int leaveDays, String email, String birthdate , String startDate, String contractType,
                   int teamSize, double allowance) {

        super(name, id, age, department, baseSalary, leaveDays, email , birthdate);
        this.position = "Manager"; // overrides default Employee position
        this.teamSize = teamSize;
        this.allowance = allowance;
    }

    // === Manager Behaviors ===
    public void conductMeeting(String topic) {
        System.out.println(name + " is conducting a meeting on: " + topic);
    }

    public void approveLeave(String employeeName, int days) {
        System.out.println("Manager " + name + " approved " + days + " days leave for " + employeeName);
    }

    public void assignTask(String employeeName, String task) {
        System.out.println("Manager " + name + " assigned task '" + task + "' to " + employeeName);
    }

    // Manager's salary includes allowance

    public void printSalary() {
        double totalSalary = baseSalary + allowance;
        System.out.println(name + "'s Total Salary (with allowance) is R" + totalSalary);
    }

    // Override printDetails to include Manager-specific info
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Team Size: " + teamSize);
        System.out.println("Manager Allowance: R" + allowance);
    }
}
