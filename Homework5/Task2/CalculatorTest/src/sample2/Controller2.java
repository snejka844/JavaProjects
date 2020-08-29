package sample2;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import sample.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller2   {

    private Operation operation;
    private double number;

    private double input;
    private Alert mb;
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtInput;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn5;
    @FXML
    private Button btn4;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btn0;
    @FXML
    private Button btn00;
    @FXML
    private Button btnAdd;
    @FXML
    private Button btnSubstract;
    @FXML
    private Button btnMultiply;
    @FXML
    private Button btnDivide;
    @FXML
    private Button btnCompute;
    @FXML
    private Button btnDot;
    @FXML
    private Button btnClear;
    @FXML
    private Button btnClearAll;
    @FXML
    private Button btnQuit;
    @FXML
    private Button btnOneOverX;
    @FXML
    private Button btnPower2;
    @FXML
    private Button btnSqrt;
    @FXML
    private Button btnLog;




    @FXML
    void btn00OnAction(ActionEvent event) {
        showDigit("00");
    }

    @FXML
    void btn0OnAction(ActionEvent event) {
        showDigit("0");
    }

    @FXML
    void btn1OnAction(ActionEvent event) {
        showDigit("1");
    }

    @FXML
    void btn2OnAction(ActionEvent event) {
        showDigit(btn2.getText());
    }

    @FXML
    void btn3OnAction(ActionEvent event) {
        showDigit("3");
    }

    @FXML
    void btn4OnAction(ActionEvent event) {
        showDigit("4");
    }

    @FXML
    void btn5OnAction(ActionEvent event) {
        showDigit("5");
    }

    @FXML
    void btn6OnAction(ActionEvent event) {
        showDigit("6");
    }

    @FXML
    void btn7OnAction(ActionEvent event) {
        showDigit("7");
    }

    @FXML
    void btn8OnAction(ActionEvent event) {
        showDigit("8");
    }

    @FXML
    void btn9OnAction(ActionEvent event) {
        showDigit("9");
    }

    private void showDigit(String digit) {
        String text = txtInput.getText();
        if (text.equals("0")) {
            txtInput.setText(digit);
        } else {
            txtInput.setText(text + digit);
        }
    }


    private void doOperation(sample2.Controller2.Operation op) {
        input = Double.parseDouble(txtInput.getText());
        operation = op;
        txtInput.setText("0");
    }

    @FXML
    void btnClearAllOnAction(ActionEvent event) {
        txtInput.setText("0");
        operation = Controller2.Operation.NO_OP;
    }

    @FXML
    void btnClearOnAction(ActionEvent event) {
        txtInput.setText("0");
    }

    @FXML
    void btnComputeOnAction(ActionEvent event) {
        double result = Double.parseDouble(txtInput.getText());
        switch (operation) {
            case MULT:
                result *= input;
                break;
            case DIVIDE:
                result = input / result;
                break;
            case PLUS:
                result = result + input;
                break;
            case MINUS:
                result = input - result;
                break;
            default:
                return;
        }
        txtInput.setText("" + result);
        operation = sample2.Controller2.Operation.NO_OP;
    }

    @FXML
    void btnDivideOnAction(ActionEvent event) {
        doOperation(sample2.Controller2.Operation.DIVIDE);
    }

    @FXML
    void btnDotOnAction(ActionEvent event) {
        showDigit(".");
    }

    @FXML
    void btnMultiplyOnAction(ActionEvent event) {
        doOperation(sample2.Controller2.Operation.MULT);
    }

    @FXML
    void btnQuitOnAction(ActionEvent event) { // ask to quit
        if (ButtonType.OK == mb.showAndWait().get()) {
            Platform.exit();
        }

    }

    @FXML
    void btnAddOnAction(ActionEvent event) {
        doOperation(sample2.Controller2.Operation.PLUS);
    }

    @FXML
    void btnSubstractOnAction(ActionEvent event) {
        doOperation(sample2.Controller2.Operation.MINUS);
    }

    // In the following 4 function using doOperator is unnecessary because of line 143.

    @FXML
    void actionBtnLog(ActionEvent event) {
        txtInput.setText("" + Math.log10(Double.parseDouble(txtInput.getText())));
    }

    @FXML
    void actionBtnOneOverX(ActionEvent event) {
        txtInput.setText("" + 1 / Double.parseDouble(txtInput.getText()));
    }

    @FXML
    void actionBtnPower2(ActionEvent event) {
        input = Double.parseDouble(txtInput.getText());
        txtInput.setText("" + input * input);
    }

    @FXML
    void actionBtnSqrt(ActionEvent event) {
        txtInput.setText("" + Math.sqrt(Double.parseDouble(txtInput.getText())));
    }

    @FXML
    void initialize() {
        operation = sample2.Controller2.Operation.NO_OP;
        mb = new Alert(Alert.AlertType.CONFIRMATION);
        mb.setTitle("Quit");
        mb.setHeaderText(null);
        mb.setContentText("Do you really want to quit?");

    }

    private enum Operation {
        PLUS, MINUS, DIVIDE, MULT, NO_OP
    }



    @FXML
    private Button btnM;

    @FXML
    private Button btnMPlus;

    @FXML
    private Button btnMMinus;

    @FXML
    private Button btnMC;

    @FXML
    void btnMCOnAction(ActionEvent event) {
        number = 0;
    }

    @FXML
    void btnMMinusOnAction(ActionEvent event) {


        if(txtInput.getText().equals("")){
            catchAllert("Number is not defined");        }
        else{ txtInput.setText(String.valueOf( Double.parseDouble(txtInput.getText()) - number ));
        }
    }

    @FXML
    void btnMOnAction(ActionEvent event) {
        if(txtInput.getText().equals("")){
            catchAllert("Number is not defined");        }
        else{
            number = Double.parseDouble(txtInput.getText());
            txtInput.setText("0");
        }
    }

    @FXML
    void btnMPlusOnAction(ActionEvent event) {
        txtInput.setText(String.valueOf(number + Double.parseDouble(txtInput.getText())));

        if(txtInput.getText().equals("")){
            catchAllert("Number is not defined");        }
        else{
            txtInput.setText(String.valueOf(number + Double.parseDouble(txtInput.getText())));

        }
    }

    public void catchAllert(String header)
    {
        Alert alert = new Alert(Alert.AlertType.ERROR);

        alert.setTitle("This is wrong ");
        alert.setHeaderText(header);
        alert.setContentText("Come on , try again");

        alert.showAndWait();
    }

}


// s jar ne raboti i za tova e taka napraveno no taka se gubi smisula ot preizpolzvaneto na kod
