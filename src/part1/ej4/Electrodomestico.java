package part1.ej4;

public class Electrodomestico {
	
	private double precio=0;
	
	enum Color{
		blanco,negro,rojo,azul,gris
	}
	
	private Color color=Color.blanco;
	
	private enum Consumo{
		A,B,C,D,E,F
	}
	
	Consumo consumo=Consumo.F;

	private int peso=0;
	

	


	public Electrodomestico() {
		super();
	}



	public Electrodomestico(double precio, int peso) {
		super();
		this.precio = precio;
		this.peso = peso;
	}



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
		
		precio=switch(consumo) {
		case A-> precio+100;
		case B-> precio+80;
		case C-> precio+60;
		case D-> precio+50;
		case E-> precio+30;
		case F-> precio+10;
		};
		
		if(peso<20&&peso>=0) {
			precio+=10;
		}
		else if(peso<50&&peso>=20){
			precio+=50;
		}
		else if(peso<80&&peso>=50){
			precio+=80;
		}
		else if(peso>80){
			precio+=100;
		}
	}
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Electrodomestico [precio=" + precio + ", color=" + color + ", consumo=" + consumo + "]";
	}
	
	
	
	
	
	
}
