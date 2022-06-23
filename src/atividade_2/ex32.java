package atividade_2;

/*
32. Tendo em uma prova com 10 questões o seguinte gabarito (a,a,b,b,c,c,d,d,e,e) crie uma
página que peça os resultados das questões assinaladas pelo candidato e ao final mostre as
respostas dadas e o resultado conforme o exemplo abaixo:
Q1 : a : Correto
Q2: b : Errada, resposta correta (a)
...
Pontuação Final: 9
 */
import java.util.Scanner;

public class ex32 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        char q1,q2,q3,q4,q5,q6,q7,q8,q9,q10;
        int cont = 0;
        
        System.out.println("Resposta questão 1:");
        q1 = s.next().charAt(0);
         System.out.println("Resposta questão 2:");
        q2 = s.next().charAt(0);
         System.out.println("Resposta questão 3:");
        q3 = s.next().charAt(0);
         System.out.println("Resposta questão 4:");
        q4 = s.next().charAt(0);
         System.out.println("Resposta questão 5:");
        q5 = s.next().charAt(0);
         System.out.println("Resposta questão 6:");
        q6 = s.next().charAt(0);
         System.out.println("Resposta questão 7:");
        q7 = s.next().charAt(0);
         System.out.println("Resposta questão 8:");
        q8 = s.next().charAt(0);
         System.out.println("Resposta questão 9:");
        q9 = s.next().charAt(0);
         System.out.println("Resposta questão 10:");
        q10 = s.next().charAt(0);
        System.out.println("__________________________");
        
        
        if (q1=='a') {
            System.out.println("Q1 : a CORRETA");
            cont++;
        } else{ System.out.println("Q1: Errada, resposta correta (a)");}
        
        if (q2=='a') {
            System.out.println("Q2 : a CORRETA");
            cont++;
        }else{ System.out.println("Q2: Errada, resposta correta (a)");}
        
        if (q3=='b') {
            System.out.println("Q3 : a CORRETA");
            cont++;
        }else{ System.out.println("Q3: Errada, resposta correta (b");}
        
        if (q4=='b') {
            System.out.println("Q4 : a CORRETA");
            cont++;
        }else{ System.out.println("Q4: Errada, resposta correta (b)");}
        
        if (q5=='c') {
            System.out.println("Q5 : a CORRETA");
            cont++;
        }else{ System.out.println("Q5: Errada, resposta correta (c)");}
        
        if (q6=='c') {
            System.out.println("Q6 : a CORRETA");
            cont++;
        }else{ System.out.println("Q6: Errada, resposta correta (c)");}
        
        if (q7=='d') {
            System.out.println("Q7 : a CORRETA");
            cont++;
        }else{ System.out.println("Q7: Errada, resposta correta (d)");}
        
        if (q8=='d') {
            System.out.println("Q8 : a CORRETA");
            cont++;
        }else{ System.out.println("Q8: Errada, resposta correta (d)");}
        
        if (q9=='e') {
            System.out.println("Q9 : a CORRETA");
            cont++;
        }else{ System.out.println("Q9: Errada, resposta correta (e)");}
        
        if (q10=='e') {
            System.out.println("Q10 : a CORRETA");
            cont++;
        }else{ System.out.println("Q10: Errada, resposta correta (e)");}
        
        
        System.out.println("--------");
        System.out.println("Sua nota final é: "+cont);
        
        
    }
}
