package vbox;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class Controller {

    @FXML
    private VBox vbox;

    @FXML
    public void clickBtn1(ActionEvent actionEvent) {
        int x = (int) (Math.random()*100);
        Button button = new Button("Кнопка #" + x);
        vbox.getChildren().add(button);

        button.setOnAction(event -> {
            System.out.println(x);
        });

    }


}
