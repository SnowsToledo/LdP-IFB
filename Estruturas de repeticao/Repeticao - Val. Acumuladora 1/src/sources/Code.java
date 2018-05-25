package sources;

import java.util.Scanner;

/**
 * @author wanghley
 */
public class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num,rep=1,soma=0;
        do{
            System.out.printf("Digite o %dº valor: ",rep);
            num = in.nextInt();
            if(num!=-1){
                soma+=num;
            }
            rep+=1;
        }while(num!=-1);
        System.out.println("Soma = "+soma);
    }
    
}
