package camt.se.se331.lab03server.service;

import camt.se.se331.lab03server.entity.Student;

import java.util.List;

/**
 * Created by Dto on 1/25/2015.
 */
public interface StudentService {
    List<Student> getStudents();
    List<Student> filterStudentByGPA(double gpa);
}
