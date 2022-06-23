package zEstudo_1;
public class Caneta{  //começo da CLASSE
    
 String  modelo;   //atributoS
 String  cor;
 float   ponta;
 int     carga;
 boolean tampada;
 
 /*
     metodos:
 */
 
 
 void status () {  // metodo para mostrar as variaveis atuais
     System.out.println("modelo: "+this.modelo);
     System.out.println("Uma caneta "+this.cor);
     System.out.println("ponta: "+this.ponta);
     System.out.println("Carga: "+this.carga);
     System.out.println("esta tampada? "+this.tampada); 
     
     
 }
 
 void rabiscar() {  //metodo
     if (this.tampada == true) {
         System.out.println("ERRO: nao da pra rabiscar com tampa");
     }else {
         System.out.println("rabiscando .. .. .. ");
     }
 }
    
 void tampar() {  //metodo
     this.tampada = true;
     
 }
    
 
 void destampar () { //metodo
     this.tampada = false;
 }
} 