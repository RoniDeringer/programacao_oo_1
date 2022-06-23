package atividade_3_repeticao;

import java.util.Scanner;

/*
15. Mostre e calcule a série S = (37*38)/1 + (36*37)/2 + (35*36)/3 + ... + (1*2)/37.

 */
public class ex15 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*   for (int i = 1; i <=37 ; i++) {
             for (int j = 38; j >= 2; j--) {
                 for (int k = 37; k >=1; k--) {
                     
         
             System.out.println("("+k+"*"+j+")/"+i);
         }}}
         */
        
        
        int v38 = 38;
        int v37 = 37;
        int v1 = 1;
        for (int i = 0; i < 37; i++) {

            System.out.println("(" + v37 + "*" + v38 + ")/" + v1);
            v38--;
            v37--;
            v1++;

        }

    }
}
