package com.example.practicejfx;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.*;

import java.io.IOException;

public class HelloApplication extends Application {

    // Define credentials for DATABASE
    private static final String DB_URL = "jdbc:mysql://localhost:3306/Java";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Clash@2215";

    @Override
    public void start(Stage stage) throws IOException {

        try {

            // Connect to DATABASE code
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Database connected successfully!");



            // JAVA FX code
            stage.setTitle("Welcome Bikash");
            Label p = new Label("Enter Principal amount: ");
            TextField pf = new TextField();
            Label t = new Label("Enter time (in years): ");
            TextField tf = new TextField();
            Label r = new Label("Enter rate of interest (in %): ");
            TextField rf = new TextField();
            Label interestAmountLabel = new Label("");

            Button btn = new Button("Submit");

            VBox inputBox = new VBox();
            inputBox.setSpacing(10);
            inputBox.setPadding(new Insets(20, 20, 20, 20));
            inputBox.getChildren().addAll(p, pf, t, tf, r, rf);

            StackPane buttonsPane = new StackPane();
            buttonsPane.setPadding(new Insets(10, 10, 10, 10));
            buttonsPane.getChildren().addAll(btn);


            VBox mainBox = new VBox();
            mainBox.getChildren().addAll(inputBox, buttonsPane, interestAmountLabel);


            // ON SUBMIT EVENT listener
            btn.setOnAction(action -> {
                try{
                    double principal = Double.parseDouble(pf.getText());
                    double time = Double.parseDouble(tf.getText());
                    double rate = Double.parseDouble(rf.getText());

                    double interestAmount = (principal*time*rate)/100;

                    PreparedStatement pstmt = conn.prepareStatement("INSERT INTO interest (principal, time, rate, interest_amount) VALUES (?,?,?,?)");
                    pstmt.setDouble(1, principal);
                    pstmt.setDouble(2, time);
                    pstmt.setDouble(3, rate);
                    pstmt.setDouble(4, interestAmount);

                    interestAmountLabel.setText("Interest amount: " + Double.toString(interestAmount));

                    int rowsInserted = pstmt.executeUpdate();
                    if(rowsInserted > 0)
                    {
                        System.out.println("Added to database!");
                    }
                }
                catch(SQLException e)
                {
                    e.printStackTrace();
                }
            });
            Scene scene = new Scene(mainBox, 200, 275);
            stage.setScene(scene);

            stage.show();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch();
    }
}