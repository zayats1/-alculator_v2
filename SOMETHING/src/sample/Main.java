package sample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/resources/sample.fxml"));
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(new Scene(root, 234, 305));
        primaryStage.show();
    }
    public static void main(String[] args) {
         String hi = "Jello World";  //I didn't use var, because i want that Calculator works with java8
         System.out.println(hi);
         launch(args);

    }
}


