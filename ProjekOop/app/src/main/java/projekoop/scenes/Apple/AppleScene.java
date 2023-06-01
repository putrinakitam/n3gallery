package projekoop.scenes.Apple;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AppleScene {
    private Stage stage;

    public AppleScene(Stage stage){
        this.stage = stage;
    }

    public void show(){

        Label appleLabel = new Label();
        appleLabel.setText("APPLE");

        

        Button button14 = new Button();
        button14.setText("IPHONE 14");

        Button button13 = new Button();
        button13.setText("IPHONE13");

        Button backButton = new Button();
        backButton.setText("BACK");






        VBox vbox = new VBox(appleLabel, button14, button13, backButton);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(12.0);
        Scene scene = new Scene(vbox, 350, 600);
        stage.setScene(scene);
        stage.show();
    }

}
    


