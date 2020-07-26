
public class TesteFuncionario {

	public static void main(String[] args) {
		
//		Cliente cliente= new Cliente();
//		cliente.setSalario(0.0);
		
		//Funcionario patricia = new Funcionario();
		Gerente patricia = new Gerente();
		patricia.setNome("Patrícia");
		patricia.setCpf("123456789-10");
		patricia.setSalario(5500.00);
		
		System.out.println(patricia.getNome());
		System.out.println(patricia.getBonificacao());
		
		//patricia.salario = 3000.0;

	}

}
