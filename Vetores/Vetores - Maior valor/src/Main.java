import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int v[]=new int[10];
		for(int c = 0;c<10;c++) {
			v[c]=in.nextInt();
		}
		for(int c = 0;c<10;c++) {
			for(int d = c+1;d<10;d++) {
				if(v[c]>v[d]) {
					int aux = v[c];
					v[c]=v[d];
					v[d]=aux;
				}
			}
		}
		System.out.println(v[9]);

	}

}
