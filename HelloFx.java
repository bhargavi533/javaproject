package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloFx extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();

        Label phoneLabel = new Label("Phone:");
        TextField phoneField = new TextField();

        Label emailLabel = new Label("Email:");
        TextField emailField = new TextField();

        Button submitButton = new Button("Submit");
        Label messageLabel = new Label();

        
        submitButton.setOnAction(e -> {
            String name = nameField.getText();
            String phone = phoneField.getText();
            String email = emailField.getText();

            messageLabel.setText("Submitted: " + name + ", " + phone + ", " + email);
        });

        
        VBox vbox = new VBox(10, nameLabel, nameField, phoneLabel, phoneField, emailLabel, emailField, submitButton, messageLabel);
        Scene scene = new Scene(vbox, 300, 300);

        primaryStage.setTitle("JavaFX Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}