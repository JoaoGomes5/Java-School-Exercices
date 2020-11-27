package pairorodd;
import java.util.Scanner;

public class PairOrOdd {
    
    static void pairOrOdd(int number){
        if((number % 2) == 0){
            System.out.println("O numero é par");
        }else System.out.println("O numero é impar");
    }
    
    public static void main(String[] args) {
        
       int number;
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Insira um numero");
        number = sc.nextInt();
        
        pairOrOdd(number);
    }
    
}
