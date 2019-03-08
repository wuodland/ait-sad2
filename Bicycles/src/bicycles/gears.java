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
        Specifications sp=new Specifications();
        if (sp.geared() == true)
        {    
            
            System.out.println("Gears: "+sp.geartype());
            if(sp.geartype()=="Back Only")
                
                return tempbike.getCost() + 500;
            else
                return tempbike.getCost() + 1000;
        }
        else{
            System.out.println("without gears");
            return tempbike.getCost();
        }
            
    }
}
