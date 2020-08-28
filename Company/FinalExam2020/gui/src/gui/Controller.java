package gui;

import java.net.URL;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.ResourceBundle;

import com.Staff;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class Controller {



    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<Staff> cboSelectedItem;

    @FXML
    private Slider sldSelectUnits;

    @FXML
    private Label lblName;

    @FXML
    private Label lblNameValue;

    @FXML
    private Label lblWorksAt;

    @FXML
    private Label lblWorksAtValue;

    @FXML
    private Label lblHiredAt;

    @FXML
    private Label lblHiredAtValue;

    @FXML
    private Label lblIncrease;

    @FXML
    private Label lblIncreaseValue;

    @FXML
    private Label lblSalary;

    @FXML
    private Label lblSalaryValue;

    private ObservableList<Staff> itemsObservableList = FXCollections.observableArrayList();
    private Staff items[] = new Staff[]{
            new Staff("Snejana",  7500,"HR" , LocalDate.now()),
            new Staff("Ivan",  5000,"DP",LocalDate.now()),

    };
    public ObservableList<Staff> getItemsObservableList() {
        itemsObservableList.setAll(Arrays.asList(items));
        return itemsObservableList;
    }

    @FXML
    void initialize() {
        assert cboSelectedItem != null : "fx:id=\"cboSelectedItem\" was not injected: check your FXML file 'View.fxml'.";
        assert sldSelectUnits != null : "fx:id=\"sldSelectUnits\" was not injected: check your FXML file 'View.fxml'.";
        assert lblName != null : "fx:id=\"lblName\" was not injected: check your FXML file 'View.fxml'.";
        assert lblNameValue != null : "fx:id=\"lblNameValue\" was not injected: check your FXML file 'View.fxml'.";
        assert lblWorksAt != null : "fx:id=\"lblWorksAt\" was not injected: check your FXML file 'View.fxml'.";
        assert lblWorksAtValue != null : "fx:id=\"lblWorksAtValue\" was not injected: check your FXML file 'View.fxml'.";
        assert lblHiredAt != null : "fx:id=\"lblHiredAt\" was not injected: check your FXML file 'View.fxml'.";
        assert lblHiredAtValue != null : "fx:id=\"lblHiredAtValue\" was not injected: check your FXML file 'View.fxml'.";
        assert lblIncrease != null : "fx:id=\"lblIncrease\" was not injected: check your FXML file 'View.fxml'.";
        assert lblIncreaseValue != null : "fx:id=\"lblIncreaseValue\" was not injected: check your FXML file 'View.fxml'.";
        assert lblSalary != null : "fx:id=\"lblSalary\" was not injected: check your FXML file 'View.fxml'.";
        assert lblSalaryValue != null : "fx:id=\"lblSalaryValue\" was not injected: check your FXML file 'View.fxml'.";






        cboSelectedItem.setItems(getItemsObservableList());

        cboSelectedItem.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (cboSelectedItem.getSelectionModel().getSelectedIndex() >= 0) {
                lblNameValue.setText(String.format(" %s", newValue.getName()));
                //lblWorksAtValue.setText(String.format("$ %.2f", newValue.getUnitPrice()));

               // currentPrice.setValue(newValue.getUnitPrice());
                sldSelectUnits.setValue(0);
            }
        });

    }
}
