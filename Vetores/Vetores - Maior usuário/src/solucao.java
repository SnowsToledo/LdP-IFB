import java.util.Scanner;
public class solucao {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite o tamanho do vetor: ");
		int n = in.nextInt();
		int v[]=new int[n];
		for(int c = 0;c<n;c++) {
			v[c]=in.nextInt();
		}
		for(int c = 0;c<n;c++) {
			for(int d = c+1;d<n;d++) {
				if(v[c]>v[d]) {
					int aux = v[c];
					v[c]=v[d];
					v[d]=aux;
				}
			}
		}
		System.out.println(v[n-1]);

	}

}
