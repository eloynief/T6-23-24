package part1.ej5;

import java.util.Scanner;

public class Main {

	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Poligono triangulo=new Triangulo();
		
		Poligono rectangulo=new Rectangulo();
		
		int opcion=0;
		
		int num=0;
		
		
		
		do {
			
			menu();
			
			System.out.println("Introduzca la opcion:");
			
			opcion=sc.nextInt();
			
			switch(opcion) {
			case 1:{
				
				triangulo=new Triangulo();
				
				break;
			}
			case 2:{
				
				break;
			}
			case 3:{
				
				break;
			}
			case 0:{
				System.out.println("Saliendo...");
				break;
			}
			default:{
				System.out.println("Opcion no valida");
			}
			
			}
			
		}while(opcion!=0);
		
		
	}

	public static void menu() {
		System.out.println("Menu: ");
		System.out.println("1. Introducir triángulo.");
		System.out.println("2. Introducir rectángulo.");
		System.out.println("3. Mostrar contenido del array.");
	}

}
