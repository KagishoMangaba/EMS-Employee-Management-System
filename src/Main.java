public class Main {
    public static void main(String[] args) {


        Employee[] employees = new Employee[5];

        // Initialize employees with different types (subclasses)
        employees[0] = new Manager("Alice Johnson", 101, 35, "Development", 80000, 20, "alice@company.com");
        employees[1] = new juniorDeveloper("Bob Smith", 102, 25, "Development", 50000, 15, "bob@company.com");
        employees[2] = new SeniorDeveloper("Carol Lee", 103, 30, "Development", 70000, 18, "carol@company.com");
        employees[3] = new Employee("David King", 104, 28, "HR", 45000, 20, "david@company.com");
        employees[4] = new Manager("Eve Martinez", 105, 40, "Sales", 85000, 25, "eve@company.com");



    }
}