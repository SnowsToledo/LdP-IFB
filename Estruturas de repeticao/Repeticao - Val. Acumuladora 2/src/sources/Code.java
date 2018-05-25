package sources;

import java.util.Scanner;

/**
 * @author wanghley
 */
public class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int soma=0;
        for(int c = 0;c<5;c++){
            System.out.printf("Digite o %d valor: ",c+1);
            soma += in.nextInt();
        }
        System.out.println("Soma = "+soma);
    }
    
}
