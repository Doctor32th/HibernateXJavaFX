package com.mycompany.Hibernate_FX;

import java.io.IOException;
import javafx.fxml.FXML;

/**
 * 
 * @author Doctor32
 */
public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}