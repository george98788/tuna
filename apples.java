/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuna;

import java.util.Scanner;

/**
 *
 * @author George
 */
public class apples {
    
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        tunaFish tunaObjt = new tunaFish("hello");
        System.out.println("enter name here: ");
        
        
        tunaObjt.saying();
        String temp = input.next();
        tunaObjt.setName(temp);
        tunaObjt.saying();
    }
}
