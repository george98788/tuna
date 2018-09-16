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
public class multiArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int firstArrays[][]={{6,7,8,7},{1,2,3}};
        int secondArrays[][]={{6,7,8,7,6,7,21,1},{1,2,3},{55,66,77}};
        System.out.println("First array");
        display(firstArrays);
        System.out.println("second array");
        display(secondArrays);
        
    }
    public static void display(int x[][]){
        for (int row =0 ; row<x.length;row++){
            for(int columns=0;columns<x[row].length;columns++ ){
                System.out.print(x[row][columns]+"\t");
            }
            System.out.println();
        }
    }
    }
    

