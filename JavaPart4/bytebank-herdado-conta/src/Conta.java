

public abstract class Conta {
	// atributos do objeto	
	//private double saldo; // encapsular atributo como privado - somente pode ser modificado através de uma classe
	protected double saldo; // filhos pode acessar o atributo
	private int agencia;
	private int numero;
	private Cliente titular; // "Cliente" é uma classe
	
	// atributo da classe
	private static int total = 0; 
	
	// construtor padrão
//	public Conta() {
//		
//	}
	
	// construtor específico
	public Conta(int agencia, int numero){
		Conta.total++; // "total++;" tb é possível
		//System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//this.saldo = 100;
		//System.out.println("Estou criando uma conta: " + "Ag " + this.agencia + " CC " + this.numero);
	}

	// métodos
//	public void deposita(double valor) {
//		// saldo = saldo + valor; // funciona
//		this.saldo += valor; // "this" é opcional
//	}
	
	public abstract void deposita(double valor);

//	public boolean saca(double valor) {
//		if (this.saldo >= valor) {
//			this.saldo -= valor;
//			return true;
//		} else {
//			return false;
//		}
//	}
	public void saca(double valor) throws SaldoInsuficienteException{
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + " , Valor: " + valor);
			
		} 
		this.saldo -= valor;
	}
	
//	public boolean transfere(double valor, Conta destino){
//		if(this.saldo >= valor) {
//			this.saldo -= valor;
//			destino.deposita(valor);
//			return true;
//		} // else é opcional
//		return false;
//	}
	
//	public boolean transfere(double valor, Conta destino){
//		if(this.saca(valor)) {
//			destino.deposita(valor);
//			return true;
//		} else {
//			return false;
//		}
//	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
		this.saca(valor);
		destino.deposita(valor);		
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero){
		if(numero <= 0) {
			System.out.println("Não pode valor <= 0.");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode valor <= 0.");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	// método da classe
	public static int getTotal() {
		return Conta.total;
	}
}
