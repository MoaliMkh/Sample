import java.util.ArrayList;

public class Professor extends Person{
    private String rank;
    private int ID;
    public static ArrayList<Professor> professors = new ArrayList<Professor>();
    public Professor(String rank, int ID,String name,String lastName) {
        super(name,lastName);
        this.rank = rank;
        this.ID = ID;
        professors.add(this);
    }
    @Override
    public void run()
    {
        System.out.println("the Professor is :" + this.toString());
    }

    @Override
    public String toString() {
        return "Professor{" +
                "rank='" + rank + '\'' +
                ", ID=" + ID +
                '}';
    }
}
