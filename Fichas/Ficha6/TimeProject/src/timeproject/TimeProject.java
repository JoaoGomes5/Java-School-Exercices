/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeproject;
import java.util.Scanner;


/**
 *
 * @author João Gomes
 */
public class TimeProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        
        Time hour1 = new Time();
        System.out.println("Insira a sua hora");
        
        System.out.println("Horas");
        int hour1Hour = sc.nextInt();
        
        System.out.println("Minutos");
        int hour1Minutes = sc.nextInt();
        
        System.out.println("Segundos");
        int hour1Seconds = sc.nextInt();
        
        hour1.setTime(hour1Hour, hour1Minutes, hour1Seconds);
        
        Time hour2 = new Time();
        System.out.println("Insira a outra hora");
        
        System.out.println("Horas");    
        int hour2Hour = sc.nextInt();
        
        System.out.println("Minutos");
        int hour2Minutes = sc.nextInt();
        
        System.out.println("Segundos");
        int hour2Seconds = sc.nextInt();
        
        hour2.setTime(hour2Hour,hour2Minutes,hour2Seconds);
        
        
       if(hour1.compareTimes(hour2)){
           System.out.println("O maior é a minha");
       }else System.out.println("O maior é a outra");
       
        System.out.println("A diferença entre os segundos das horas é "  + hour1.secondsDiference(hour2));
        
        
        
    }
    
}
