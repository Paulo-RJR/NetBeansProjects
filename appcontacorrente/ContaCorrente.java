/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcontacorrente;  
//import java.util.Scanner; //Importando a Class Scanner na biblioteca Util.
/**
 *
 * @author paulo
 */
public class ContaCorrente { //Classe filha do tipo publica.
    public String numero, agencia; //Atributos do tipo publico.
    public double saldo = 1000, valor; //Atributos do tipo publico.
    //Scanner entr = new Scanner(System.in); //Instancia para a Classe Scanner.
    public void realizarSaque(){ //Método sem retorno e sem parâmetro.                   
            if(saldo < valor){ //Estrutura condicional IF.
                System.err.println("\t!!! SALDO INSUFICIENTE !!!");
            }else{ //Estrutura condicional ELSE.
                saldo -= valor;   
                //this.saldo -= saldo; 
            }            
    }
    public void realizarDeposito(){ //Método sem retorno e sem parâmetro.                   
            if(valor < 1.0){ //Estrutura condicional IF.
                System.err.println("\t!!! VALOR INCORRETO !!!");
            }else{ //Estrutura condicional ELSE.
               saldo += valor;  
               //this.saldo += saldo;
            }           
    }
    public void consultarSaldo(){ //Método sem retorno e sem parâmetro.
        System.out.printf("\tO seu saldo atual é: R$ %.2f\n", this.saldo); //Para mostrar dois números depois da vírgula.
    } 
    /*public String toString(){
        return "Agencia: " + agencia + "\n" 
                + "Número: " + numero + "\n";
    }*/
}