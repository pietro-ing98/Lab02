package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

	Parole elenco;
	AlienDictionary dizionario;

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private TextField txtInserisci;

	@FXML
	private Button btnTranslate;

	@FXML
	private TextArea txtStampa;

	@FXML
	private Button btnClear;

	@FXML
	void DoClear(ActionEvent event) {
		// elenco.reset();
		txtStampa.setText("");
	}

	@FXML
	void DoTraduzione(ActionEvent event) {
		
		String parola = txtInserisci.getText();

		String alienWord = parola.split(" ")[0].toLowerCase();

		if (parola.split(" ").length == 2) {
			 
			txtStampa.setText("Parola aggiunta al dizionario!");
			 String traduzione = parola.split(" ")[1].toLowerCase();
			dizionario.aggiungiParola(alienWord, traduzione);
			
		} 
		else if(parola.split(" ").length == 1 && elenco.presente(alienWord)){
			txtStampa.setText("Parola aggiunta al dizionario!");
		}
		
		boolean lettere = false;

		try {
			Integer.parseInt(parola);
		} catch (Exception e) {
			lettere = true;
		}

		if (!lettere) {
			txtStampa.setText("Non è una parola!");
			return;
		}

		//if (parola.contains(" ")) {
		//	elenco.aggiungiParola(parola);
		//} else {
		//	txtStampa.setText(elenco.getTraduzione(parola));
		//}

	}

	@FXML
	void initialize() {
		assert txtInserisci != null : "fx:id=\"txtInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
		assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
		assert txtStampa != null : "fx:id=\"txtStampa\" was not injected: check your FXML file 'Scene.fxml'.";
		assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Scene.fxml'.";

	}
}
