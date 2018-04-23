/*
 * Vetores -> Variáveis Compostas Homogêneas Unidimensionais
 */
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
        float notas[] = new float [10];
        float manual = 0,media = 5;
        int amedia = 0;
        Scanner in = new Scanner(System.in);
        for(int c = 0;c<10;c++){
            System.out.printf("Digite o valor de notas[%d]:",c);
            notas[c] = in.nextFloat();
            if(notas[c]>media){
                amedia += 1;
            }
            manual += notas[c];
        }
        manual /=10;
        System.out.println("Média anual de todos os alunos: "+manual);
        System.out.println("Alunos acima da média: "+amedia);
    }
    
}
