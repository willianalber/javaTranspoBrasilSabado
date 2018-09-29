package br.com.cursojava.aula003;

public class ExemploString {

	public static void main(String[] args) {
		String curso = "Curso Java Transpo Brasil Sábado";
		
		//Quantidade de caracteres
		System.out.printf("O texto possui %d caracteres \n", curso.length());
		
		String semEspaco = curso.replace(" ", "");
		System.out.println(semEspaco);
		System.out.println(curso);
		System.out.println(curso.replace(" ", "").length());
		
		//Verifica se a variavel contem a palavra abaixo 
		System.out.println(curso.contains("TranspoBrasil"));
		//Verifica se a varivael inicia com o texto abaixo
		System.out.println(curso.startsWith("Curso"));
		//Verifica se a variavel termina com o texto abaixo
		System.out.println(curso.endsWith("Domingo"));
		
		//Retorna a posição onde começa a palavra abaixo
		System.out.println(curso.indexOf("TranspoBrasil"));
		//Retorna a posição da primeira ocorrencia que contem a letra abaixo
		System.out.println(curso.indexOf("a"));
		//Retorna a posição da primeira ocorrencia apartir da posição especificada abaixo
		System.out.println(curso.indexOf("a",10));
		// retorna a posição da ultima ocorrencia que contenha o caracter abaixo
		System.out.println(curso.lastIndexOf("a"));
		
		//Retorna outro objeto com as letras maiusculas
		System.out.println(curso.toUpperCase());
		//Retorna outro objeto com as letras minusculas
		System.out.println(curso.toLowerCase());
		
		//Retorna outro objeto do tipo String com o valor da posição abaixo em diante
		System.out.println(curso.substring(11));
		//Retorna outro objeto do tipo String com o valor da posição abaixo até a segunda posição especificada abaixo
		System.out.println(curso.substring(11,17));
		
		System.out.println(curso.charAt(10));
		System.out.println(curso.charAt(11));
		System.out.println(curso.charAt(12));
		System.out.println(curso.charAt(13));
		System.out.println("=======================");
		String user1 = "João";
		String user2 = "João";
		String user3 = new String("João");
		System.out.println(user1 == user2);
		System.out.println(user1 == user3);
		System.out.println(user1.equals(user2));
		System.out.println(user1.equals(user3));
		
		System.out.println(user1.equalsIgnoreCase("JOÃO"));
		System.out.println("João".equalsIgnoreCase("JOÂO"));
		
		String texto = "  oi  ";
		String registro = "contato;contato@teste.com;33221100";
		System.out.printf("<%s> , length = %d\n",texto.trim(),texto.trim().length());
		String[] valores  = registro.split(";");
		System.out.println(valores[0]);
		System.out.println(valores[1]);
		System.out.println(valores[2]);
				

	}

}
