/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;

/**
 *
 * @author abhinavsingha
 */
public interface AnimalBuilder {
    
    public void buildName();
    
    public void buildHabitat();
    
    public void buildRisk();
    
    public void buildDescription();
    
    public Animal1 getAnimal();
}
