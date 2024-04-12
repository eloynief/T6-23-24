/**
 * 
 */
package part2.ej1;

import java.util.Arrays;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Socio[] socios=new Socio[5];
		//socios=new Socio(int id, String nombre, int edad);
		socios[0]=new Socio(10000,"hola",5);
		socios[1]=new Socio(200,"hole",50);
		socios[2]=new Socio(3,"holi",500);
		socios[3]=new Socio(400,"holo",5000);
		socios[4]=new Socio(5,"holu",50000);
		
		System.out.println("DESODENADA");
		
		for(Socio socio:socios) {
			System.out.println(socio);
		}
		
		Arrays.sort(socios);
		
		
		System.out.println("ODENADA");
		
		for(Socio socio:socios) {
			System.out.println(socio);
		}
		
	}

}
