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
public class testTimeMultConstructors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mutiConstructors objectsMultiConstructorsOB = new mutiConstructors();
        mutiConstructors objectsMultiConstructorsOB2 = new mutiConstructors(5);
        mutiConstructors objectsMultiConstructorsOB3 = new mutiConstructors(5, 13);
        mutiConstructors objectsMultiConstructorsOB4 = new mutiConstructors(25, 13, 63);

        System.out.printf("%s\n", objectsMultiConstructorsOB.toMilitary());
        System.out.printf("%s\n", objectsMultiConstructorsOB2.toMilitary());
        System.out.printf("%s\n", objectsMultiConstructorsOB3.toMilitary());
        System.out.printf("%s\n", objectsMultiConstructorsOB4.toMilitary());

    }

}
