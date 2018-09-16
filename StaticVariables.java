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
public class StaticVariables {

   
    private String first;
     private String last;
      private static int members =0;
      
      
     public StaticVariables(String first, String last) {
        this.first = first;
        this.last = last;
        members++;
         System.out.printf("Constructor for %s %s, members in the club : %d \n",first,last,members );
    }  

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public static int getMembers() {
        return members;
    }
    
}
