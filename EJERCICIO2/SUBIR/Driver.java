/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 19072018
  Ejercicio2
  Archivo Driver.java*/
  /* Importamos el archivo scanner y creamos nuestra clase driver. */
import java.util.Scanner;
class Driver{
	public static void main (String[]args){
		/*Mostrar mensaje de pantalla*/
		System.out.println("Bienvenido a la investigacion de Marte.");
		/*Creamos nuestro scanner llamado leer.*/
		Scanner leer = new Scanner(System.in);
		/*Pedimos que ingrese primero el peso.*/
		pesa maquina = new pesa();
		System.out.println("Ingrese el peso en UP.");
		double masa= leer.nextDouble();
		/*Se envia al metodo convertir para que retorne los datos en las demas escalas*/
		System.out.println(maquina.convertir(masa));
		/*Pedimos ingreso de los datos necesarios del animal.*/
		System.out.println("Ahora ingrese el nombre del animal.");
		String nombre= leer.next();
		System.out.println("Ingrese el sonido que emite.");
		String sonido= leer.next();
		System.out.println("Ingrese el tipo de animal. El tipo de animal puede ser Ave, Mamifero o Reptil.");
		String tipo=leer.next();
		/*A partir del tipo de animal ingresado debe crear cierto objeto segun sea el animal,
		ejecutar su toString y luego su metodo peculiar.*/
		/* 		Se usa tipo equals para compara 2 strings */	
		if (tipo.equals("Ave")){
			ave nuevoa= new ave(nombre,sonido);
			System.out.println(nuevoa.toString());
			System.out.println(nuevoa.volar());
		}
		else if (tipo.equals("Mamifero")){
			mamifero nuevoa= new mamifero(nombre,sonido);
			System.out.println(nuevoa.toString());
			System.out.println(nuevoa.caminar());
		}
		else if (tipo.equals("Reptil")){
			reptil nuevoa= new reptil(nombre,sonido);
			System.out.println(nuevoa.toString());
			System.out.println(nuevoa.arrastrar());
		}
		else{
			System.out.println("Error. Clase no identificada.");
		}
		System.out.println("Gracias por usar el programa. La ejecucion ha terminado.");
	}
}