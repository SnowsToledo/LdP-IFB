package resumo;
import java.util.Scanner;
public class Resumo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		
		//loop bem definido com for
		for (int i = 37; i < 155; i++) {
			if(i!= 48 && i!=49) {
				System.out.println("ol� "+i);
			}
		}
		//loop bem definido com while
		int i = 154;
		while ( i >= 37 ) {
			if(i!= 48 && i!=49) {
				System.out.println("ol� "+i);
			}
			i--;
		}
		
		//Loop definido pelo usu�rio
		System.out.println("inicio:");
		int inicio = teclado.nextInt();
		System.out.println("fim:");
		int fim = teclado.nextInt();
		for (int j = inicio; j <= fim; j++) {
			System.out.println(j);
		}
		
		//Loop limitado por um valor digitado
		int soma = 0;
		int o;
		System.out.println("digite que eu vou somando, se for zero eu paro.");
		do {
			o = teclado.nextInt();
			soma = soma + o;
			System.out.println("soma "+ soma);
		}while(o!=0);
		
		//Loop limitado por um valor digitado
		int soma2 = 0;
		int n=0;
		System.out.println("digite que eu vou somando, se for negativo eu paro.");
		while(n>=0) {
			soma2 = soma2 + n;
			n = teclado.nextInt();
			System.out.println("soma "+ soma2);
		}
		
		//Loop limitado por uma soma
		int soma3 = 0;
		int m;
		System.out.println("digite que eu vou somando, quando a soma passar de 100 eu paro.");
		while(soma3<=100) {
			m = teclado.nextInt();
			soma3 = soma3 + m;
			System.out.println("soma "+ soma3);
		}
    }
    
}
