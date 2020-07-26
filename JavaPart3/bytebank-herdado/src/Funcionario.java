
// não se pode instanciar objetos dessa classe pq é abstrata
public abstract class Funcionario {
			
		// atributos
		private String nome;
		private String cpf;
		//protected double salario;
		private double salario;
		
		
		// metodos
		
//		public double getBonificacao() {
//			//System.out.println("Chamando o método de bonificação do Funcionário");
//			return this.salario * 0.05;
//		}
		
//		public double getBonificacao() {
//		//System.out.println("Chamando o método de bonificação do Funcionário");
//		return -1; // gambiarra
//		}
		
		// metodo abstrato sem corpo - não há implementação aqui
		public abstract double getBonificacao(); 

		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
		
		
		
	
}
