package part1.ej5;

import java.util.Scanner;

public class Main {

	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Poligono triangulo=new Triangulo();
		
		Poligono rectangulo=new Rectangulo();
		
		int opcion=0;
		
		int lado1=0;
		
		int lado2=0;
		
		int lado3=0;
		
		
		do {
			
			menu();
			
			System.out.println("Introduzca la opcion:");
			
			opcion=sc.nextInt();
			
			switch(opcion) {
			case 1:{
				
				System.out.println("INTRODUZCA EL VALOR DE LOS LADOS:");

				System.out.println("LADO 1:");

				lado1=sc.nextInt();
				
				System.out.println("LADO 2:");

				lado2=sc.nextInt();
				
				System.out.println("LADO 3:");

				lado3=sc.nextInt();
				
				triangulo=new Triangulo(lado1, lado2, lado3);
				
				ListaPoligonos.introducirValor(triangulo);
				
				break;
			}
			case 2:{
				
				System.out.println("INTRODUZCA EL VALOR DE LOS LADOS:");

				System.out.println("LADO 1:");

				lado1=sc.nextInt();
				
				System.out.println("LADO 2:");

				lado2=sc.nextInt();
				
				rectangulo=new Rectangulo(lado1, lado2);
				
				ListaPoligonos.introducirValor(rectangulo);
				
				break;
			}
			case 3:{
				
//				System.out.println(ListaPoligonos.arrayPol.toString());
				ListaPoligonos.muestraValores();
				
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
