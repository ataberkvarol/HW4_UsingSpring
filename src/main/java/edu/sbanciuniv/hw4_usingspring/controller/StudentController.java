package edu.sbanciuniv.hw4_usingspring.controller;
import edu.sbanciuniv.hw4_usingspring.model.*;
import edu.sbanciuniv.hw4_usingspring.model.dto.*;
import edu.sbanciuniv.hw4_usingspring.model.dto.*;
import edu.sbanciuniv.hw4_usingspring.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@Slf4j
public class StudentController {



    @Value("${developer.name}")
    private String developerName;

    @Autowired
        private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        log.info("Developer of the project :" + developerName);
        return studentService.getAllStudents();
    }

    @PostMapping("/students")
    public ResponseEntity<StudentResponse> addNewBook(@RequestBody StudentRequest student) {
        return ResponseEntity.ok().body(studentService.addNewStudent(student));
    }

    @PutMapping("/students")
    public Student updateExistingBook(@RequestBody Student student) {
        return studentService.updateExistStudent(student);
    }

    @DeleteMapping("/students")
    public void deleteExistingBook(@RequestBody Student student) {
        studentService.deleteExistingStudent(student);
    }

}
