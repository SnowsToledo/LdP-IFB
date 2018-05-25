package sources;

import java.util.Scanner;

/**
 * @author wanghley
 */
public class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("-----------------------------------------------\n");
        System.out.printf("                     Menu\n");
        System.out.printf("1 - Tabuada de adição\n2 - tabuada de subtração\n"
                + "3 - tabuada de multiplicação\n4 - tabuada de potenciação\n");
        System.out.printf("-----------------------------------------------\n");
        System.out.print("Digite a opção:");
        int option = in.nextInt();
        System.out.print("Digite um valor:");
        int num = in.nextInt();
        switch(option){
            case 1:
                for(int c = 0;c<10;c++){
                    System.out.print((num+c)+" ");
                }
                System.out.println();
                break;
            case 2:
               for(int c = 0;c<10;c++){
                    System.out.print((num-c)+" ");
                }
                System.out.println();
                break; 
            case 3:
                for(int c = 0;c<10;c++){
                    System.out.print((num*c)+" ");
                }
                System.out.println();
                break;
            case 4:
                for(int c = 0;c<10;c++){
                    int aux = (int) Math.pow(num, c);
                    System.out.print(aux+" ");
                }
                System.out.println();
                break;
            default:
                    System.out.println("Erro! Caso inválido1");
                    break;
        }
    }
    
}
