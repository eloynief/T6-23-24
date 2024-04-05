package part1.ej4;

public class Electrodomestico {
	
	private double precio=0;
	
	enum Color{
		blanco,negro,rojo,azul,gris
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


	public char getConsumo() {
		//correccion
		return String.valueOf(consumo).charAt(0);
	}



	public void setConsumo(String consumo) {
		
		if(!consumo.equals("")&&consumo!=null) this.consumo = Consumo.valueOf(consumo);
		
	}
	
	/**
	 * 
	 * @param letra
	 * @return
	 */
	public void comprobarConsumoEnergetico(char letra) {
		boolean comprobacion=false;
		
		String cons=String.valueOf(letra);
		
		switch(letra) {
		case 'A','B','C','D','E','F'-> this.consumo=Consumo.valueOf(cons);
		
		default-> this.consumo=Consumo.F;	
		};
		
	}
	
	public void comprobarColor(String color){
		String colorMin=color.toLowerCase();

		switch(colorMin) {
		case "blanco","negro","rojo","azul","gris"-> this.consumo=Consumo.valueOf(colorMin);
		
		default-> this.consumo=Consumo.F;	
		};
		
	}
	
	
	
	public void precioFinal() {
		
		switch(consumo) {
		case A-> precio+=100;
		case B-> precio+=80;
		case C-> precio+=60;
		case D-> precio+=50;
		case E-> precio+=30;
		case F-> precio+=10;
		};
		
		switch(color) {
		
		};
	}
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Electrodomestico [precio=" + precio + ", color=" + color + ", consumo=" + consumo + "]";
	}
	
	
	
	
	
	
}
