import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;

public class JavaFXMain extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();

        Random r = new Random();

        Scene scene = new Scene(root,1000,500);
        scene.setFill(Color.BLACK);

        primaryStage.setScene(scene);

        Rectangle r1 = new Rectangle();
        r1.setX(10);
        r1.setY(10);
        r1.setHeight(80);
        r1.setWidth(80);
        r1.setFill(Color.CYAN);
        root.getChildren().add(r1);



        final long startNanoTime = System.nanoTime( );

        new AnimationTimer(){
            double speedX = 5;
            double speedY = 5;
            @Override
            public void handle (long currentNanoTime){
                double timer = ( currentNanoTime - startNanoTime ) / 10000000000.0;
                // ANIMATION
                if(r1.getX()>scene.getWidth()-r1.getWidth()||r1.getX()<0) {
                    speedX *= -1;
                    r1.setFill(Color.rgb(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
                }
                if(r1.getY()>scene.getHeight()-r1.getHeight()||r1.getY()<0) {
                    speedY *= -1;
                    r1.setFill(Color.rgb(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
                }
                r1.setX(r1.getX()+speedX);
                r1.setY(r1.getY()+speedY);




                //ANIMATION
            }
        }.start();

        primaryStage.show();

    }
}

