/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 23082018
  Ejercicio6
  Archivo driversuper.java*/
 
/*Importamos el scanner y las librerias necesarias.*/ 
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.util.Random;

/*Clase driversuper que sera nuestro driver program*/
/*Aqui se ejecutaran las funcionalidades de nuestro programa y sus clases.*/

public class driversuper{
	public static void main(String args[]) {
	/*Creamos nuestro scanner llamado leer para recibir datos.*/
	Scanner leer = new Scanner(System.in);
	/*Damos bienvenida a nuestro programa*/
	System.out.println("Bienvenido al sistema de cajas rapido para supermercado.");
	/*Pedimos que se ingresen los datos necesarios.*/
	/*Los primeros datos deben de ser para inicializar el programa.*/
	/*Estos datos seran la cantidad de cajas.*/
	System.out.println("En este momento inicializaremos el sistema del dia.");
	int cantcajas;
	do{
		try{
				System.out.println("Ingrese la cantidad de cajas rapidas para el supermercado : ");
				cantcajas = leer.nextInt();
				if (cantcajas>0)
					break;
				else{
					System.out.println("Error. La cantidad de cajas debe ser un entero mayor a 0.");
					continue;
				}
				/*Mientras no hayan errores, se ejecutara el codigo total del try, sino habra errores
				y no podra seguir. Si se ingresa algo distinto a un entero, se produce un error y se
				regresa al principio. Si no existe error, se guardan los datos para instanciar nuestro sistema.*/
		}catch (java.util.InputMismatchException e ){
				System.out.println("Error. Los datos ingresados para el numero de cajas debe ser un entero mayor a 0.");
				leer.next();
				continue;
		}
		
	}while(true);

	sistema sistemasuper= new sistema(cantcajas);
	/*Para imprimir.*/
	/*Comienza la simulacion.*/
	System.out.println("\nLa simulacion ha iniciado.");
	String respuesta="1";
	/*Los minutos comienzan en 0 y se iran sumando uno a uno. En cada simulacion pasa 1 minuto y existe una probabilidad de crear un cliente nuevo de 60%.
	Ademas, genera un numero de articulos aleatorio entre 1 y 11. 
	Se opera el sistema y ademas se muestran los datos de como se encuentran las cajas rapidas.*/
	int min=0;
	while (respuesta.equals("2")==false){
		switch(respuesta){
		case("1"):
			System.out.println("");
			cliente cnuevo;
			int aleatorio= sistema.randint(1,100);
			if (aleatorio>=40){
				int articulos= sistema.randint(1,11);
				cnuevo = new cliente(articulos);
				System.out.println("Se ha generado un nuevo cliente con " +articulos+" articulos.");
			}else{
				cnuevo=null;
			}
			sistemasuper.operar(cnuevo);
			min=min+1;
			System.out.println(sistemasuper.mostrarsistema());
			System.out.println("Se ha simulado el paso de "+min+" minutos.");
			System.out.println("");
			break;
		default:
			break;
		}
		/*Habra un menu, que puede seguir simulando el tiempo y nuevos clientes, o salir y terminar el programa.*/
		/*Mientras sea 1, se seguira ejecutando el programa. Al salir, se muestra el total de clientes.*/
		System.out.println(" Ingrese 1 para seguir con simulacion.\n Ingrese 2 para salir.");
		respuesta= leer.next();		
	    }
	System.out.println("El total de clientes del dia fue "+cliente.nodecliente+".");
	System.out.println("Gracias por usar el programa.");
}}