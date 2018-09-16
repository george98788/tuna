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
public class compositionLinkwithToStringclass {

    private String name;
    private theToString birthday;
    
    public compositionLinkwithToStringclass(String theName, theToString theBirthday ){
        name = theName;
        birthday = theBirthday;
    }
    
    public String toString(){
        return String.format("my name is %s , my birthday is %s", name,birthday );
    }
}
