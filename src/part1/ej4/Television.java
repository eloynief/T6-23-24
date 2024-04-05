package part1.ej4;

public class Television extends Electrodomestico {

	private int resolucion = 20;

	private boolean sintonizador = false;

	public Television() {
		super();
	}

	public Television(double precio, int peso) {
		super(precio, peso);
	}

	public Television(double precio, String color, String consumo, int peso, int resolucion, boolean sintonizador) {
		super(precio, color, consumo, peso);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}

	/**
	 * @return el resolucion
	 */
	public int getResolucion() {
		return resolucion;
	}

	/**
	 * @param resolucion el resolucion to set
	 */
	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	/**
	 * @return el sintonizador
	 */
	public boolean isSintonizador() {
		return sintonizador;
	}

	/**
	 * @param sintonizador el sintonizador to set
	 */
	public void setSintonizador(boolean sintonizador) {
		this.sintonizador = sintonizador;
	}

	
	
	@Override
	public void precioFinal(){
		super.precioFinal();
		
		double precioSuper= super.getPrecio();
		
		//
		if(resolucion>30) {
			super.setPrecio(precioSuper+((precioSuper*30)/100));
		}
		
		if(sintonizador) {
			super.setPrecio(precioSuper+50);
		}
		
		
	}
	
	
	
	
	
}
