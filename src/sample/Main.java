package sample;import java.io.FileNotFoundException;import java.util.UUID;import java.util.logging.Level;import java.util.logging.Logger;import javafx.application.Application;import javafx.fxml.FXMLLoader;import javafx.scene.Scene;import javafx.scene.layout.StackPane;import javafx.stage.Stage;import sample.JSON.LoadFromJSON;import sample.Sammlungen.FilmeSammlung;import sample.Sammlungen.PersonenSammelung;import sample.ViewModels.Kinobuchungsystem;public class Main extends Application {    public static void main(String[] args) {        Application.launch(Main.class, (java.lang.String[]) null);    }    @Override    public void start(Stage primaryStage) {        LoadFromJSON loader = new LoadFromJSON();        loader.LoadAll();        try {            StackPane page = FXMLLoader.load(Main.class.getResource("Views/MainWindow.fxml"));            Scene scene = new Scene(page);            primaryStage.setScene(scene);            primaryStage.setTitle("Kino System");            primaryStage.show();        } catch (Exception ex) {            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);        }    }}