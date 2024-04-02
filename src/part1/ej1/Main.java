package part1.ej1;

import java.util.Scanner;

public class Main {

	//objeto tipo scanner
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hora horaPuesta;
		
		HoraExacta horaExacta;
		
		
		boolean comprobacion;
		int hora;
		int minuto;
		int segundo;
		
		//te pide los datos para introducir
		System.out.println("Dime la hora: ");
				
		hora=sc.nextInt();
				

		//te pide los datos para introducir
		System.out.println("Dime el minuto: ");
				
		minuto=sc.nextInt();

		//te pide los datos para introducir
		System.out.println("Dime el segundo: ");
				
		segundo=sc.nextInt();
				
		
		horaPuesta=new Hora(hora, minuto);
		
		horaExacta=new HoraExacta(hora, minuto, segundo);
		
		System.out.println("DATOS:");
		
		System.out.println(horaPuesta);
		System.out.println(horaExacta);
		System.out.println();
		
		horaPuesta.inc();
		
		System.out.println("DESPUES DEL INCREMENTO:");
		
		System.out.println(horaPuesta);
		System.out.println(horaExacta);
		System.out.println();
		
		
		
	}

}
