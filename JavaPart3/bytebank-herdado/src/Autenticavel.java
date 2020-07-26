/* Interface: classe abstrata com todos os métodos abstratos
 há somente a assinatura dos métodos*/

// contrato Autenticavel
	// quem assina esse contrato precisa implementar:
		// método setSenha
		// método autentica
public abstract interface Autenticavel {

	// metodos
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
	
	
	
}
