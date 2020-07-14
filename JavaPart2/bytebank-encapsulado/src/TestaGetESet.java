
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 490089); // inseri argumentos para satisfazer construtor
		conta.setNumero(1234);
		System.out.println(conta.getNumero());
		
		Cliente patricia = new Cliente();
		//conta.titular = patricia;
		conta.setTitular(patricia);
		//patricia.nome = "Patrícia"; // não compila pq a variável é privada
		patricia.setNome("Patrícia");
		conta.setTitular(patricia);
		System.out.println(conta.getTitular()); // valor de referência do objeto
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programadora");
		// em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programadora");
		System.out.println(titularDaConta);
		System.out.println(titularDaConta.getProfissao());
	}
}
