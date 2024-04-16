package part2.ej3;

public abstract class AnimalDomestico implements Animal{
	
	private String nombre;
	
	private String raza;
	
	private int peso;
	
	private String color;

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}
	
	
	public void vacunar() {
		
	}

	@Override
	public abstract void hacerRuido();

	
	
	
	public abstract boolean hacerCaso();
	
}
