package login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import validators.UserNameValidator;

public class ApplicationScene extends Application {
    //This is the main class

    @Override
    public void start(Stage stage) throws Exception {
        Parent root= FXMLLoader.load(getClass().getResource("Scene.fxml"));
        stage.setTitle("Registration form");
        stage.setScene(new Scene(root,918,337));
        stage.show();
    }
    public static void main(String[] args) {
        //System.out.println(UserNameValidator.isValid("Sneji"));
        launch(args);

    }
}
