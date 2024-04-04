package part1.ej3;

public class Electrodomestico {
	
	private double precio=0;
	
	enum Color{
		blanco,negro,azul,gris
	}
	
	Color color=Color.blanco;
	
	enum Consumo{
		A,B,C,D,E,F
	}
	
	Consumo consumo=Consumo.F;

	int peso=0;
	

	


	public Electrodomestico(double precio, String color, String consumo, int peso) {
		super();
		
		this.precio = precio;
		
		if(!color.equals("")&&color!=null) this.color = Color.valueOf(color);
		
		if(!consumo.equals("")&&consumo!=null) this.consumo = Consumo.valueOf(consumo);
		
		this.peso = peso;
		
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public Color getColor() {
		return color;
	}




	public void setColor(String color) {
		
		if(!color.equals("")&&color!=null) this.color = Color.valueOf(color);
		
	}


	public Consumo getConsumo() {
		return consumo;
	}



	public void setConsumo(String consumo) {
		
		if(!consumo.equals("")&&consumo!=null) this.consumo = Consumo.valueOf(consumo);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Electrodomestico [precio=" + precio + ", color=" + color + ", consumo=" + consumo + "]";
	}
	
	
	
	
	
	
}
