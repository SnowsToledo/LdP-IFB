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
        float raio;
        System.out.print("Digite o valor do raio:");
        raio = in.nextFloat();
        System.out.printf("--------------------------------\n");
        float circun =(float) ((float) 2*(Math.PI)*raio);
        float area = (float) (Math.PI*(Math.pow(raio, 2)));
        System.out.println("Circunferência = "+circun);
        System.out.println("Área = "+area);
        System.out.printf("--------------------------------\n\n");
    }
    
}
