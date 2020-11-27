package invertarray;
import java.util.Scanner;

public class InvertArray {
    
    static int[] readVector(int n){
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Insira o valor da " + (i+1) + " posição do vetor");
            vector[i] = sc.nextInt();
        }
        
        return vector;

    }
    
     static void invertArray(int[] vector, int n){
         System.out.println("Vector invertido");
         
        for (int i = n - 1; i >= 0 ; i--) {
            System.out.print(vector[i]);
            if(i != 0){
                System.out.print(" , "); 
            }
        }
        
         System.out.println("");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        
        System.out.println("Insira o tamanho do vextor");
        n = sc.nextInt();
        
       int []vector = readVector(n);
            
        invertArray(vector,n);
    }
    
}
