package com.limengkai0225.javaFx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class JavaApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage){
        Text text = new Text("JDK14，javafx11瘦身啦");
        HBox sceneBox = new HBox(text);
        sceneBox.setStyle("-fx-alignment: center;-fx-text-fill: #ff0000;-fx-background-color: transparent;-fx-border-color: green;-fx-font-size: 1.8em;");
        Scene scene = new Scene(sceneBox,600,400);
        stage.setScene(scene);
        stage.show();
    }
}
