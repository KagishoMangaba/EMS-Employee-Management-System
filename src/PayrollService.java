import java.util.List;

public class PayrollService {
    public void printPayroll(List<Employee> employees) {
        for (Employee e : employees) {
            System.out.println("------------------------------");
            e.printDetails();
        }
    }
}
