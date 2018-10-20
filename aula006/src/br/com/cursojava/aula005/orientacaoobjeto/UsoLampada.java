package br.com.cursojava.aula005.orientacaoobjeto;

public class UsoLampada {

	public static void main(String[] args) {
		Lampada lamp;
		
		lamp = new Lampada();
		lamp.potencia = 100;
		lamp.tipo = "Incandecente";
		System.out.println(lamp.potencia);
		System.out.println(lamp.tipo);
		System.out.println("Lampada esta ligada? "+lamp.ligada);
		lamp.ligar();
		System.out.println("Lampada esta ligada? "+lamp.ligada);
		lamp.desligar();
		System.out.println("Lampada esta ligada? "+lamp.ligada);
		lamp.configurarTipo("LED");
		System.out.println(lamp.tipo);
		
		System.out.println("lamp.potencia ="+lamp.potencia);
		System.out.println("lamp.tipo = "+lamp.tipo);
		
		Lampada lamp2 = new Lampada();
		System.out.println("lamp2.potencia ="+lamp2.potencia);
		System.out.println("lamp2.tipo = "+lamp2.tipo);
		
		

	}

}
