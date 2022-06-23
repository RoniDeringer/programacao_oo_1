package atividade_3_repeticao;
import java.util.Scanner;

/*
21. Faça um programa que peça para n pessoas a sua idade, ao final o programa devera
verificar se a média de idade da turma varia entre 0 e 25,  26 e 60 e maior que 60; e então,
dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.


*/

public class ex21{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char condicao = 0;
        int i =0;
        int soma = 0;
        int idade=  0;
        do {
            i++;
            System.out.println("Informe a "+i+"ª idade:");
             idade = s.nextInt();
            soma+= idade;
            
            System.out.println("Deseja informa mais idade?");
            condicao = s.next().charAt(0);
        } while (condicao=='s');
        
        int media = idade/i;
        if (media>60) {
            System.out.println("Turma Idosa");
            
        }else if (media>26) {
            System.out.println("Turma Adulta");
            
        }else {
            System.out.println("turma jovem");
        }
       
    }    
}
