package edu.sbanciuniv.hw4_usingspring.model.dto;
import lombok.Builder;
import lombok.Data;


    @Data
    @Builder
    public class StudentRequest {
        private String name;;
        private int studentId;
        private String gender;
        private String accessToken;
    }



