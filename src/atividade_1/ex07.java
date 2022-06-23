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
public class ex07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
 
        System.out.println("Informe a medida de um dos lados do quadrado:");
        double valor = s.nextDouble();
        System.out.println("A área é: "+valor*2) ;
    }
}
