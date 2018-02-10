package hsms;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;

public class RestaurantController {

    @FXML
    private AnchorPane restaurantPane;

    @FXML
    void Back(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
       restaurantPane.getChildren().setAll(pane);
    }

    @FXML
    void LogOut(ActionEvent event) throws IOException{
        AnchorPane pane = FXMLLoader.load(getClass().getResource("LogIn.fxml"));
       restaurantPane.getChildren().setAll(pane);
    }

    

    @FXML
    void genRestaurant(ActionEvent event) {

    }

    @FXML
    void newRestaurant(ActionEvent event) {

    }

    @FXML
    void printRestaurant(ActionEvent event) {

    }
    @FXML
    private TableColumn<?, ?> restaurantID;

    @FXML
    private TableColumn<?, ?> quantity_restaurant;

    @FXML
    private TableColumn<?, ?> amount_restaurant;

    @FXML
    private TableColumn<?, ?> itemID1;

    @FXML
    private TableColumn<?, ?> CustomerID_restaurant;

    @FXML
    private TableColumn<?, ?> payment_restaurant;

    @FXML
    private TableColumn<?, ?> RestaurantAmount;

    @FXML
    private TableColumn<?, ?> roomNum_restaurant;

    @FXML
    private TableColumn<?, ?> date_restaurant;

    @FXML
    private TableColumn<?, ?> time_restaurant;

    @FXML
    void VegPizza(ActionEvent event) {

    }

    @FXML
    void apple_pie(ActionEvent event) {

    }

    @FXML
    void assortedBiscuits(ActionEvent event) {

    }

    @FXML
    void assortedPies(ActionEvent event) {

    }

    @FXML
    void assortedVegs(ActionEvent event) {

    }

    @FXML
    void bagels(ActionEvent event) {

    }

    @FXML
    void baguette(ActionEvent event) {

    }

    @FXML
    void bakedBeans(ActionEvent event) {

    }

    @FXML
    void brownBread(ActionEvent event) {

    }

    @FXML
    void burgers(ActionEvent event) {

    }

    @FXML
    void chapati(ActionEvent event) {

    }

    @FXML
    void cheese_cake(ActionEvent event) {

    }

    @FXML
    void chefSoup(ActionEvent event) {

    }

    @FXML
    void chicken(ActionEvent event) {

    }

    @FXML
    void chickenPizza(ActionEvent event) {

    }

    @FXML
    void chips(ActionEvent event) {

    }

    @FXML
    void chocMuffin(ActionEvent event) {

    }

    @FXML
    void chocolateCake(ActionEvent event) {

    }

    @FXML
    void cracker(ActionEvent event) {

    }

    @FXML
    void donut(ActionEvent event) {

    }

    @FXML
    void eclairs(ActionEvent event) {

    }

    @FXML
    void fish(ActionEvent event) {

    }

    @FXML
    void frenchToast(ActionEvent event) {

    }

    @FXML
    void fried_noodles(ActionEvent event) {

    }

    @FXML
    void fruitPudding(ActionEvent event) {

    }

    @FXML
    void fruitSala(ActionEvent event) {

    }

    @FXML
    void garlci_bread(ActionEvent event) {

    }

    @FXML
    void githeri(ActionEvent event) {

    }

    @FXML
    void halwa(ActionEvent event) {

    }

    @FXML
    void jalebi(ActionEvent event) {

    }

    @FXML
    void jamTarts(ActionEvent event) {

    }

    @FXML
    void jelly(ActionEvent event) {

    }

    @FXML
    void kulfi(ActionEvent event) {

    }

    @FXML
    void mandazi(ActionEvent event) {

    }

    @FXML
    void masala_chips(ActionEvent event) {

    }

    @FXML
    void mukimo(ActionEvent event) {

    }

    @FXML
    void mutton_beefRice(ActionEvent event) {

    }


    @FXML
    void oatmeal(ActionEvent event) {

    }

    @FXML
    void omelllete(ActionEvent event) {

    }

    @FXML
    void onionFries(ActionEvent event) {

    }

    @FXML
    void paneerCurry(ActionEvent event) {

    }

    @FXML
    void porridge(ActionEvent event) {

    }

    @FXML
    void quiche(ActionEvent event) {

    }

    @FXML
    void salad_dip(ActionEvent event) {

    }

    @FXML
    void sandwich(ActionEvent event) {

    }

    @FXML
    void scrambledEggs(ActionEvent event) {

    }

    @FXML
    void steak_pork(ActionEvent event) {

    }

    @FXML
    void sukuma(ActionEvent event) {

    }

    @FXML
    void tiramisu(ActionEvent event) {

    }

    @FXML
    void tunaSandwich(ActionEvent event) {

    }

    @FXML
    void ugali(ActionEvent event) {

    }

    @FXML
    void veg_pasta(ActionEvent event) {

    }

    @FXML
    void veg_pilau(ActionEvent event) {

    }

    @FXML
    void waffles(ActionEvent event) {

    }

    @FXML
    void wraps(ActionEvent event) {

    }

}
