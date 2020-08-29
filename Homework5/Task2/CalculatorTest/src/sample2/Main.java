package sample2;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample2.fxml"));
        primaryStage.setTitle("Calculator2");
        primaryStage.setScene(new Scene(root, 918, 317));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}



// izpolzvam java 13 tui kato java11 ne iska da se runne ne moje da go otkrie

