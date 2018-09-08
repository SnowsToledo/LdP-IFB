public class StringTest {
	public static void main(String[] args) {
		String msg = "hoje a gente começa a estudar Strings mais a fundo";
		System.out.println(msg);//Imprime a String
		System.out.println(msg.length());//Tamanho da String
		System.out.println(msg.charAt(15));//Imprime o caracter da posição 15
		System.out.println(msg.contains("estudar"));//Imprime V ou F se tal palavra existe na string
		String email = "wanghley@gmail.com";
		if(email.contains("@")) {
			System.out.println("Email Válido!");
		}else {
			System.out.println("Email inválido!");
		}
		System.out.println(msg.indexOf("a"));//Imprime o indice da 1ª aparição da letra "a"
		System.out.println(msg.replaceAll(" ", "#"));
		System.out.println(msg.substring(7));//Imprime um novo string a paritir do indice 7
		System.out.println(msg.);
	}

}
