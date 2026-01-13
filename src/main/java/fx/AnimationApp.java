package fx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.LineTo;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.FillTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.RotateTransition;
import javafx.animation.PathTransition;
import javafx.animation.SequentialTransition;

public class AnimationApp extends Application{
    @Override
    public void start(Stage stage) throws Exception {

        Group group = new Group();
        Rectangle rect = new Rectangle(150, 150, 200, 200);

        FillTransition t1 = new FillTransition(
                Duration.seconds(1), rect,
                Color.YELLOW, Color.RED
        );

        ScaleTransition t2 = new ScaleTransition(Duration.seconds(10), rect);
        t2.setToX(0.1);
        t2.setToY(0.2);

        RotateTransition t3 = new RotateTransition(Duration.seconds(10), rect);
        t3.setFromAngle(45);
        t3.setToAngle(270);

        PathTransition t4 = new PathTransition(Duration.seconds(20), rect);
        Path path = new Path();
        path.getElements().add(new MoveTo(50, 50));
        path.getElements().add(new LineTo(250, 250));
        t4.setNode(rect);
        t4.setPath(path);
        t4.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);

        SequentialTransition t5 = new SequentialTransition();
        t5.getChildren().addAll(t2, t4, t1, t3);
        t5.play();

        group.getChildren().add(rect);

        Scene scene = new Scene(group, 300, 300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
