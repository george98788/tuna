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
public enum enumationPratice {

    george("nice", "30"),
    bucky("boring", "50"),
    jane("bigmistake", "44"),
    nikki("italian", "23"),
    candy("different", "14"),
    charlie("class", "20");

    private final String desc;
    private final String year;
    
    enumationPratice(String description, String birthday){
        desc =description;
         year =birthday;
    }
    
    public String getDesc(){
        return desc;
    }
    
    public String getyear(){
        return year;
    }
}
