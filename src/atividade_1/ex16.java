/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_1;
import java.util.Scanner;
/**
 *
 * @author Roni
 */
public class ex16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
 
        System.out.println("Informe o tamanho da área em m²");
        double area = s.nextDouble();
        
        //6 area pra 1 L
        //lata  18L   = 80rs
        //galao 3,6L  = 25rs

        double total = area / 6;                    //quantos litros tinta a serem usados
        double tintaLata  = total / 18;             // total de latas de tintas
        double tintaGalao = total / 3.6;            // total de galao de tintas        
       
       // int qtdLatas = (int) Math.round(tintaLata);     //converter double pra int
       // int qtdGalao = (int) Math.round(tintaGalao);     //converter double pra int
        
        int qtdLatas   = (int) Math.ceil(tintaLata);
        int qtdGalao   = (int) Math.ceil(tintaGalao);
       
        System.out.println();
        System.out.println("vai usar "+qtdLatas+" LATAS de tinta");
        System.out.println("em LATA de 18L o valor é de: R$ "+qtdLatas*80);
        System.out.println();
        System.out.println("vai usar "+qtdGalao+" GALÕES de tinta");
        System.out.println("em GALÃO de 3,6L o valor é de: R$ "+qtdGalao*25);



    }
}
