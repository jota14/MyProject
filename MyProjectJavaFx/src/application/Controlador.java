package application;

import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * 
 * @author Jozet
 * @version 1.0
 *
 */

public class Controlador {
	AnchorPane anchor;
    @FXML
    private Button btnDie;

    @FXML
    private Button btnLive;

    /**
     * En este metodo llamaremos a una nueva vista y la mostraremos.
     * 
     */
    @FXML
    void abrirImg(ActionEvent event) {
    
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("VistaLive.fxml"));
			anchor = loader.load();
			Stage sendStage = new Stage();
            sendStage.setTitle("Superheader");
            
            Scene scene = new Scene(anchor);
            sendStage.setScene(scene);
            sendStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    /**
     *  
     * En este metodo cerramos la ventana
     */
    @FXML
    void cerrarVentana(ActionEvent event) {
    	Platform.exit();
    }
}
