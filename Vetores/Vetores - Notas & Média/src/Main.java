import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Digite a quantidade de notas: ");
		int n = in.nextInt(),vet[]=new int[n],soma=0,media;
		
		for(int c = 0;c<n;c++) {
			vet[c]=in.nextInt();
			soma+=vet[c];
		}
		media = soma/n;
		String maior="",menor="";
		for(int c = 0;c<n;c++) {
			if(vet[c]>media) {
				maior+=vet[c]+" ";
			}else if(vet[c]<media) {
				menor+=vet[c]+" ";
			}
		}
		maior = maior.trim();
		menor = menor.trim();
		System.out.printf("Acima da média: %s\n",maior);
		System.out.printf("Abaixo da média: %s\n",menor);
	}

}
