package part2.ej2;

public class Futbolista implements Comparable<Futbolista>{
	
	//c#>java por esto
	//region [atributos]
	
	private int nCamiseta=0;
	
	private String nombre="";
	
	private int edad=0;

	private int goles=0;
	
	//end region
	
	
	
	/**
	 * Construc sin parametros
	 */
	public Futbolista() {
	}


	/**
	 * Construc con id nombre edd
	 * @param nCamiseta
	 * @param nombre
	 * @param edad
	 */
	public Futbolista(int nCamiseta, String nombre, int edad,int goles) {
		if(nCamiseta>0) this.nCamiseta = nCamiseta;
		if(nombre!=null&&!nombre.equals(""))this.nombre = nombre;
		if(edad>0) this.edad = edad;
		if(goles>=0) this.goles=goles;
	}
	
	
	



	/**
	 * @return the id
	 */
	public int getId() {
		return nCamiseta;
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
		if (edad>0) this.edad = edad;
	}


	
	

	/**
	 * @return the goles
	 */
	public int getGoles() {
		return goles;
	}


	/**
	 * @param goles the goles to set
	 */
	public void setGoles(int goles) {
		if(goles>=0) this.goles = goles;
	}


	/**
	 * El comparable tiene que tener el mismo tipo de var que lo que esta dentro del comparable del implement
	 * 
	 */
	@Override
	public int compareTo(Futbolista o) {
		//se crea una var cuyo valor es 0
		int var=0;

		if(o.nCamiseta<this.nCamiseta) {
			var++;
		}
		else if(o.nCamiseta>this.nCamiseta) {
			var--;
		}
		//si el numero de camiseta es el mismo
		else {
			//comparamos el nombre
			var=this.nombre.compareTo(o.nombre);
			
//			if(this.nombre.compareTo(o.nombre)>0){
//				var++;
//			}
//			else if (this.nombre.compareTo(o.nombre)<0) {
//				var--;
//			}
		}
		
		
		return var;
	}



	@Override
	public String toString() {
		String str="";
		
		str+="ID:" + nCamiseta +"\n";
		str+="Nombre=" + nombre +"\n";
		str+="Edad=" + edad +"\n";
		str+="Goles: "+goles+"\n";
		return str;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean comprobacion=false;
		
		Futbolista fut=(Futbolista) o;
		
		if(this.nCamiseta==fut.nCamiseta&&this.nombre.equals(fut.nombre)) {
			comprobacion=true;
		}
		
		return comprobacion;
	}
	
	
}
