package atividade_7_poo_AreaCone;

import java.util.Scanner;

public class Calculos implements calculo_interface {

    Scanner s = new Scanner(System.in);

    /*
    atributos:
     */
    private float alturaZ;
    private float raioR;
    private int tipoTinta;
    private double geratriz;
    private double fundoCone;
    private double areaTotal;
    private double lateralCone;
    private double qtdLitros;
    private int    qtdLatasTinta;
    private double valorFinal;

    /*
        CONSTRUTOR
    */
    public Calculos(float alturaZ, float raioR, int tipoTinta) {
        this.alturaZ = alturaZ;
        this.raioR = raioR;
        this.tipoTinta = tipoTinta;
    }

    /*
        GET E SET
     */
    public float getAlturaZ() {
        return alturaZ;
    }

    public void setAlturaZ(float alturaZ) {
        this.alturaZ = alturaZ;
    }

    public float getRaioR() {
        return raioR;
    }

    public void setRaioR(float raioR) {
        this.raioR = raioR;
    }

    public int getTipoTinta() {
        return tipoTinta;
    }

    public void setTipoTinta(int tipoTinta) {
        this.tipoTinta = tipoTinta;
    }

    public double getGeratriz() {
        return geratriz;
    }

    public void setGeratriz(double geratriz) {
        this.geratriz = geratriz;
    }

    public double getFundoCone() {
        return fundoCone;
    }

    public void setFundoCone(double fundoCone) {
        this.fundoCone = fundoCone;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public double getLateralCone() {
        return lateralCone;
    }

    public void setLateralCone(double lateralCone) {
        this.lateralCone = lateralCone;
    }

    public double getQtdLitros() {
        return qtdLitros;
    }

    public void setQtdLitros(double qtdLitros) {
        this.qtdLitros = qtdLitros;
    }

    public int getQtdLatasTinta() {
        return qtdLatasTinta;
    }

    public void setQtdLatasTinta(int qtdLatasTinta) {
        this.qtdLatasTinta = qtdLatasTinta;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
    
    

    
    @Override
    public void dadosEntrada() {
        System.out.println("---DADOS DE ENTRADA---");
        System.out.println("Informe o tipo de lata de tinta:");
        System.out.println("o:\n"
                + "Tipo 1 – R$ 238,90\n"
                + "Tipo 2 – R$ 467,98\n"
                + "Tipo 3 – R$ 758,34");
        this.setTipoTinta(s.nextInt());

        System.out.println("Informe a altura Z:");
        this.setAlturaZ(s.nextFloat());  

        System.out.println("Informe o raio R:");
        this.setRaioR(s.nextFloat());  
    }

    @Override
    public void status() { //fiz só pra ir testando
        System.out.println("");
        System.out.println("tipo de tinta: "+this.getTipoTinta());  
        System.out.println("altura: "+this.getAlturaZ());
        System.out.println("raio: "+this.getRaioR());
        
    }

    @Override
    public void calculosMedidas() {
        /*
        geratriz:
        */
        
        double geratrizRaiz = (Math.pow(this.getAlturaZ(), 2)) + (Math.pow(this.getRaioR(), 2));  //geratriz dentro da raiz
        this.setGeratriz(Math.sqrt(geratrizRaiz)); //calculo pra tirar da raiz        
       
        /*
        fundo do cone area:
        */
        this.setFundoCone(3.14 * (Math.pow(this.getRaioR(), 2))); //FUNDO CONE
        
        /*
        lateral do cone:
        */
        this.setLateralCone(3.14 * this.getRaioR() * this.getGeratriz()); //LATERAL DO CONE
        
        /*
        area TOTAL:
        */
        this.setAreaTotal(3.14 * this.getRaioR() * (this.getRaioR() + this.getGeratriz())); //AREA TOTAL
    
        
    }

    @Override
    public void calculoTintas() {
      /*
        CALCULO DA QTD DE LITROS DE TINTA
        */
        this.setQtdLitros(this.getAreaTotal() * 3.45);  //qtd de litros
      
        /*
        CALCULO DA QTD DE LATAS EM INTEIRO 
        ARREDONDANDO PRA CIMA
        */
        double qtdLatasDecimal = this.getQtdLitros() / 18;  //consigo fazer só em 1 linha tudo isso?
        this.setQtdLatasTinta((int) Math.round(qtdLatasDecimal));
   }

    @Override
    public void valorFinal() {
        switch (this.getTipoTinta()) {
            case 1:
                this.setValorFinal(this.getQtdLatasTinta() * 238.90 );  
                break;

            case 2:
                this.setValorFinal(this.getQtdLatasTinta() * 467.98);
                break;

            case 3:
                this.setValorFinal(this.getQtdLatasTinta() * 758.34);
                break;

            default:
                this.setValorFinal(0);
        
        }
    }    
    
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(" [Raio: ");
        builder.append(this.getRaioR());
        builder.append("\n Altura: ");
        builder.append(this.getAlturaZ());
        builder.append("\n Nível: ");
        builder.append(this.getTipoTinta());
        builder.append("\n ------ ");
        builder.append("\n Área do fundo: ");
        builder.append(this.getFundoCone());
        builder.append("\n Área Lateral: ");
        builder.append(this.getLateralCone());
        builder.append("\n Área TOTAL: ");
        builder.append(this.getAreaTotal());
        builder.append("\n -------- ");
        builder.append(this.getAreaTotal());
        builder.append("\n Litros: ");
        builder.append(this.getQtdLitros());
        builder.append("\n Quantidade de Latas: ");
        builder.append(this.getQtdLatasTinta());
        builder.append("\n ________ ");
        builder.append("\nVALOR FINAL: ");
        builder.append(this.getValorFinal());
        builder.append("]");
        return builder.toString();
    }

		
	
    @Override
    public void saida() {     
        System.out.println("--> CONE");
        System.out.println("Raio:   " + this.getRaioR());
        System.out.println("Altura: " + this.getAlturaZ());
        System.out.println("Nível:  " + this.getTipoTinta());  

        System.out.println("----------");

        System.out.println("Geratriz: " + this.getGeratriz());

        System.out.println("----------");

        System.out.println("Área do fundo: " + this.getFundoCone());
        System.out.println("Área lateral cone: " + this.getLateralCone());  //errado
        System.out.println("Área total: " + this.getAreaTotal());

        System.out.println("----------");

        System.out.println("Litros: " + this.getQtdLitros());
        System.out.println("Latas: " + this.getQtdLatasTinta());

        System.out.println("----------");

        System.out.println("Preço total: R$ " + this.getValorFinal());
    }
}
    

   
    
    
