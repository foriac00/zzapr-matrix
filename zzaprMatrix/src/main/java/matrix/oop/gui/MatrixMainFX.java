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
    
    private TextArea textArea;
    
    @Override
    public void start(Stage primaryStage) {
        

    Group root = new Group();
		
		Scene scene = new Scene( root, 300, 300 );
		
		primaryStage.setTitle("Matrix");
		
		primaryStage.setScene( scene );
		
		
		Button boton = new Button("Show");
		boton.setDefaultButton(true);
		
		boton.setPrefSize(100, 50);
		
		boton.setLayoutX(105);
		boton.setLayoutY(110);
                
		
		root.getChildren().add(boton);
		
		//Para mostrar la visible, semejante al setVisible(true)
		primaryStage.show();		
      
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
