/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetorparimpar;
import java.util.Scanner;
/**
 *
 * @author paulo
 */
public class VetorParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("DESENVOLVA UM PROGRAMA PARA CARREGAR UM VETOR "
                + "\nCOM 5 ELEMENTOS INTEIROS E DEPOIS MOSTRAR OS NÚMEROS "
                + "\nPARES E ÍMPARES.");
        Scanner entr = new Scanner(System.in); 
        int [] vetor = new int[5], par, impar;
        System.out.println("\nDigites os cinco números inteiros do seu Vetor:");
        for (int i = 0; i < vetor.length; i++){          
            vetor[i] = entr.nextInt();
            if(vetor[i] % 2 == 0){
                System.out.println(vetor[i] + " Par.");  
            }else{
            System.out.println(vetor[i] + " Ímpar.");
            }
        }        
        /*if(vetor[0] % 2 == 0){
            System.out.println("Par: " + vetor[0]);
        }else{
            System.out.println("Ímpar: " + vetor[0]);
        }
        if(vetor[1] % 2 == 0){
            System.out.println("Par: " + vetor[1]);
        }else{
            System.out.println("Ímpar: " + vetor[1]);
        }
        if(vetor[2] % 2 == 0){
            System.out.println("Par: " + vetor[2]);
        }else{
            System.out.println("Ímpar: " + vetor[2]);
        }
        if(vetor[3] % 2 == 0){
            System.out.println("Par: " + vetor[3]);
        }else{
            System.out.println("Ímpar: " + vetor[3]);
        }
        if(vetor[4] % 2 == 0){
            System.out.println("Par: " + vetor[4]);
        }else{
            System.out.println("Ímpar: " + vetor[4]);
        }*/
        System.out.print("\n");
        entr.close();
    }    
}