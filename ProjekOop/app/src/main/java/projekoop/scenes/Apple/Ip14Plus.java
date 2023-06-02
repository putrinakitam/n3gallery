package projekoop.scenes.Apple;

import java.net.URI;
import java.awt.Desktop;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
// import projekoop.scenes.Apple.AppleScene;
import projekoop.scenes.StartScene;

public class Ip14Plus {
    public static Stage stage;

    public Ip14Plus(Stage stage){
        this.stage = stage;
    }

    public void show() {
        Image ip14PlusImage = new Image("/image/ip14plus.png");
        ImageView logoHp = new ImageView(ip14PlusImage);
        logoHp.setFitWidth(120);
        logoHp.setFitHeight(150);

        Button beli = new Button("Cek Barang");
        beli.setMaxHeight(30);
        beli.setMaxWidth(125);
        beli.setOnAction(v -> {
            try{
                String url = "https://ibox.co.id/product/iphone-14-plus-ibox";
                    Desktop.getDesktop().browse(new URI(url));
            } catch (Exception ex){
                ex.printStackTrace();
            }
        });
        beli.setOnMouseEntered(V ->{
            beli.setStyle("-fx-cursor: hand;");
        });

        VBox gabungan = new VBox();
        gabungan.setAlignment(Pos.TOP_CENTER);
        gabungan.setPadding(new Insets(50, 0, 45, 0));
        gabungan.setSpacing(20);
        gabungan.getChildren().addAll(logoHp,beli);


        Label text14PlusPM = new Label("-> loloLayar Super Retina XDR 6,7 inci dengan ProMotion untuk penggunaan yang terasa lebih cepat dan responsif2Mode Sinematik menambahkan kedalaman bidang yang dangkal dan pindah fokus secara otomatis di video And\n-> Sistem kamera Pro dengan kamera Telefoto, Wide, dan Ultra Wide 12 MP; LiDAR Scanner; rentang zoom optik 6x; fotografi makro; Gaya Fotografi, video ProRes, Smart HDR 4, mode Malam, Apple ProRAW, perekaman HDR 4K Dolby Vision\n-> Kamera depan TrueDepth 12 MP dengan mode Malam, perekaman HDR 4K Dolby Vision");
        text14PlusPM.setFont(new Font("Franklin Gothic Demi Cond", 11));
        text14PlusPM.setMaxWidth(350);
        text14PlusPM.setWrapText(true);
        text14PlusPM.setTextAlignment(TextAlignment.JUSTIFY);
        text14PlusPM.setLineSpacing(7);


        //button back
        Button buttonBack = new Button("Back");
        buttonBack.setAlignment(Pos.BOTTOM_LEFT);
        buttonBack.setOnAction(V -> {
            AppleScene startScene = new AppleScene(stage);
            startScene.show();
        });
        buttonBack.setOnMouseEntered(V ->{
            buttonBack.setStyle("-fx-cursor: hand;");
        });

        VBox layout = new VBox();
        layout.setAlignment(Pos.TOP_CENTER);
        layout.setSpacing(30);
        layout.getChildren().addAll(gabungan, text14PlusPM,buttonBack);

        Scene scene = new Scene(layout, 400, 600);
        stage.setScene(scene);
        stage.show();


    }
    
}
