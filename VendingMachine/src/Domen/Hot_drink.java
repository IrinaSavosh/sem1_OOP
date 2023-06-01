package Domen;

public class Hot_drink extends Product {

   private int temperature;

   /**
    * Create a product for VM
    *
    * @param productId       id product
    * @param productName
    * @param productCategory
    * @param price
    * @throws Exception
    */

   public Hot_drink(int productId, String productName, String productCategory, double price, int temperature) throws Exception {
      super(productId, productName, productCategory, price);
      this.temperature = temperature;
   }

   public int getTemperature() {
      return temperature;
   }

   public void setTemperature(int temperature) {
      this.temperature = temperature;
   }
   
   @Override
   public String toString() {
      return "Product{" +
            "name='" + super.getProductName() + '\'' +
            "category='" + super.getProductCategory() + '\'' +
            ", cost=" + Double.toString(super.getPrice()) +
            ", temperature=" + Integer.toString(temperature) +
            '}';
   }

}
