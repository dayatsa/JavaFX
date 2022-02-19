
package org.openjfx.controller;

import eu.hansolo.medusa.Gauge;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Control {
    private int number = 0;
    
    @FXML
    private Gauge gauge1;

    @FXML
    private Gauge gauge2;

    @FXML
    private Label text1;

    @FXML
    void onButtonAddClick(ActionEvent event) {
        number += 1;
        text1.setText(Integer.toString(number));
        gauge1.setValue(number);
    }

    @FXML
    void onButtonDecClick(ActionEvent event) {
        number -= 1;
        text1.setText(Integer.toString(number));
        gauge1.setValue(number);
    }

}

