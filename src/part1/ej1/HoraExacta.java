package part1.ej1;

public class HoraExacta extends Hora{
	
	protected int segundo=0;
	
	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		
		if(segundo>=0&&segundo<60) {
			this.segundo = segundo;
		}
		
	}

	public int getSegundo() {
		return segundo;
	}

	/**
	 * 
	 * @param segundo
	 * @return
	 */
	public boolean setSegundo(int segundo) {
		boolean comprobacion=false;
		if(segundo>=0&&segundo<60) {
			this.segundo = segundo;
			comprobacion=true;
		}
		return comprobacion;
	}

	
	/**
	 * 
	 */
	public void inc() {
		
		this.segundo++;
		while(this.segundo>59) {
			this.segundo-=60;
			//el minuto de la hora exacta aumenta
			inc();
			
		}
		
	}

	@Override
	public String toString() {
		String str=super.toString();
		
		if(segundo<10) {

			str+="Segundo: 0"+segundo+"\n";
		}
		else {
			str+="Segundo: "+segundo+"\n";
		}
		
		return str;
	}
	
	
	
	
	
}
