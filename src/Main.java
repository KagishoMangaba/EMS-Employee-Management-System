public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Thabo", 9001015234087L, 45, "Finance", 45000.00, 20, "thabo.m@company.co.za");
        employees[1] = new Employee("Lerato", 2030512340L, 23, "IT", 18000.00, 15, "lerato.d@company.co.za");
        employees[2] = new Employee("Sipho", 9102075234090L, 32, "IT", 35000.00, 18, "sipho.k@company.co.za");
        employees[3] = new Employee("Nandi", 8809035234012L, 38, "HR", 42000.00, 20, "nandi.m@company.co.za");
        employees[4] = new Employee("Kabelo", 604125234075L, 21, "Marketing", 8000.00, 10, "kabelo.t@company.co.za");

        for (Employee e : employees) {
            e.printDetails();
            e.getSalary();
            System.out.println("-------------------");

        }


    }
}
