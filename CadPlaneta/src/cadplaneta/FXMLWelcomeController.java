/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadplaneta;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Lais Gomes
 */
public class FXMLWelcomeController {
  
    @FXML
    private Button bntEntrar;
    
    @FXML
    void entrar(ActionEvent event) {
        Stage stage = new Stage();
        Parent root = null;

        try{
            root = FXMLLoader.load(getClass().getResource("FXMLcadplaneta.fxml"));
        }catch (IOException ex){
            JOptionPane.showMessageDialog(null, "ERRO: "+ex);
        }

        Scene scene= new Scene(root);
                    
        try { 
          // load a custom font from a specific location (change path!)
          // 12 is the size to use
          final Font f = Font.loadFont(new FileInputStream(new File("./fonts/Starjedi.TTF")), 12);
                // use this font with our label
        } catch (FileNotFoundException e) {
          e.printStackTrace();
        }
            stage.setScene(scene);
            stage.resizableProperty().setValue(Boolean.FALSE);  //remover maximizar

            stage.getIcons().add(new javafx.scene.image.Image(getClass().getResourceAsStream("iconjedi.png"))); //adicionar icone
            stage.setTitle("Cadastro de Planetas");
            stage.show();
                    
                  
                    
                   
    }
}
