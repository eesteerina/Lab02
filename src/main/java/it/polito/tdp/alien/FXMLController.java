/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.alien;

import it.polito.tdp.alien.model.*;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.*;

public class FXMLController {
	
	private Dizionario model = new Dizionario();
	
	@FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;
    
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
    	this.txtComm.clear();

    }

    @FXML
    void doTranslation(ActionEvent event) {
    	
		this.txtComm.clear();
    	
    	if(controllaParole(insertTxt.getText()) == true) {
    		String arr[] = insertTxt.getText().split(" ");
    		if(arr.length == 1 && model.getDizionario().isEmpty() == false) {
    			
    			LinkedList<String> l = this.model.cercaTraduzione(insertTxt.getText());
    			
    			if(l.size() > 0) {
    				for(String s : l) {
    					this.txtComm.appendText(s + "\n");
    				}
    			}
    		}
    		else if(arr.length == 2){
    			this.model.aggiungiTraduzione(insertTxt.getText());
    			this.txtComm.setText("Traduzione inserita correttamente!");
    		}else {
    			this.txtComm.setText("Il dizionario è ancora vuoto");
    		}
    	}
    	else {
    		this.txtComm.setText("Testo inserito errato, riprova");
    	}
    	this.insertTxt.clear();

    }
    
    public boolean controllaParole(String txt) {
    	
    	String arr[] = txt.split(" ");
    	
    	if(arr.length == 1) {
    		return txt.matches("[a-zA-Z?]*");
    	}else {
    		if(arr[0].matches("[a-zA-Z?]*") && arr[1].matches("[a-zA-Z]*?")) {
    			return true;
    		}
    		else {
    			return false;
    		}
    	}
    	
    }
   

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnClearText != null : "fx:id=\"btnClearText\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert insertTxt != null : "fx:id=\"insertTxt\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtComm != null : "fx:id=\"txtComm\" was not injected: check your FXML file 'Scene.fxml'.";

    }

}
