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
        Scanner in = new Scanner(System.in);
        String d;
        Registro var = new Registro();
        System.out.print("Digite o nome: ");
        var.nome = in.nextLine();
        System.out.print("Digite a idade: ");
        var.age = in.nextInt();
        System.out.print("Digite a dívida: ");
        var.valor = in.nextFloat();
        
        print(var.age,var.valor,var.nome);
        
    }
    public static class Registro{
        private int age;
        private String nome;
        private float valor;
    }
    public static void print(int idade, float conta,String nome){
        System.out.println();
        System.err.printf("-------------------------------------\n"
                        + "|          Registro de débito       |\n"
                        + "-------------------------------------\n");
        System.err.println("Nome: "+nome);
        System.err.println("Idade: "+idade);
        System.err.println("Dívida: R$"+conta);
        System.err.println("------------------------------------");
    }
    
}

