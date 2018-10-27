package br.com.cursojava.aula007.ExercicioAnimal;

public class Gato extends Animal {
	@Override
	void correr(){
		System.out.println("Gato está correndo...");
	}
	@Override
	void comer(String comida){
		System.out.println("Gato está comendo...");
	}
	
	void comer(String comida, int quantidade){
		System.out.println("O gato come "+quantidade+"g de "+comida);
		
	}

}
