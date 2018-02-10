
package hsms;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Deepali
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private AnchorPane rootPane;
    
    private void handleButtonAction(ActionEvent event) {
      
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadSsecond(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
        rootPane.getChildren().setAll(pane);
    }
    
}
