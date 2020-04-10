import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = new String();
        while (input.equals("end")) {
            input = scanner.nextLine();
            Person person = new Person(input.split("\\s")[4], input.split("\\s")[5]);
            if (input.startsWith("Create a new Student")) {
                Student student = new Student(2, "DM", person.getFirstName(), person.getLastName());
                person = student;
                person.run();
            } else if (input.startsWith("Create a new Professor")) {
                Professor professor = new Professor("Prof", 1, person.getFirstName(), person.getLastName());
                person = professor;
                person.run();
            }
            else if (input.startsWith("Show Student")) {
                Student student = new Student(2, "DM", person.getFirstName(), person.getLastName());
                student.toString();
            }
            else if (input.startsWith("Show Professors")) {
                Professor professor = new Professor("Prof", 1, person.getFirstName(), person.getLastName());
                professor.toString();
            }
        }
        System.out.println("The End");

    }
}
