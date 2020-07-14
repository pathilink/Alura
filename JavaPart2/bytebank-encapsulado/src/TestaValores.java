
public class TestaValores {
	public static void main(String[] args) {

		Conta conta = new Conta(1337, 456789); // chama o construtor
		Conta conta2 = new Conta(1337, 122389); 
		
		// conta está inconsistente com a regra de negócio
		//conta.setAgencia(-50);
		//conta.setNumero(-330);
		//System.out.println(conta.getAgencia());
		System.out.println(Conta.getTotal());
	}
}
