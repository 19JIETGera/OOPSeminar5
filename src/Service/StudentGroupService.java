package Service;

import Data.Student;
import Data.StudentGroup;
import Data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupService {
    private List<StudentGroup> studentGroups;


    public void createStudentGroups (List<Student> students, Teacher teacher){
        this.studentGroups = (List<StudentGroup>) new StudentGroup(students,teacher);
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }
}
