package login;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import validators.EmailValidator;
import validators.PasswordValidator;
import validators.PhoneValidator;
import validators.UserNameValidator;

public class ControllerScene {

    //All of the labels text and buttons used for the registration form

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnValidate;

    @FXML
    private TextField txtUsername;

    @FXML
    private TextField txtPhone;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtConfirmPassword;

    @FXML
    private Label lblUsername;

    @FXML
    private Label lblPhone;

    @FXML
    private Label lblEmail;

    @FXML
    private Label lblPassword;

    @FXML
    private Label lblConfirmPassword;

    @FXML
    void btnCancelOnAction(ActionEvent event) {
        Platform.exit();
    }

    //Check is everything entered is correct and if not print text to tell the user
    @FXML
    void btnValidateOnAction(ActionEvent event) {
        if(!UserNameValidator.isValid(txtUsername.getText())){
            lblUsername.setText("You can't use this username");
        } if(!PhoneValidator.isValid(txtPhone.getText())){
            lblPhone.setText("That is not a valid phone");
        } if(!EmailValidator.isValid(txtEmail.getText())){
            lblEmail.setText("This is not a valid Email");
        } if(!PasswordValidator.isValid(txtPassword.getText())){
            lblPassword.setText("This is not a valid password");
        } if(!txtPassword.getText().equals((txtConfirmPassword.getText()))){
            lblConfirmPassword.setText(("You can't confirm this password"));
        }

        //An alert to tell the user if everything entered is correct and he can register using this information
        Alert alert=new Alert((Alert.AlertType.INFORMATION));
        if(UserNameValidator.isValid(txtUsername.getText()) &
                PhoneValidator.isValid(txtPhone.getText()) &
                EmailValidator.isValid(txtEmail.getText()) &
                PasswordValidator.isValid(txtPassword.getText()) &
                txtPassword.getText().equals((txtConfirmPassword.getText()))){

            alert.setTitle("Successful");
            alert.setHeaderText("Everything you entered is valid");
            alert.setContentText(null);
            alert.showAndWait();
        }else{
            alert.setTitle("Unsuccessful");
            alert.setHeaderText("Something you entered is invalid");
            alert.setContentText(null);
            alert.showAndWait();
        }


    }

    @FXML
    void initialize() {
        assert btnCancel != null : "fx:id=\"btnCancel\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnValidate != null : "fx:id=\"btnValidate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtUsername != null : "fx:id=\"txtUsername\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtPhone != null : "fx:id=\"txtPhone\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtPassword != null : "fx:id=\"txtPassword\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtConfirmPassword != null : "fx:id=\"txtConfirmPassword\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblUsername != null : "fx:id=\"lblUsername\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblPhone != null : "fx:id=\"lblPhone\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblEmail != null : "fx:id=\"lblEmail\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblPassword != null : "fx:id=\"lblPassword\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblConfirmPassword != null : "fx:id=\"lblConfirmPassword\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
