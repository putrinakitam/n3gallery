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

public class Ip14Promax {
    public static Stage stage;

    public Ip14Promax(Stage stage){
        this.stage = stage;
    }

    public void show() {
        Image ip = new Image("/image/ip14promax.png");
        ImageView spesifikasi14ProMax = new ImageView(ip);
        spesifikasi14ProMax.setFitWidth(120);
        spesifikasi14ProMax.setFitHeight(150);

        Button beli = new Button("Cek Barang");
        beli.setMaxHeight(30);
        beli.setMaxWidth(125);
        beli.setOnAction(v -> {
            try{
                String url = "https://eraspace.com/eraspace/produk/apple-iphone-14-pro-max";
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
        gabungan.getChildren().addAll(spesifikasi14ProMax,beli);


        Label text14PM = new Label("-> Layar Super Retina XDR 6,7 inci yang Selalu Aktif dan dilengkapi ProMotion\n-> Dynamic Island, cara baru yang istimewa untuk berinteraksi dengan iPhone\n-> Kamera utama 48 MP untuk resolusi hingga 4x lebih besar\n-> Mode Sinematik kini dalam Dolby Vision 4K pada kecepatan hingga 30 fps\n-> Mode Aksi untuk video handheld yang stabil");
        text14PM.setFont(new Font("Franklin Gothic Demi Cond", 11));
        text14PM.setMaxWidth(350);
        text14PM.setWrapText(true);
        text14PM.setTextAlignment(TextAlignment.JUSTIFY);
        text14PM.setLineSpacing(7);


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
        layout.getChildren().addAll(gabungan, text14PM,buttonBack);

        Scene scene = new Scene(layout, 400, 600);
        stage.setScene(scene);
        stage.show();


    }
    
}
