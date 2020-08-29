package sample;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application
{
    private static final int DRAW_WIDTH  = 600;
    private static final int DRAW_HEIGHT = 600;
    private static final double NANO = 0.000000001;

    private Animation myAnimation;  //Reference to an inner class that gets called at 60Hz
    private Canvas canvas;          //Area on which to draw graphics items.
    private GraphicsContext gtx;    //Drawing methods for the Canvas.
    private int x=DRAW_WIDTH/2;
    private int y=DRAW_HEIGHT/2;
    private int frameNumber = 0;
    private int distance = 10;
    private double timeOfLastDraw = 0;

    @Override
    public void start(Stage stage) throws Exception
    {
        stage.setTitle("Spiral");

        canvas = new Canvas(DRAW_WIDTH, DRAW_HEIGHT);

        gtx = canvas.getGraphicsContext2D();

        gtx.setLineWidth(3);

        gtx.setFill(Color.DEEPSKYBLUE);

        gtx.fillRect(0, 0, DRAW_WIDTH, DRAW_HEIGHT);



        VBox vBox = new VBox();
        vBox.getChildren().addAll(canvas);

        Scene scene = new Scene(vBox, DRAW_WIDTH, DRAW_HEIGHT);

        stage.setScene(scene);
        stage.show();

        myAnimation = new Animation();

        myAnimation.start();




    }


    class Animation extends AnimationTimer
    {
        @Override
        public void handle(long now)
        {

            double currentTimeInSec = now*NANO;
            if (currentTimeInSec - timeOfLastDraw < 0.5) return;

            timeOfLastDraw = currentTimeInSec;

            gtx.setLineWidth(2);
            gtx.setStroke(Color.BLACK);

            int x2 = x;
            int y2 = y;
            if (frameNumber % 4 == 0)
            {
                x2 = x + distance;
            }
            else if (frameNumber % 4 == 1)
            {
                y2 = y - distance;
            }
            else if (frameNumber % 4 == 2)
            {
                x2 = x - distance;
            }
            else
            {
                y2 = y + distance;
            }

            gtx.strokeLine(x,y, x2, y2);

            distance += 5;
            x = x2;
            y = y2;
            frameNumber++;



        }

    } //This bracket ends Animation, the inner class.


    public static void main(String[] args)
    {
        launch(args);
    }
}


