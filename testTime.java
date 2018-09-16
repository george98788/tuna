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
public class testTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        time timeobject = new time();
        System.out.println(timeobject.toMilitary());
        System.out.println(timeobject.toString());
        
        timeobject.setTime(13, 27, 6);
        System.out.println(timeobject.toMilitary());
        System.out.println(timeobject.toString());
    }
    
}
