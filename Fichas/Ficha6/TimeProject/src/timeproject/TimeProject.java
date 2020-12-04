/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeproject;



/**
 *
 * @author João Gomes
 */
public class TimeProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Time now = new Time();
        
        System.out.println(now.getTimeOfDay(13, 20, 2));
        
        
        
    }
    
}
