package plusfunction;
import java.util.Scanner;

public class PlusFunction {
    
    static int plusTwoNumbers(int number1 , int number2){
        return (number1 + number2);
    }
 
    public static void main(String[] args) {
        int number1 = 0, number2 = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o primeiro número");
        number1 = sc.nextInt();
      
        System.out.println("Insira o segundo número");
        number2 = sc.nextInt();
        
        
        
        System.out.println("A soma de " + number1 + " com " + number2 + " é "  + plusTwoNumbers(number1, number2));
    }
    
}
