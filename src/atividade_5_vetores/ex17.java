package atividade_5_vetores;

import java.util.Date;
import java.util.Scanner;

/*
17.  Crie uma agenda de contatos usando as estruturas de vetores, ela deve
armazenar no mínimo 10 contatos, e deve ter a informação do nome, telefone, celular, email, Data de Nascimento.
A agenda deve permitir consultas por:
 Nome e Sobrenome;
 Aniversários do mês (mês será informado);
Gerar um relatório com todos os contatos (cuidar com a formatação);
 */

public class ex17 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*
        atributos:
         */
        String nome[] = {"Andre Santos", "Breno Silva", "Carlos Zé"};
        int telefone[] = {111111, 222222, 333333};
        int celular[] = {91111, 9222, 9333};
        String email[] = {"andre@gmail", "breno@outlook", "carlos@uol"};
        int mes[] = {1, 2, 3};
        char condicao = 0;

        do {

            System.out.println("1 - Consulta \n"
                    + "2 - Aniversarios");
            int cons = s.nextInt();

            switch (cons) {
                case 1:
                    System.out.println("Informe quem deseja ver as info");
                    for (int i = 0; i < 3; i++) {
                        System.out.println((i + 1) + " - " + nome[i]);
                    }
                    int nomeConsulta = s.nextInt();
                    System.out.println("Telefone: " + telefone[nomeConsulta - 1]);
                    System.out.println("Celular: " + celular[nomeConsulta - 1]);
                    System.out.println("email: " + email[nomeConsulta - 1]);
                    System.out.println("mes aniversario: " + mes[nomeConsulta - 1]);
                    break;
                    
                case 2:
                    System.out.println("Informe o mes que deseja ver os aniversarientes: \n"
                            + "1 - Janeiro\n"
                            + "2 - Feveriro\n"
                            + "3 - Março\n"
                            + "4 - Abril\n"
                            + "5 - Maio\n"
                            + "6 - Junho\n"
                            + "7 - Julho\n"
                            + "8 - Agosto\n"
                            + "9 - Setembro\n"
                            + "10 - Outubro\n"
                            + "11 - Novembro\n"
                            + "12 - Dezembro");
                    int mesAniver = s.nextInt();

                    for (int i = 0; i < 3; i++) {
                        if (mesAniver == mes[i]) {
                            System.out.println("Nome Aniversariente: " + nome[i]);

                        }
                    }
                    break;
            }
            System.out.println("Deseja fazer mais consultas: 's' ou 'n'");
            condicao = s.next().charAt(0);
        } while (condicao == 's');
    }


    
}
