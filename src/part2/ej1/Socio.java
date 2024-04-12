package part2.ej1;

public class Socio implements Comparable<Socio>{
	
	//c#>java por esto
	//region [atributos]
	
	private int id=0;
	
	private String nombre="";
	
	private int edad=0;

	//end region
	
	
	
	/**
	 * Construc sin parametros
	 */
	public Socio() {
	}


	/**
	 * Construc con id nombre edd
	 * @param id
	 * @param nombre
	 * @param edad
	 */
	public Socio(int id, String nombre, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	



	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	//no pongo set
//	/**
//	 * @param id the id to set
//	 */
//	public void setId(int id) {
//		this.id = id;
//	}



	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}



	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}



	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}



	/**
	 * El comparable tiene que tener el mismo tipo de var que lo que esta dentro del comparable del implement
	 * 
	 */
	@Override
	public int compareTo(Socio o) {
		//se crea una var cuyo valor es 0
		int var=0;

		if(o.id<this.id) {
			var++;
		}
		else if(o.id>this.id) {
			var--;
		}
		
		return var;
	}



	@Override
	public String toString() {
		String str="";
		
		str+="ID:" + id +"\n";
		str+="Nombre=" + nombre +"\n";
		str+="Edad=" + edad +"\n";
		return str;
	}
	
	
	
	
}
