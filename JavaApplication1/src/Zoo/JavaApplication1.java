/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;
import java.io.*;
/**
 *
 * @author abhinavsingha
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        
        System.out.println("Enter Name");
        String name=br.readLine();
        System.out.println("Enter Habitat");
        String habitat=br.readLine();
        System.out.println("Enter Risk");
        String risk=br.readLine();
        System.out.println("Enter Description");
        String description =br.readLine();
        
        AnimalBuilder newEntry = new Animal(name,habitat,risk,description);
        
        manager manager =new manager(newEntry);
        
        manager.makeAnimal();
        
        Animal1 firstAnimal = manager.getAnimal();
        
        
        System.out.println("Name: "+ firstAnimal.getName());
        System.out.println("Habitat: "+ firstAnimal.getHabitat());
        System.out.println("Risk: "+ firstAnimal.getRisk());
        System.out.println("Description: "+ firstAnimal.getDescription());
        
        // TODO code application logic here
    }
    
}
