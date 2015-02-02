package camt.se.se331.lab03server.service;

import camt.se.se331.lab03server.dao.SimpleStudentDao;
import camt.se.se331.lab03server.dao.StudentDao;
import camt.se.se331.lab03server.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dto on 1/25/2015.
 */
@Service
public class StudentServiceImpl  implements StudentService{

    StudentDao studentDao = new SimpleStudentDao();
    @Override
    public List<Student> getStudents() {
        return studentDao.getStudents();
    }

    @Override
    public List<Student> filterStudentByGPA(double gpa) {
        List<Student> allStudent = studentDao.getStudents();
        List<Student> output = new ArrayList<>();
        for (Student student : allStudent) {
            if (student.getGpa() > gpa){
                output.add(student);
            }
        }
        return output;
    }
}
