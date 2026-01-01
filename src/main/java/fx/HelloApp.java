package fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloApp extends Application {

    @Override
    public void start(Stage stage) {
        Button btn = new Button("Hello JavaFX");
        Scene scene = new Scene(new StackPane(btn), 400, 300);
        stage.setScene(scene);
        stage.setTitle("Hello FX");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
