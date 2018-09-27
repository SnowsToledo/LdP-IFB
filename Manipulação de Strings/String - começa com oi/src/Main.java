import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite uma String: ");
        String v = in.next(),x="";
        if(v.startsWith("oi")){
            System.out.println("Começa com OI");
        }else{
            System.out.println("Não começa com OI");
        }
    }
    
}