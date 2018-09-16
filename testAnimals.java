/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuna;

/**
 *
 * @author George
 */
public class testAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //adding objts in arrays super/subclass
        AnimalList ALO = new AnimalList();
        dog d = new dog();
        fish f = new fish();
        ALO.add(d);
        ALO.add(f);

        animal[] aList = new animal[2];
        
        aList[0] = d;
        aList[1] = f;
        
        for(animal x: aList){
           x.noise();
        }
    }

}
