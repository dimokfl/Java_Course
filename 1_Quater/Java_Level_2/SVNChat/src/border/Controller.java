package border;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    @FXML
    public Label label;
    @FXML
    private Slider slider;

    @FXML
    public void clickClose(ActionEvent actionEvent) {
        System.exit(0);
    }

    @FXML
    public void sliderMouseRelease(MouseEvent mouseEvent) {
        label.setText(String.format("Слайдер: %.2f", slider.getValue()));
    }
}
