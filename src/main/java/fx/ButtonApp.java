package fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class ButtonApp extends Application {

    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        Scene scene = new Scene(root, 500, 500);

        Button btn = new Button("Hi");
        Button btn2 = new Button("Click me!");

        btn2.setOnAction(e -> {
            System.out.println("Button2 clicked!");
        });

        root.getChildren().add(btn);
        root.getChildren().add(btn2);

        stage.setScene(scene);
        stage.setTitle("Hi");
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
