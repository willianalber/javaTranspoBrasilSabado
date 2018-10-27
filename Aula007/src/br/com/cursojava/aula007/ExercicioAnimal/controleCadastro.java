package br.com.cursojava.aula007.ExercicioAnimal;

public class controleCadastro {

	Animal[] animal = new Animal[50];
	int quantidade = 0;

	public void cadastrarAnimal(Cachorro cachorro) {
		if (quantidade < animal.length) {
			animal[quantidade] = cachorro;
			quantidade++;
			System.out.println("Cachorro cadastrado com sucesso!");
		}

	}

	public void cadastrarAnimal(Gato gato) {
		if (quantidade < animal.length) {
			animal[quantidade] = gato;
			quantidade++;
			System.out.println("Gato cadastrado com sucesso!");
		}

	}

}
