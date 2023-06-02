 package projekoop.scenes.samsung;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import projekoop.scenes.StartScene;

public class SamsungScene {
    public static Stage stage;

    public SamsungScene(Stage stage){
        this.stage = stage;
    }

    public void show(){

        //label samsung
        Label samsungLabel = new Label();
        samsungLabel.setText("SAMSUNG");
        samsungLabel.setFont(new Font("Cooper Black", 20));

        //samsung23plus
        Image samsung23PlusImage = new Image("/image/samsung23plus.png");
        ImageView samsung23PlusIV = new ImageView(samsung23PlusImage);
        samsung23PlusIV.setFitWidth(120);
        samsung23PlusIV.setFitHeight(150);
        samsung23PlusIV.setOnMouseEntered(V ->{
            samsung23PlusIV.setStyle("-fx-cursor: hand;");
        });

        Label nama1 = new Label("SAMSUNG S23 Plus");
        nama1.setFont(new Font("Hey Comic", 12));

        VBox hp1 = new VBox();
        hp1.setAlignment(Pos.TOP_CENTER);
        hp1.getChildren().addAll(samsung23PlusIV,nama1);

        //samsung23ultra
        Image samsung23UltraImage = new Image("/image/samsung23ultra.png");
        ImageView samsung23UltraIV = new ImageView(samsung23UltraImage);
        samsung23UltraIV.setFitWidth(120);
        samsung23UltraIV.setFitHeight(150);
        samsung23UltraIV.setOnMouseEntered(V ->{
            samsung23UltraIV.setStyle("-fx-cursor: hand;");
        });

        Label nama2 = new Label("SAMSUNG S23 Ultra IV");
        nama2.setFont(new Font("Hey Comic", 12));
        VBox hp2 = new VBox();
        hp2.setAlignment(Pos.TOP_CENTER);
        hp2.getChildren().addAll(samsung23UltraIV,nama2);

        HBox duaHp = new HBox();
        duaHp.setAlignment(Pos.CENTER);
        duaHp.setSpacing(20);
        duaHp.getChildren().addAll(hp1,hp2);

        //samsung22plus
        Image samsung22PlusImage = new Image("/image/samsungFoldd.png");
        ImageView samsung22PlusIV = new ImageView(samsung22PlusImage);
        samsung22PlusIV.setFitWidth(120);
        samsung22PlusIV.setFitHeight(150);
        samsung22PlusIV.setOnMouseEntered(V ->{
            samsung22PlusIV.setStyle("-fx-cursor: hand;");
        });

        Label nama3 = new Label("SAMSUNG S22 Plus");
        nama3.setFont(new Font("Hey Comic", 12));
        VBox hp3 = new VBox();
        hp3.getChildren().addAll(samsung22PlusIV,nama3);
        hp3.setAlignment(Pos.TOP_CENTER);
        
        //samsungFlip
        Image samsungFlipImage = new Image("/image/samsungFlippp.png");
        ImageView samsungFlip = new ImageView(samsungFlipImage);
        samsungFlip.setFitWidth(120);
        samsungFlip.setFitHeight(150);
        samsungFlip.setOnMouseEntered(V ->{
            samsungFlip.setStyle("-fx-cursor: hand;");
        });;

        Label nama4 = new Label("SAMSUNG FLIP");
        nama4.setFont(new Font("Hey Comic", 12));
        VBox hp4 = new VBox();
        hp4.setAlignment(Pos.TOP_CENTER);
        hp4.getChildren().addAll(samsungFlip,nama4);

        //hbox 2 hp
        HBox empatHp = new HBox();
        empatHp.setAlignment(Pos.CENTER);
        empatHp.setSpacing(20);
        empatHp.getChildren().addAll(hp3,hp4);

        //back
        Button backButton = new Button();
        backButton.setText("BACK");
        backButton.setOnAction(action->{
            StartScene startScene = new StartScene(stage);
            startScene.show();
        });
        backButton.setOnMouseEntered(V ->{
            backButton.setStyle("-fx-cursor: hand;");
        });


        
        // vbox pemanggilan
        VBox layout = new VBox();
        layout.getChildren().addAll(samsungLabel,duaHp,empatHp,backButton);
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(20);
        
        Scene scene = new Scene(layout, 400, 600);
        stage.setScene(scene);
        stage.show();
    }
}
