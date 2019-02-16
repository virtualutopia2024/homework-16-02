package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class controller {
	   @FXML
	   private Button octa, hex;
	  
	   @FXML
	   private TextField input, output;
	  
	   public void initialize(URL location, ResourceBundle resources) {}
	   
	   public void toHex(ActionEvent event) {
	        output.setText(Integer.toHexString(Integer.parseInt(input.getText())));  
	   }
	   public void toOcta(ActionEvent event) {
	        output.setText(Integer.toOctalString(Integer.parseInt(input.getText())));  
	   }
}
