/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcarroteclado;

/**
 *
 * @author paulo
 */
public class CarroTeclado {
    String marca, modelo;
    int numPassageiros;
    double capCombustivel, consumoCombustivel;
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel * 
                consumoCombustivel + " km"); 
    }
}
