import java.util.ArrayList;
import java.util.List;

public class StudentManagement<T extends Student> {
    private List<T> studentList;

    public StudentManagement() {
        this.studentList = new ArrayList<>();
    }

    // Add a student to the list
    public void addStudent(T student) {
        studentList.add(student);
        System.out.println("Student added: " + student.getName());
    }

    // Remove a student from the list
    public void removeStudent(T student) {
        if (studentList.remove(student)) {
            System.out.println("Student removed: " + student.getName());
        } else {
            System.out.println("Student not found: " + student.getName());
        }
    }

    // Display all students
    public void displayStudents() {
        for (T student : studentList) {
            System.out.println("Name: " + student.getName());
            System.out.println("ID: " + student.getStudentID());
            System.out.println("Email: " + student.getEmail());
            System.out.println("Date of birth: " + student.getdob());
            System.out.println();
        }
    }

    // Get student by ID
    public T getStudentByID(String studentID) {
        for (T student : studentList) {
            if (student.getStudentID().equals(studentID)) {
                return student;
            }
        }
        return null;
    }
}
