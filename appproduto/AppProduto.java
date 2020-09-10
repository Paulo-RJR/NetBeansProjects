/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appproduto;
import java.util.Scanner;
//import java.text.DecimalFormat;
/**
 *
 * @author paulo
 */
public class AppProduto {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produto estoque = new Produto(); //Método construtor
        Scanner entr = new Scanner(System.in);        
        System.out.println("Dados do Produto:");
        System.out.print("Nome: ");
            estoque.nome = entr.nextLine();
        System.out.print("Preço R$: ");
            estoque.preco = entr.nextDouble();
        System.out.print("Quantidade no estoque: ");
            estoque.qtdEstoque = entr.nextInt(); 
        System.out.print("Entre com o valor a ser adicionado no estoque: ");
            int qtde = entr.nextInt();
            estoque.adicionarProduto(qtde);
        System.out.println("Dados atuais: " + estoque);
        System.out.print("Entre com o valor a ser removido no estoque: ");
            qtde = entr.nextInt();
            estoque.removerProduto(qtde); 
        System.out.println("Dados atuais: " + estoque);
        estoque.totalEstoque();
        estoque.toString();
        entr.close();
    }    
}