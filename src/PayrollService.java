import java.util.List;

public class PayrollService {
    public void printPayroll(List<Employee> employees) {
        for (Employee e : employees) {
            e.printDetails();
            System.out.println("Total Salary (Base + Bonus): R" + e.calculateTotalSalary());
            System.out.println("-------------------");
        }
    }
}
