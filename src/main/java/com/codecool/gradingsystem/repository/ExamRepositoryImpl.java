package com.codecool.gradingsystem.repository;

import com.codecool.gradingsystem.model.Exam;

import java.util.ArrayList;
import java.util.List;

public class ExamRepositoryImpl implements ExamRepository {

    private final List<Exam> exams = new ArrayList<>();

    public void addExam(Exam exam) {
        exams.add(exam);
    }

    public List<Exam> getExams() {
        return exams;
    }

}
