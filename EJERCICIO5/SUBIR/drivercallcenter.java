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
				if (niveles>2 && edificios>0 && operadores>0)
					break;
				else{
					System.out.println("Error. La cantidad de niveles de niveles debe ser por lo menos 3. Las demas deben ser por lo menos 1.");
					continue;
				}
				/*Mientras no hayan errores, se ejecutara el codigo total del try, sino habra errores
				y no podra seguir. Si se ingresa algo distinto a un entero, se produce un error y se
				regresa al principio. Si no existe error, se guardan los datos para instanciar nuestro sistema.*/
		}catch (java.util.InputMismatchException e ){
				System.out.println("Error. Los datos ingresados deben ser enteros.");
				leer.next();
				continue;
		}
		
	}while(true);

	sistemasimulador callcenter= new sistemasimulador(edificios,niveles,operadores);
	/*Para imprimir.*/
	/*Comienza la simulacion.*/
	System.out.println("\nLa simulacion ha iniciado.");
	String respuesta="1";
	/*Los minutos comienzan en 0 y se iran sumando uno a uno. En cada simulacion pasa 1 minuto y existe una nueva llamada.*/
	/*Habra un menu, que puede seguir simulando el tiempo, mostrar los datos o salir y terminar el programa.*/
	while (respuesta.equals("3")==false){
		switch(respuesta){
		case("1"):
			System.out.println(callcenter.simularminuto());
			break;
		case("2"):
			callcenter.mostraroperadores();
			System.out.println("Total de llamadas del dia "+operador.llamadastotales);
			break;
		default:
			break;
		}
		System.out.println(" Ingrese 1 para seguir con simulacion. \n Ingrese 2 para ver datos del call center \n Ingrese 3 para salir.");
		respuesta= leer.next();		
		}
	System.out.println("\nGracias por usar el programa.");
}}