/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuna;
import java.util.Random;
/**
 *
 * @author George
 */
public class randomDice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Random dice = new Random();
      int number;
      
      for (int i = 1; i <= 10; i++){
          number = dice.nextInt(6);
          System.out.println(number+1);
      }
         Random dice2 = new Random(); 
         int freq[] = new int[7];
         
         for (int roll = 1; roll < 1000; roll++){
             ++freq[1+dice2.nextInt(6)];
         }
         System.out.println("face \tFrequency");
         for (int face= 1; face < freq.length;face++){
             System.out.println(face+"\t"+freq[face]);
         }
    }
    
}
