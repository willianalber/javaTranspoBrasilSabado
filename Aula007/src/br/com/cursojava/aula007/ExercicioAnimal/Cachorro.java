package br.com.cursojava.aula007.ExercicioAnimal;

public class Cachorro extends Animal{
	
	@Override
	void correr(){
		System.out.println("Cachorro est� correndo...");
	}
	@Override
	void comer(String comida){
		System.out.println("Cachorro est� comendo...");
	}

}
