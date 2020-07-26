
public class TesteReferencias {

	public static void main(String[] args) {
		// Polimorfismo:
		//Gerente g1 = new Gerente();   // "Gerente" é específico
		Funcionario g1 = new Gerente(); // "Funcionário" é mais geral
		
		g1.setNome("Patrícia");
//		String nome = g1.getNome();
//		
//		//g1.autentica(2222);
//		
//		System.out.println(nome);
		g1.setSalario(5000.0);
		
		// não funciona mais quando a classe se torna abstract
//		Funcionario f = new Funcionario();
//		f.setSalario(2000.0);
		
		Funcionario ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Funcionario d = new Designer();
		ev.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		//controle.registra(f);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());

	}

}
