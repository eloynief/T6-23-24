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
		Futbolista[] futbolistas=new Futbolista[5];
		//socios=new Socio(int id, String nombre, int edad);
		futbolistas[0]=new Futbolista(10000,"hola",5,1);
		futbolistas[1]=new Futbolista(200,"hole",50,2);
		futbolistas[2]=new Futbolista(3,"holi",500,3);
		futbolistas[3]=new Futbolista(400,"holo",5000,4);
		futbolistas[4]=new Futbolista(5,"holu",50000,5);
		
		System.out.println("DESODENADA");
		
		for(Futbolista socio:futbolistas) {
			System.out.println(socio);
		}
		
		Arrays.sort(futbolistas);
		
		
		System.out.println("ODENADA");
		
		for(Futbolista socio:futbolistas) {
			System.out.println(socio);
		}
		
	}

}
