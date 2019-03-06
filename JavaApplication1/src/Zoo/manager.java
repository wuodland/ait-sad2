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
public class manager {
    
    private AnimalBuilder animalBuilder;
    
    public manager(AnimalBuilder animalBuilder){
        this.animalBuilder = animalBuilder;
    }

    manager() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Animal1 getAnimal(){
        
        return this.animalBuilder.getAnimal();
    }
    
    public void makeAnimal(){
        
        this.animalBuilder.buildName();
        this.animalBuilder.buildHabitat();
        this.animalBuilder.buildRisk();
        this.animalBuilder.buildDescription();
    }

}
