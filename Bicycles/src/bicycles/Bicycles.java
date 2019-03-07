/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycles;

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
    public static void main(String[] args) {
        
        bike basicbike;
        basicbike = new type(new gears(new Basic()));
        System.out.println("PRICE:" + basicbike.getCost());
        
        
        Specifications sForm = new Specifications();
        sForm.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        sForm.pack();
        sForm.setLocationRelativeTo(null);

        sForm.setVisible(true);
    }
    
}
