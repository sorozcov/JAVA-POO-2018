/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 05082018
  Laboratorio1
  Archivo DriverVuelos.java*/
 
/*Importamos el scanner*/ 
import java.util.Scanner;

/*Clase Drivervuelos que sera nuestro driver program*/
public class DriverVuelos{
	public static void main(String args[]) {
	int y=1;
	/*Mientras y no sea 0 que es una variable de control, que significa que si el programa se ejecuta sin ningun programa, de lo contrario falla y se reinicia. */
	while (y!=0){
	try{		
		/*Creamos nuestro scanner llamado leer.*/
		Scanner leer = new Scanner(System.in);
		
		/*Damos bienvenida a nuestro programa*/
		System.out.println("Bienvenido al sistema de vuelos de deportados.");
		System.out.println("En este momento se necesitan ingresar los 3 vuelos del dia.");
		/*Pedimos que se ingresen los datos para instanciar los 3 vuelos del dia.*/
		
		/*Datos que pediremos para todos los vuelos*/
		int cantidadhombres;
		int cantidadmujeres;
		int cantidadninos;
		int numerovuelo;
		String nombrepiloto;
		int edad;
		int horasvuelo;
		String tipo;
		String nombrecopiloto;
		String modelo;
		String fabrica;
		double alcance;
		String nombreae;
		String ubicacion;
		
		/*Vuelo1*/
		System.out.println("Vuelo 1");
		/*Pedimos cantidades*/
		System.out.println("Ingrese la cantidad de hombres: ");
		cantidadhombres= leer.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		cantidadmujeres= leer.nextInt();
		System.out.println("Ingrese la cantidad de ninos: ");
		cantidadninos= leer.nextInt();
		System.out.println("Ingrese el numero de vuelo: ");
		numerovuelo= leer.nextInt();
		/*Pedimos otros atributos de otros objetos.*/
		/*Piloto*/
		System.out.println("Para el piloto ingrese: ");
		System.out.println("Ingrese el nombre: ");
		nombrepiloto= leer.next();
		System.out.println("Ingrese la edad: ");
		edad= leer.nextInt();
		System.out.println("Ingrese las horas de vuelo: ");
		horasvuelo= leer.nextInt();
		tipo="Piloto";
		piloto pilot1= new piloto(nombrepiloto,edad,horasvuelo, tipo);
		
		/*Copiloto*/
		System.out.println("Para el copiloto ingrese: ");
		System.out.println("Ingrese el nombre: ");
		nombrecopiloto= leer.next();
		System.out.println("Ingrese la edad: ");
		edad= leer.nextInt();
		System.out.println("Ingrese las horas de vuelo: ");
		horasvuelo= leer.nextInt();
		tipo="Copiloto";
		piloto copilot1= new piloto(nombrecopiloto,edad,horasvuelo, tipo);
		
		/*Avion*/
		System.out.println("Para el avion del vuelo ingrese: ");
		System.out.println("Ingrese la fabrica: ");
		fabrica= leer.next();
		System.out.println("Ingrese el modelo: ");
		modelo= leer.next();
		System.out.println("Ingrese el alcance: ");
		alcance= leer.nextDouble();
		avion ave1= new avion(fabrica,modelo,alcance);
		
		/*Aeropuerto*/
		System.out.println("Para el aeropuerto del vuelo ingrese: ");
		System.out.println("Ingrese el nombre: ");
		nombreae= leer.next();
		System.out.println("Ingrese la ubicacion: ");
		ubicacion= leer.next();
		aeropuerto puerto1= new aeropuerto(nombreae, ubicacion);

		/*Se crea el vuelo 1.*/
		vuelo vuelo1 =new vuelo(cantidadhombres, cantidadmujeres, cantidadninos, numerovuelo,pilot1, copilot1,ave1, puerto1);
		
		/*Vuelo2*/
		System.out.println("Vuelo 2");
		/*Pedimos cantidades*/
		System.out.println("Ingrese la cantidad de hombres: ");
		cantidadhombres= leer.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		cantidadmujeres= leer.nextInt();
		System.out.println("Ingrese la cantidad de ninos: ");
		cantidadninos= leer.nextInt();
		System.out.println("Ingrese el numero de vuelo: ");
		numerovuelo= leer.nextInt();
		/*Pedimos otros atributos de otros objetos.*/
		/*Piloto*/
		System.out.println("Para el piloto ingrese: ");
		System.out.println("Ingrese el nombre: ");
		nombrepiloto= leer.next();
		System.out.println("Ingrese la edad: ");
		edad= leer.nextInt();
		System.out.println("Ingrese las horas de vuelo: ");
		horasvuelo= leer.nextInt();
		tipo="Piloto";
		piloto pilot2= new piloto(nombrepiloto,edad,horasvuelo, tipo);
		
		/*Copiloto*/
		System.out.println("Para el copiloto ingrese: ");
		System.out.println("Ingrese el nombre: ");
		nombrecopiloto= leer.next();
		System.out.println("Ingrese la edad: ");
		edad= leer.nextInt();
		System.out.println("Ingrese las horas de vuelo: ");
		horasvuelo= leer.nextInt();
		tipo="Copiloto";
		piloto copilot2= new piloto(nombrecopiloto,edad,horasvuelo, tipo);
		
		/*Avion*/
		System.out.println("Para el avion del vuelo ingrese: ");
		System.out.println("Ingrese la fabrica: ");
		fabrica= leer.next();
		System.out.println("Ingrese el modelo: ");
		modelo= leer.next();
		System.out.println("Ingrese el alcance: ");
		alcance= leer.nextDouble();
		avion ave2= new avion(fabrica,modelo,alcance);
		
		/*Aeropuerto*/
		System.out.println("Para el aeropuerto del vuelo ingrese: ");
		System.out.println("Ingrese el nombre: ");
		nombreae= leer.next();
		System.out.println("Ingrese la ubicacion: ");
		ubicacion= leer.next();
		aeropuerto puerto2= new aeropuerto(nombreae, ubicacion);

		/*Se crea el vuelo 2.*/
		vuelo vuelo2 =new vuelo(cantidadhombres, cantidadmujeres, cantidadninos, numerovuelo,pilot2, copilot2,ave2, puerto2);

		/*Vuelo3*/
		System.out.println("Vuelo 3");
		/*Pedimos cantidades*/
		System.out.println("Ingrese la cantidad de hombres: ");
		cantidadhombres= leer.nextInt();
		System.out.println("Ingrese la cantidad de mujeres: ");
		cantidadmujeres= leer.nextInt();
		System.out.println("Ingrese la cantidad de ninos: ");
		cantidadninos= leer.nextInt();
		System.out.println("Ingrese el numero de vuelo: ");
		numerovuelo= leer.nextInt();
		/*Pedimos otros atributos de otros objetos.*/
		/*Piloto*/
		System.out.println("Para el piloto ingrese: ");
		System.out.println("Ingrese el nombre: ");
		nombrepiloto= leer.next();
		System.out.println("Ingrese la edad: ");
		edad= leer.nextInt();
		System.out.println("Ingrese las horas de vuelo: ");
		horasvuelo= leer.nextInt();
		tipo="Piloto";
		piloto pilot3= new piloto(nombrepiloto,edad,horasvuelo, tipo);
		
		/*Copiloto*/
		System.out.println("Para el copiloto ingrese: ");
		System.out.println("Ingrese el nombre: ");
		nombrecopiloto= leer.next();
		System.out.println("Ingrese la edad: ");
		edad= leer.nextInt();
		System.out.println("Ingrese las horas de vuelo: ");
		horasvuelo= leer.nextInt();
		tipo="Copiloto";
		piloto copilot3= new piloto(nombrecopiloto,edad,horasvuelo, tipo);
		
		/*Avion*/
		System.out.println("Para el avion del vuelo ingrese: ");
		System.out.println("Ingrese la fabrica: ");
		fabrica= leer.next();
		System.out.println("Ingrese el modelo: ");
		modelo= leer.next();
		System.out.println("Ingrese el alcance: ");
		alcance= leer.nextDouble();
		avion ave3= new avion(fabrica,modelo,alcance);
		
		/*Aeropuerto*/
		System.out.println("Para el aeropuerto del vuelo ingrese: ");
		System.out.println("Ingrese el nombre: ");
		nombreae= leer.next();
		System.out.println("Ingrese la ubicacion: ");
		ubicacion= leer.next();
		aeropuerto puerto3= new aeropuerto(nombreae, ubicacion);

		/*Se crea el vuelo 3.*/
		vuelo vuelo3 =new vuelo(cantidadhombres, cantidadmujeres, cantidadninos, numerovuelo,pilot3, copilot3,ave3, puerto3);
		
		/*Se muestran los datos de cada vuelo como lo pide el sistema.*/
		String x; /*La opcion que se leera.*/
		System.out.println("Ingrese el vuelo del que quiere saber los datos (1,2 ,3 o 4 para salir):  ");
		x= leer.next();
		while (x.equals("4")==false){
			switch(x){
				case ("1"):
					System.out.println("Vuelo 1: ");
					System.out.println(vuelo1.mostrardatosvuelos());
					System.out.println(vuelo1.mostrarcantidades());
					System.out.println(vuelo1.mostrarporcentajes());
					System.out.println(vuelo1.mostrarreporte());
					System.out.println("Ingrese el vuelo del que quiere saber los datos (1,2 ,3 o 4 para salir):  ");
					x= leer.next();
					break;
					
				case  ("2"):	
					System.out.println(vuelo.totaldeldia());
					System.out.println("Vuelo 2: ");
					System.out.println(vuelo2.mostrardatosvuelos());
					System.out.println(vuelo2.mostrarcantidades());
					System.out.println(vuelo2.mostrarporcentajes());
					System.out.println(vuelo2.mostrarreporte());
					System.out.println("Ingrese el vuelo del que quiere saber los datos (1,2 ,3 o 4 para salir):  ");
					x= leer.next();
					break;
					
				case  ("3"):
					System.out.println("Vuelo 3: ");
					System.out.println(vuelo3.mostrardatosvuelos());
					System.out.println(vuelo3.mostrarcantidades());
					System.out.println(vuelo3.mostrarporcentajes());
					System.out.println(vuelo3.mostrarreporte());
					System.out.println("Ingrese el vuelo del que quiere saber los datos (1,2 ,3 o 4 para salir):  ");
					x= leer.next();
					break;
				default:
					System.out.println("Opcion no valida. Saldra del programa");
					x="4";
		}}
		
		/*Ahora se ejecutaran las funciones de un piloto.*/
		System.out.println("Ahora se ejecutaran las funciones del piloto desde el mismo de la nave 1:  ");
		System.out.println("Se entrenara un nuevo piloto. Para ello ingrese los siguientes datos:  ");
		System.out.println("Ingrese el nombre : ");
		nombrepiloto= leer.next();
		System.out.println("Ingrese la edad: ");
		edad= leer.nextInt();
		tipo="Piloto";
		pilot1.entrenarpiloto(nombrepiloto,edad,tipo);
		System.out.println("Ahora intercambiara los copilotos del vuelo 1 y vuelo 2.:  ");
		System.out.println(pilot1.intercambiarpilotos(vuelo1,vuelo2));
		System.out.println("Ahora mostrara su mensaje de bienvenida: ");
		System.out.println(pilot1.mensajebienvenida());
		
		/*Ahora se ejecutaran las funciones de un avion por medio del vuelo.*/
		System.out.println("Ingrese algo para ver las funciones del avion y luego la comparacion de vuelos.");
		String e= leer.next();
		System.out.println("Ahoea se ejecutaran las funciones de un avion por medio del vuelo.");
		System.out.println(vuelo1.utilizaravion());
		
		/*Ahora compararemos 2 vuelos por sus vuelos y luego por sus cantidades en hombres y el segundo en mujeres.*/
		System.out.println("Ahora compararemos 2 vuelos por sus vuelos y luego por sus cantidades en hombres y el segundo en mujeres. Se comparara el vuelo 1 con el vuelo2 en hombres y luego mujeres.");
		System.out.println(vuelo.comparar(vuelo1, vuelo2,1));
		System.out.println(vuelo.comparar(vuelo1.getmujeres(),vuelo2.getmujeres(),2));
		y=0;
	}
	catch(Exception e) {
		System.out.println("Ha habido un error en el sistema, se reiniciara el programa.");
		y=1;
	}
	}
}

}