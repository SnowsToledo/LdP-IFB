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
        float v[] = new float[20];
        float mv = 0,aux;
        int x;
        boolean pronto = false;
        for(int c =0;c<20;c++){
            v[c] = (float) (5+Math.random()*10);
            System.out.printf("%.2f|",v[c]);
        }
        System.out.println();
        
        for(int c = 0;c<19;c++){
            x=c;
            aux = v[c];
            for(int d = c+1;d<20;d++){
                if(v[d]<aux){
                    x = d;
                    aux = v[x];
                }
            }
            v[x] = v[c];
            v[c] = aux;
        }
        
        for(int c = 0;c<20;c++){
            System.out.printf("%.2f|",v[c]);
        }
        
    }
    
}
