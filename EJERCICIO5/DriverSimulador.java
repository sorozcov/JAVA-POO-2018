/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 16082018
  Ejercicio5
  Archivo DriverSimulador.java*/
 
/*Importamos el scanner y las librerias necesarias.*/ 
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.util.Random;

/*Clase drivercallcenter que sera nuestro driver program*/
/*Aqui se ejecutaran las funcionalidades de nuestro programa y sus clases.*/

public class drivercallcenter{
	public static void main(String args[]) {
		
	/*Creamos nuestro scanner llamado leer para recibir datos.*/
	Scanner leer = new Scanner(System.in);
	/*Damos bienvenida a nuestro programa*/
	System.out.println("Bienvenido al sistema de llamadas para Call Center.");
	/*Pedimos que se ingresen los datos necesarios.*/
	/*Los primeros datos deben de ser para inicializar el programa.*/
	/*Estos datos seran Edificios, Niveles, Filas y Cantidad de Operadores*/
	int edificios,niveles,operadores;
	do{
		try{
				System.out.println("Ingrese la cantidad de edificios: ");
				edificios= leer.nextInt();
				System.out.println("Ingrese la cantidad de niveles: ");
				niveles= leer.nextInt();
				System.out.println("Ingrese la cantidad de operadores por fila: ");
				operadores= leer.nextInt();		
				break;
				/*Mientras no hayan errores, se ejecutara el codigo total del try, sino habra errores
				y no podra seguir. Si se ingresa algo distinto a un entero, se produce un error y se
				regresa al principio. Si no existe error, se guardan los datos para instanciar nuestro sistema.*/
		}catch (java.util.InputMismatchException e ){
				System.out.println("Error. Los datos ingresados deben ser enteros.");
				leer.next();
				continue;
		}
	}while(true);
	int t=0;
	operador[] trabajadores=new operador[(operadores*3*(niveles-2)*edificio)];
	int[][][][] sistema = new int[edificios][niveles][3][operadores];
	for(int edificio=0;edificio<sistema.length; edificio++){
		System.out.println("Edificio "+edificio);
		for (int nivel=0;nivel<(sistema[edificio]).length; nivel++){
			System.out.println("\tNivel "+nivel);
			if((nivel==0) ||(nivel==(sistema[edificio].length-1))){
				System.out.println("\t \t Nivel sin personas.");
			}else{
				for (int fila=0;fila<(sistema[edificio][nivel]).length; fila++){
					System.out.println("\t \tFila "+ fila);
					for (int operador=0;operador<(sistema[edificio][nivel][fila]).length; operador++){
						System.out.println("\t\t\t Operador "+ operador);
						trabajadores[t]= new operador(edificio,nivel,fila,operador);
						t=t+1;
			}}}}}
	/*Para imprimir.*/
	System.out.println("\nGracias por usar el programa.");
}
}