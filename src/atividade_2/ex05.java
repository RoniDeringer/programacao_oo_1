package atividade_2;
/*
Faça um Programa que verifique se uma letra digitada é vogal.
 */
import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe uma letra");
        char letra = s.next().charAt(0);

        switch (letra) {

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':

                System.out.println("é uma vogal");
                break;
                
            default:
                System.out.println("nao é uma vogal");
        }
    }
}
