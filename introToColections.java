/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuna;
import java.util.*;
/**
 *
 * @author George
 */
public class introToColections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String[] stuff = {"eggs","lasers","hats","pie"};
       List<String> list1 = new ArrayList<String>();
       
       // add array to list 
       
       for(String x: stuff){
           list1.add(x);
       }
       
       String[] moreStuff =  {"eggs","lasers"};
        List<String> list2 = new ArrayList<String>();
      
         for(String y: moreStuff){
           list2.add(y);
       }
         for(int i = 0; i < list1.size();i++){
             System.out.printf("%s", list1.get(i));
         }
         
         editlist(list1,list2);
         System.out.println("");
         System.out.println("");
             
         for(int i = 0; i < list1.size();i++){
             System.out.printf("%s ", list1.get(i));
         }
    }
    
    public static void editlist(Collection<String> l1,Collection<String> l2){
        Iterator<String> it = l1.iterator();
        while(it.hasNext()){
            if(l2.contains(it.next()))
                it.remove();
        }
    }
    
}
