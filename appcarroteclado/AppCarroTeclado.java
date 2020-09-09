/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcarroteclado;
import java.util.Scanner;
/**
 *
 * @author paulo
 */
public class AppCarroTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entr = new Scanner(System.in);
        CarroTeclado fusca = new CarroTeclado();
        System.out.println("Digite a marca do carro: ");
            fusca.marca = entr.nextLine();
        System.out.println("Digite a modelo do carro: ");
            fusca.modelo = entr.nextLine();
        /*System.out.println("Digite a marca do carro: ");
            fusca.marca = entr.nextLine();*/
        System.out.println("");
        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
        entr.close();
    }
    
}
