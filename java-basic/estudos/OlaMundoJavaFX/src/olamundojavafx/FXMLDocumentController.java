/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package olamundojavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;

/**
 *
 * @author danie
 */
public class FXMLDocumentController implements Initializable {
    
    
    
    @FXML
    private Label lblMsg;
    private Button btnClick;
    
    @FXML
    private void clicouBotao(ActionEvent event) {
        lblMsg.setText("Ola, Mundo!");
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
