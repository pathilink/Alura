
public class TestaBanco {
	public static void main(String[] args) {
		Cliente patricia = new Cliente();
		patricia.nome = "Patrícia";
		patricia.cpf = "123.456.789-10";
		patricia.profissao = "analista";
		
		Conta contaDaPatricia = new Conta();
		contaDaPatricia.deposita(100);
		
		contaDaPatricia.titular = patricia; // conta faz referência a cliente patricia
		System.out.println(contaDaPatricia.titular); // 1)
		System.out.println(patricia); // 2)
		// 1) e 2) são duas referências para o mesmo objeto
		System.out.println(contaDaPatricia.titular.nome);
	}
}
