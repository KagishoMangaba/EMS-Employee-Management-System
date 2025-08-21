

public class Employee {

    String name;
    int id;
    int age;
    String department;
    String position;
    double baseSalary;
    int leaveDays;
    String email;


    Employee(String name , int id , int age , String department , double baseSalary , int leaveDays , String email  ) {

        this.name = name;
        this.id = id;
        this.age = age;
        this.department = department;
        this.baseSalary = baseSalary;
        this.leaveDays = leaveDays;
        this.email = email;
        this.position = "Employee";
    }

    void getSalary() {
        System.out.println(this.name + "'s BaseSalary is " );
    }


}
