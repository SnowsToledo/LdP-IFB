import java.util.Scanner;
public class Code {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int vet[]=new int[10];
		int fim[]=new int[10];
		for(int c =0;c<10;c++) {
			vet[c]=in.nextInt();
			if(vet[c]%2==0) {
				fim[c]=vet[c]/2;
			}else {
				fim[c]=vet[c]*3;
			}
		}
		System.out.print("Vetor original: ");
		for(int c = 0;c<10;c++) {
			System.out.print(vet[c]+" ");
		}
		System.out.println();
		System.out.print("Vetor modificado: ");
		for(int c = 0;c<10;c++) {
			System.out.print(fim[c]+" ");
		}
	}

}
