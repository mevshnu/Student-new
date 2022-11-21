import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    ArrayList<Student> studentlist = new ArrayList<Student>();
    //ArrayList<Student> studentlist = new ArrayList<>();

    public static void main(String[] args)
    {
        System.out.println("enter 1 to add data");
        System.out.println("enter 2 to view data");
        System.out.println("enter 3 to search data");
        System.out.println("enter 4 to delete data\n" +
                "enter 5 to exit");
        int x = sc.nextInt();

    }
}
class Student
{
    String name;
    int admissionNo;
    int rollNo;
    String college;

    public Student(String name, int admissionNo, int rollNo, String college)
    {
        this.name = name;
        this.admissionNo = admissionNo;
        this.rollNo = rollNo;
        this.college = college;
    }
}