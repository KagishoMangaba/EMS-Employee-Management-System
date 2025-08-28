public class Main {
    public static void main(String[] args) {

        // Create an array to store 10 interns
        Intern[] interns = new Intern[10];

        interns[0] = new Intern("Kagisho Prince Mangaba", 9910110001L, 20, "IT", 5000, 5,
                "kagisho@email.com", "Wits University", "Computer Science", "6", 85, 1);

        interns[1] = new Intern("Thabo Mokoena", 9802150002L, 21, "HR", 4800, 4,
                "thabo@email.com", "UP", "Psychology", "12", 75, 2);

        interns[2] = new Intern("Siphiwe Dlamini", 9903230003L, 22, "Marketing", 4500, 6,
                "siphiwe@email.com", "UCT", "Business Management", "3", 90, 3);

        interns[3] = new Intern("Naledi Khumalo", 0005010004L, 23, "Finance", 5200, 5,
                "naledi@email.com", "Wits University", "Accounting", "6", 60, 1);

        interns[4] = new Intern("Lerato Motsepe", 0107070005L, 22, "IT", 5100, 5,
                "lerato@email.com", "UP", "Software Engineering", "6", 95, 3);

        interns[5] = new Intern("Siphesihle Ndlovu", 9909120006L, 21, "HR", 4700, 4,
                "siphesihle@email.com", "UCT", "Psychology", "12", 70, 2);

        interns[6] = new Intern("Mpho Mthethwa", 9808040007L, 22, "Marketing", 4600, 6,
                "mpho@email.com", "Wits University", "Business", "3", 88, 2);

        interns[7] = new Intern("Zinhle Khanyile", 0101010006L, 23, "Finance", 5300, 5,
                "zinhle@email.com", "UP", "Accounting", "6", 82, 2);

        interns[8] = new Intern("Thulani Zuma", 0006100005L, 22, "IT", 5000, 5,
                "thulani@email.com", "UCT", "Software Engineering", "6", 77, 1);

        interns[9] = new Intern("Amanda Molefe", 010003232442L, 21, "HR", 4800, 4,
                "amanda@email.com", "Wits University", "Psychology", "12", 91, 3);

        // Loop through interns to print details and evaluate performance
        for (Intern intern : interns) {
            intern.printDetails();
            intern.evaluatePerformance();
            System.out.println("-----");
        }
    }
}
