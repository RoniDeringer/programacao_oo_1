package atividade_3_repeticao;
import java.util.Scanner;

/*
37. Desenvolver um programa para verificar a nota do aluno em uma prova com 10
questões, o programa deve perguntar ao aluno a resposta de cada questão e ao final
comparar com o gabarito da prova e assim calcular o total de acertos e a nota 
(atribuir 1
ponto por resposta certa). Após cada aluno utilizar o sistema deve ser feita uma pergunta se
outro aluno vai utilizar o sistema. Após todos os alunos terem respondido informar:
a. Maior e Menor Acerto;
b. Total de Alunos que utilizaram o sistema;
c. A Média das Notas da Turma.
Gabarito da Prova:
01  A
02  B
03  C
04  D
05  E
06  E
07  D
08  C
09  B
10  A

Após concluir isto você poderia incrementar o programa permitindo que o professor digite o
gabarito da prova antes dos alunos usarem o programa.
• Faça um programa que peça um numero inteiro positivo e em seguida mostre este numero
invertido.
• Exemplo:
 12376489
 => 98467321

*/

public class ex37{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char condicao = 0;
        char q1, q2,q3,q4,q5,q6,q7,q8,q9,q10;
        int pontos = 0;
        int somaPontos = 0;
        int cont = 0;
        
        int maiorPontos = Integer.MIN_VALUE;
        int menorPontos = Integer.MAX_VALUE;
        
        
        do {
            pontos = 0;
            System.out.println("Informe a questão 1:");
            q1= s.next().charAt(0);
            System.out.println("Informe a questão 2:");
            q2= s.next().charAt(0);
            System.out.println("Informe a questão 3:");
            q3= s.next().charAt(0);
            System.out.println("Informe a questão 4:");
            q4=s.next().charAt(0);
            System.out.println("Informe a questão 5:");
            q5= s.next().charAt(0);
            System.out.println("Informe a questão 6:");
            q6= s.next().charAt(0);
            System.out.println("Informe a questão 7:");
            q7= s.next().charAt(0);
            System.out.println("Informe a questão 8:");
            q8= s.next().charAt(0);
            System.out.println("Informe a questão 9:");
            q9= s.next().charAt(0);
            System.out.println("Informe a questão 10:");
            q10= s.next().charAt(0);
            
            if (q1=='a') {
                pontos++;
            }
            if (q2=='b') {
                pontos++;
            }
            if (q3=='c') {
                pontos++;
            }
            if (q4=='d') {
                pontos++;
            }
            if (q5=='e') {
                pontos++;
            }
            if (q6=='e') {
                pontos++;
            }
            if (q7=='d') {
                pontos++;
            }
            if (q8=='c') {
                pontos++;
            }
            if (q9=='b') {
                pontos++;
            }
            if (q10=='a') {
                pontos++;
            }
            System.out.println("Sua nota foi: "+pontos);
            
            if (pontos > maiorPontos) {
                maiorPontos = pontos;
                
            }
            if (pontos < menorPontos) {
                menorPontos = pontos;
                
            }
            
            
            somaPontos+= pontos;
            cont++;
            System.out.println("Usar sistema novamente? 's' ou 'n'");
            condicao = s.next().charAt(0);
            
        } while (condicao=='s');
        
        System.out.println("Total de alunos q usaram o sistema: "+cont);
         System.out.println("media de notas: "+ somaPontos/cont);
         System.out.println("Maior nota foi: "+maiorPontos);
        System.out.println("Menor nota foi: "+menorPontos);
    }    
}
