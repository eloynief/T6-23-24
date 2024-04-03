/**
 * 
 */
package part1.ej2;

/**
 * 
 */
public class Tecnico extends Operario {

	public Tecnico(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String str="";
		
		str+=super.toString()+" -> Tecnico";
		
		
		return str;
	}

}
