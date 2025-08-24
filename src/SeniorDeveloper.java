public class SeniorDeveloper extends Employee {

    private String BonusMultiplier;


    public SeniorDeveloper(String name, long id, int age, String department,
                           double baseSalary, int leaveDays, String email, String bonusMultiplier) {

        super(name, id, age, department, baseSalary, leaveDays, email);

        this.BonusMultiplier = bonusMultiplier;
    }




}
