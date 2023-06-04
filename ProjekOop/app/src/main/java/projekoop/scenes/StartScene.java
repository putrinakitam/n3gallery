package projekoop.scenes;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import projekoop.scenes.Apple.AppleScene;
import projekoop.scenes.samsung.SamsungScene;

public class StartScene {
    private Stage stage;
    public static int uang=10000000;
 
    public StartScene(Stage stage){
        this.stage = stage;
    }
    
    public void show(){
        // Label welcomeLabel = new Label();
        // welcomeLabel.setAlignment(Pos.TOP_CENTER);
        // welcomeLabel.setText("SELECT THE BRAND");
        // welcomeLabel.setFont(new Font("Cooper Black", 20));
        // welcomeLabel.setStyle("-fx-font-family: arial; -fx-font-weight: bold; -f;-fx-font-size: 30px");
        
        // apple button
        Image appleLogoImage = new Image("/image/apple11.png");
        ImageView imageViewAplleLogo = new ImageView(appleLogoImage);
        // imageViewAplleLogo.setFitHeight(200);
        // imageViewAplleLogo.setFitWidth(210);
        imageViewAplleLogo.setOnMouseClicked(V ->{
            AppleScene appleScene = new AppleScene(stage);
            appleScene.show();
        });
        imageViewAplleLogo.setOnMouseEntered(V->{
            imageViewAplleLogo.setStyle("-fx-cursor: hand;");
        }); 
       
        //samsung Button
        Image samsungLogoImage = new Image("/image/samsung1.png");
        ImageView imageViewSamsungLogo = new ImageView(samsungLogoImage);
        // imageViewSamsungLogo.setFitHeight(100);
        // imageViewSamsungLogo.setFitWidth(240);
        imageViewSamsungLogo.setOnMouseClicked(V ->{
            SamsungScene samsungScene = new SamsungScene(stage);
            samsungScene.show();
        });
        imageViewSamsungLogo.setOnMouseEntered(V ->{
            imageViewSamsungLogo.setStyle("-fx-cursor: hand;");
        });

        //vbox pemanggilan        
        HBox layout = new HBox(imageViewAplleLogo , imageViewSamsungLogo);
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(12);
        layout.setPadding(new Insets(150, 0, 0, 0));
        // layout.setStyle("-fx-background-color: #FFFFFF;");

        ImageView bg = new ImageView("/image/bgbg.png");
        bg.setFitHeight(600);
        bg.setFitWidth(400);
        StackPane stackPane = new StackPane(bg,layout);
        

        //memanggil layout
        Scene scene = new Scene(stackPane, 400, 600);
        stage.setScene(scene);
        stage.show();
    }

    
}
