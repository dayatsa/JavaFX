
package org.openjfx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Control {
    private int number = 0;

    @FXML
    private Label text1;

    @FXML
    void onButtonAddClick(ActionEvent event) {
        number += 1;
        text1.setText(Integer.toString(number));
    }

    @FXML
    void onButtonDecClick(ActionEvent event) {
        number -= 1;
        text1.setText(Integer.toString(number));
    }

}

