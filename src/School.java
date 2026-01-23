import java.util.ArrayList;
public class School {
    public static void main(String[] args)
    {
    ArrayList<Student> list = new ArrayList<Student>();
    Student s1 = new Student("Ram",12);
    list.add(s1);
    Student s2 = new Student("Rahim",81);
        list.add(s2);
    Student s3 = new Student("Albert",41);
        list.add(s3);

    if (list.remove(s1))
    {
        System.out.println("Ram has been removed");
    }

     list.add(0,s1);
    for (Student s: list)
    {
        System.out.println(s.getStudentname() + " - " + s.getRollno());
    }

    list.clear();
    if (list.isEmpty())
    {
        System.out.println("Array is empty! ");
    }






    }


}
