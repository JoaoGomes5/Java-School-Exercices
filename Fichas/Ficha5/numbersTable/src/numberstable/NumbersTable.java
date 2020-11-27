package numberstable;
import java.util.Scanner;

public class NumbersTable {

    static void numberTable(int number){
        for (int i = 1; i < 11; i++) {
            System.out.println(number + " * " + i + " = " + (i * number) );
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        
        System.out.println("Insira o numero do qual quer a tabuada");
        number = sc.nextInt();
        numberTable(number);
    }
    
}
