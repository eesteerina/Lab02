/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
    @FXML
    private Button btnClearText;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextField insertTxt;

    @FXML
    private TextArea txtComm;
    
    @FXML
    void doClear(ActionEvent event) {

    }

    @FXML
    void doTranslation(ActionEvent event) {

    }
	

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnClearText != null : "fx:id=\"btnClearText\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert insertTxt != null : "fx:id=\"insertTxt\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtComm != null : "fx:id=\"txtComm\" was not injected: check your FXML file 'Scene.fxml'.";

    }

}
