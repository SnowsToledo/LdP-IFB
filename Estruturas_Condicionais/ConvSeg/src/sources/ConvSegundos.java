package sources;

import java.util.Scanner;

/**
 *
 * @author wanghley
 */
public class ConvSegundos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int hora,minuto,segundo;
        System.out.println("---------------------------------------");
        System.out.println("|           Conversão Horas           |");
        System.out.println("---------------------------------------");
        System.out.println("Cálculo de tempo...");
        System.out.print("Digite as horas: ");
        hora = in.nextInt();
        System.out.print("Digite os minutos: ");
        minuto = in.nextInt();
        System.out.print("Digite os segundos: ");
        segundo = in.nextInt();
        int tot = (hora*60*60)+(minuto*60)+segundo;
        System.out.println("---------------------------------------");
        System.out.println("Tempo total decorrido: "+tot+"s");
        System.out.println("---------------------------------------");
    }
    
}
