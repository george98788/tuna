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
public class AnimalList {
    private animal[] thelist = new animal[5];
    private int i = 0;
    
    public void add(animal a){
        if (i < thelist.length){
            thelist[i] = a;
            System.out.println("The Animal added at " + i);
            i++;
        }
    }
}
