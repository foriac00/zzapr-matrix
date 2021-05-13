package matrix.oop.gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.Event;
import matrix.oop.Matrix;
import matrix.oop.MatrixMain;

/**
 *
 * @author michal
 */
public class MatrixMainFX extends Application {

    private TextArea textArea, textArea2;

    @Override
    public void start(Stage primaryStage) {

        BorderPane root = new BorderPane();

        Matrix matrixA = new Matrix(6, 2);
        matrixA.generateRandomElements(-10, 10);

        Matrix matrixB = new Matrix(6, 2);
        matrixB.generateRandomElements(-10, 10);

        String show = "MatrixA:\n" + matrixA.toString() + "\n";
        show = show + "MatrixB:\n" + matrixB.toString() + "\n";

        textArea = new TextArea();
        textArea.setEditable(false);
        textArea.appendText(show);

        matrixA.swapDiagonals(matrixB);

        String showSwapped = "MatrixA Swapped:\n" + matrixA.toString() + "\n";
        showSwapped = showSwapped + "MatrixB Swapped:\n" + matrixB.toString();

        textArea2 = new TextArea();
        textArea2.setEditable(false);
        textArea.appendText(showSwapped);
        root.setRight(textArea);

        Scene scene = new Scene(root);
        primaryStage.setTitle("Matrix");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
