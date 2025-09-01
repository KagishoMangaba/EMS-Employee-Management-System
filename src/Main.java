public class Main {
    public static void main(String[] args) {
        // Create EmployeeManager and populate with interns, juniors, and seniors
        EmployeeManager manager = new EmployeeManager();

        System.out.println("=== ALL EMPLOYEES ===");
        manager.displayAllEmployees();  // Polymorphism ensures each class prints correctly

        System.out.println("\n=== ONLY JUNIOR DEVELOPERS ===");
        manager.displayByType(JuniorDeveloper.class);

        System.out.println("\n=== ONLY SENIOR DEVELOPERS ===");
        manager.displayByType(SeniorDeveloper.class);

        System.out.println("\n=== ONLY INTERNS ===");
        manager.displayByType(Intern.class);
    }
}
