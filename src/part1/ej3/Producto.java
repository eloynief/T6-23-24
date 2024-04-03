package part1.ej3;

public class Producto {

	public String nombre;
	
	public double precio;

	/**
	 * 
	 * @param nombre
	 * @param precio
	 */
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre!=null||!nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if(precio>0) {
			this.precio = precio;
		}
	}

	@Override
	public String toString() {
		String str="";
		str+="Producto: "+ nombre+" Precio: "+precio;
		return str;
	}
	
}
