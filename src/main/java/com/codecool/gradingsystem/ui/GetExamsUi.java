package com.codecool.gradingsystem.ui;

import com.codecool.gradingsystem.model.Exam;
import com.codecool.gradingsystem.repository.ExamRepository;
import com.codecool.gradingsystem.repository.ExamRepositoryImpl;

import java.util.List;

public class GetExamsUi {

    private final ExamRepository examRepository;

    public GetExamsUi() {
        examRepository = new ExamRepositoryImpl();
    }

    public void showExams() {
        List<Exam> exams = examRepository.getExams();

        if (exams.isEmpty()) {
            System.out.println("No exams in the database.");
        }

        for (Exam exam : exams) {
            System.out.println(exam);
        }
    }

}
