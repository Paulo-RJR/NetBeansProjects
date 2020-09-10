/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetormenor;
import java.util.Scanner;
/**
 *
 * @author paulo
 */
public class VetorMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entr = new Scanner(System.in);
        System.out.println("DESENVOLVA UM PROGRAMA PARA CARREGAR UM VETOR COM 5"
                + "\nELEMENTOS INTEIROS E MOSTRAR O MENOR VALOR.");
        int[] vetor = new int[5]; //Variável inteira para um vetor de 5 posições. 
        //int menor = 0; //Variável para receber o menor valor.
        System.out.print("\nDigite os números do vetor: \n");
        for (int i = 0; i < 5; i++) { //Laço (For) para percorrer a 5 posiçõe do Vetor.
            vetor[i] = entr.nextInt(); //Entrada de dados pelo teclado.}
        }// como a professora fez.
        int menor = vetor[0];
        for(int i = 0; i < 5; i++){
            if(vetor[i] < menor){
                menor = vetor[i];
            }
        }        
        /*if(vetor[0] < vetor[1] && vetor[0] < vetor[2] && vetor[0] < vetor[3] && 
                vetor[0] < vetor[4]){
            menor = vetor[0];
        }else if(vetor[1] < vetor[0] && vetor[1] < vetor[2] && vetor[1] < 
                vetor[3] && vetor[1] < vetor[4]){
            menor = vetor[1];
        }else if(vetor[2] < vetor[0] && vetor[2] < vetor[1] && vetor[2] < 
                vetor[3] && vetor[2] < vetor[4]){
            menor = vetor[2];
        }else if(vetor[3] < vetor[0] && vetor[3] < vetor[1] && vetor[3] < 
                vetor[2] && vetor[4] < vetor[4]){
            menor = vetor[3];
        }else{
            menor = vetor[4];
        }*/
        System.out.println("O menor número de seu Vetor é: " + menor);
        entr.close();
        //OU
        /*else if(vetor[4] < vetor[0] && vetor[4] < vetor[1] && vetor[4] < 
                vetor[2] && vetor[4] < vetor[3]){
            maior = vetor[4];
        }*/        
    }    
}