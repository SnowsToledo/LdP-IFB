import java.util.Scanner;
public class Code {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int vet[]=new int[10];
	int ordenado[]=new int[10];
	for(int c = 0;c<10;c++) {
		vet[c]=in.nextInt();
		ordenado[9-c]=vet[c];
	}
	for(int c = 0;c<10;c++) {
		System.out.printf("%d, ",ordenado[c]);
	}
	System.out.println();
	
	}

}
