package sources;

import java.util.Scanner;

/**
 *
 * @author wanghley
 */
public class Code {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int idade;
          
        do{
            System.out.print("Informe a idade: ");
            idade = in.nextInt();
        }while(idade<0 || idade>120);
        if(idade<16){
            System.out.println("Não pode votar");
        }else if(idade>=16&&idade<18){
            System.out.println("Vota se quiser");
        }else if(idade>=18 && idade<65){
            System.out.println("Voto obrigatório");
        }else if(idade>=65){
            System.out.println("Vota se quiser");
        }
    }
    
}
