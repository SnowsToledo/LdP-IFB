/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        int ma[][] = new int[3][3];
        int mb[][] = new int[3][3];
        int mr[][] = new int[3][3];
        Scanner in  = new Scanner(System.in);
        for(int l = 0;l<3;l++){
            for(int c = 0;c<3;c++){
                System.out.println("ma:");
                ma[l][c] = in.nextInt();
                System.out.println("mb:");
                mb[l][c] = in.nextInt();
            }
        }
        
        for(int l = 0;l<3;l++){
            for(int c = 0;c<3;c++){
                mr[l][c] = 0;
                for(int k = 0;k<3;k++){
                    mr[l][c] = (mr[l][c]+ma[l][k])*mb[k][c]; //multiplicação de matrizes
                }
            }
        }
        for(int l = 0;l<3;l++){
            System.out.println();
            for(int c = 0;c<3;c++){
                System.out.print(mr[l][c]+" ");
            }
        }
    }
    
}
