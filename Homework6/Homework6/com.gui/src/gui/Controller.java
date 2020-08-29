package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnGenerate;

    @FXML
    private Button btnRandomSubnets;

    @FXML
    private Button btnQuit;

    @FXML
    void onActionGenerate(ActionEvent event) {

    }

    @FXML
    void onActionQuit(ActionEvent event) {
        Stage stage = (Stage) btnQuit.getScene().getWindow();
        stage.close();

    }

    @FXML
    void onActionRandomSubnets(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnGenerate != null : "fx:id=\"btnGenerate\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnRandomSubnets != null : "fx:id=\"btnRandomSubnets\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnQuit != null : "fx:id=\"btnQuit\" was not injected: check your FXML file 'sample.fxml'.";

    }
}
