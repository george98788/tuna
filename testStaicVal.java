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
public class testStaicVal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StaticVariables member1 = new StaticVariables("george", "Ellicott");
        StaticVariables member2 = new StaticVariables("adam", "bang");
        StaticVariables member3 = new StaticVariables("taylor", "smooth");

        System.out.println("");

        System.out.println(member2.getFirst());
        System.out.println(member2.getLast());
        System.out.println(StaticVariables.getMembers());

    }

}
