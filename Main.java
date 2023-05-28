import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagement<Student> studentManagement = new StudentManagement<>();

        Scanner scanner = new Scanner(System.in);

        //Main UI display
        boolean running = true;
        while (running) {
            System.out.println("---------- Student Management System ----------");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Quit");
            System.out.println("-----------------------------------------------");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character after reading the integer input

            //Action referenced by number
            switch (choice) {
                //Student appending
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter student ID: ");
                    String studentID = scanner.nextLine();

                    System.out.print("Enter student email: ");
                    String email = scanner.nextLine();

                    System.out.print("Enter student date of birth (Format DD/MM/YYYY): ");
                    String dob = scanner.nextLine();

                    Student student = new Student(name, studentID, email, dob);
                    studentManagement.addStudent(student);
                    break;

                    //Student removing
                case 2:
                    System.out.print("Enter student ID to remove: ");
                    String idToRemove = scanner.nextLine();
                    Student studentToRemove = studentManagement.getStudentByID(idToRemove);
                    if (studentToRemove != null) {
                        studentManagement.removeStudent(studentToRemove);
                    } else {
                        System.out.println("Student not found with ID: " + idToRemove);
                    }
                    break;

                    //Student list diaplying
                case 3:
                    System.out.println("All students:");
                    studentManagement.displayStudents();
                    break;

                    //Program break
                case 4:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        }

        scanner.close();
    }
}
