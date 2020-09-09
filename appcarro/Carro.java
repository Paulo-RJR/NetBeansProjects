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
public class Carro {
    String marca, modelo;
    int numPassageiro;
    double capCombustivel, consumoCombustivel;
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel * 
            consumoCombustivel + " km");    
    } 
    double calcularCombustivel( double km){ //Método com retorno e prâmetro.
        double qtdCombustivel = km / consumoCombustivel; 
        return qtdCombustivel;
    }
}