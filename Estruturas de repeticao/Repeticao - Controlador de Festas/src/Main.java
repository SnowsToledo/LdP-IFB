import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tot=0,val;
        do{
            System.out.printf("Digite uma opção:\n"
                    + "     1- Adicionar pessoa.\n"
                    + "     2- Remover pessoa.\n"
                    + "     3- Informar quantas pessoas estão no evento.\n");
            val = in.nextInt();
            switch(val){
                case 1:
                    tot+=1;
                    break;
                case 2:
                    tot-=1;
                    break;
                case 3:
                    System.out.println("Total de pessoas = "+tot);
            }
        }while(true);
    }
    
}
