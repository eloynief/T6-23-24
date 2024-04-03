package part1.ej3;

public class Perecedero extends Producto{

	int diasCad;
	

	public Perecedero(String nombre, double precio, int diasCad) {
		super(nombre, precio);
		this.diasCad = diasCad;
	}

	
	public boolean cambioPrecio() {
		boolean esModificado=false;
		int i=this.diasCad;
		
		int division=0;
		
		double abs=super.precio;
		//
		while(i>0&&i<=4) {
			
			division++;
			i++;
			
		}
		
		if(division>0) {
			super.precio=super.precio/division;

			esModificado=true;
		}
		
		return esModificado;
	}

	@Override
	public String toString() {
		String str=super.toString();
		str+="Perecedero"+diasCad;
		return "";
	}
	
	
	
	
	
}
