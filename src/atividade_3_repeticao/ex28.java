package atividade_3_repeticao;

import java.util.Scanner;

/*
28. O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa
que leia as um conjunto indeterminado de temperaturas, e informe ao final a menor e a
maior temperaturas informadas, bem como a média das temperaturas.


 */
public class ex28 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char condicao = 0;
        int i = 0;
        double temp = 0;
        double tempMenor = Integer.MAX_VALUE;
        double tempMaior = Integer.MIN_VALUE;
double soma =0;
        do {
            i++;
            System.out.println(i + "ª Temperatura:");
            temp = s.nextDouble();
            if (temp > tempMaior) {
                tempMaior = temp;
            } else if (temp < tempMenor) {
                tempMenor = temp;
            }
            soma+= temp;
            
            
            System.out.println("DESEJA INFORMAR MAIS TEMP? 's' ou 'n'");
            condicao = s.next().charAt(0);
        } while (condicao == 's');
        
        System.out.println("---");
        System.out.println("Media: "+(soma/i));
        System.out.println("menor: "+tempMenor);
        System.out.println("Maior: "+tempMaior);
    }
}
