package edu.sbanciuniv.hw4_usingspring.model;

import lombok.*;

import java.util.Date;
import javax.persistence.*;
import java.util.Date;
    @Entity
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        @Column
        private String name;
        @Column
        private String gender;
        @Column
        private String address;
        @Column
        private Date birthday;
        @Column
        private int studentId;

        public Student(String name, String gender, String address, Date birthday, int studentId) {
            this.address = address;
            this.name = name;
            this.gender = gender;
            this.studentId = studentId;
            this.birthday = birthday;
        }


        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", address='" + address + '\'' +
                    ", birthday=" + birthday +
                    '}';
        }

    }



