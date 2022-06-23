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
public class ex05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe a medida em metros:");
        double valor = s.nextDouble();
        System.out.println("Sua distancia em cm é: "+(valor*100)+" cm" );
    }
}
