package hsms;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;

public class BarController {

    @FXML
    private AnchorPane BarOrder;
     @FXML
    private TableColumn<?, ?> ItemID;

    @FXML
    private TableColumn<?, ?> Amount;

    @FXML
    private TableColumn<?, ?> price;

    @FXML
    private TableColumn<?, ?> date;

    @FXML
    private TableColumn<?, ?> time;

    
    @FXML
    void New(ActionEvent event) {

    }

    @FXML
    void Print(ActionEvent event) {

    }

    @FXML
    void Back_Bar(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
       BarOrder.getChildren().setAll(pane);
    }

    @FXML
    void LogOut(ActionEvent event) throws IOException{
AnchorPane pane = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
       BarOrder.getChildren().setAll(pane);
    }

    @FXML
    void generateOrderBar(ActionEvent event) {
    }
     @FXML
    void banana(ActionEvent event) {

    }

    @FXML
    void brandy(ActionEvent event) {

    }

    @FXML
    void cappuccino(ActionEvent event) {

    }

    @FXML
    void cherry(ActionEvent event) {

    }

    @FXML
    void chocolate(ActionEvent event) {

    }

    @FXML
    void cider(ActionEvent event) {

    }

    @FXML
    void cocktail(ActionEvent event) {

    }

    @FXML
    void coke(ActionEvent event) {

    }

    @FXML
    void cookie(ActionEvent event) {

    }

    @FXML
    void efes(ActionEvent event) {

    }

    @FXML
    void espresso(ActionEvent event) {

    }

    @FXML
    void fanta(ActionEvent event) {

    }

    @FXML
    void flavouredTea(ActionEvent event) {

    }

    @FXML
    void fruitJuice(ActionEvent event) {

    }


    @FXML
    void gin(ActionEvent event) {

    }

    @FXML
    void guinness(ActionEvent event) {

    }

    @FXML
    void hotChocolate(ActionEvent event) {

    }

    @FXML
    void iceTea(ActionEvent event) {

    }

    @FXML
    void jimbean(ActionEvent event) {

    }

    @FXML
    void latte(ActionEvent event) {

    }

    @FXML
    void masalaTea(ActionEvent event) {

    }

    @FXML
    void mediumWhite(ActionEvent event) {

    }

    @FXML
    void mocha(ActionEvent event) {

    }

    @FXML
    void mocktail(ActionEvent event) {

    }

    @FXML
    void red(ActionEvent event) {

    }

    @FXML
    void redbull(ActionEvent event) {

    }

    @FXML
    void rose(ActionEvent event) {

    }

    @FXML
    void rum(ActionEvent event) {

    }

    @FXML
    void safari(ActionEvent event) {

    }

    @FXML
    void snapp(ActionEvent event) {

    }

    @FXML
    void spark_tonicWater(ActionEvent event) {

    }

    @FXML
    void sprite(ActionEvent event) {

    }

    @FXML
    void still(ActionEvent event) {

    }

    @FXML
    void strawberry(ActionEvent event) {

    }

    @FXML
    void sweetWhite(ActionEvent event) {

    }

    @FXML
    void tequila(ActionEvent event) {

    }

    @FXML
    void todaySpecial(ActionEvent event) {

    }

    @FXML
    void turquishLiquor(ActionEvent event) {

    }

    @FXML
    void tusker(ActionEvent event) {

    }

    @FXML
    void vanilla(ActionEvent event) {

    }

    @FXML
    void vodka(ActionEvent event) {

    }

    @FXML
    void white(ActionEvent event) {

    }
}
