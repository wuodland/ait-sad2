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
abstract class bikedecorator implements bike {
    
    protected bike tempbike;
    
    public bikedecorator(bike newbike){
        tempbike =newbike;
    }
    public String getDescription(){
        return tempbike.getDescription();
    }
    
    
    public int getCost(){
        return tempbike.getCost();
    }
    
    
}
