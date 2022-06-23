package atividade_11_piramide;

public class Piramide {

    //atributos
    private double altura;
    private double base;
    private int tipoTinta;
    private int qtdLatas;

    //construtor
    public Piramide(double base, double altura, int tipoTinta) {
        setBase(base);
        setAltura(altura);
        setTipoTinta(tipoTinta);
    }

    public Piramide() {
    }
    //area do triangulo
    //area total
    //litros
    //latas
    //preco
    
    
    //diagonal  
    //area de uma face
    //area da base
    //area total (4*areadeumaface) * area base
    //volume
    //litros
    //latasTinta
    //preco
    
    // metodos
    public double diagonal() {
        //dgnl² = altura² + base²
        return Math.sqrt((Math.pow(this.getAltura(), 2)) + (Math.pow(this.getBase(), 2)));  
    }
    public double areaFace(){
        //area de um triangulo comum
        //base * altura /2
        return ((this.getBase()*2) * this.getAltura())/2; //erro
    }
    
    public double areaBase(){
        //base² mas base é só metade entao multiplico por 2
        return (Math.pow((this.getBase()*2), 2));
    }

    public double areaTotal(){
        //areaTotal = 4*areaFace + areaBase
        return (this.areaFace()*4) + this.areaBase();
    }
    
    public double volume() {
        return (this.areaBase() * this.getAltura()) / 3;
    }

    public double litros() {
        return (this.areaTotal()/ 4.76 );  //qtd de litros
    }

    public double latas(){
         double qtdLatasDecimal = (this.litros()/18);
         System.out.println("qtd decimal "+qtdLatasDecimal);
         this.setQtdLatas((int)Math.ceil(qtdLatasDecimal)); //erro 
         System.out.println(this.getQtdLatas());
         return this.getQtdLatas();
    }
      
    public double area(){
        return (this.getBase()*this.getAltura())/2;
    }
    
    public double preco(){
        
        switch(tipoTinta){
            case 1:
                return qtdLatas * 127.9;
            case 2:
                return qtdLatas * 258.98;
            case 3:
                return qtdLatas * 344.34;
            default:
                return 0;
        }
    }
    
     //toString:
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Piramide \n[Base=");
		builder.append(this.getBase());
		builder.append("\n altura=");
		builder.append(this.getAltura());
		builder.append("\n diagonal=");
		builder.append(this.diagonal());
		builder.append("\n Area do triangulo=");
		builder.append(this.areaFace());
		builder.append("\n Area Base=");
		builder.append(this.areaBase());                 ////faaaaazzz
                builder.append("\n Area Total=");
		builder.append(this.areaTotal());
                builder.append("\n tipo de tinta=");
		builder.append(tipoTinta);
                builder.append("\n Litros =");
		builder.append(this.litros());
                builder.append("\n Latas=");
		builder.append(this.latas());
                builder.append("\n Preço= R$");
		builder.append(this.preco());
                builder.append("\n Volume");
		builder.append(this.volume());
                builder.append("]");
		return builder.toString();
	}
        
    //gets e sets

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura>0) 
        this.altura = altura;
    }
        

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base>0) 
        this.base = base;
    }
    
    public int getTipoTinta() {
        return tipoTinta;
    }

    public void setTipoTinta(int tipoTinta) {
        if ((tipoTinta == 1)
                || (tipoTinta == 2)
                || (tipoTinta == 3)) {
            this.tipoTinta = tipoTinta;
        }
    }

    public int getQtdLatas() {
        return qtdLatas;
    }

    public void setQtdLatas(int qtdLatas) {
        this.qtdLatas = qtdLatas;
    }
}
