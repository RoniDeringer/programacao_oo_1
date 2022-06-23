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
public class ex13 {
 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
 

        double excesso =  0;
        double multa = 0;
        System.out.println("Informe o peso do peixe");
        double peso = s.nextDouble();
        if (peso>50) {
            excesso = (peso-50);
            multa = (excesso*4); 
        } else {
            excesso = 0;
            multa = 0;
        }
        System.out.println("excesso de: "+excesso+" kg");
        System.out.println("multa no valor de: R$"+multa);

    }     
}
