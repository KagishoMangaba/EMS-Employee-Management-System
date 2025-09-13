import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
        addAllInterns();
        addAllJuniorDevelopers();
    }

    // Add any employee
    public void addEmployee(Employee e) {
        employees.add(e);
    }

    // Display all employees
    public void displayAllEmployees() {
        for (Employee e : employees) {
            e.printDetails();
            System.out.println("-------------------");
        }
    }

    // Display employees by type
    public void displayByType(Class<?> type) {
        for (Employee e : employees) {
            if (type.isInstance(e)) {
                e.printDetails();
                System.out.println("-------------------");
            }
        }
    }

    // Add 10 interns
    private void addAllInterns() {
        employees.add(new Intern("Kagisho Prince Mangaba", 9910110001L, 20, "IT", 5000, 5,
                "kagisho@email.com", "11/10/1999",
                "Wits University", "Computer Science", "6", 85, 1));

        employees.add(new Intern("Thabo Mokoena", 9802150002L, 21, "HR", 4800, 4,
                "thabo@email.com", "15/02/1998",
                "UP", "Psychology", "12", 75, 2));

        employees.add(new Intern("Siphiwe Dlamini", 9903230003L, 22, "Marketing", 4500, 6,
                "siphiwe@email.com", "23/03/1999",
                "UCT", "Business Management", "3", 90, 3));

        employees.add(new Intern("Naledi Khumalo", 9505010004L, 23, "Finance", 5200, 5,
                "naledi@email.com", "01/05/1995",
                "Wits University", "Accounting", "6", 60, 1));

        employees.add(new Intern("Lerato Motsepe", 9707070005L, 22, "IT", 5100, 5,
                "lerato@email.com", "07/07/1997",
                "UP", "Software Engineering", "6", 95, 3));

        employees.add(new Intern("Siphesihle Ndlovu", 9909120006L, 21, "HR", 4700, 4,
                "siphesihle@email.com", "12/09/1999",
                "UCT", "Psychology", "12", 70, 2));

        employees.add(new Intern("Mpho Mthethwa", 9808040007L, 22, "Marketing", 4600, 6,
                "mpho@email.com", "04/08/1998",
                "Wits University", "Business", "3", 88, 2));

        employees.add(new Intern("Zinhle Khanyile", 9901010003L, 23, "Finance", 5300, 5,
                "zinhle@email.com", "01/01/1999",
                "UP", "Accounting", "6", 82, 2));

        employees.add(new Intern("Thulani Zuma", 9606100002L, 22, "IT", 5000, 5,
                "thulani@email.com", "10/06/1996",
                "UCT", "Software Engineering", "6", 77, 1));

        employees.add(new Intern("Amanda Molefe", 9703340004L, 21, "HR", 4800, 4,
                "amanda@email.com", "34/03/1997", // adjust if you want real date
                "Wits University", "Psychology", "12", 91, 3));
    }


    // Add 10 junior developers
    private void addAllJuniorDevelopers() {
        employees.add(new JuniorDeveloper("Junior01_Lerato", 9707070001L, 22, "IT", 5200, 5,
                "lerato@email.com", "07/07/1997",
                "Senior01_Luyanda", "Login Module"));

        employees.add(new JuniorDeveloper("Junior02_Naledi", 9505010002L, 23, "Finance", 5300, 5,
                "naledi@email.com", "01/05/1995",
                "Senior02_Sipho", "Accounting App"));

        employees.add(new JuniorDeveloper("Junior03_Kagisho", 9910110003L, 21, "IT", 5000, 5,
                "kagisho@email.com", "11/10/1999",
                "Senior03_Amanda", "E-Commerce Backend"));

        employees.add(new JuniorDeveloper("Junior04_Thabo", 9802150004L, 22, "HR", 4800, 4,
                "thabo@email.com", "15/02/1998",
                "Senior04_Mpho", "Employee Management System"));

        employees.add(new JuniorDeveloper("Junior05_Siphiwe", 9903230005L, 22, "Marketing", 4600, 5,
                "siphiwe@email.com", "23/03/1999",
                "Senior05_Luyanda", "Marketing Analytics"));

        employees.add(new JuniorDeveloper("Junior06_Zinhle", 9901010006L, 23, "Finance", 5100, 5,
                "zinhle@email.com", "01/01/1999",
                "Senior06_Sipho", "Budget Tracker"));

        employees.add(new JuniorDeveloper("Junior07_Thulani", 9606100007L, 22, "IT", 5000, 5,
                "thulani@email.com", "10/06/1996",
                "Senior07_Amanda", "Website Login System"));

        employees.add(new JuniorDeveloper("Junior08_Amanda", 9703340008L, 21, "HR", 4800, 4,
                "amanda@email.com", "34/03/1997", // check real date
                "Senior08_Mpho", "Recruitment Tracker"));

        employees.add(new JuniorDeveloper("Junior09_Lerato", 9707070009L, 23, "IT", 5200, 5,
                "lerato2@email.com", "07/07/1997",
                "Senior09_Luyanda", "Inventory System"));

        employees.add(new JuniorDeveloper("Junior10_Naledi", 9505010010L, 22, "Finance", 5300, 5,
                "naledi2@email.com", "01/05/1995",
                "Senior10_Sipho", "Accounting Dashboard"));
    }

    public List<Employee> getEmployeesByType(Class<?> type) {
        List<Employee> filtered = new ArrayList<>();
        for (Employee e : employees) {
            if (type.isInstance(e)) {
                filtered.add(e);
            }
        }
        return filtered;
    }

    // Returns all employees as a list
    public List<Employee> getAllEmployees() {
        return employees;
    }





}


