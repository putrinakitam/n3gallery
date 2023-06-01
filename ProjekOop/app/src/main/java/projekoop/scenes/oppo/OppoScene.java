package projekoop.scenes.oppo;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class OppoScene {
    private Stage stage;

    public OppoScene(Stage stage){
        this.stage = stage;
    }

    public void show(){

        Label oppoLabel = new Label();
        oppoLabel.setText("OPPO");

        Button oppoFindButton = new Button();
        oppoFindButton.setText("OPPO FIND SERIES");

        Button oppoRenoButton = new Button();
        oppoRenoButton.setText("OPPO RENO SERIES");

        Button backButton = new Button();
        backButton.setText("BACK");
        




        VBox vbox = new VBox(oppoLabel, oppoFindButton, oppoRenoButton);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(12.0);
        
        Scene scene = new Scene(vbox, 350, 600);
        stage.setScene(scene);
        stage.show();
    }

    
    
}
