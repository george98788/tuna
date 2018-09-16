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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author George
 */
public class dogList {

    private dog[] thelist = new dog[5];
    private int i = 0;

    public void add(dog d) {
        if (i < thelist.length) {
            thelist[i] = d;
            System.out.println("dog added at index " + i);
            i++;
        }

    }
}
