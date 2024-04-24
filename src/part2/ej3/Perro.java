package part2.ej3;

import java.util.Random;

public class Perro extends AnimalDomestico{

	
	@Override
	public void hacerRuido() {
		
		System.out.println("Guau");
		
	}

	@Override
	public boolean hacerCaso() {
		boolean res=false;
		
		
		Random random = new Random();
		
        int numeroAleatorio = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
        
        if (numeroAleatorio<90) {
        	res=true;
        }
		
		return res;
	}
	
	public void sacarPaseo() {
		
		System.out.println("El perro se va de paseo solo");
		
	}
	
	
	
}
