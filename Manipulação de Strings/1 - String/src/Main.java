/*1) Faça um programa que, a partir de uma string digitada pelo usuário, imprima:
a) O número de caracteres da string.
b) A string com todas suas letras em maiúsculo.
c) O número de vogais da string.
d) Se a string digitada começa com “oi” (ignorando maiúsculas/minúsculas).
e) Se a string digitada termina com “tchau” (ignorando maiúsculas/minúsculas).
f) O número de dígitos (0 a 9) da string.
g) Se a string é um palíndromo ou não. */
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite uma String: ");
		String frase = in.nextLine();
		int nCarac = frase.length(),vogais=0;
		char letra;
		System.out.println("Nº de Caracteres: "+nCarac);
		System.out.println("Maiúsculo: "+frase.toUpperCase());
		for(int c = 0;c<frase.length();c++) {
			letra = frase.charAt(c);
			if(letra=='a') {
				vogais++;
			}else if(letra=='e') {
				vogais++;
			}else if(letra=='i') {
				vogais++;
			}else if(letra=='o') {
				vogais++;
			}else if(letra=='u') {
				vogais++;
			}
		}
		System.out.println("Nº de voagais: "+vogais);
		if(frase.startsWith("oi")) {
			System.out.println("Começa com oi!");
		}else if(frase.endsWith("tchau")) {
			System.out.println("Termina com tchau");
		}
		int digitos=0;
		String x="";
		for(int c =0;c<frase.length();c++) {
			x = frase.charAt(c)+"";
			if(x.matches("[0-9]")) {
				digitos++;
			}
		}
		System.out.println("Possui "+digitos+" números");
		String inverso = frase.substring(frase.length(), 0);
		System.out.println(inverso);
		//for(int c = 0;c<)
		
		
	}

}
