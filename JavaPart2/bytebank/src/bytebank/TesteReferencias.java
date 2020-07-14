package bytebank;

public class TesteReferencias {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;	
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda: " + segundaConta.saldo);
		// saldo: 300.0
		
		segundaConta.saldo += 100;
		System.out.println("Novo saldo da segunda conta: " + segundaConta.saldo);
		// 400.0
		System.out.println("Novo saldo da primeira conta: " + primeiraConta.saldo);
		// 400.0
		
		// as duas contas referenciam ao mesmo objeto
		
		if(primeiraConta == segundaConta){
			System.out.println("são a mesma conta");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
