/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetorelementos;
import java.util.Scanner;
/**
 *
 * @author paulo
 */
public class VetorElementos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entr = new Scanner(System.in);
        System.out.println("DESENVOLVA UM PROGRAMA PARA CARREGAR UM VETOR COM 5"
                + "\nELEMENTOS INTEIROS E MOSTRAR O MAIOR VALOR.");
        int[] vetor = new int[5]; //Variável inteira para um vetor de 5 posições. 
        int maior = 0; //Variável para receber o maior valor.
        System.out.print("\nDigite os números do vetor: \n");
        for (int i = 0; i < 5; i++) { //Laço (For) para percorrer a 5 posições do Vetor.
            vetor[i] = entr.nextInt(); //Entrada de dados pelo teclado.
            // como a professora fez.
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }
        /*if(vetor[0] > vetor[1] && vetor[0] > vetor[2] && vetor[0] > vetor[3] && 
                vetor[0] > vetor[4]){
            maior = vetor[0];
        }else if(vetor[1] > vetor[0] && vetor[1] > vetor[2] && vetor[1] > 
                vetor[3] && vetor[1] > vetor[4]){
            maior = vetor[1];
        }else if(vetor[2] > vetor[0] && vetor[2] > vetor[1] && vetor[2] > 
                vetor[3] && vetor[2] > vetor[4]){
            maior = vetor[2];
        }else if(vetor[3] > vetor[0] && vetor[3] > vetor[1] && vetor[3] > 
                vetor[2] && vetor[4] > vetor[4]){
            maior = vetor[3];
        } else{
            maior = vetor[4];
        }*/
        
        System.out.println("O maior número de seu Vetor é: " + maior);
        //OU
        /*else if(vetor[4] > vetor[0] && vetor[4] > vetor[1] && vetor[4] > 
                vetor[2] && vetor[4] > vetor[3]){
            maior = vetor[4];
        }*/       
        entr.close();
        //System.out.println("Resposta: " + vetor[0]);
        /*int resultado = 3;
System.out.println(resultado);
resultado = resultado + 1;       // esse é igual
System.out.println(resultado);
resultado += 1;                  // a esse   
System.out.println(resultado);
resultado = resultado - 1;       // esse é igual
System.out.println(resultado);
resultado -= 1;                  // a esse
System.out.println(resultado);
resultado = 5;
System.out.println(resultado++); // mostra primeiro, depois incrementa.
System.out.println(resultado);   // está valendo 6
System.out.println(++resultado); // incrementa e mostra
System.out.println(--resultado); // decrementa e mostra
System.out.println(resultado--); // mostra primeiro, depois decrementa.
System.out.println(resultado);*/
    }    
}