package edu.sbanciuniv.hw4_usingspring.initilizer;


import edu.sbanciuniv.hw4_usingspring.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import edu.sbanciuniv.hw4_usingspring.repository.*;

import java.util.Calendar;
import java.util.Date;


@Component
@RequiredArgsConstructor
public class StudentInitilize {

        private final StudentRepository  studentRepository;


    Student std = new Student("ataberk","male","maltepe",new Date(1994, Calendar.APRIL,17),424);



}
