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
public class time {

    private int hour;
    private int minute;
    private int second;

    
   

    public void setTime(int h, int m, int s) {
        hour = ((h > 0 && h < 24) ? h : 0);
        minute = ((h > 0 && m < 60) ? m : 0);
        second = ((h > 0 && m < 60) ? s : 0);
    }
    
    public String toMilitary(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    
    public String toString(){
        
        return String.format("%d:%02d:%02d %s", ((hour ==0 || hour == 12)?12:hour%12), minute, second, (hour<12? "AM":"PM") ) ;
    }
}
