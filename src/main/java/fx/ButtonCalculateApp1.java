package fx;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;

public class ButtonCalculateApp1 extends Application {

    @Override
    public void start(Stage stage) {

        TextField tf = new TextField();

        Button btn = new Button("Calculate");
        btn.setOnAction(e -> {
            try {
                int value = Integer.parseInt(tf.getText());
                tf.setText(String.valueOf(value * value));
                btn.setText("Calculated");
            } catch (Exception ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Wrong input");
                alert.show();
            }
        });

        VBox root = new VBox();
        root.getChildren().add(tf);
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 500, 500);

        stage.setScene(scene);
        stage.setTitle("JavaFX Calculator");
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
