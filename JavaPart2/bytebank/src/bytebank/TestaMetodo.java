package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		//classe variavel...
		Conta contaDaPat = new Conta();
		contaDaPat.saldo = 100;
		
		contaDaPat.deposita(50);
		System.out.println(contaDaPat.saldo);
		
		boolean conseguiuRetirar = contaDaPat.saca(20);
		System.out.println(contaDaPat.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDoLoro = new Conta();
		contaDoLoro.deposita(1000);
		
		boolean sucessoTransferencia = contaDoLoro.transfere(300, contaDaPat); // (valor, destino)
		if(sucessoTransferencia) { 
			System.out.println("Transferência feita com sucesso!");
		}else {
			System.out.println("Faltou dinheiro.");
		}
		System.out.println(contaDoLoro.saldo);
		System.out.println(contaDaPat.saldo);
		
		contaDaPat.titular = "Patrícia";
		System.out.println(contaDaPat.titular);
	}
}
