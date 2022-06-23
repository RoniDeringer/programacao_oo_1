package atividade_6_matriz;
import java.util.Scanner;
/*
3. Utilizando a estrutura de matriz, faça um programa que para um colégio que tem N (deve
ser informado no início do programa) alunos e estes são avaliados em duas provas. O
programa deve permitir digitação do nome do aluno e das duas notas e após isto mostrar as
seguintes informações:
• Nome e as duas Notas de cada aluno;
• A média de cada aluno;
• A maior e menor nota (nome do aluno junto);
• A maior e menor média (nome do aluno junto);
• A média geral da turma;
• O nome dos alunos acima e abaixo da Media Geral da Turma;
Permitir gravar e ler estes dados de um arquivo.


*/

public class ex03_NotasAlunoComNomes{
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
       
        
        /*
        dados entrada
        */
        System.out.println("qtd alunos:");
        int alunos = s.nextInt();
        
        
         /*
        atributos:
        */
        float matriz[][] = new float[alunos][2];
        String vetorNome[] =new String[alunos];  //vetor nome de cada aluno
        float vetorMedia[] = new float[alunos];  //vetor soma de notas por aluno
        float maiorNota= Integer.MIN_VALUE; //
        float menorNota = Integer.MAX_VALUE; //vai comparar com a outra nota
        int posMaiorNota = 0;  //vai pegar a posição do i
        int posMenorNota =0;//vai pegar a posição do i
        
        
        /*
        receber notas
        */
        for (int i = 0; i < alunos; i++) {
            System.out.println("Nome aluno:");
            vetorNome[i] = s.next();
            for (int j = 0; j < 2; j++) {
                System.out.println("nota "+(j+1)+":");
                matriz[i][j]=s.nextFloat();
              
                vetorMedia[i]+=matriz[i][j];  //soma de cada aluno
                
                if (maiorNota < matriz[i][j]) {
                    maiorNota = matriz[i][j];
                    posMaiorNota = i;
                }
                if (menorNota > matriz[i][j]) {
                    menorNota =matriz[i][j];
                    posMenorNota = i;
                }
            } // fim for linha
        } //fim for coluna
        
        
        System.out.println("__________SAIDA__________");
        for (int i = 0; i < alunos; i++) {
            System.out.println("");
            System.out.println(vetorNome[i]);
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
        }
        System.out.println("");
        for (int i = 0; i < alunos; i++) {
            if (i==posMenorNota) {
                System.out.println("nome menor nota: "+vetorNome[i]);
                System.out.println("media dele "+vetorMedia[i]/2);
            }
            System.out.println("");
            if (i==posMaiorNota) {
                System.out.println("nome maior nota "+vetorNome[i]);
                System.out.println("media dele "+vetorMedia[i]/2);
            }
        }
       
    }    
}
