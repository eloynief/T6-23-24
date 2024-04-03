package part1.ej2;

public class Oficial extends Operario {

	public Oficial(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String str="";
		
		str+=super.toString()+" -> Oficial";
		
		
		return str;
	}
	
	
}
