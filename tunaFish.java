package tuna;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author George
 */
public class tunaFish {
    private String girlName;
    public tunaFish(){
         girlName = "not given yet";
    }
      public tunaFish(String name){
         girlName = name;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    }
    public void setName(String name){
        girlName = name;
        
    }
     public String getName(){
         return girlName;
     }
     public void saying(){
         System.out.printf("Your first gf was %s", getName());
     }
}
