package vectores;
import java.util.Scanner;

public class twoVectors {
    
    public static int[] sumVectores(int[] arrayOne, int[] arrayTwo){
        
        int[] finalArray = new int[arrayOne.length];
        
        for (int i = 0; i < arrayOne.length; i++) {
            finalArray[i] = arrayOne[i] + arrayTwo[i];
        }
        
        return finalArray;
    }
    
    public static void writeArray(int[] array){
        for (int i = 0 ; i < array.length; i++) {
            System.out.print(array[i]);
            if(i != array.length){
                System.out.print(" , "); 
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int n = 0;
        int vectorOneSize = 0;
        int vectorTwoSize = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o tamanho do 1 vetor");
        vectorOneSize = sc.nextInt(); 
        int []vectorOne = Vectores.readVector(vectorOneSize);
        
        int[] finalArray = new int[vectorOneSize];
                

        System.out.println("Insira o tamanho do 2 vetor");
        vectorTwoSize = sc.nextInt();
        int []vectorTwo = Vectores.readVector(vectorTwoSize);
        
        if( vectorOneSize == vectorTwoSize ){
           finalArray = sumVectores(vectorOne,vectorTwo);
          writeArray(finalArray);
        }else{
             System.out.println("Insira o mesmo tamanho para os vetores");
        }
    }
}
