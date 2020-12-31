/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anward;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class AnwarD extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       Label lw=new Label("Welcome");
       lw.setStyle("-fx-font-weight: bold");
              lw.setStyle("-fx-font-size: 30px");

       Label user=new Label("User Name:");
       TextField txt1=new TextField();
         Label pass=new Label("Password:");
         TextField txt2=new TextField();
        Button bt1=new Button("Sign in");
        Image img=new Image("anward/1.jpg");
        ImageView im=new ImageView(img);
        GridPane g1=new GridPane();
        g1.setAlignment(Pos.CENTER);
        g1.setHgap(5);
        g1.setVgap(10);
        g1.add(lw, 0, 0);
        g1.add(user,0, 1);
    g1.add(txt1, 1,1 );
    g1.add(pass, 0,2);
    g1.add(txt2, 1,2);
    g1.add(bt1, 1,3);
    g1.add(im, 1, 4);
    g1.setPadding(new Insets(25,25,25,25));
     Scene s=new Scene(g1);


        
        
        
        primaryStage.setTitle("JavaFx Welcome!");
        primaryStage.setScene(s);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
