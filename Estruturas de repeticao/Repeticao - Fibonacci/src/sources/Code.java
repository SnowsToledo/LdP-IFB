package sources;
/**
 *
 * @author wanghley
 */
public class Code {
    public static void main(String[] args) {
        long a1 = 0,a2 = 1,b,aux;
        System.out.print(a1+" "+a2+" ");
        for(int c = 0;c<50;c++){
            b = a1+a2;
            a1 = a2;
            a2 = b;
            System.out.print(b+" ");
        }
        System.out.println();
    }
    
}
