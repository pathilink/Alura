
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDoLoro = new Conta();
		//System.out.println(contaDoLoro.saldo); // não visível quando o atributo é "private"
		System.out.println(contaDoLoro.getSaldo());
		
		contaDoLoro.titular = new Cliente();
		System.out.println(contaDoLoro.titular);
		
		contaDoLoro.titular.nome = "Loro";
		System.out.println(contaDoLoro.titular.nome);
	}
}
