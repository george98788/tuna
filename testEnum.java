/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuna;

import java.util.EnumSet;

/**
 *
 * @author George
 */
public class testEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (enumationPratice people : enumationPratice.values()) {
            System.out.printf("Thier name is %s and they are %s years old they are %s\n", people, people.getyear(), people.getDesc());

        }
        System.out.println("\n and now for the range of constants!!");
        for (enumationPratice people : EnumSet.range(enumationPratice.bucky, enumationPratice.nikki)) {
            System.out.printf("Thier name is %s and they are %s years old they are %s\n", people, people.getyear(), people.getDesc());

        }
    }

}
