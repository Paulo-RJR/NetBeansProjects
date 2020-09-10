/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appproduto;
import java.text.DecimalFormat;
/**
 *
 * @author paulo
 */
public class Produto {
    String nome;
    double preco;
    int qtdEstoque;
    
    public double totalEstoque(){        
        DecimalFormat dc = new DecimalFormat("0.00");
        /*System.out.println("\nO Produto: " + nome);
        System.out.println("No estoque tem: " + qtdEstoque);
        System.out.println("Com o valor de R$ " + dc.format(preco) + " cada.");
        System.out.println("Totalizando R$ " + dc.format(qtdEstoque * preco));*/
        return qtdEstoque * preco;
    }   
    public void adicionarProduto(int qtdEstoque){
        this.qtdEstoque += qtdEstoque;
    } 
    public void removerProduto(int qtdEstoque){
        this.qtdEstoque -= qtdEstoque;
    }
    public String toString(){
        return nome + " R$ " + preco + " " + qtdEstoque + " R$ " + totalEstoque() + ".";
    }
}