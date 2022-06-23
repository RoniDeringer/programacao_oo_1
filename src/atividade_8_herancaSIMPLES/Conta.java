package atividade_8_herancaSIMPLES;
    public class Conta {
	
	private String banco;
	private int agencia;
	private int numeroconta;
	private double saldo;
	
        // construtor
	public Conta(String banco, int agencia, int numeroconta, double saldo) {
		setBanco(banco);
		setAgencia(agencia);
		setNumeroconta(numeroconta);
		setSaldo(saldo);
	}
	
        //construtor vazio
	public Conta() {
		
	}
	//get e set
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		if (banco.length() > 0)
			this.banco = banco;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		if (agencia > 0)
			this.agencia = agencia;
	}
	
	public int getNumeroconta() {
		return numeroconta;
	}
	public void setNumeroconta(int numeroconta) {
		if (numeroconta > 0)
			this.numeroconta = numeroconta;
	}
	
	public double getSaldo() {
		return saldo;
	}
		
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
        //metodos
        
	public boolean deposito(double valor) {
		if (valor > 0) {
			setSaldo(getSaldo()+valor);
			return true;
		}
		return false;
	}
	
	public boolean saque(double valor) {
		if (valor <= getSaldo() && valor > 0) {
			setSaldo(getSaldo() - valor);
			return true;
		}
		return false;
	}
	  
        
        //toString:
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numeroconta=");
		builder.append(numeroconta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}
}

