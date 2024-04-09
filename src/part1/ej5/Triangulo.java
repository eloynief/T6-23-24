package part1.ej5;

public class Triangulo extends Poligono{
	
	private double lado1;
	
	private double lado2;

	private double lado3;
	
	
	
	public Triangulo(double lado1, double lado2, double lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	@Override
	public double area() {
		double num=0;
		
		num=(lado1+lado2+lado3)/2;
		
		return num;
	}

	@Override
	public String toString() {
		String str = super.toString();
		
		str+=" Lado 1:" + lado1 + ", Lado 2:" + lado2+ ", Lado 3:"+lado3;
		
		return str;
	}
	
	
	
}
