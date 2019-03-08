/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycles;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author karan
 */
import javax.swing.JDialog;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
public class Bicycles {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        
  

           try {
            // Set System L&F
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
                } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                    System.out.println(ex.getMessage());
                }

        Specifications sForm = new Specifications();
        sForm.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        sForm.pack();
        sForm.setLocationRelativeTo(null);

        sForm.setVisible(true);

        
       /* listPurchases lP = new listPurchases();
         lP.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        lP.pack();
        lP.setLocationRelativeTo(null);

        lP.setVisible(true);
        */
    
    
        
       
       /* Purchase p1 = dao.getPurchase(3);
        System.out.println(p1.buyer);
        Purchase p2 = new Purchase();
        
        p2.buyer= "salih";
        p2.price=400;
        dao.addPurchase(p2);
      */  
       // System.out.println(DBUtilities.count);        
    }
    
}
