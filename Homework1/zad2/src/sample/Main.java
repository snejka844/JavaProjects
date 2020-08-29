package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Main extends Application {

    private static void draw2DShapes(Group group, double width, double height)
            throws InterruptedException {
        Line line;
        int increment = 20;
        double widthStep = width / increment;
        double heightStep = height / increment;

        for (int count = 1; count < increment; count++) {
            line = new Line(0, count * heightStep, (count) * widthStep, height);
            line.setStroke(Color.ORANGE);
            group.getChildren().add(line);
        }

        for (int count = 1; count < increment; count++) {
            line = new Line(width, count * heightStep, (count) * widthStep, 0);
            line.setStroke(Color.ORANGE);
            group.getChildren().add(line);
        }

        for (int count = 1; count < increment; count++) {
            line = new Line(count * widthStep, 0, 0, height - (count) * heightStep);
            line.setStroke(Color.ORANGE);
            group.getChildren().add(line);
        }

        for (int count = 1; count < increment; count++) {
            line = new Line(count * widthStep, height, width, height - (count) * heightStep);
            line.setStroke(Color.ORANGE);
            group.getChildren().add(line);
        }
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();
        draw2DShapes(group, 300,250);
        Scene scene = new Scene(group, 300, 250);

        primaryStage.setTitle("Canvas demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}