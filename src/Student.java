import java.util.ArrayList;
public class Student {
    private String Firstname;
    private String Lastname;
    private int id;
    private int age;
    ArrayList<Student> students;


    public Student(String firstname, String lastname, int id, int age) {
        Firstname = firstname;
        Lastname = lastname;
        this.id = id;
        this.age = age;
    }

    public Student() {

    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Firstname='" + Firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

}
