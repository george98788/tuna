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
public class simpleRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //JUST TO SEE COMMIT CHANGE ON GIT
          //JUST TO SEE COMMIT CHANGE ON GIT desktop
        System.out.println(fact(30));
    }

    //factorial
    public static long fact(long n) {
        if (n <= 1) {
            return 1;
        } else {
          return n * fact(n-1);
         
        }
       
    }

}
