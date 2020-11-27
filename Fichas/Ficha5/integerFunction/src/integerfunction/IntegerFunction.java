
package integerfunction;
import java.util.Scanner;

public class IntegerFunction {
    
    static int readInteger(String question){
        int number = 0;
        
        System.out.println(question);
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        
        return number;
    }
    
    public static void main(String[] args) {
        
        int number;
        number = readInteger("Insira um numero");
        System.out.println("O numero é " + number);
        
    }
    
}
