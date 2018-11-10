import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
	public static void main(String[] args) {
		Map<String, Pessoa> mapa = new HashMap<>();
		
		//add elementos
		mapa.put("123456", new Pessoa("Maria"));
		mapa.put("789101", new Pessoa("João"));
		mapa.put("teste1", new Pessoa("Mariana"));
		System.out.println(mapa);
		
		//quantidade de elementos
		System.out.println(mapa.size());
		
		//troca de pessoas
		mapa.put("Troca", new Pessoa("Pessoa1"));
		mapa.put("Troca", new Pessoa("Tiburcio"));
		System.out.println(mapa);
		
		//verifica se existe uma chave
		System.out.println(mapa.containsKey(new Pessoa("123456")));
		System.out.println(mapa.containsKey(new Pessoa("naoexiste")));
		
		//verifica se existe um valor especifico
		System.out.println(mapa.containsValue(new Pessoa("Maria")));
		System.out.println(mapa.containsValue(new Pessoa("Joana")));
		
		//busca elemento atraves da chave
		System.out.println(mapa.get("123456"));
		System.out.println(mapa.get("troca1000"));
		
		//retorna o conjunto de keys(chaves
		System.out.println(mapa.keySet());
	}

}
