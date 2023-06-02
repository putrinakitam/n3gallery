package projekoop.scenes;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
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
        welcomeLabel.setAlignment(Pos.TOP_CENTER);
        welcomeLabel.setText("SELECT THE BRAND");
        welcomeLabel.setFont(new Font("Cooper Black", 20));
        // welcomeLabel.setStyle("-fx-font-family: arial; -fx-font-weight: bold; -f;-fx-font-size: 30px");
        
        // apple button
        Image appleLogoImage = new Image("/image/AppleLogo.png");
        ImageView imageViewAplleLogo = new ImageView(appleLogoImage);
        imageViewAplleLogo.setFitHeight(200);
        imageViewAplleLogo.setFitWidth(210);
        imageViewAplleLogo.setOnMouseClicked(V ->{
            AppleScene appleScene = new AppleScene(stage);
            appleScene.show();
        });
        imageViewAplleLogo.setOnMouseEntered(V->{
            imageViewAplleLogo.setStyle("-fx-cursor: hand;");
        }); 
       
        //samsung Button
        Image samsungLogoImage = new Image("/image/samsungLogo.jpg");
        ImageView imageViewSamsungLogo = new ImageView(samsungLogoImage);
        imageViewSamsungLogo.setFitHeight(100);
        imageViewSamsungLogo.setFitWidth(240);
        imageViewSamsungLogo.setOnMouseClicked(V ->{
            SamsungScene samsungScene = new SamsungScene(stage);
            samsungScene.show();
        });
        imageViewSamsungLogo.setOnMouseEntered(V ->{
            imageViewSamsungLogo.setStyle("-fx-cursor: hand;");
        });

        //vbox pemanggilan        
        VBox layout = new VBox(welcomeLabel,imageViewAplleLogo , imageViewSamsungLogo);
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(12);
        layout.setStyle("-fx-background-color: #FFFFFF;");

        //memanggil layout
        Scene scene = new Scene(layout, 400, 600);
        stage.setScene(scene);
        stage.show();
    }

    
}
