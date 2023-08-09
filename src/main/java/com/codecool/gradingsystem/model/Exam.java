package com.codecool.gradingsystem.model;

import java.time.LocalDate;

public record Exam(LocalDate date, String studentName, String examName, Grade grade) {

    @Override
    public String toString() {
        return "Exam{" +
                "date=" + date +
                ", studentName='" + studentName + '\'' +
                ", examName='" + examName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
