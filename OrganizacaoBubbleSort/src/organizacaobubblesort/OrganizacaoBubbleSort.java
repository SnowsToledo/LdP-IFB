/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organizacaobubblesort;

/**
 *
 * @author wanghley
 */
public class OrganizacaoBubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vet1[] = new int[20];
        int aux;
        for(int c = 0;c<20;c++){
            vet1[c] = (int) ((5.2/Math.random())*10);
        }
        for(int c = 0;c<20;c++){
            for(int d = 19;d>0;d--){
                if(vet1[d-1]>vet1[d]){
                    aux = vet1[d-1];
                    vet1[d-1] = vet1[d];
                    vet1[d] = aux;
                }
            }
        }
        for(int c = 0;c<20;c++){
            System.out.printf("%d|",vet1[c]);
        }
        System.out.println();
    }
    
}
