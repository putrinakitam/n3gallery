package projekoop.scenes.samsung;

import java.awt.Desktop;
import java.io.File;
import java.net.URI;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import projekoop.models.SamsungModel;
// import projekoop.scenes.Apple.AppleScene;
import projekoop.scenes.StartScene;

public class SamsungDetailScene {
    public  Stage stage;
    private SamsungModel samsungModel;

    public SamsungDetailScene(Stage stage, SamsungModel samsungModel){
        this.stage = stage;
        this.samsungModel = samsungModel;
    }

    public void show() {
        File file2 = new File("src/main/resources/image/bg/"+samsungModel.getDesc());
        Image image2 = new Image(file2.toURI().toString());
        ImageView bg = new ImageView(image2);
        bg.setFitHeight(600);
        bg.setFitWidth(400);
        
        VBox layout = new VBox();
        layout.setAlignment(Pos.BOTTOM_CENTER);
        layout.setSpacing(30);
        layout.setPrefSize(400, 600);


        ImageView checkout = new ImageView("/image/checkout.png");
        ImageView back = new ImageView("/image/back.png");
        Region space = new Region();
        HBox.setHgrow(space, Priority.ALWAYS);
        checkout.setOnMouseClicked(v ->{
            try{
                        String url = samsungModel.getStoreUrl();
                            Desktop.getDesktop().browse(new URI(url));
                            StartScene.uang-=samsungModel.getPrice();
                    } catch (Exception ex){
                        ex.printStackTrace();
                    }
        });
        back.setOnMouseClicked(v ->{
            SamsungScene samsungScene = new SamsungScene(stage);
            samsungScene.show();
        });

        HBox hBox = new HBox(back, space, checkout);
        hBox.setPadding(new Insets(0, 12, 0, 12));
        hBox.setAlignment(Pos.CENTER);
        hBox.setStyle("-fx-background-color:#D9D9D9;");
        hBox.setMinHeight(57);
        hBox.setMinWidth(400);
        layout.getChildren().add(hBox);
        // layout.getChildren().addAll(gabungan);
        StackPane stackPane = new StackPane(bg,layout);

        Scene scene = new Scene(stackPane, 400, 600);
        stage.setScene(scene);
        stage.show();


    }
}
