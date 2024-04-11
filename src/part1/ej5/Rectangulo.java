package part1.ej5;

public class Rectangulo extends Poligono{
	
	private double lado1;
	
	private double lado2;
	
	
	
	
	

	public Rectangulo() {
		super(4);
	}

	public Rectangulo(double lado1, double lado2) {
		super(4);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	public double area() {
		double num=0;
		
		num=lado1*lado2;
		
		return num;
	}

	@Override
	public String toString() {
		String str = super.toString();
		
		str+=" Lado 1:" + lado1 + ", Lado 2:" + lado2;
		
		return str;
	}
	
	
	
}
