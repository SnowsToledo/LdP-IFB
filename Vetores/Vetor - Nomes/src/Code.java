import java.util.Scanner;
public class Code {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String  vet[]=new String[10];
		boolean Nachei = false;
		System.out.println("DIGITE OS NOMES ");
		for(int c = 0;c<10;c++) {
			vet[c]=in.nextLine();
		}
		System.out.print("Digite o nome que deseja procurar: ");
		String nome = in.nextLine();
		for(int c =0;c<10;c++) {
			if(vet[c].equals(nome)) {
				System.out.println("ACHEI");
				break;
			}else {
				Nachei=true;
			}
		}
		if(Nachei) {
			System.out.println("NÃO ACHEI");
		}

	}

}
