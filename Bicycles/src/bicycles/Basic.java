/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycles;

/**
 *
 * @author abhinavsingha
 */
public class Basic implements bike {

    @Override
    public String getDescription() {
        return "basic bike";
    }

    @Override
    public int getCost() {
        return (500);
    }
    
}
