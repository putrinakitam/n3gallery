package projekoop.scenes.Apple;

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
// import projekoop.scenes.Apple.Ip14Promax;

public class AppleScene {
    public static Stage stage;

    public AppleScene(Stage stage){
        this.stage = stage;
    }

    public static void show(){
        
        Label appleLabel = new Label();
        appleLabel.setText("APPLE");
        appleLabel.setFont(new Font("Cooper Black", 20));

        //iphone14promax
        Image ip14PromaxImage = new Image("/image/ip14promax.png");
        ImageView ip14PromaxIV = new ImageView(ip14PromaxImage);
        ip14PromaxIV.setFitWidth(120);
        ip14PromaxIV.setFitHeight(150);
        ip14PromaxIV.setOnMouseClicked(V ->{
            Ip14Promax promax = new Ip14Promax(stage);
            promax.show();
        });
        ip14PromaxIV.setOnMouseEntered(V ->{
            ip14PromaxIV.setStyle("-fx-cursor: hand;");
        });
    
        Label nama1 = new Label("IPHONE 14 PRO MAX");
        nama1.setFont(new Font("Hey Comic", 12));

        VBox hp1 = new VBox();
        hp1.setAlignment(Pos.TOP_CENTER);
        hp1.getChildren().addAll(ip14PromaxIV,nama1);

        //ip13PROMAX
        Image ip13ProMax = new Image("/image/ip13promax.png");
        ImageView imageView2 = new ImageView(ip13ProMax);
        imageView2.setFitWidth(120);
        imageView2.setFitHeight(150);
        imageView2.setOnMouseClicked(V ->{
            Ip13Promax promax = new Ip13Promax(stage);
            promax.show();
        });
        imageView2.setOnMouseEntered(V ->{
            imageView2.setStyle("-fx-cursor: hand;");
        });

        Label nama2 = new Label("IPHONE 13 PRO MAX");
        nama2.setFont(new Font("Hey Comic", 12));
 
        VBox hp2 = new VBox();
        hp2.setAlignment(Pos.TOP_CENTER);
        hp2.getChildren().addAll(imageView2,nama2);

        //hbox gabungan
        HBox urut1 = new HBox();
        urut1.setAlignment(Pos.CENTER);
        urut1.setSpacing(20);
        urut1.getChildren().addAll(hp1,hp2);

        //ip12promax
        Image ip12ProMax = new Image("/image/ip12promax.png");
        ImageView imageView3 = new ImageView(ip12ProMax);
        imageView3.setFitWidth(120);
        imageView3.setFitHeight(150);
        imageView3.setOnMouseClicked(V ->{
            Ip12Promax pro12max = new Ip12Promax(stage);
            pro12max.show();
        });
        imageView3.setOnMouseEntered(V ->{
            imageView3.setStyle("-fx-cursor: hand;");
        });

        Label nama3 = new Label("IPHONE 12 PRO MAX");
        nama3.setFont(new Font("Hey Comic", 12));

        VBox hp3 = new VBox(0);
        hp3.setAlignment(Pos.TOP_CENTER);
        hp3.getChildren().addAll(imageView3,nama3);  

        //ip14plus
        Image ip14Plus = new Image("/image/ip14plus.png");
        ImageView imageView4 = new ImageView(ip14Plus);
        imageView4.setFitWidth(120);
        imageView4.setFitHeight(150);
        imageView4.setOnMouseClicked(V ->{
            Ip14Plus ip14PlusButton = new Ip14Plus(stage);
            ip14PlusButton.show();
        });
        imageView4.setOnMouseEntered(V ->{
            imageView4.setStyle("-fx-cursor: hand;");
        });

        Label nama4 = new Label("IPHONE 14 PLUS");
        nama4.setFont(new Font("Hey Comic", 12));

        VBox hp4 = new VBox(0);
        hp4.setAlignment(Pos.TOP_CENTER);
        hp4.getChildren().addAll(imageView4,nama4); 
        
        //hbox gabungan
        HBox urut2 = new HBox();
        urut2.setAlignment(Pos.CENTER);
        urut2.setSpacing(20);
        urut2.getChildren().addAll(hp3,hp4);
        
        //button back
        Button buttonBack = new Button("Back");
        buttonBack.setAlignment(Pos.BOTTOM_LEFT);
        buttonBack.setOnAction(V -> {
            StartScene startScene = new StartScene(stage);
            startScene.show();
        });
        buttonBack.setOnMouseEntered(V ->{
            buttonBack.setStyle("-fx-cursor: hand;");
        });

        //vbox pemanggilan
        VBox layout = new VBox();
        layout.getChildren().addAll(appleLabel,urut1,urut2,buttonBack);
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(20);

        Scene scene = new Scene(layout, 400, 600);
        stage.setScene(scene);
        stage.show();
    }

    
}
