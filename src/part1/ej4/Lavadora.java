package part1.ej4;

public class Lavadora extends Electrodomestico{
	
	int carga=5;

	
	
	public Lavadora() {
	}

	public Lavadora(double precio,int peso) {
		super(precio, peso);
	}
	
	
	
	public Lavadora(double precio, String color, String consumo, int peso, int carga) {
		super(precio, color, consumo, peso);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	
	public void precioFinal(){
		super.precioFinal();
		
		//
		if(carga>30) {
			super.setPrecio(super.getPrecio()+50);
		}
		
	}
	
	
	
	
}
