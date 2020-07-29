
public class TestaContaComExcecaoChecked {

//	public static void main(String[] args) throws MinhaExcecao{
//		
//		Conta c = new Conta();
//		c.deposita();
//	}
	
	public static void main(String[] args) {
		
		Conta c = new Conta();
		
		try {
			c.deposita();
		} catch(MinhaExcecao ex) {
			System.out.println("Tratamento à exceção.");
		}
		
	}
	// as duas formas são válidas
}
