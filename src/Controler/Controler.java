package Controler;

import Data.*;
import Service.DataService;
import Service.StudentGroupService;
import View.StudentView;

import java.util.List;

public class Controler {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    private final StudentGroupService groupService = new StudentGroupService();
    public void createSudentGroup (List<User> students, User teacher){
        groupService.createStudentGroups(students,teacher);
    }
    public List<StudentGroup> getStudentGroup (){
        return groupService.getStudentGroups();
    }

    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.STUDENT);
    }
    public void createTeacher (String firstName, String secondName,
                               String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.TEACHER);
    }
    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for (User user: userList){
            studentView.printOnConsole((Student) user);
        }
    }
    public List<User> getStudent(){
        return service.getAllStudent();
    }
    public User getTeacher(){
        return  service.getAllTeacher();
    }
}
