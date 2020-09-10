/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ternarioifelse;
import java.util.*;
//import java.math.*;
/**
 *
 * @author paulo
 */
public class TernarioIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exemplo da Estrutura Condicional "if" "else" na forma ternária.
        /*Obs. Esta forma pode somente ser usada em Estrutura condicional 
        Simples, ou seja, com apenas duas condições(if  else).*/
        Scanner entr = new Scanner(System.in);
        System.out.print("Digite um número: ");
            int numero = entr.nextInt();
        double resultado = numero % 2; //Resto da divisão em Java "%", mod.
        //System.out.println(resultado);
        //Forma normal da Estrutura condicional Simples.
        if(resultado == 0){
            System.out.print("Par\n");
        }else{
            System.out.print("Ímpar\n");                
        }
        //Forma Ternária da Estrutura Condicional Simples.
        /*double resultado = (numero % 2) ? 0 : 1;
            System.out.println(resultado);*/
    }    
}