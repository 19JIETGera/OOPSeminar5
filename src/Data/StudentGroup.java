package Data;

import java.util.List;

public class StudentGroup {
    private List<Student> student;
    private Teacher teacher;

    public StudentGroup(List<Student> student, Teacher teacher) {
        this.student = student;
        this.teacher = teacher;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + student +
                ", teacher=" + teacher +
                '}';
    }
}
