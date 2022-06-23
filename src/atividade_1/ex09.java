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
public class ex09 {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
 
        System.out.println("Informe a temperatura em Farenheit:");
        double valor = s.nextDouble();
        //(F – 32) / 1,8
        System.out.println("A temperatura em Celcius é: "+( (valor-32) /1.8));
    }  
}
