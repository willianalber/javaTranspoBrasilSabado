
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploSet {

	public static void main(String[] args) {
		Set<String> nomes = new HashSet<>();
		
		//add elementos
		nomes.add("João");
		nomes.add("Maria");
		System.out.println(nomes);
		
		//não são permitido elementos duplicados
		boolean adicionado = nomes.add("Ana");
		System.out.println(adicionado);
		System.out.println(nomes);
		
		//verifica a quantidade de elementos
		System.out.println(nomes.size());
		
		//Verifica se o conjunto contem um elemento
		System.out.println(nomes.contains("Ana"));
		System.out.println(nomes.contains("Beatriz"));
		
		//Verifica se o conjunto esta vazio
		System.out.println(nomes.isEmpty());
		
		//Itera sobre o conjunto
		for (String atual : nomes) {
			System.out.println(atual);			
		}
		Iterator<String> iterator = nomes.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		//remove um elemento do conjunto
		System.out.println(nomes);
		nomes.remove("Maria");
		System.out.println(nomes);
		
		

	}

}
