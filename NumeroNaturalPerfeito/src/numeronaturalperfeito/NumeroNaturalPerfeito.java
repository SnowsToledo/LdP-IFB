
package numeronaturalperfeito;

/**
 *
 * @author wanghley
 */
public class NumeroNaturalPerfeito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int div = 0;
        for(int numero = 1;numero<100;numero++){
            for(int teste = 1;teste<numero;teste++){
                if(numero%teste==0){
                    div+=teste;
                }
            }
System.out.println(numero);
        }
    }
    
}
