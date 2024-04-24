package part2.ej3;

import java.util.Random;

public class Gato extends AnimalDomestico{

	
	@Override
	public void hacerRuido() {
		
		System.out.println("Miau");
		
	}

	@Override
	public boolean hacerCaso() {
		boolean res=false;
		
		
		Random random = new Random();
		
        int numeroAleatorio = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
        
        if (numeroAleatorio<5) {
        	res=true;
        }
		
		return res;
	}
	
	
	public void toserBolaPelo() {
		System.out.println("El gato a escupido pelo");
	}
	
	
}
