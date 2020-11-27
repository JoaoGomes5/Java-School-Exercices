package vectores;

import java.util.Scanner;

public class Vectores {
    
     public  static int[] readVector(int n){
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Insira o valor da " + (i+1) + " posição do vetor");
            vector[i] = sc.nextInt();
        }
        
        return vector;

    }
    
    public static int higherValueOnArray(int[] vector, int n){
        int max = vector[0];
        
        for (int i = 0 ; i < n ; i++) {
            
          if(vector[i] >= max){
              max = vector[i];
          }
        }
        return max;
    }
     
    public  static int lowValueOnArray(int[] vector, int n){
        int low = vector[0];
        
        for (int i = 0 ; i < n ; i++) {
            
          if(vector[i] <= low){
              low = vector[i];
          }
        }
        return low;
    }
     
    public  static double mediaValueOnArray(int[] vector, int n ){
         int sum = 0; 
         
         for (int i = 0; i < n; i++) {
            sum += vector[i];
         }
         
         return sum / n;
     }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = 0;
        int max = 0;
        int low = 0;
        double media = 0;
        
        System.out.println("Insira o tamanho do vextor");
        n = sc.nextInt();
        
       int []vector = readVector(n);
            
       max = higherValueOnArray(vector,n);
       System.out.println("O maior valor é " + max);
       
       low = lowValueOnArray(vector,n);
       System.out.println("O menor valor é " + low);
       
       media = mediaValueOnArray(vector, n);
       System.out.println("A média é " + media);
    }
    
}
