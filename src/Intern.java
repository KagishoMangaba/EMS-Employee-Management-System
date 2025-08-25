public class Intern extends Employee{

    String University;

    Intern(String name, long id, int age, String department, double baseSalary,
           int leaveDays, String email , String University) {

        super(name, id, age, department, baseSalary, leaveDays, email);

        this.University = University;

    }

}
