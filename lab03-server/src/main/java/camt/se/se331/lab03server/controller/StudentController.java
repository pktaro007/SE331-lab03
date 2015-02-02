package camt.se.se331.lab03server.controller;

import camt.se.se331.lab03server.entity.Student;
import camt.se.se331.lab03server.service.StudentService;
import camt.se.se331.lab03server.service.StudentServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Dto on 1/25/2015.
 */
@Controller
@RequestMapping("/")
public class StudentController {

    StudentService studentService = new StudentServiceImpl();
    @RequestMapping(value="/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/allstudents.json",method = RequestMethod.GET)
    public @ResponseBody List<Student> getAllStudent(){
        return studentService.getStudents();
    }

    @RequestMapping(value = "/gpa.json",method = RequestMethod.GET)
    public @ResponseBody List<Student> getStudentsGradeMoreThan(@RequestParam("gpa") double gpa){
        return studentService.filterStudentByGPA(gpa);
    }

    @RequestMapping(value = "/reverse",method = RequestMethod.GET)
    public @ResponseBody String getReverse(@RequestParam("text") String input){
        return StringUtils.reverseDelimited(StringUtils.reverse(input),' ');
    }
}
