import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
//		Comparator<String> comparador = new ComparadorPorTamanho();
				
		//Collections.sort(palavras, comparador);
		
//		palavras.sort(comparador);
//		palavras.sort(new Comparator<String>() {
//
//			@Override
//			public int compare(String s1, String s2) {
//				if(s1.length() < s2.length())
//					return -1;
//				if(s1.length() > s2.length())
//					return 1;
//				return 0;
//			}
//			
//		});
		
//		palavras.sort((s1, s2) -> {
//				if(s1.length() < s2.length())
//					return -1;
//				if(s1.length() > s2.length())
//					return 1;
//				return 0;
//		});
		
//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
//		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));
		
//		Function<String, Integer> funcao = String::length;
		Function<String, Integer> funcao2 = s -> s.length();
		
//		Comparator<String> comparador = Comparator.comparing(s -> s.length());
		
//		Function<String, Integer> funcao = s -> s.length();
//		Comparator<String> comparador = Comparator.comparing(funcao);
//		palavras.sort(comparador);
		
		System.out.println(palavras);
		
//		Consumer<String> impressor = s -> System.out.println(s);
		Consumer<String> impressor = System.out::println;
		palavras.forEach(impressor);
		
//		palavras.forEach(s -> System.out.println(s)); // lambda equivalente
		palavras.forEach(System.out::println); // lambda equivalente

//		for (String p : palavras) {
//			System.out.println(p);
//		}
		
//		Consumer<String> consumidor = new ImprimeNaLinha();
		
//		Consumer<String> consumidor = new Consumer<String>() {
//
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//				
//			}
//		};
		
//		palavras.forEach(consumidor);
		
//		palavras.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String s) {
//				System.out.println(s);		
//			};
//	
//		});
		
		
	}
}

//class ImprimeNaLinha implements Consumer<String>{
//	@Override
//	public void accept(String s) {
//		System.out.println(s);
//		
//	}
//}

//class ComparadorPorTamanho implements Comparator<String>{
//	@Override
//	public int compare(String s1, String s2) {
//		if(s1.length() < s2.length())
//			return -1;
//		if(s1.length() > s2.length())
//			return 1;
//		return 0;
//	}
//}