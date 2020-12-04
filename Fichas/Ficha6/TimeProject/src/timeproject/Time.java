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
public class Time {
        private int hour;
        private int minutes;
        private int seconds;
    
        public Time() {
            hour = 0;
            minutes = 0; 
            seconds= 0;
        }
        
        public void setSeconds(){
            this.seconds++;
        }
        
        public String getTimeFormatted(int hour, int minute, int seconds ){
            
            String formattedHour = (hour + ":" + minute + ":" + seconds);
            
            return formattedHour;
        }
        
        public String getTimeOfDay(int hour, int minute, int seconds ){
            
            
            if(hour <=12  && hour >= 00){
                String formattedHour = ( this.getTimeFormatted(hour, minute, seconds)  + "PM");
                
                return formattedHour;
            }else {
                 String formattedHour = (this.getTimeFormatted(hour, minute, seconds) + "AM");
                 
                 return formattedHour;
            }
           
        }
        
        
        
}
