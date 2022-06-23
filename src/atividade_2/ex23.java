package atividade_2;

/*
23. Faça um Programa para ler três idades de alunos e seguir as seguintes instruções:
◦ Se a média de idade dos alunos é inferior de 25, apresentar a mensagem
"Turma Jovem";
◦ Se a média de idade dos alunos é entre 25 e 40, apresentar a mensagem
"Turma Adulta";
◦ Se a média de idade dos alunos é acima de 40 anos, apresentar a
mensagem "Turma Idosa".

 */
import java.util.Scanner;

public class ex23 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int ida1, ida2, ida3, media;

        System.out.println("1a idade:");
        ida1 = s.nextInt();
        System.out.println("2a idade:");
        ida2 = s.nextInt();
        System.out.println("3a idade:");
        ida3 = s.nextInt();

        media = (ida1 + ida2 + ida3) / 3;
        System.out.println("media: " + media);
        
        if (media < 25) {

            System.out.println("turma Jovem");
        } else if (media <= 40) {

            System.out.println("Turma adulta");
        } else {
            System.out.println("turma idosa");

        }

    }
}
