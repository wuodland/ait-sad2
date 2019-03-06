/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;
import java.util.Scanner;
/**
 *
 * @author abhinavsingha
 */
public class Animal1  implements NewAnimal{
 
    private String name;
    private String habitat;
    private String risk;
    private String description;

    
    
  

    @Override
    public void setName(String NewName) {
        name=NewName;
    }

    @Override
    public void setHabitat(String NewHabitat) {
        habitat=NewHabitat;
    }

    @Override
    public void setRisk(String NewRisk) {
        risk=NewRisk;
    }

    @Override
    public void setDescription(String NewDescription) {
        description=NewDescription;   
    }
    public String getName(){    return name;    }
        
    public String getDescription(){    return description;    }
    
    public String getRisk(){    return risk;    }
    
    public String getHabitat(){    return habitat;    }
    
    
    
}
