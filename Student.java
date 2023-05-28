public class Student {
    private String name;
    private String studentID;
    private String email;
    private String dob;

    // Constructor
    public Student(String name, String studentID, String email, String dob) {
        this.name = name;
        this.studentID = studentID;
        this.email = email;
        this.dob = dob;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setdob(String name) {
        this.name = dob;
    }

    public String getdob() {
        return dob;
    }

    // Override toString() method

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID='" + studentID + '\'' +
                ", email='" + email + '\'' +
                ", Date of birth='" + dob + '\'' +
                '}';
    }
}
