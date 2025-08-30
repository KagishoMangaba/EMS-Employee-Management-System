import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
        addAllInterns(); // add all interns on creation
    }

    // Add any employee
    public void addEmployee(Employee e) {
        employees.add(e);
    }

    // Add 10 interns with all 12 arguments
    private void addAllInterns() {
        employees.add(new Intern("Kagisho Prince Mangaba", 9910110001L, 20, "IT", 5000, 5,
                "kagisho@email.com", "Wits University", "Computer Science", "6", 85, 1));

        employees.add(new Intern("Thabo Mokoena", 9802150002L, 21, "HR", 4800, 4,
                "thabo@email.com", "UP", "Psychology", "12", 75, 2));

        employees.add(new Intern("Siphiwe Dlamini", 9903230003L, 22, "Marketing", 4500, 6,
                "siphiwe@email.com", "UCT", "Business Management", "3", 90, 3));

        employees.add(new Intern("Naledi Khumalo", 9505010004L, 23, "Finance", 5200, 5,
                "naledi@email.com", "Wits University", "Accounting", "6", 60, 1));

        employees.add(new Intern("Lerato Motsepe", 9707070005L, 22, "IT", 5100, 5,
                "lerato@email.com", "UP", "Software Engineering", "6", 95, 3));

        employees.add(new Intern("Siphesihle Ndlovu", 9909120006L, 21, "HR", 4700, 4,
                "siphesihle@email.com", "UCT", "Psychology", "12", 70, 2));

        employees.add(new Intern("Mpho Mthethwa", 9808040007L, 22, "Marketing", 4600, 6,
                "mpho@email.com", "Wits University", "Business", "3", 88, 2));

        employees.add(new Intern("Zinhle Khanyile", 9901010003L, 23, "Finance", 5300, 5,
                "zinhle@email.com", "UP", "Accounting", "6", 82, 2));

        employees.add(new Intern("Thulani Zuma", 9606100002L, 22, "IT", 5000, 5,
                "thulani@email.com", "UCT", "Software Engineering", "6", 77, 1));

        employees.add(new Intern("Amanda Molefe", 9703340004L, 21, "HR", 4800, 4,
                "amanda@email.com", "Wits University", "Psychology", "12", 91, 3));

        employees.add(new SeniorDeveloper("Luyanda Nene", 9501010001L, 25, "IT(QA)", 67600, 15, "LuyandaNene@email.com", new String[]{"Java","Spring Boot","SQL"}, 6 , new String[]{"Login & Authentication Testing", "Payment Gateway Testing", "User Profile Management", "Shopping Cart Functionality", "Notification System QA"}));


    }

    // Display all employees

}
