package me.gillesvanpellicom.ex3;

import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import me.gillesvanpellicom.utils.StringGenerator;

public class Controller {
    public ChoiceBox input;
    public Label output;

    public void initialize() {

    }

    public void handleButtonAction() {
        output.setText(StringGenerator.generateRandomString((int) input.getValue()));
    }

}
