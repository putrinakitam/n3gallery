package projekoop.scenes.samsung;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import projekoop.scenes.StartScene;

public class SamsungScene {
    private Stage stage;

    public SamsungScene(Stage stage){
        this.stage = stage;
    }

    public void show(){

        Label samsungLabel = new Label();
        samsungLabel.setText("SAMSUNG");

        Button samsungNoteButton = new Button();
        samsungNoteButton.setText("SAMSUNG NOTE SERIES");

        Button samsungGalaxyButton = new Button();
        samsungGalaxyButton.setText("SAMSUNG GALAXY SERIES");

        Button backButton = new Button();
        backButton.setText("BACK");
        backButton.setOnAction(action->{
            StartScene startScene = new StartScene(stage);
            startScene.show();
        });





        VBox vbox = new VBox(samsungLabel, samsungNoteButton, samsungGalaxyButton, backButton);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(12.0);
        
        Scene scene = new Scene(vbox, 350, 600);
        stage.setScene(scene);
        stage.show();
    }

    
}
