/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrationform;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class RegistrationForm extends Application {
    boolean hasCap=false,hasLow=false,hasDig=false,hasSpecialChar=false,FLAG=true;
     char c;
    @Override
public void start(Stage primaryStage) {   
Label l1=new Label("Name:");
TextField t1=new TextField();
Label l2=new Label("Email:");
TextField t2=new TextField();
Label l3=new Label("phone:");
TextField t3=new TextField();
Label l4=new Label("Password:");
PasswordField p1=new PasswordField();
Label l5=new Label("Confirm:");
PasswordField p2=new PasswordField();
Label l6=new Label("Country:");
ComboBox c1 = new ComboBox();
c1.getItems().addAll("Lebanon","palastine","jordan");
c1.getSelectionModel().select("Select...");
Label l7=new Label("Gender:");
ToggleGroup group=new ToggleGroup();
RadioButton rb1 = new RadioButton("Male");
rb1.setToggleGroup(group);
RadioButton rb2 = new RadioButton("Female");            
rb2.setToggleGroup(group);
Label l8=new Label("Lanquage:");
CheckBox cb1 = new CheckBox("Arabic");
CheckBox cb2 = new CheckBox("English");
CheckBox cb3 = new CheckBox("Spanish");
Label l9=new Label("About You:");
TextArea ta=new TextArea();
ta.setPromptText("Your Biography....");
Button bt1=new Button("Register");
bt1.setMaxHeight(1000);
Text txt_Alert=new Text();
txt_Alert.setFill(Color.RED);
GridPane g = new GridPane();
g.setHgap(10);
g.setVgap(10);
g.setPadding(new Insets(25,25,25,25));
HBox v1=new HBox(20);
v1.getChildren().addAll(rb1,rb2);
HBox v2=new HBox(20);
v2.getChildren().addAll(cb1,cb2,cb3);
g.add(l1, 0,0);
g.add(t1, 1,0);
g.add(l2,0 ,1);
g.add(t2, 1,1);
g.add(l3, 0,2);
g.add(t3, 1,2);
g.add(l4, 0,3);
g.add(p1, 1,3);
g.add(l5, 0,4);
g.add(p2,1 ,4);
g.add(l6,0,5);
g.add(c1,1,5);
g.add(l7,0,6);
g.add(v1,1,6);
g.add(l8,0,7);
g.add(v2,1,7);
g.add(l9,0,8);
g.add(ta,1,8);
HBox h1=new HBox(20);
h1.getChildren().addAll(bt1);
h1.setAlignment(Pos.CENTER);
h1.setHgrow(bt1, Priority.ALWAYS);
bt1.setMaxWidth(Double.MAX_VALUE);
h1.setPrefWidth(400);
g.add(h1,1,9);
bt1.setOnAction(e->{
            txt_Alert.setText("");
            if (!(t1.getText().equals("")))
                    Validate_Name(t1, txt_Alert);
            else {
                    txt_Alert.setText(txt_Alert.getText()+"\n Enter valide Name.");
        }
 if(!(t1.getText().matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.com"))){
            txt_Alert.setText(txt_Alert.getText()+"\n Valid Email (it has @ and dot characters).");
            FLAG=false;}
         else
            FLAG=true;
    
   if(!(t2.getText().matches("[0-9]") || t3.getText().length()==8)){
            txt_Alert.setText(txt_Alert.getText()+"\n Invalid Phone Number (8 digit only)");
            FLAG=false;}
         else
            FLAG=true;

   if(((t3.getText().length()>=8))){
            for(int i=0;i<p1.getText().length();i++){
                c=p1.getText().charAt(i);
                if(Character.isDigit(c))
                    hasDig=true;
                if(Character.isUpperCase(c))
                    hasCap=true;
                if(Character.isLowerCase(c))
                    hasLow=true;
                if(p1.getText().contains("[!@#$%&*()_+=|<>?{}\\[\\]~-]"))
                    hasSpecialChar=true;
                /*OR
                Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
                Matcher hasSpecial = special.matcher(TF_Password.getText());*/
            }}
        if(hasCap==false && hasLow==false && hasDig==false && hasSpecialChar==false) {
            txt_Alert.setText(txt_Alert.getText()+"\n Password should Contains at least:\n \tone capital letter, \n \tone small letter, \n\tone digit and minimum length is 8");
            FLAG=false;}
         else
            FLAG=true;
if (!(p2.getText().equals(p2.getText()))){
            txt_Alert.setText(txt_Alert.getText()+"\n Password doesn't match");
            FLAG=false;}
         else
            FLAG=true;
 if(c1.getSelectionModel​().isEmpty()){
            txt_Alert.setText(txt_Alert.getText()+"\n Country: must be selected");
            FLAG=false;}
         else
            FLAG=true;

        if (!(ta.getText().length()>=50)){
            txt_Alert.setText(txt_Alert.getText()+"\n About You: at least 50 characters.");
            FLAG=false;}
         else
            FLAG=true;

 //System.out.println(FLAG);
                     //If All Field Validated*/
                        if(FLAG==true){
                            //System.out.println("Flag true");
                            Alert a = new Alert(Alert.AlertType.CONFIRMATION, "", new ButtonType("OK"));
                            a.setTitle("Confirm Registration");
                            a.setHeaderText("Succesfully registerd");
                           // a.setContentText("Content text");
                            a.showAndWait();}
                       // else
                         //System.out.println("Flag falseeeeeeee&");
        });



         
        p1.setOnKeyReleased(e->{
                            if(((p1.getText().length()>=8))){
            for(int i=0;i<p1.getText().length();i++){
                c=p1.getText().charAt(i);
                if(Character.isDigit(c))
                    hasDig=true;
                if(Character.isUpperCase(c))
                    hasCap=true;
                if(Character.isLowerCase(c))
                    hasLow=true;
                if(p1.getText().contains("[!@#$%&*()_+=|<>?{}\\[\\]~-]"))
                    hasSpecialChar=true;
                /*OR
                Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
                Matcher hasSpecial = special.matcher(TF_Password.getText());*/
            }}
        if(hasCap==false && hasLow==false && hasDig==false && hasSpecialChar==false) {
            txt_Alert.setText(txt_Alert.getText()+"\n Password should Contains at least:\n \tone capital letter, \n \tone small letter, \n\tone digit and minimum length is 8");
            FLAG=false;}
         else
            FLAG=true;


        });
    
        p2.setOnKeyReleased(e->{
                      if (!(p2.getText().equals(p2.getText()))){
            txt_Alert.setText(txt_Alert.getText()+"\n Password doesn't match");
            FLAG=false;}
         else
            FLAG=true;

        });
    
        ta.setOnKeyReleased(e->{
                        if (!(ta.getText().length()>=50)){
            txt_Alert.setText(txt_Alert.getText()+"\n About You: at least 50 characters.");
            FLAG=false;}
         else
            FLAG=true;

        });


Scene scene = new Scene(g);        
primaryStage.setTitle("Registration Form");
primaryStage.setScene(scene);
primaryStage.show();}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private void Validate_Name(TextField t1, Text txt_Alert) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
