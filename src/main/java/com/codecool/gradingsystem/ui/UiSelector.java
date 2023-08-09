package com.codecool.gradingsystem.ui;

import java.util.Scanner;

public class UiSelector {

    private final AddExamUi addExamUi;
    private final GetExamsUi getExamsUi;

    public UiSelector() {
        addExamUi = new AddExamUi();
        getExamsUi = new GetExamsUi();
    }

    public void selectUi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a UI to show: 1 - Add exam, 2 - View exams, 3 - Exit");
        String input = scanner.nextLine();

        switch (input) {
            case "1" -> {
                addExamUi.addExam();
                selectUi();
            }
            case "2" -> {
                getExamsUi.showExams();
                selectUi();
            }
            case "3" -> System.exit(0);
            default -> {
                System.out.println("Invalid input.");
                selectUi();
            }
        }
    }

}
