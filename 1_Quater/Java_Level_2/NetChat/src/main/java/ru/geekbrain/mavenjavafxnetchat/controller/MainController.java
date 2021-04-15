package ru.geekbrain.mavenjavafxnetchat.controller;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

import java.awt.event.KeyEvent;


public class MainController {

    @FXML
    private Label timeLine;
    @FXML
    private Button sendButton;
    @FXML
    private TextArea textMembers;
    @FXML
    private TextField sendText;
    @FXML
    private TextArea primaryTextArea;

    @FXML
    public void clickSend(ActionEvent actionEvent) {
        primaryTextArea.appendText(" Вы: " + sendText.getText()+"\n");
        sendText.clear();
        sendText.requestFocus();
    }

    @FXML
    public void close(ActionEvent actionEvent) {
        System.exit(0);
    }

    @FXML
    public void clickSendEnter(ActionEvent actionEvent) {
        primaryTextArea.appendText(" Вы: " + sendText.getText()+"\n");
        sendText.clear();
        sendText.requestFocus();
    }
}
