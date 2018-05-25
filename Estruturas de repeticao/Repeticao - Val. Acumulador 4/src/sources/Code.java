package sources;
import java.util.Scanner;
/**
 *
 * @author wanghley
 */
public class Code {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Qual a quantidade de alunos: ");
        int qalunos = in.nextInt(),cont=1;
        float notas = 0;
        while(cont<=qalunos){
            System.out.printf("Nota do %dº aluno: ",cont);
            notas += in.nextFloat();
            cont+=1;
        }
        System.out.println("A média aritmética é = "+(notas/qalunos));
        
    }
    
}
