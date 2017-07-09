import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Titian Bormann on 09.07.2017.
 */

public class ViewClass extends VBox implements Observer{

    Button calculate = new Button();
    TextField firstfield = new TextField();
    Label plus = new Label("+");
    TextField secondfield = new TextField();
    TextField solution = new TextField();

    ViewClass() {

        Scene scene;
        VBox layout = new VBox(20);
        layout.getChildren().add(firstfield, plus, secondfield, calculate, solution);
        scene = new Scene(layout, 200, 200);

        Stage stage = new Stage();


        stage.setTitle("Calculator");









        stage.setScene(scene);
        stage.show();

    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
