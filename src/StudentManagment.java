import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagment {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<Student>();

    public void AddStudent(Student student){
        students.add(student);
        return;
    }

    public void RemoveStudent(int id){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getId() == id){
                students.remove(i);
                return;
            }
        }
        System.out.println("This student "+id +"is not available ");
    }

    public void UpdateStudents(int id, String FirstName, String LastName, int age){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getId() == id){
                students.get(i).setFirstname(FirstName);
                students.get(i).setLastname(LastName);
                students.get(i).setAge(age);
                return;
            }
        }
        System.out.println("This student " +id +"is not available ");
    }

    public void DisplayStudents(){
        for(Student student : students){
            System.out.println(students);
            return;
        }
    }

    public void displayMenu() {
        boolean running = true;

        while (running) {

            System.out.println("1. Add Student ");
            System.out.println("2. Delete Student ");
            System.out.println("3. Update Student's information ");
            System.out.println("4. Display Students ");
            System.out.println(" 5. Exit ");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Please, enter student's the first name: ");
                    String firstName = scanner.next();

                    System.out.println("Please, enter student's the last name: ");
                    String lastName = scanner.next();

                    System.out.println("Please, enter student's id: ");
                    int id = scanner.nextInt();

                    System.out.println("Please, enter student's age: ");
                    int age = scanner.nextInt();

                    AddStudent(new Student(firstName, lastName, id, age));
                    break;
                case 2:
                    System.out.println("Enter student id to delete: ");
                    int deleteId = scanner.nextInt();
                    RemoveStudent(deleteId);
                    break;
                case 3:
                    System.out.println("Please, enter student's new first name: ");
                    String newFirstName = scanner.next();

                    System.out.println("Please, enter student's new last name: ");
                    String newLastName = scanner.next();

                    System.out.println("Please, enter student's new ID: ");
                    int newId = scanner.nextInt();

                    System.out.println("Please, enter student's new age: ");
                    int newAge = scanner.nextInt();
                    break;
                case 4:
                    DisplayStudents();
                    break;

                case 5:
                    running = false;
                default:
                    System.out.println("There is no choice");
            }

        }
        scanner.close();
    }
}
