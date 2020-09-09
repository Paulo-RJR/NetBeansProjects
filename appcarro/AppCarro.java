/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcarro;

/**
 *
 * @author paulo
 */
public class AppCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro van = new Carro();        
            van.marca = "FIAT";
            van.modelo = "Ducato";
            van.numPassageiro = 10;
            van.consumoCombustivel = 9;
            van.capCombustivel = 100;
            System.out.println(van.marca);
            System.out.println(van.modelo);
            System.out.println(van.numPassageiro);
            System.out.println(van.capCombustivel);
            System.out.println(van.consumoCombustivel);  
            van.exibirAutonomia();
            System.out.println("");
            double calcularCombustivelvan = van.calcularCombustivel(200.0);
            System.out.println("Combustível para 200Km é: " + calcularCombustivelvan);
        Carro fusca = new Carro();
            fusca.marca = "Waokvagen";
            fusca.modelo = "Popular";
            fusca.numPassageiro = 5;
            fusca.capCombustivel = 70;
            fusca.consumoCombustivel = 8.5;
            System.out.println(fusca.marca);
            System.out.println(fusca.modelo);
            System.out.println(fusca.numPassageiro);
            System.out.println(fusca.consumoCombustivel);
            System.out.println(fusca.capCombustivel);
            fusca.exibirAutonomia();
            double calcularCombustivelfusca = fusca.calcularCombustivel(200.0);
            System.out.println("Combustível para 200Km é: " + calcularCombustivelfusca);
    }    
}