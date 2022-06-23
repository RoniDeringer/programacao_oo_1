package atividade_2;

/*
11.Faça um Programa que pergunte em que turno você estuda. Peça para digitar
M Matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa
Tarde!" ou "Boa Noite!" , conforme o caso
 */
import java.util.Scanner;

public class ex11_switch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Em qual turno você estuda?");
        System.out.println("V para vespertino");
        System.out.println("M para matutino");
        System.out.println("N para noturno");
        char turno = s.next().charAt(0);

        switch (turno) {
            case 'v':
                System.out.println("Boa tarde!");
                break;
            case 'm':
                System.out.println("Bom dia!");
                break;
            case 'n':
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Informe 'v', 'm' ou 'n'");
        }
    }
}
