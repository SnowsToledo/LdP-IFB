package sources;
import java.util.Scanner;
/**
 *
 * @author wanghley
 */
public class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int soma=0;
        do{
            soma+=in.nextInt();
        }while(soma<=100);
        System.out.println("A soma utrapassou 100.");
        System.out.println("Soma = "+soma);
    }
    
}
