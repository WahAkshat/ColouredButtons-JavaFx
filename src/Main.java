import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage s) {
        s.setTitle("Akshat's JAVA-FX program 06.10.2020");

        Button red = new Button("Red");
        Button green = new Button("Green");
        Button blue = new Button("Blue");
        Button pink = new Button("Pink");
        Button black = new Button("Black");

        red.setOnAction(event -> System.out.println(red.getText()));

        green.setOnAction(event -> System.out.println(green.getText()));

        blue.setOnAction(event -> System.out.println(blue.getText()));

        pink.setOnAction(event -> System.out.println(pink.getText()));

        black.setOnAction(event -> System.out.println(black.getText()));

        StackPane r1 = new StackPane();
        StackPane r2 = new StackPane();
        StackPane r3 = new StackPane();
        StackPane r4 = new StackPane();
        StackPane r5 = new StackPane();

        r1.getChildren().add(red);
        r2.getChildren().add(green);
        r3.getChildren().add(blue);
        r4.getChildren().add(pink);
        r5.getChildren().add(black);

        red.setStyle("-fx-background-color: #ff0000");
        red.setTextFill(Color.WHITE);
        green.setStyle("-fx-background-color: #00ff00");
        blue.setStyle("-fx-background-color: #001aff");
        blue.setTextFill(Color.YELLOW);
        pink.setStyle("-fx-background-color: #ff00c8");
        pink.setTextFill(Color.BLACK);
        black.setStyle("-fx-background-color: #000000");
        black.setTextFill(Color.WHITE);

        HBox hbox = new HBox(red, green, blue, pink, black);
        hbox.setAlignment(Pos.CENTER);

        BackgroundFill background_fill = new BackgroundFill(Color.BURLYWOOD, CornerRadii.EMPTY, Insets.EMPTY);

        // create Background
        Background background = new Background(background_fill);

        hbox.setBackground(background);


        Scene sc = new Scene(hbox, 500, 200);
        s.setScene(sc);
        s.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
