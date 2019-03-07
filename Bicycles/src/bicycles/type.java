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
public class type extends bikedecorator {
    
    public type(bike newbike){
        super(newbike);
        System.out.println(" Bike type");     
    }
    
    
    @Override
    public String getDescription(){
        return tempbike.getDescription()+", type";
        
    }
    
    
    @Override
    public int getCost(){
        return tempbike.getCost() + 1500;
    }
}