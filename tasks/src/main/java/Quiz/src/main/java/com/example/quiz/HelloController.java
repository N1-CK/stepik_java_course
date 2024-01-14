package com.example.quiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

public class HelloController {
    int counter = 0;
    int rightAnswers = 0;
    List<List<String>> questList = new ArrayList<>() {};
    {
        questList.add(new ArrayList<>(){
            {
                add("Кто ты");
                add("Я");
                add("Не я");
                add("Ещё кто-то");
                add("Не знаю");
                add("Я");
            }
        });
        questList.add(new ArrayList<>(){
            {
                add("Почему?");
                add("12");
                add("43");
                add("Надо");
                add("Не знаю");
                add("Надо");
            }
        });
    }
    @FXML
    private Button answerButton;
    @FXML
    private ToggleGroup answerGroup;

    @FXML
    private RadioButton firstButton;

    @FXML
    private RadioButton fourthButton;

    @FXML
    private Text question;

    @FXML
    private RadioButton secondButton;

    @FXML
    private RadioButton thirdButton;

    @FXML
    private Label countOfAnswers;
    @FXML
    void initialize(){
        answerButton.setText("Ответить");
        answerButton.setDisable(true);
        countOfAnswers.setText("Вопрос № " + (counter + 1));
        question.setText(questList.get(counter).get(0));
        firstButton.setText(questList.get(counter).get(1));
        secondButton.setText(questList.get(counter).get(2));
        thirdButton.setText(questList.get(counter).get(3));
        fourthButton.setText(questList.get(counter).get(4));
    }
    @FXML
    void onAnswerClick(ActionEvent event) {
        if(answerGroup.getSelectedToggle().toString().split("'")[1].equals(questList.get(counter).get(5))){
            rightAnswers++;
        }
        answerGroup.getSelectedToggle().setSelected(false);
        counter++;
        answerButton.setDisable(true);
        if(counter == questList.size()){
            System.out.printf("Молодец ты ответил правильно на %s вопросов", rightAnswers );
            question.setText(String.format("Молодец, количество правильных ответов: %s", rightAnswers ));
            counter = 0;
            rightAnswers = 0;
            answerButton.setText("Заново");
            answerButton.setDisable(false);
        }
        initialize();
    }
    @FXML
    void onRadioClick(ActionEvent event) {
        answerButton.setDisable(false);
    }
}