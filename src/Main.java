import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        PayrollService payroll = new PayrollService();
        Scanner sc = new Scanner(System.in);

        System.out.println("Select payroll type:");
        System.out.println("1 - All Employees");
        System.out.println("2 - Interns");
        System.out.println("3 - Junior Developers");
        System.out.println("4 - Senior Developers");
        int choice = sc.nextInt();

        List<Employee> selectedEmployees;

        switch (choice) {
            case 1 -> selectedEmployees = manager.getAllEmployees();
            case 2 -> selectedEmployees = manager.getEmployeesByType(Intern.class);
            case 3 -> selectedEmployees = manager.getEmployeesByType(JuniorDeveloper.class);
            case 4 -> selectedEmployees = manager.getEmployeesByType(SeniorDeveloper.class);
            default -> {
                System.out.println("Invalid choice! Defaulting to all employees.");
                selectedEmployees = manager.getAllEmployees();
            }
        }

        payroll.printPayroll(selectedEmployees);
        sc.close();
    }


}
