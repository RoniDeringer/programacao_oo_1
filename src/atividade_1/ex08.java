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
public class ex08 {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
 
        System.out.println("Informa as horas trabalhadas no mes:");
        double horas = s.nextDouble();
        System.out.println("Informa o valor em reais da hora trabalhada:");
        double valor = s.nextDouble();
        System.out.println("O salário do mês é: "+valor*horas+" reais") ;
    }
}
