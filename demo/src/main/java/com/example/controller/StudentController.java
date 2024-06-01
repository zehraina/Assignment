package com.example.controller;
package com.example.beans;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import java.lang.InterruptedException;
import com.example.entity.Student;
import com.example.service.StudentService;
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;
    @PostMapping
    @RequestMapping("/")
    public StudentCreateResponse(@RequestBody Student student) throws InterruptedException{
       return studentService.createStudent(student);


   }
}
