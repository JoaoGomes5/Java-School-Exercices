import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) throws Exception {
        int days, months, years, result;

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira a sua idade em dias, meses e anos que tem");
        days = ler.nextInt();
        months = ler.nextInt();
        years = ler.nextInt();
        
        result = (years * 365) + (months * 30) + days;

        System.out.println(result);
        



    }
}
