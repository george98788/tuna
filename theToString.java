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
public class theToString {

    private int year;
    private int month;
    private int day;

    public theToString(int y, int m, int d) {
        year = y;
        month = m;
        day = d;

        System.out.printf("the constructor this is %S \n", this);
    }

    public String toString() {
        return String.format("%d/%d/%d", day, month, year);
    }
}
