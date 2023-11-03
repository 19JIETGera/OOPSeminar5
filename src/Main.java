import Controler.Controler;
import Data.Student;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controler controler = new Controler();
        controler.createStudent("1", "1","1","1");
        controler.createStudent("2", "2","2","2");
        controler.getAllStudent();
        controler.createStudent("3", "3","3","3");
        controler.createStudent("4", "4","4","4");
        controler.getAllStudent();
        controler.createTeacher("1", "2", "3", "4");
        controler.createSudentGroup(controler.getStudent(),controler.getTeacher());
        System.out.println(controler.getStudentGroup().toString());
    }
}