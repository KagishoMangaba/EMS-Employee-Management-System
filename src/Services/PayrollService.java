package Services;

public class PayrollService {


    public double calculateNetSalary(double grossSalary, double taxRate, double deductions) {
        double tax = grossSalary * taxRate;
        return grossSalary - tax - deductions;
    }


    public String generatePayslip(String employeeName, double grossSalary, double netSalary) {
        return "Payslip for: " + employeeName + "\n" +
                "Gross Salary: " + grossSalary + "\n" +
                "Net Salary: " + netSalary + "\n";
    }
}