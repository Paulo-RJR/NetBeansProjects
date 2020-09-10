/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetoraeb;
import java.util.Scanner;
/**
 *
 * @author paulo
 */
public class VetorAeB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entr = new Scanner(System.in);
        int []veta = new int[5];
        int []vetb = new int[5];
        System.out.println("Digite os valores do vetor A e B: ");
        for(int i = 0; i < 5; i ++){
            veta[i] = entr.nextInt();
            vetb [i] = veta[i]; 
        }
        System.out.println("O conteúdo do Vetro A é: ");    
        for(int i = 0; i < 5; i ++){
            System.out.println(veta[i]);  
        } 
        System.out.println("O conteúdo do Vetro B é: "); 
        for(int i = 0; i < 5; i ++){
            System.out.println(vetb[i]);  
        } 
        entr.close();
    }   
}