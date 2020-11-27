import java.util.*;

public class hiposenusa {
    public static void main(String[] args) throws Exception {
        int catetoOne , catetoTwo;
        double hipotenusa;

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o cateto 1");
        catetoOne = ler.nextInt();
        System.out.println("Insira o cateto 1");
        catetoTwo = ler.nextInt();


        hipotenusa = Math.round(
                       Math.sqrt( 
                         Math.pow(catetoOne, 2) + Math.pow(catetoTwo, 2) 
                            )
                      );
        System.out.println();     
        System.out.println("A hipotenusa é " + hipotenusa);

    }
}
