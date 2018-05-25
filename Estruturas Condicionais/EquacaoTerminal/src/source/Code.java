package source;

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
        float a,b,c,delta,x1,x2;
        int c1;
        System.out.print("Digite A: ");
        a = in.nextFloat();
        System.out.print("Digite B: ");
        b = in.nextFloat();
        System.out.print("Digite C: ");
        c = in.nextFloat();
        System.out.println("------------------------------------------");
        System.out.println(a+"X² + "+b+"X + "+c);
        System.out.println("------------------------------------------");
        for(c1 = 1;c1<=10;c1++){
            float result = a*(c1*c1)+b*c1+c;
            System.out.println("Resultado para X = "+c1+" é: "+result);
        }
        System.out.println("------------------------------------------");
        delta = (float) (Math.pow(b, 2)-4*a*c);
        if(delta>=0){
            x1 = (float) ((-b+Math.sqrt(delta))/2);
            System.out.println("X' = "+x1);
            x2 = (float) ((-b-Math.sqrt(delta))/2);
            System.out.println("X'' = "+x2);
        }else{
            System.out.println("X ñ pertence aos reais");
        }
        System.out.println("------------------------------------------");
    }
    
}
