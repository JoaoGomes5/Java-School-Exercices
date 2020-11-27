
package revertarray;

import java.util.Scanner;
public class RevertArray {

    public static void main(String[] args) {
        int length = 0; 
        
        Scanner scanner = new Scanner(System.in);
        
        do {
           System.out.println("Escreva o tamanho do array");
           length = scanner.nextInt();
        } while(length < 1);
            
          int[] data = new int[length];
          
          for (int i = 0; i < length; i++) {
              System.out.println("Escreva o valor da posição " + (i+1) );
              data[i] = scanner.nextInt();
          }
          
          
          for (int k = length-1; k >= 0; k--) {
              System.out.println(data[k]);
        }
            
    }
    
}
