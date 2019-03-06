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
public class Animal implements AnimalBuilder{
    
    private Animal1 animal;
    private String name;
    private String habitat;
    private String risk;
    private String description;
    
    
    public Animal(String n,String h,String r,String d){
        this.animal = new Animal1();
        this.name = n;
        this.habitat=h;
        this.risk=r;
        this.description=d;
    }
    
    @Override
    public void buildName() {
        
       animal.setName(this.name);
    }

    @Override
    public void buildHabitat() {
        animal.setHabitat(this.habitat);
    }

    @Override
    public void buildRisk() {
        animal.setRisk(this.risk);
    }

    @Override
    public void buildDescription() {
        animal.setDescription(this.description);
    }
    
    public Animal1 getAnimal(){
        return this.animal; 
    }
    
}
