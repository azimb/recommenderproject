package sample;
import javafx.application.Application;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.geometry.Insets;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.xml.soap.Text;

public class Main extends Application{

    Scene scene1,scene2,scene3; // SCENE 2 - LOGIN FORM , SCENE 3 - SIGN UP FORM
    Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception{
      //  Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        window=primaryStage;
        window.setTitle("PROJECT RECOMMENDER SYSTEM");
       // primaryStage.setScene(new Scene(root, 500, 500));

        // GRID 1 FOR APP

        GridPane grid1=new GridPane();
        grid1.setPadding(new Insets(10,10,10,10));
        grid1.setVgap(16);
        grid1.setHgap(10);

        Label lbl1=new Label("Welcome To Our App");
        GridPane.setConstraints(lbl1,0,0);

        Button loginButton = new Button("Login"); // GO TO SCENE 2
        GridPane.setConstraints(loginButton,0,1);

        Button signupButton = new Button("Sign Up"); // GO TO SCENE 3
        GridPane.setConstraints(signupButton,0,2);

        grid1.getChildren().addAll(lbl1,loginButton,signupButton);
        scene1=new Scene(grid1,500,300);

        loginButton.setOnAction(e -> {
            System.out.println("Login");
            window.setScene(scene2);
        });

        signupButton.setOnAction(e ->{
            System.out.println("Signup");
            window.setScene(scene3);
        });

        // GRID 2 FOR LOGIN FORM

        GridPane grid2=new GridPane();
        grid2.setPadding(new Insets(10,10,10,10));
        grid2.setHgap(8);
        grid2.setVgap(10);

        Label name_lbl=new Label("Username");
        GridPane.setConstraints(name_lbl,0,0);
        TextField name_entry=new TextField();
        GridPane.setConstraints(name_entry,1,0);

        Label pass_lbl = new Label("Password");
        GridPane.setConstraints(pass_lbl,0,1);
        PasswordField pass_entry=new PasswordField();
        pass_entry.setPromptText("Your password");
        GridPane.setConstraints(pass_entry,1,1);

        Label message =new Label("You are now logged in!");
        GridPane.setConstraints(message,1,4);

        Button login_btn1=new Button("LOGIN");
        GridPane.setConstraints(login_btn1,1,3);

        login_btn1.setOnAction(e->{
            grid2.getChildren().add(message);
        });

        Button back_btn=new Button("BACK");
        GridPane.setConstraints(back_btn,2,3);
        back_btn.setOnAction(e->{
            window.setScene(scene1);
        });

        grid2.getChildren().addAll(name_lbl,pass_lbl,back_btn,name_entry,pass_entry,login_btn1);
        scene2=new Scene(grid2,600,200);


        // GRID 3 FOR SIGNUP FORM

        GridPane grid3=new GridPane();
        grid3.setPadding(new Insets(10,10,10,10));
        grid3.setHgap(8);
        grid3.setVgap(10);

        Label title=new Label("User Information Form ");
        GridPane.setConstraints(title,0,0);

        Label nameLabel=new Label("Username");
        GridPane.setConstraints(nameLabel,0,1);
        TextField nameEntry=new TextField();
        GridPane.setConstraints(nameEntry,1,1);

        Label passLabel=new Label("Password");
        GridPane.setConstraints(passLabel,0,2);
        PasswordField passEntry=new PasswordField();
        passEntry.setPromptText("Your password");
        GridPane.setConstraints(passEntry,1,2);

        Label contactLabel=new Label("Contact Info");
        GridPane.setConstraints(contactLabel,0,3);
        TextField contactEntry=new TextField();
        GridPane.setConstraints(contactEntry,1,3);


        Label locLabel=new Label("Location");
        GridPane.setConstraints(locLabel,0,4);
        TextField locEntry=new TextField();
        GridPane.setConstraints(locEntry,1,4);


        Label interestLabel=new Label("Interests");
        GridPane.setConstraints(interestLabel,0,5);
        TextField interestsEntry=new TextField();
        GridPane.setConstraints(interestsEntry,1,5);

        Label message3=new Label("Submitted!");
        GridPane.setConstraints(message3,0,7);


        grid3.getChildren().addAll(title,nameLabel,nameEntry,contactLabel,contactEntry,passLabel,passEntry,locEntry,locLabel,interestsEntry,interestLabel);

        Button submit = new Button("SUBMIT");
        GridPane.setConstraints(submit,0,6);
        submit.setOnAction(e->{
            boolean result= ConfirmBox.display("Submit Info","Are you sure you want to submit this information?");
            if ( result ==true)
            {
                grid3.getChildren().add(message3);
            }
                });

        Button backButton = new Button("BACK");
        GridPane.setConstraints(backButton,1,6);
        backButton.setOnAction(e->{
            window.setScene(scene1);
        });

        grid3.getChildren().addAll(submit,backButton);
        scene3=new Scene(grid3,600,600);


        window.setScene(scene1);
        window.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
