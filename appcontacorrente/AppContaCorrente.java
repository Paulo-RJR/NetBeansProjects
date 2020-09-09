/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcontacorrente;
import java.util.Scanner; //Importando a Class Scanner na biblioteca Util.
/**
 *
 * @author paulo
 */
public class AppContaCorrente { //Classe principal (Classe Pai).

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        //int opcao;   
        //double saldo;
        ContaCorrente conta = new ContaCorrente();//Instanciar um objeto para a Classe filha. 
        Scanner entr = new Scanner(System.in); //Instancia para a Classe Scanner.
        System.out.println("================================================");
        System.out.println("======= Olá bem vindo ao Banco Boa Sorte =======");
        System.out.println("================================================");        
        System.out.println("===             Dados da Conta:              ===");
        System.out.println("================================================");
        System.out.print("== Informe a sua Agencia: ");
            conta.agencia = entr.nextLine();
        System.out.print("== Informe o Número: ");
            conta.numero = entr.nextLine();        
        System.out.printf("== Saldo: R$ %.2f", conta.saldo); //Para mostrar dois números depois da vírgula.        
        System.out.println("\n\n================================================");
        System.out.println("===              Menu de Opções:             ===");
        System.out.println("===       Escolha a operação desejada:       ===");
        System.out.println("================================================");
        System.out.println("== Saque - 1.");
        System.out.println("== Depósito - 2.");
        System.out.print("== Opção: ");        
            int opcao = entr.nextInt();
        //System.out.println("");
        if(opcao != 1 && opcao != 2){ //Estrutura condicional IF.
            System.err.println("================================================");
            System.err.print("!!! OPÇÃO INVALIDA !!! Inicie o programa novamente.\n");           
            System.err.println("================================================\n");
        }else{ //Estrutura condicional ELSE.
            switch(opcao){ //Estrutura SWITCH para o menu de opções.
                case 1:
                    System.out.print("== Digite o valor a ser Sacado R$: ");
                        //saldo = entr.nextDouble();  
                        conta.valor = entr.nextDouble();                     
                    System.out.println("\n================================================");
                    conta.realizarSaque(); //Utilizando o Método da Classe ContaCorrenta.                    
                    System.out.print("== Agencia: " +  conta.agencia + "\n" + "== Número: "
                        + conta.numero + "\n");
                    System.out.println("\n================================================");
                        conta.consultarSaldo(); //Utilizando o Método da Classe ContaCorrenta.
                    System.out.println("================================================\n");
                    break;
                case 2:
                    System.out.print("== Digite o valor a ser Depositado R$: ");
                        conta.valor = entr.nextDouble(); 
                    System.out.println("\n================================================");
                    conta.realizarDeposito(); //Utilizando o Método da Classe ContaCorrenta.                    
                    System.out.print("== Agencia: " +  conta.agencia + "\n" + "== Número: "
                        + conta.numero + "\n");
                    System.out.println("\n================================================");
                        conta.consultarSaldo(); //Utilizando o Método da Classe ContaCorrenta.
                    System.out.println("================================================\n");
                    break;
            }
            entr.close();
        }        
    }    
}