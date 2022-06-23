package atividade_3_repeticao;
import java.util.Scanner;

/*
18. Altere o programa de cálculo dos números primos, informando, caso o número não seja
primo, por quais número ele é divisível.


*/

public class ex18{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("numero");
        int num = s.nextInt();

        int verificacao = 0;

        for (int i = 1; i <= num; i++) {

            if ((num % i) == 0) {
                verificacao++;   //só pode ter 2, o 1 e ele mesmo se for mais q 2 nao é primo
                
                System.out.println("esse número é divisivel por: "+i);
            }

        }
        System.out.println("-----");
        if (verificacao > 2) {
            System.out.println("nao é primo");

        } else {
            System.out.println("é primo");

        }
    }
}
