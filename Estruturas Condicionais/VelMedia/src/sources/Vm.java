package sources;

import java.util.Scanner;
/**
 *
 * @author wanghley
 */
public class Vm {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float vel,temp,s0,sf;
        System.out.println("-------------------------------");
        System.out.println("|       Velocidade Média      |");
        System.out.println("-------------------------------");
        System.out.print("Digite a distância inicial::");
        s0 = in.nextFloat();
        System.out.print("Digite o espaço final:");
        sf = in.nextFloat();
        System.out.print("Digite o tempo[h]:");
        temp = in.nextFloat();
        vel = (sf-s0)/temp;
        System.out.println("-------------------------------");
        System.out.println("Velocidade média = "+vel+"Km/h");
        System.out.println("-------------------------------");
    }
    
}
