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
public class dataArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int george[] = new int [10];
       
       for (int i = 0; i < 10 ; i++){
           george[i] = i;
           System.out.println(george[i]);
       }
       
       int ellicott[] = {2,4,6,5,8,4,65,5};
       for(int name:ellicott){
           System.out.println(name);
           
           
       }
       int numbers[] = {66,88,77,4};
         int h = 0;
           for (int j: numbers){
             
               h++;
               System.out.println(h+ "\t"+j);
           }
    
    }
}
