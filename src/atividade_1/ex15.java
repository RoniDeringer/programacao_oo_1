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
public class ex15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o tamanho da área em m²");
        double area = s.nextDouble();
        
        //3 area pra 1 L
        //lata 18L = 80rs

        double total = area / 3;                    //quantos litros tinta a serem usados
        double tinta = total / 18;                  // total de latas de tintas
        int qtdLatas = (int) Math.round(tinta);     //converter double pra int

        System.out.println("vai usar "+qtdLatas+" latas de tinta");
        System.out.println("o valor é de: R$ "+qtdLatas*80);
    } 
}
