/*faça um programa que recebe a quantidade de alunos da turma.
 * Em seguida, o usuário digitará a idade de cada aluno da turma. 
 * Você deve armazenar a idade em um vetor. Em seguida, você deve calcular
 * a média das idades*/

import java.util.Scanner;
public class Code {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite a quantidade de alunos:");
		int y = in.nextInt();
		double notas[]=new double[y];
		double soma=0,media;
		for(int c = 0;c<y;c++) {
			notas[c]=in.nextDouble();
			soma+=notas[c];
		}
		media = soma/y;
		System.out.printf("Média de notas = %.2f pts",media);
		
	}

}
