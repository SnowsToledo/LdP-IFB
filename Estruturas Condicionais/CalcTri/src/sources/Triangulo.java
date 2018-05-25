package sources;

import java.util.Scanner;

/**
 *
 * @author wanghley
 */
public class Triangulo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float l1,l2,l3;
        System.out.println("----------------------------------");
        System.out.println("|            Triângulo           |");
        System.out.println("----------------------------------");
        System.out.print("Digite o 1º lado:");
        l1 = in.nextFloat();
        System.out.print("Digite o 2º lado:");
        l2 = in.nextFloat();
        System.out.print("Digite o 3º lado:");
        l3 = in.nextFloat();
        System.out.println("----------------------------------");
        float perimetro = l1+l2+l3;
        System.out.println("Perimetro = "+perimetro);
    }
    
}
