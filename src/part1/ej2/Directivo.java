package part1.ej2;

public class Directivo extends Empleado {

	public Directivo(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String str="";
		
		str+=super.toString()+" -> Directivo";
		
		
		return str;
	}
	
	
	
	
	
}
