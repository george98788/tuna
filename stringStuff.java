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
public class stringStuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] words = {"funk", "chunk", "furry", "baconator"};

        //starts with method
        for (String w : words) {
            if (w.startsWith("fu")) {
                System.out.println(w + " starts with fu");
            }

        }
        for (String w : words) {
            if (w.endsWith("unk")) {
                System.out.println(w + " ends with unk");
            }
        }

        String s = "georgeellicottishere";
        //optional starting point - 5
        System.out.println(s.indexOf("cott", 5));

        String a = "Bacon ";
        String b = "monster";
        //simple concatenation
        System.out.println(a+b);
         //concatenation
         System.out.println(a.concat(b));
         //replacing strings
         System.out.println(a.replace('B', 'F'));
         
         System.out.println(b.toUpperCase());

    }
}
