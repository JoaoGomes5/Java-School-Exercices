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
        
        public void setTime(int hour, int minutes, int seconds){
            this.hour = hour;
            this.minutes = minutes;
            this.seconds = seconds;
        }
        
        public String getTimeFormatted(){
            
            String formattedHour = (this.hour + ":" + this.minutes + ":" + this.seconds);
            
            return formattedHour;
        }
        
        public String getTimeOfDay(){
               
            if(hour <=12  && hour >= 00){
                String formattedHour = (this.hour + ":" + this.minutes + ":" + this.seconds + "PM");
                
                return formattedHour;
            }else {
                 String formattedHour = (this.hour + ":" + this.minutes + ":" + this.seconds + "AM");
                 
                 return formattedHour;
            }
           
        }
        
        public boolean compareTimes(Time otherTime){
            
            if(this.hour > otherTime.hour && this.hour != otherTime.hour){
                return true;
            }
            
            if(this.hour == otherTime.hour){
                if(this.minutes > otherTime.minutes){
                    return true;
                }
                if(this.minutes == otherTime.minutes){
                    if(this.seconds > otherTime.seconds){
                        return true;
                    }
                }
            }
            
            return false;
        }
        
        public int secondsDiference(Time otherTime){
            
            int diference = Math.abs(this.seconds - otherTime.seconds);
            
            return diference;
       }
        
        public void timeDiference(Time otherTime){
           
        }
        
        
}
