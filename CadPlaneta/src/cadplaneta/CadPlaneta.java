package cadplaneta;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Image;
import static java.awt.SystemColor.text;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class CadPlaneta extends Application {

    @Override
    public void start(Stage stage) throws Exception {


       Parent root = FXMLLoader.load(getClass().getResource("FXMLWelcome.fxml"));
        
        Scene scene = new Scene(root);
        
        try { 
          // load a custom font from a specific location (change path!)
          // 12 is the size to use
          final Font f = Font.loadFont(new FileInputStream(new File(".\\fonts\\Starjedi.TTF")), 12);
                // use this font with our label
        } catch (FileNotFoundException e) {
        }
        
        stage.setScene(scene);
            stage.resizableProperty().setValue(Boolean.FALSE);  //remover maximizar

            stage.getIcons().add(new javafx.scene.image.Image(getClass().getResourceAsStream("iconjedi.png"))); //adicionar icone
            stage.setTitle("Cadastro de Planetas");
            stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
