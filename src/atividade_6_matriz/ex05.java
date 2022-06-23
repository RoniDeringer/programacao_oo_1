package atividade_6_matriz;
import java.util.Random;
import java.util.Scanner;

/*
5. Criar uma loteria com 6 números de 1 a 60. Solicitar ao usuário quantas cartelas deseja
preencher criar uma matriz deste tamanho para armazenar os valores que serão criados
aleatoriamente. No final analisar cada uma das cartelas e mostrar ao lado do números (ordenados
em ordem crescente e não repetidos dentro da mesma cartela) o total de acertos.

 */

public class ex05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random aleatorio = new Random();
        
        
        System.out.println("quantas cartelas informar:");
        int num = s.nextInt();
        
        /*
        atributos:
         */
        int matriz[][] = new int[num][6];
        int contAcertos[] = new int[6];  //vetor que conta os acertos de cada cartela
        int vetorRandom[] = new int[6];   //vetor q cria valor random
        System.out.println("valor sorteado");
        for (int i = 0; i < 6; i++) {
            vetorRandom[i] = aleatorio.nextInt(60)+1; //vai de 1 até 60
            System.out.print(vetorRandom[i]+" - ");
        }
        System.out.println("");
        for (int i = 0; i < num; i++) {
            System.out.println((i+1)+"ª Cartela:");
            for (int j = 0; j < 6; j++) {
                System.out.println("Valor "+(j+1)+":");
                matriz[i][j] = s.nextInt();
                for (int k = 0; k < 6; k++) {  //percore o vetor aleatorio
                    if (matriz[i][j] == vetorRandom[k]) {
                        contAcertos[i]++;
                        
                    } //fim if 
                } //fim vetor random
                
            }//fim coluna
        }//fim linha
        
        System.out.println("");
        System.out.println("matriz das cartelas:");
        for (int i = 0; i <num; i++) {
            System.out.println("");
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
        }
        System.out.println("");
        System.out.println("\nValores aleatorios:");
        for (int i = 0; i < 6; i++) {
            System.out.print(vetorRandom[i]+"\t");
        }
        
        System.out.println("___________");
        for (int i = 0; i < num; i++) {
            System.out.println("Total de acertos da cartela: "+(i+1));
            System.out.println("Acertos: "+contAcertos[i]);
            
        
        }
    
    }
}
