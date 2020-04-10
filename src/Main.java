import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = new String();
        while (!input.equals("end")) {
            input = scanner.nextLine();
            if (input.startsWith("Create a new Student")) {
                Person person = new Person(input.split("\\s")[4], input.split("\\s")[5]);
                Student student = new Student(2, "DM", person.getFirstName(), person.getLastName());
                person = student;
                person.run();
            } else if (input.startsWith("Create a new Professor")) {
                Person person = new Person(input.split("\\s")[4], input.split("\\s")[5]);
                Professor professor = new Professor("Prof", 1, person.getFirstName(), person.getLastName());
                person = professor;
                person.run();
            }
            else if (input.startsWith("Show Student")) {
                for (Student student : Student.students) {
                    System.out.println(student);
                }
            }
            else if (input.startsWith("Show Professors")) {
                for (Professor professor : Professor.professors) {
                    System.out.println(professor);
                }
            }
        }
        System.out.println("The End");

    }
}
