public class Student {
    private String studentID;
    private String name;
    private double cgpa;
    private String programme;

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCGPA(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            throw new IllegalArgumentException("CGPA must be between 0.0 and 4.0.");
        }
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }

    public String getProgramme() {
        return programme;
    }
}

