package VendingMachines;
import java.util.ArrayList;
// import java.util.List;

import Domen.Product;

public class VendingMachine {
    private int volume;
    private ArrayList<Product> products;

    public VendingMachine(int volume) {
        this.volume = volume;
        products = new ArrayList<Product>();
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public ArrayList<Product> getProducts() {
        return products; // возвращает массив
    }
    public void setProducts(ArrayList<Product> products) {
        this.products = products;  // заполняет массив
    }

    public void addProduct(Product prod)
    {
        products.add(prod);   // Добавление в массив продуктов
    }


}
