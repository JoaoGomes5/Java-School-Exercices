package invertwrite;
import java.util.Scanner;
import java.*;

public class InvertWrite {

    static void invertWrite(String phase){
        System.out.println(new StringBuilder(phase).reverse().toString());
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phase = "";
        
        System.out.println("Insira o texto que deseja");
        phase = sc.nextLine();
        
        invertWrite(phase);
    }
    
}
