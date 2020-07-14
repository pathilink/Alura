

public class Conta {
	// atributos	
	private double saldo; // encapsular atributo como privado - somente pode ser modificado através de uma classe
	int agencia;
	int numero;
	Cliente titular; // "Cliente" é uma classe

	// métodos
	public void deposita(double valor) {
		// saldo = saldo + valor; // funciona
		this.saldo += valor; // "this" é opcional
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} // else é opcional
		return false;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
}
