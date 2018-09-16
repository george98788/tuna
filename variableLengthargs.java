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
public class variableLengthargs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int args passed to average
        System.out.println(average(44,33,22,1,6,8,9));
        System.out.println(average(44,33,22));
        
         //String args passed to average
         String word1 = "Hello";
         String word2 = "Hi";
         String word3 = "George";
         
          System.out.println(sentences(word1,word3));
         System.out.println(sentences(word2,word3));
         System.out.println(sentences(word1,"there","would you like","coffee"));
         
    }
  public static int average(int...numbers){
      int total = 0;
      for (int x: numbers){
          total+=x;
          
      }
      return total/numbers.length;
  } 
  
   public static String sentences(String...words){
      String newSentenace = "";
      for (String x: words){
      newSentenace =  newSentenace + x; 
      newSentenace =  newSentenace + " ";  
      }
      return newSentenace;
  
}
}
