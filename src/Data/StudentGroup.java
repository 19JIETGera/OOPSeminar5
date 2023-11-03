package Data;

import java.util.List;

public class StudentGroup {
    private List<User> student;
    private User teacher;

    public StudentGroup(List<User> student, User teacher) {
        this.student = student;
        this.teacher = teacher;
    }

    public List<User> getStudent() {
        return student;
    }

    public void setStudent(List<User> student) {
        this.student = student;
    }

    public User getTeacher() {
        return teacher;
    }

    public void setTeacher(User teacher) {
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
