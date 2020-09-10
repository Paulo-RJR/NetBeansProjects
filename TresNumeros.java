/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresnumeros;
import java.util.Scanner;
/**
 *
 * @author paulo
 */
public class TresNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, n3, maior;
        Scanner entr = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("FAÇA UM PROGRAMA EM JAVA QUE LEIA TRÊS NÚMEROS\n" + 
                "E IMPRIMA O MAIOR DELES.");
        System.out.println("================================================\n");
        System.out.print("Digite o primeiro número: ");
            n1 = entr.nextInt();
        System.out.print("Digite o segundo número: ");
            n2 = entr.nextInt();
        System.out.print("Digite o Terceiro número: ");
            n3 = entr.nextInt();
        System.out.print("\n================================================\n");
        if(n1 > n2 && n1 > n3){
            maior = n1;
            System.out.println("\t\tO maior é: " + maior);
        }
        if(n2 > n1 && n2 > n3){
            maior = n2;
            System.out.println("\t\tO maior é: " + maior);
        }
        else if(n3 > n1 && n3 > n2){
           maior = n3;
           System.out.println("\t\tO maior é: " + maior); 
        }
        System.out.print("================================================\n\n");
        entr.close();
    }    
}