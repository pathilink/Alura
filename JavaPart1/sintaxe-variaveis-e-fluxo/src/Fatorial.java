
public class Fatorial {
	public static void main(String[] args) {
		int fat = 1;
		for(int n = 1; n < 11; n++) {
			fat *= n;
			System.out.println("O fatorial de " + n + " é " + fat);
			
		}
	}
}
