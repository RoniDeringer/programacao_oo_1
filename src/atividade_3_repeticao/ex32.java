package atividade_3_repeticao;
import java.util.Scanner;

/*
32. Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes
de trânsito. Foram obtidos os seguintes dados:
a. Código da cidade;
b. Número de veículos de passeio (em 1999);
c. Número de acidentes de trânsito com vítimas (em 1999). 

Deseja-se saber:
 Qual o maior e menor índice de acidentes de transito e a que cidade pertence;
 Qual a média de veículos nas cinco cidades juntas;
 Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.

*/

public class ex32{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int cod = 0;
        int codCidMaior = 0;
        int codCidMenor = 0;
        int contCid2 =0;
        int veic = 0;
        
        int acid = 0;
        int acidMaior = Integer.MIN_VALUE;
        int acidMenor = Integer.MAX_VALUE;
        int somaVeic = 0;
        int somaAcid2 = 0;
  
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("codigo da "+(i+1)+"ª city");
            cod = s.nextInt();
            System.out.println("numero de veiculos");
            veic = s.nextInt();
            somaVeic+=veic;
            System.out.println("numero de acidentes");
            acid = s.nextInt();
            
            if (acid > acidMaior) {
                acidMaior = acid;
                codCidMaior = cod;
            } else 
                if (acid < acidMenor) {
                acidMenor = acid;
                codCidMenor = cod;
            }
                        
            if (veic <2000) {
                somaAcid2+=acid;
                contCid2++;
            }
            
            System.out.println("------------------");
        }// fim FOR
        
        System.out.println("");
         System.out.println("Maior indice acidente:");
         System.out.println("cidade: "+codCidMaior);
         System.out.println("Indice de: "+acidMaior);
         System.out.println("-----------------");
         System.out.println("Menor indice acidente:");
         System.out.println("cidade: "+codCidMenor);
         System.out.println("Indice de: "+acidMenor);
         System.out.println("");
         System.out.println("Média de veiculos das 5 cidades: "+(somaVeic/5));
         System.out.println("");
         System.out.println("Média acidentes nas cidades com menos de 2000 veiculos: "+(somaAcid2/contCid2));
 
       
    }    
}
