
public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int)salario; // casting: (int)
		System.out.println(valor);
		
		/* Tipos flutuantes
		double
		float pontoFlutuante = (float) 3.14f;
		*/
		
		//double valor = 3; // promovido a double
		
		/* Tipos primitivos
		int
		long numeroGrande = 323232323232L;
		short valorPequeno = 2131;
		byte b = 127
		*/
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
	}

}
