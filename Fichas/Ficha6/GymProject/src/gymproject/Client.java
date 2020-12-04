/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymproject;
import java.*;
/**
 *
 * @author João Gomes
 */
public class Client {
    
    private String name;
    private String genus;
    private int age;
    private float heigth;
    private float weight;
    private double imc;
    
    public Client() {
        this.imc = 0;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setGenus(String genus){
        this.genus = genus;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setHeigth(float heigth){
        this.name = name;
    }
    public void setWeight(float weight){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    public String getGenus(){
        return this.genus;
    }
    public int getAge(){
        return this.age;
    }
    public float getHeigth(){
        return this.heigth;
    }
    public float getWeigth(){
        return this.weight;
    }
    
    public String relatory(){
        return 
        "O nome do utente é " + this.name + ", com a idade de " +  this.age + " anos do sexo " + this.genus + ". A sua altura é de " + heigth + "metros e o seu peso é de " + this.weight ;
    }
    
   public double calculateIMC(){
       imc = this.weight/(Math.pow(this.heigth, 2));
       return imc;
   }
    
   public String classification(){      

        String result = "";
       if(this.imc<18){
            result = "Magro";
       }
       if(this.imc>18 && imc<15){
           result =  "Saudavel";
       }
       if(this.imc>25){
           result =  "Obeso";
       }

       return result;
   }
    
   public int ageDifference(int otherAge){
       return Math.abs(this.age - otherAge);
   }   

   public String younger(Client otherClient){

       String result = "";
       if(this.age < otherClient.getAge()){
        result = "O mais novo é o/a" + this.name;
       }
       if(this.age > otherClient.getAge()){
        result = "O mais novo é o/a" + otherClient.getName();
       }

       return result;
   }

   public boolean isHealthy(){
       boolean result = false;
       if(this.classification() == "Saudavel"){
        result = true;
       }

       return result;
   }
}
