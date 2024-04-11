package part1.ej5;

public abstract class Poligono {
	
	protected int numeroLados=0;
	
	/**
	 * Metodo abstracto
	 * @return
	 */
	public abstract double area();
	
	
	 
	
	
	public Poligono() {
	}





	public Poligono(int numeroLados) {
		this.numeroLados = numeroLados;
	}





	/**
	 * @return the numeroLados
	 */
	public int getNumeroLados() {
		return numeroLados;
	}





	/**
	 * @param numeroLados the numeroLados to set
	 */
	public void setNumeroLados(int numeroLados) {
		if(numeroLados>0) {
			this.numeroLados = numeroLados;
		}
	}





	@Override
	public String toString() {
		return "Numero Lados:" + numeroLados;
	}
	
	
	
}
