/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testesprova;
import java.text.DecimalFormat;
import java.util.*;

/**
 *
 * @author paulo
 */
public class TestesProva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner entr = new Scanner(System.in);
        //Questão-01 da Prova
        /*int resu = 5;
        resu += 1;
        System.out.println(resu++);*/
        
        //Questão-02 da Prova
        //int notas[] = (5,9,10);
        //int[] notas[] = {5,9,10};
        /*int notas[] = {5,9,10};
        //double[] notas = {5, 9, 10};
        System.out.println(notas[0]);
        System.out.println(notas[1]);
        System.out.println(notas[2]);*/
        
        //Questão-03 da Prova
        /*int n=6, r=0, c=1, s=-1;
        while(c <= n){
            if(c % 2 == 0){
                r = r + c * s;
            }else{
                r = r + c;
            }
            c++;
        }
        System.out.println(r);
        System.out.println(c);*/
        
        //Questão-04 da Prova
        /*int a = 3, b = 2;
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));*/
        
        //Questão-06 da Prova
        //double a, b, c, x1;
        /*System.out.print("Digite p valor de A: ");
        a = entr.nextDouble();
        System.out.print("Digite p valor de B: ");
        b = entr.nextDouble();*/
        //System.out.print("Digite p valor de C: ");
        //c = entr.nextDouble();
        //x1 = (Math.sqrt(c));
        //x1 = (-b = + Calc.sqrt(c)) / (2 * a);
         //x1 = (b = + sqrt(c)) / (2 * a);
        //System.out.println(x1);
        
         //Questão-07 da Prova
         //Obs: as alternativas estão todas erradas, por isso optei pela ultima
         //a qual esta incompleta.
         
         //Questão-08 da Prova:
         /*int a, b, x, y;           
         a = 3;           
         b = -2;           
         x = -1;           
         y = 6;           
         x += b;           
         y /= a;           
         b--;           
         System.out.println(x);           
         System.out.println(y);           
         System.out.println(b);*/
         //Quetão-09 da Prova
        /*for(int i=3; i<20 ; i+=2)  
        {  
             System.out.print((i%3) + " ");  
        } */
        //Questão-11 da Prova:
         /*float vlr, desc;
        String nome;
        Scanner entrf = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00");
        System.out.println("FAÇA UM PROGRAMA EM JAVA QUE LEIA O NOME E O"
                + " SALÁRIO BRUTO DE UM \n" + "FUNCIONÁRIO. EM SEGUIDA "
                + "O PROGRAMA DEVERÁ CALCULAR O DESCONTO DO INSS\n" + 
                "(8%) E MOSTRAR OS RESULTADOS NA TELA.\n" + "MOSTRAR NA "
                + "TELA: NOME E SALÁRIO COM O DESCONTO.\n" + "UTILIZE "
                + "FUNÇÃO PARA O CÁLCULO DO SALÁRIO.\n");
        System.out.print("Digite o nome do funcionário: ");
            nome = entrf.next();
        System.out.print("Digite o valor do salário do funcionário: R$ ");
            vlr = entrf.nextFloat();
        desc = vlr - (vlr * 0.08f);
        System.out.print("\nO novo salário do fincionário " + nome + " ,com desconto de 8% é: R$ " + dc.format(desc) + "\n\n");
        //entr.close();*/
        /*int resultado = 5;
        resultado += 1;
        System.out.println(--resultado);*/
        int idade = 34;
        int x = idade;
        idade = idade + x/2;
        //System.out.println("Sua idade é:", idade); Erro.
        //System.out.println("Sua idade é:"+ idade);
        //OU
        System.out.printf("Sua idade é:%d\n", idade);
        
    }    
}