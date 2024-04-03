package part1.ej2;

public class Empleado {
	
	private String name="";

	/**
	 * 
	 * @param name
	 */
	public Empleado(String name) {
		this.name = name;
	}

	
	
	
	
	
	
	public String getName() {
		return name;
	}







	public void setName(String name) {
		if(name!=null||!name.equals("")) {
			this.name = name;
		}
	}







	@Override
	public String toString() {
		String str="";
		str+="Empleado " + this.name;
		
		return str;
	}
	
	
	
	
}
