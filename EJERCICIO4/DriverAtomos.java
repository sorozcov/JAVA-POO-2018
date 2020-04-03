/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 09082018
  Ejercicio4
  Archivo DriverAtomos.java*/
 
/*Importamos el scanner y las librerias necesarias.*/ 
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.util.Random;

/*Clase Driveratomos que sera nuestro driver program*/
public class DriverAtomos{
	public static void main(String args[]) {
	int y=1;

	/*Creamos nuestro scanner llamado leer.*/
	Scanner leer = new Scanner(System.in);
	/*Damos bienvenida a nuestro programa*/
	System.out.println("Bienvenido al sistema de decaimiento radiactivo de atomos.");
	/*Crearemos muestros tres tipos de objeto con sus caracteristicas basicas nombre, masamolar y vida media.*/

	
	/*Crearemos un ciclo que pedira el ingreso de un isotopo y una cantidad valida, mientras haya error este ciclo se repetira
	cuando se compruebe quen no existe ningun error, se podra proseguir con el programa.*/
	boolean error=false;
	String isotopo;
	IsotopoSimulador isotopousado=null;
	do{
		/*Pedimos que se ingresen los datos necesarios.*/
		/*El primer dato sera el isotopo que se necesita.*/
		/*Nuestro programa solo acepta 3 isotopos
		Cromo-48
		Oro-193
		Uranio-240.*/
		do{
			System.out.println("Ingrese el isotopo: ");
			isotopo= leer.next();
			if (isotopo.equals("Cromo-48")){
				isotopousado= new IsotopoSimulador("Cromo-48",47.95,21.561);
			}else if (isotopo.equals("Oro-193")){
				isotopousado= new IsotopoSimulador("Oro-193",192.96,17.65);
			}else if(isotopo.equals("Uranio-240")){
				isotopousado= new IsotopoSimulador("Uranio-240",240.06,14.1);
			}else{
				System.out.println("Error. Este isotopo no existe, ingrese un isotopo valido.");
			}
		}while ((isotopo.equals("Cromo-48")==false) &&(isotopo.equals("Oro-193")==false) &&(isotopo.equals("Uranio-240")==false));
		/*El segundo dato será la cantidad junto con su dimensional.*/
		System.out.println("Ingrese la cantidad: ");
		String cantidad= leer.next();
		error=isotopousado.convertir(isotopo,cantidad);
		if (error==true){
			System.out.println("La cantidad ingresada no es valida. Ejecute de nuevo su programa con cantidades validas.");
		}
	}while (error==true);
	/*Luego de hacer todas las verificaciones posibles, se ejecuta el metodo simulador para 
	ver que ha pasado con la simulacion y en cuantas horas sera exitoso el proceso de
	volver a comer shucos.*/
	System.out.println(isotopousado.simulacion());
	System.out.println("\nGracias por usar el programa.");
}
}