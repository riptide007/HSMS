package hsms;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;

public class Gift_ShopController {

       @FXML
    private AnchorPane giftshopPane;

    @FXML
    void Back(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
       giftshopPane.getChildren().setAll(pane);
    }

    @FXML
    void Logout(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
       giftshopPane.getChildren().setAll(pane);
       
    }
      @FXML
    private TableColumn<?, ?> CustomerID;

    @FXML
    private TableColumn<?, ?> payment;

    @FXML
    private TableColumn<?, ?> gAmount;

    @FXML
    private TableColumn<?, ?> roomNum;

    @FXML
    private TableColumn<?, ?> date;

    @FXML
    private TableColumn<?, ?> time;


    @FXML
    void Chocolate(ActionEvent event) {

    }

    @FXML
    void Cigarettes(ActionEvent event) {

    }

    @FXML
    void Keychains(ActionEvent event) {

    }


    @FXML
    void New_bar(ActionEvent event) {

    }

    @FXML
    void Postcards(ActionEvent event) {

    }

    @FXML
    void SanPads(ActionEvent event) {

    }

    @FXML
    void Soap(ActionEvent event) {

    }

    @FXML
    void airtime(ActionEvent event) {

    }

    @FXML
    void batteries(ActionEvent event) {

    }

    @FXML
    void bird(ActionEvent event) {

    }

    @FXML
    void bracelets(ActionEvent event) {

    }

    @FXML
    void buffalo(ActionEvent event) {

    }

    @FXML
    void candles(ActionEvent event) {

    }

    @FXML
    void chrisps(ActionEvent event) {

    }

    @FXML
    void coffeePacked(ActionEvent event) {

    }

    @FXML
    void cookies(ActionEvent event) {

    }

    @FXML
    void crocodile(ActionEvent event) {

    }

    @FXML
    void earings(ActionEvent event) {

    }

    @FXML
    void elephant(ActionEvent event) {

    }

    @FXML
    void flashDisk(ActionEvent event) {

    }

    @FXML
    void flashLight(ActionEvent event) {

    }

    @FXML
    void gazelles(ActionEvent event) {

    }

    @FXML
    void genOrderBar(ActionEvent event) {

    }

    @FXML
    void giraffe(ActionEvent event) {

    }

    @FXML
    void guestID(ActionEvent event) {

    }

    @FXML
    void gum(ActionEvent event) {

    }

    @FXML
    void hats(ActionEvent event) {

    }

    @FXML
    void juice(ActionEvent event) {

    }

    @FXML
    void lion(ActionEvent event) {

    }

    @FXML
    void maps(ActionEvent event) {

    }

    @FXML
    void newsapaper(ActionEvent event) {

    }

    @FXML
    void nuts(ActionEvent event) {

    }

    @FXML
    void paintings(ActionEvent event) {

    }

    @FXML
    void print_bar(ActionEvent event) {

    }

    @FXML
    void printedBags(ActionEvent event) {

    }

    @FXML
    void printedCups(ActionEvent event) {

    }

    @FXML
    void printedShawl(ActionEvent event) {

    }

    @FXML
    void rhino(ActionEvent event) {

    }

    @FXML
    void shampoo(ActionEvent event) {

    }

    @FXML
    void smokerPalet(ActionEvent event) {

    }

    @FXML
    void soda(ActionEvent event) {

    }

    @FXML
    void stickers(ActionEvent event) {

    }

    @FXML
    void sweets(ActionEvent event) {

    }

    @FXML
    void teaPacked(ActionEvent event) {

    }

    @FXML
    void toiletPaper(ActionEvent event) {

    }

    @FXML
    void toothBrush(ActionEvent event) {

    }

    @FXML
    void toothPaste(ActionEvent event) {

    }

    @FXML
    void travelBooks(ActionEvent event) {

    }

    @FXML
    void water(ActionEvent event) {

    }
   
}