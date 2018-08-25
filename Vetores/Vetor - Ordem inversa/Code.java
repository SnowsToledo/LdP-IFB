import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int vet[]=new int[10];
		for(int c = 0;c<10;c++) {
			vet[c]=in.nextInt();
		}
		for(int c = 0;c<10;c++) {
			System.out.printf("%d, ",vet[c]);
		}
		System.out.println();
		for(int c = 9;c>=0;c--) {
			System.out.printf("%d, ",vet[c]);
		}
	}

}
