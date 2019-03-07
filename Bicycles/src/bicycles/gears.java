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
public class gears extends bikedecorator {
    
    public gears(bike newbike){
        super(newbike);
        System.out.println("Basic Bike");
        
        
        System.out.println("Adding gears");
        
        
        
    }
    
    
    @Override
    public String getDescription(){
        return tempbike.getDescription()+", gears";
        
    }
    
    
    @Override
    public int getCost(){
        return tempbike.getCost() + 500;
    }
}
