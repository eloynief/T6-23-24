/**
 * 
 */
package part2.ej2;

import java.util.Arrays;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Futbolista[] socios=new Futbolista[5];
		//socios=new Socio(int id, String nombre, int edad);
		socios[0]=new Futbolista(10000,"hola",5);
		socios[1]=new Futbolista(200,"hole",50);
		socios[2]=new Futbolista(3,"holi",500);
		socios[3]=new Futbolista(400,"holo",5000);
		socios[4]=new Futbolista(5,"holu",50000);
		
		System.out.println("DESODENADA");
		
		for(Futbolista socio:socios) {
			System.out.println(socio);
		}
		
		Arrays.sort(socios);
		
		
		System.out.println("ODENADA");
		
		for(Futbolista socio:socios) {
			System.out.println(socio);
		}
		
	}

}
