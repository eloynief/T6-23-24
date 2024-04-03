/**
 * 
 */
package part1.ej2;

/**
 * 
 */
public class Operario extends Empleado{

	public Operario(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String str="";
		
		str+=super.toString()+" -> Operario";
		
		return str;
	}
	
}
