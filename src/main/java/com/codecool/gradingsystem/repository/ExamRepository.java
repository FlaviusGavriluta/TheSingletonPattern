package com.codecool.gradingsystem.repository;

import com.codecool.gradingsystem.model.Exam;

import java.util.List;

public interface ExamRepository {

    void addExam(Exam exam);

    List<Exam> getExams();
}
