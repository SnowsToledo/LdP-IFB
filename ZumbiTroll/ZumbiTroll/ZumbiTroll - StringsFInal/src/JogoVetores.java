import java.util.Scanner;

public class JogoVetores {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String[] vetor = new String[100];// Se tiver mais que 100, aumenta esse numero
		vetor[0] = "Seja bem-vindo ao jogo que as suas decisões podem matar ou salvar alguém...\n"
				+ "Só depende de você! Boa sorte! Você está pronto? ### 1 ### SIM ### 2 ### NÃO.";
		
		vetor[1]="Você tomou essa decisão... A partir de agora tudo está por sua\n"  
				+"conta em risco...\nSalve-se... A aventura começa agora...\n\n"  
				+".............................................................................\n"  
				+"................................................................\n"
				+ "\n2025, nos Estados Unidos, Texas...\n\n"  
				+ "Ocorreu um acidente químico, no qual as pessoas\n\n" 
				+ "começam a ficar inconscientes e com fome de carne humana.\n\n" 
	            + "Você está no seu apartamento e precisa sobreviver a esse apocalipse...\n\n" 
	            + "Primeiramente você olha a foto de sua amada esposa, Mary.\nSempre quando você ver a foto dela,\n" 
	            + " você se inspira, a esperança volta em você...\n\n"
	            + "\nVocê escuta explosões... "
				+ "O que você faz: ### 3 ### Ir ao terraço verificar o que está acontecendo. ### 4 ### Ficar no apartamento e esperar.###";
		
		vetor[2]="PERDEU-Muito bem, você é fraco, esse jogo não foi feito para você.\n" + 
				"Volte quando estiver preparado para encarar o mundo real.\n";
		vetor[3]="PERDEU-Você morre, com estilhaços de vidro derivados da explosão,\n"
		+ "e você vê, na sua mente, sua esposa decepcionada";
		vetor[4]="\nVocê fica no seu apartamento no 14° andar (último andar),\n "
             + "mas escuta barulhos no 7° andar e vai verificar...\n"
             + "Você desce até a metade do prédio, no caminho você "
             + "encontra uma arma(sem balas)\ne uma faca. Qual você leva? ### 5 ### Arma ### 6 ### Faca";
		Vetor[5]=
		int tentativas, tt;
		boolean naoacertou = true;

		System.out.println("Digite a quantidade de tentativas:");
		tentativas = teclado.nextInt();
		tt = tentativas;
		System.out.flush();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nBem-vindo ao nosso jogo!");

		do{
			System.out.println("\n###################################\nNúmero de tentativas: "+tentativas+"\n###################################");
			int posicao = 0;
			boolean continua = true;
			
			do {
				
				String completa = vetor[posicao];
				if(completa.startsWith("PERDEU")) {
					System.out.println(completa.substring(7));
					System.out.println("---------------------------------------\n----          Você PERDEU!         ----\n---------------------------------------");
					continua = false;
				}else if(completa.startsWith("VENCEU")) {
					System.out.println(completa.substring(6));
					System.out.println("---------------------------------------\n----          Você GANHOU!         ----\n---------------------------------------");
					continua = false;
					naoacertou = false;
				}else {
					String[] tokens = completa.split("###");
					int opcoes[] = new int[(tokens.length/2) + 1];
					int n = 1;
					String historia = tokens[0];
					System.out.println(historia);
					System.out.println("Escolha uma opção:");
					for (int i = 1; i < tokens.length; i=i+2) {
						String p = tokens[i];
						String opt = tokens[i+1];
						System.out.println(n+ " - "+ opt);
						opcoes[n] = Integer.parseInt(p.trim());
						n++;					
					}
					int escolha = teclado.nextInt();
					if(escolha>0 && escolha < opcoes.length) {
						posicao = opcoes[escolha];
					}else {
						System.out.println("\n\n --> Você escolheu uma opção errada...\n\n");
					}
					

				}
			}while(continua);
			tentativas--;
		}while(naoacertou && tentativas > 0);
		if(naoacertou) {
			System.out.println("Suas tentativas acabaram!");
			System.out.println("###################################\nVocê perdeu!\n###################################");
		}else {
			System.out.println("###################################\n\nVocê ganhou em "+ (tt - tentativas)+" tentativas! Parab�ns!\n\n###################################");

		}
		//teclado.nextInt();
		teclado.close();

	}

}
