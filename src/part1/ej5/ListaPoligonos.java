package part1.ej5;

public class ListaPoligonos {
	
	public static Poligono[] arrayPol=new Poligono[10];
	
	
	public static int posicionVacia() {
		boolean comprobacion=false;
		int i=0;
		while(i<arrayPol.length&&!comprobacion) {
			
			if(arrayPol[i]==null) {
				comprobacion=true;
			}
			else {
				i++;
			}
			
		}
		
		return i;
	}
	
	/**
	 * Le da al array el valor del poligono pasado si hay posiciones libres
	 * Introduce el valor del poligono pasado y se lo da al array
	 * @param p
	 * @return
	 */
	public static boolean introducirValor(Poligono p) {
		
		boolean comprobacion=false;
		
		int posicion = posicionVacia();
		//comprueba si la posicion es menor que la altura del array
		if(posicion<arrayPol.length) {
			//se le añade el valor dlel bojeto
			arrayPol[posicion]=p;
			
		}
		
		return comprobacion;
	}
	
	
	public static void muestraValores() {
		
		for(int i =0 ; i<arrayPol.length;i++) {
			System.out.println(arrayPol[i]);
		}
		
	}
	
}
