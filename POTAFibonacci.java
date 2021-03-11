/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potafibonacci;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class POTAFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Resolução sem o uso de Recursividade.
        //Vetor com tamanho definido para receber calculo de Fibonacci.
        long[] fibonacci = new long[20];                                        
        fibonacci[0] = 0; //Valor definido para a posição zero do Vetor.
        fibonacci[1] = 1; //Valor definido para a posição um do Vetor.
        long numero; //Variável para receber a entrada de dado feita pelo usuário. 
        //Instância do Objeto para uso da Classe.
        Scanner entrada = new Scanner(System.in);  
        try{ //Para tratamento de erros e exceções.
            System.out.print("Digite um número inteiro de entrada: ");
            numero = entrada.nextInt();             
            System.out.println("");
            if(numero == 0) //Se o usuário digitar zero.
                System.out.println("Entrada: 0" + " \tSaída: 0\n");                
            if(numero == 1) //Se o usuário digitar um.
                System.out.println("Entrada: 1" + " \tSaída: 1\n");                
            if(numero > fibonacci.length || numero < 0 || numero == 20) 
                System.err.println("Número fora do intervalo de entrada!!!\n");           
            for(int i = 2; i < fibonacci.length; i++){
                fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];                
                if(numero == i){
                    System.out.println("Entrada: " + i + " \tSaída: " 
                            + fibonacci[i] + "\n");
                }
            }
        //Exceção mostra uma mensagem ao usuário caso esta ocorra.
        }catch(Exception e){           
            System.err.println("Favor digitar uma entrada válida!!!\n");            
        }       
        System.exit(0);
    }
    
    //Resolução com o uso de Recursividade.
    //public static void 
}
