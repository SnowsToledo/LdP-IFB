/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

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
        int vet1[] = new int[20];
        int x = 1,r[] = new int[20];
        int vet2[] = new int[20];
        char op[] = new char[20];
        for(int c = 0;c<20;c++){
            op[c] = '+';
            vet1[c] = x;
            x+=1;
            vet2[c] = x-2;
        }
        System.out.print("Vet1[] = ");
        for(int c = 0;c<20;c++){
            System.out.printf("%d. ",vet1[c]);   
        }
        System.out.printf("\nVet2[] = ");
        for(int c = 0;c<20;c++){
            System.out.printf("%d. ",vet2[c]);   
        }
        for(int c=0;c<20;c++){
            if(op[c] == '+'){
                r[c] = vet1[c]+vet2[c];
            }
        }
        System.out.printf("\n   R[] = ");
        for(int c = 0;c<20;c++){
            System.out.printf("%d. ",r[c]);
        }
        System.out.println();
    }
    
}
