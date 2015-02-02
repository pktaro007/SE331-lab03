package camt.se.se331.lab03server.dao;

import camt.se.se331.lab03server.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Dto on 1/25/2015.
 */
@Repository
public class SimpleStudentDao implements  StudentDao{

    Student[] students = {  new Student("Somchai","Chaidee",0.77),
                            new Student("Yingluck","Shinnawat",3.21),
                            new Student("Prayuth","Chanocha",2.68),
                            new Student("Sonthi","Limthongkul",1.59),
                            new Student("Jayakrit","Hirisajja",4.00)
                            };
    @Override
    public List<Student> getStudents() {
        return Arrays.asList(students);
    }
}
