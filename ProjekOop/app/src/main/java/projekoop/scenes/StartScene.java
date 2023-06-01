package projekoop.scenes;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import projekoop.scenes.Apple.AppleScene;
import projekoop.scenes.samsung.SamsungScene;

public class StartScene {
    private static Stage stage;

    public StartScene(Stage stage){
        this.stage = stage;
    }
    
    public static void show(){
        

        Label welcomeLabel = new Label();
        welcomeLabel.setText("Selamat datang di N3 GALERRY");
        
        Text chooseBrandText = new Text();
        chooseBrandText.setText("silahkan pilih merk hp yang anda inginkan");

        Button appleButton = new Button ("APPLE");
        appleButton.setOnAction(action->{
            AppleScene appleScene = new AppleScene(stage);
            appleScene.show();
        });

        // vbox.getChildren().add(appleButton);
        // vbox.setAlignment(Pos.CENTER);
        // vbox.setSpacing(12.0);



        Button samsungButton = new Button ("SAMSUNG");
        samsungButton.setOnAction(action->{
            SamsungScene samsungScene = new SamsungScene(stage);
            samsungScene.show();
        });
        // vbox.getChildren().add(samsungButton);

        Button oppoButton = new Button ("OPPO");
        // vbox.getChildren().add(oppoButton);

        Button vivoButton = new Button ("VIVO");
        // vbox.getChildren().add(vivoButton);
        
        

        VBox vbox = new VBox(chooseBrandText, appleButton, samsungButton, oppoButton, vivoButton);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(12.0);

        Scene scene = new Scene(vbox, 350, 600);
        stage.setScene(scene);
        stage.show();
    }

    
}
