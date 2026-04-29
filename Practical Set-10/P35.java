import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class PR35 extends Application {
    public void start(Stage stage) {

        VBox p = createBar("Projects — 20%", 100, Color.RED);
        VBox q = createBar("Quizzes — 10%", 50, Color.BLUE);
        VBox m = createBar("Midterm — 30%", 150, Color.GREEN);
        VBox f = createBar("Final — 40%", 200, Color.ORANGE);

        HBox root = new HBox(20, p, q, m, f);
        root.setAlignment(Pos.BOTTOM_CENTER);

        Scene scene = new Scene(root, 500, 300);
        stage.setTitle("PR35");
        stage.setScene(scene);
        stage.show();
    }

    private VBox createBar(String text, int height, Color color) {
        Rectangle rect = new Rectangle(50, height);
        rect.setFill(color);

        Label label = new Label(text);

        VBox box = new VBox(5, rect, label);
        box.setAlignment(Pos.BOTTOM_CENTER);

        return box;
    }

    public static void main(String[] args) {
        launch(args);
    }
}