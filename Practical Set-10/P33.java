import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import java.util.Random;

public class PR33 extends Application {
    public void start(Stage stage) {
        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);

        Random rand = new Random();

        for (int i = 1; i <= 5; i++) {
            Text t = new Text("Text " + i);
            t.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));

            Color color = new Color(rand.nextDouble(), rand.nextDouble(), rand.nextDouble(), 1.0);
            t.setFill(color);
            t.setOpacity(0.3 + (0.7 * rand.nextDouble()));

            root.getChildren().add(t);
        }

        Scene scene = new Scene(root, 400, 300);
        stage.setTitle("PR33");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}