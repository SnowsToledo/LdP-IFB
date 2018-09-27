import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite uma String: ");
        String v = in.next();
        char aux;
        int cont = 0;
        for(int c = 0;c<v.length();c++){
            aux = v.charAt(c);
            if(aux=='a'){
                cont+=1;
            }else if(v.charAt(c)=='e'){
                cont+=1;
            }else if(v.charAt(c)=='i'){
                cont+=1;
            }else if(v.charAt(c)=='o'){
                cont+=1;
            }else if(v.charAt(c)=='u'){
                cont+=1;
            }
        }
        System.out.println(cont+" vogais");
    }
    
}