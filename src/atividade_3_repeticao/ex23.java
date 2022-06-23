package atividade_3_repeticao;
import java.util.Scanner;

/*
23. Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a
quantidade de turmas e a quantidade de alunos para cada turma. As turmas não podem ter
mais de 40 alunos.

*/

public class ex23{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int alunos = 0;
        int turmas = 0;
        int soma   = 0;
        char condicao = 0;
        
        
        System.out.println("QTD de turmas");
             turmas = s.nextInt();
             
         do {
             System.out.println("QTD alunos");
             alunos = s.nextInt();
             
             if (alunos > 40) {
                 System.out.println("Valor inválido informe novamente");
                 condicao= 's';
             }else{
                 soma+=alunos;
                 System.out.println("Deseja informa mais alunos? 's' ou 'n'");
                 condicao = s.next().charAt(0);
             }
             
        } while (condicao=='s');
         
         System.out.println("-------");
        System.out.println("Média de alunos por turma: "+soma/turmas);

       
    }    
}
