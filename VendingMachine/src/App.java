

import Domen.Bottle;
import Domen.Hot_drink;
import Domen.Product;
import VendingMachines.VendingMachine;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Product item1 = new Product(1, "Lays", "Чипсы", 59);
        item1.setPrice(98);
        Product item2 = new Bottle(2, "Cola", "Water", 70, 500);
        Product item3 = new Hot_drink(5, "Latte", "Coffee", 150, 90);

        VendingMachine iMachine = new VendingMachine(300);
        iMachine.addProduct(item1);
        iMachine.addProduct(item2);
        iMachine.addProduct(new Product(3, "Масло", "Масло", 59));
        iMachine.addProduct(new Bottle(4, "Water", "Water", 170, 1500));
        iMachine.addProduct(item3);
        iMachine.addProduct(new Hot_drink(5, "Espresso", "Coffee", 120, 90));
        

        MyFrameVersion frame = new MyFrameVersion(iMachine.getProducts());
        frame.setVisible(true);
       

    }
}
