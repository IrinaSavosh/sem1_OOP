

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Domen.Product;

public class MyFrameVersion extends JFrame {

   JButton confirmation;
   JCheckBox j;
   String order = "";
   double sum = 0.0;
  

   /**
    * @param products
    */
   public MyFrameVersion(ArrayList<Product> products) {
      super("VendingMachine"); // название заголовка
      super.setBounds(200, 100, 800, 500); // отступ слева сверху + размер:ширина и
                                           // длина окна
      super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие приложения при нажатии на Х

      Container container = super.getContentPane(); // открытие контейнера
      container.setLayout(new GridLayout(products.size(), 1, 2, 12));

      for (Product i : products) {
         j = new JCheckBox(i.toString(), false);

         container.add(j);


      }

      confirmation = new JButton("Заказать");
      container.add(confirmation);

      /// сделать черенз перебор - это галка

      confirmation.addActionListener(new Press(container, order, sum));
   }

   class Press implements ActionListener {

      String order;
      double sum;

      /**
       * @param containers
       * @param order
       * @param sum
       */
      public Press(Container containers, String order, double sum) {

      
      }

      @Override
      public void actionPerformed(ActionEvent e) {

         JOptionPane.showMessageDialog(null, "Ваш заказ " + order + " на сумму " + sum, order,
               JOptionPane.PLAIN_MESSAGE);

      }
      
   }  
}
