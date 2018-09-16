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
public class polymorph {

    public static void main(String[] args) {
        //polymorphic array
        foods bucky[] = new foods[2];
        bucky[0] = new buckiesInheritance();
        bucky[1] = new buckiesInheritance2();
        // calls eat method in each class
        for (int x = 0; x < 2; ++x) {
            bucky[x].eat();
        }

        PolymorphicArguements foods1 = new PolymorphicArguements();
        //foods theFoods = new foods(); ABSTRACTION STOPS CREATION OF OBJT
        buckiesInheritance foods2 = new buckiesInheritance();
        buckiesInheritance2 foods3 = new buckiesInheritance2();
        //foods1.digest(theFoods);
        foods1.digest(foods2);
        foods1.digest(foods3);
    }
}
