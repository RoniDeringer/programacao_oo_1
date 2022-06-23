package atividade_3_repeticao;

import java.util.Scanner;

/*
3. Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';

 */
public class ex03_validacaoNome {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String nome;
        int idade;
        char sexo, ec;
        boolean condicao;

        /*
         vou fazer um laço pra verificar
         cada dado independente.
         assim caso informar algo errado
         o laço só pede a informação necessária
         */
        do {  //VERIFICAÇÃO NOME  'FAZER UM METODO pra cada'

            System.out.println("Informe Nome: ");
            nome = s.next();

            int qtdLetrasNome = nome.length();
            if (qtdLetrasNome > 3) {
                condicao = false;
            } else {
                condicao = true;
                System.out.println("nome Inválido (minimo 4 letras)");

            }

        } while (condicao == true);

        System.out.println("");

        do {  //verificação IDADE

            System.out.println("IDADE:");
            idade = s.nextInt();

            if (idade >= 0 && idade <= 150) {
                condicao = false;

            } else {
                condicao = true;
                System.out.println("idade inválida (entre 0 a 150)");
            }

        } while (condicao == true);

        System.out.println("");

        do {
            System.out.println("SEXO:");
            System.out.println(" 'm' ou 'f' ");
            sexo = s.next().charAt(0);

            if (sexo == 'f' || sexo == 'm') {
                condicao = false;
            } else {
                condicao = true;
                System.out.println("Sexo inválido");
            }
        } while (condicao == true);
        System.out.println("");

        do {
            System.out.println("ESTADO CIVIL");
            System.out.println(" 's' 'c' 'v' 'd' ");
            ec = s.next().charAt(0);

            if (ec == 's' || ec == 'v' || ec == 'c' || ec == 'd') {
                condicao = false;

            } else {
                condicao = true;
                System.out.println("Estado civil inválido");
            }

        } while (condicao == true);
        
        
        
        System.out.println("----");
        System.out.println("TODOS DADOS SALVOS COM EXITO");
    }
}
