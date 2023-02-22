package com.example.increasedecrease;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label number_lbl;
    int initial_num = 0;

    @FXML
    void add(ActionEvent event) {
        initial_num ++;
        number_lbl.setText(String.valueOf(initial_num));
    }

    @FXML
    void minus(ActionEvent event) {
        initial_num --;
        number_lbl.setText(String.valueOf(initial_num));

    }
}