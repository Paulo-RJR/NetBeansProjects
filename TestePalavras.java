/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testepalavras;

/**
 *
 * @author paulo
 */
public class TestePalavras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Exemplos de manipulação de Strings
        String nome = "Paulo", sobrenome = "Rodrigues";          
        final String nomecompleto= nome + " " + sobrenome;
        System.out.println(nome);
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Nome completo: " + nomecompleto);        
        String string = new String("Minha String");
        System.out.println("Char na posição: " + string.charAt(4)); //Mostra a String na posição 4, por exemplo.
        System.out.println("Quantidade: " + string.length()); //Mostra o tamanho da String (quantidade de caracteres e espaços se houver).
        System.out.println("Sem Trim [ " + string + " ]");
        System.out.println("Com Trim: [ " + string.trim() + " ]"); //Retira os espaços(Não funcionou).
        System.out.println("Lower: " + string.toLowerCase());  //Todas Minúsculas.
        System.out.println("Upper: " + string.toUpperCase());  //Todas Maiúsculas.
        System.out.println("Contém M: " + string.contains("M")); //Procurar letra (retornando true ou false).
        System.out.println("Contém X: " + string.contains("X")); //Procurar letra (retornando true ou false).
        System.out.println("Replese: " + string.replace("n","b")); //Troca as letras.
        System.out.println("Ignorar o tamanho das letras: " + string.equalsIgnoreCase("minha sTrinG"));
        System.out.println("Mostrar partes da frase: " + string.substring(0, 6));
        //Teste da Aula-3:
        System.out.println("A B C D E F G".toCharArray());
        System.out.println("Aula de Java".split(""));
        System.out.println("Aula".concat(" de Java."));
        System.out.println("1234 asda qw".replaceAll("[0-9]", "g"));
    }    
}