import java.util.ArrayList;

public class Student extends Person{
    private int ID;
    private String course;
    public static ArrayList<Student> students = new ArrayList<Student>();

    public Student(int ID, String course,String name,String lastName) {
        super(name,lastName);
        this.ID = ID;
        this.course = course;
        students.add(this);
    }
    @Override
    public void run()
    {
        System.out.println("the student is :" + this.toString());
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", course='" + course + '\'' +
                '}';
    }
}
