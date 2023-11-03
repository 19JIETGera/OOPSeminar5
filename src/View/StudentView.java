package View;

import Data.Student;
import Data.Teacher;

public class StudentView {
    public void printOnConsole(Student student){
        System.out.println(student.toString());
    }
    public void printOnConsole(Teacher teacher){
        System.out.println(teacher.toString());
    }
}
