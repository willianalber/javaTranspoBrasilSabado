import java.util.ArrayList;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		
		//Add elementos
		
		nomes.add("João");
		nomes.add("Maria");
		System.out.println(nomes);
		
		//Retorna a quantidade de elementos da lista [ lista.size()]
		
		System.out.println(nomes.size());
		
		//Adicionar elementos no inicio
		nomes.add(0,"José");
		nomes.add(0,"Ana");
		System.out.println(nomes);
		System.out.println(nomes.size());
	
		//trocar o elemento [lista.set(indice,elemento)]
		
		nomes.set(nomes.size()-1, "Tiburcio");
		System.out.println(nomes);
		System.out.println(nomes.size());
		
		//buscar o elemento especifico [lista.get(indice)]
		
		System.out.println(nomes.get(0));
		System.out.println(nomes.get(1));
		System.out.println(nomes.get(2));
		System.out.println(nomes.get(3));

		//verificar o indice de um elemento [lista.indexOf(elemento)]
		System.out.println(nomes.indexOf("Tiburcio"));
		System.out.println(nomes.indexOf("Marilia")); //se não existir retorna -1
		
		//verifica se o elemento está contido na lista  [lista.contains(elemento)]
		System.out.println(nomes.contains("João"));
		System.out.println(nomes.contains("Bartolomeu"));
		
		//Criar uma sublista
		List<String> sublista = nomes.subList(2, nomes.size());
		System.out.println(sublista);
		
		//remove elemento da lista atraves do indice [lista.remove(indice)]
		System.out.println(nomes);
		nomes.remove(0);
		System.out.println(nomes);
		
		//remove o elemento da lista atraves da referencia [lista.remove[elemento]]
		System.out.println(nomes);
		nomes.remove("Tiburcio");
		System.out.println(nomes);
		
		

	}

}
