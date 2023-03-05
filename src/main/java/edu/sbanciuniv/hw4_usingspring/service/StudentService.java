package edu.sbanciuniv.hw4_usingspring.service;


import edu.sbanciuniv.hw4_usingspring.model.Student;
import edu.sbanciuniv.hw4_usingspring.model.dto.StudentRequest;
import edu.sbanciuniv.hw4_usingspring.model.dto.StudentResponse;
import edu.sbanciuniv.hw4_usingspring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class StudentService {




        @Autowired
        private StudentRepository studentRepository;

        public StudentResponse addNewStudent(StudentRequest studentRequest) {
            if (studentRequest.getName().length() > 100) {
                throw new IllegalArgumentException("The author name length cannot be greater than 100 characters!");
            }

            // DTO to Entity mapper
            Student studentEntity = Student.builder()
                    .name(studentRequest.getName())
                    .studentId(studentRequest.getStudentId())
                    .gender(studentRequest.getGender())
                    .build();

            studentEntity = studentRepository.save(studentEntity);

            // Entity to DTO mapper
            StudentResponse response = StudentResponse.builder()
                    .name(studentEntity.getName())
                    .address(studentEntity.getAddress())
                    .gender(studentEntity.getGender())
                    .studentId(studentEntity.getStudentId())
                    .build();

            return response;
        }

        public List<Student> getAllStudents() {
            return (List<Student>) studentRepository.findAll();
        }

        public Student updateExistStudent(Student student) {
            return studentRepository.save(student);
        }

        public void deleteExistingStudent(Student student) {
            studentRepository.delete(student);
        }

}
