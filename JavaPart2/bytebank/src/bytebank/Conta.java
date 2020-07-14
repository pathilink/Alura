package bytebank;

public class Conta {
	// atributos
	double saldo;
	int agencia;
	int numero;
	String titular;

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
}
