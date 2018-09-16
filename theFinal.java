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
public class theFinal {

    private int sum;
    private final int NUMBER;

    public theFinal(int NUMBER) {
        this.NUMBER = NUMBER;
    }
 public void add(){
     sum += this.NUMBER;
 }
 
 public String toString(){
     return String.format("sum = %d \n", sum);
 }
}
