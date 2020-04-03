/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 26072018
  EJERCICIO 3
  Archivo CatalAviones.java*/
 
/*Importamos el scanner*/ 
import java.util.Scanner;

/*Clase CatalogoAviones que sera nuestro driver program*/
public class CatalogoAviones {
	public static void main(String args[]) {
				
		/*Creamos nuestro scanner llamado leer.*/
		Scanner leer = new Scanner(System.in);
		
		
		/*Damos bienvenida a nuestro programa*/
		System.out.println("Bienvenido al catalogo de aviones.");
		System.out.println("En este momento se ingresaran 3 aviones.");
		

		/*Pedimos que ingrese la fabrica, modelo, alcance, helices y vueltas del primer avion.*/
		System.out.println("Avion 1");
		System.out.println("Ingrese la fabrica: ");
		String fabrica= leer.next();
		System.out.println("Ingrese el modelo: ");
		String modelo= leer.next();
		System.out.println("Ingrese el alcance: ");
		Double alcance= leer.nextDouble();
		System.out.println("¿Tiene helices? Responda 0 para no y 1 para si: ");
		int helices= leer.nextInt();
		int numvueltas1=0;
		if (helices==1){
			System.out.println("¿Conoce el numero de vueltas que da la helice? Responda 0 para no y 1 para si: ");
			int respvueltas= leer.nextInt();
			if (respvueltas==1){
				System.out.println("Ingrese el numero de vueltas: ");
				int numvueltas= leer.nextInt();
				numvueltas1=numvueltas;
			}else if (respvueltas==0){
			    /*Predeterminado sera 5 vueltas, si no las conoce.*/
				numvueltas1= 5;
			}else{
				System.out.println("Error solo puede ingresar 1 o 0. Se le asignara el valor predeterminado de vueltas.");
				numvueltas1= 5;
			}
		}else if (helices==0){
			/*Se asigna 0 a helices y vuelta, y el metodo no podra ser llamado por la clase, al no tener estos valores.*/
			  numvueltas1=0;
		}
		/*Se crea el nuevo avion.*/
		Avion naveAerea1 = new Avion(fabrica,modelo,alcance,helices,numvueltas1);

		/*Pedimos que ingrese la fabrica, modelo, alcance, helices y vueltas del segundo avion.*/
		System.out.println("Avion 2");
		System.out.println("Ingrese la fabrica: ");
		String fabrica2= leer.next();
		System.out.println("Ingrese el modelo: ");
		String modelo2= leer.next();
		System.out.println("Ingrese el alcance: ");
		Double alcance2= leer.nextDouble();
		System.out.println("¿Tiene helices? Responda 0 para no y 1 para si: ");
		int helices2= leer.nextInt();
		int numvueltas2=0;
		if (helices2==1){
			System.out.println("¿Conoce el numero de vueltas que da la helice? Responda 0 para no y 1 para si: ");
			int respvueltas2= leer.nextInt();
			if (respvueltas2==1){
				System.out.println("Ingrese el numero de vueltas: ");
				int numvueltas22= leer.nextInt();
				numvueltas2=numvueltas22;
			}else if (respvueltas2==0){
			    /*Predeterminado sera 5 vueltas, si no las conoce.*/
				numvueltas2= 5;
			}else{
				System.out.println("Error solo puede ingresar 1 o 0. Se le asignara el valor predeterminado de vueltas.");
				numvueltas2= 5;
			}
		}else if (helices2==0){
			/*Se asigna 0 a helices y vuelta, y el metodo no podra ser llamado por la clase, al no tener estos valores.*/
			numvueltas2=0;
		}
		/*Se crea el nuevo avion.*/
		Avion naveAerea2 = new Avion(fabrica2,modelo2,alcance2,helices2,numvueltas2);
		
		/*Pedimos que ingrese la fabrica, modelo, alcance, helices y vueltas del tercer avion.*/
		System.out.println("Avion 3");
		System.out.println("Ingrese la fabrica: ");
		String fabrica3= leer.next();
		System.out.println("Ingrese el modelo: ");
		String modelo3= leer.next();
		System.out.println("Ingrese el alcance: ");
		Double alcance3= leer.nextDouble();
		System.out.println("¿Tiene helices? Responda 0 para no y 1 para si: ");
		int helices3= leer.nextInt();
		int numvueltas3=0;
		if (helices3==1){
			System.out.println("¿Conoce el numero de vueltas que da la helice? Responda 0 para no y 1 para si: ");
			int respvueltas3= leer.nextInt();
			if (respvueltas3==1){
				System.out.println("Ingrese el numero de vueltas: ");
				int numvueltas33= leer.nextInt();
				numvueltas3=numvueltas33;
			}else if (respvueltas3==0){
			    /*Predeterminado sera 5 vueltas, si no las conoce.*/
				numvueltas3= 5;
			}else{
				System.out.println("Error solo puede ingresar 1 o 0. Se le asignara el valor predeterminado de vueltas.");
				numvueltas3= 5;
			}
		}else if (helices3==0){
			/*Se asigna 0 a helices y vuelta, y el metodo no podra ser llamado por la clase, al no tener estos valores.*/
			numvueltas3=0;
		}
		/*Se crea el nuevo avion.*/
		Avion naveAerea3 = new Avion(fabrica3,modelo3,alcance3,helices3,numvueltas3);
		
		
		
		/*Ya creados los aviones imprimimos toda su informacion*/
		System.out.println("Ahora desplegaremos la informacion de todos los aviones. Si tienen helices recurriran a dar vueltas tambien.");
		/*Llamamos al metodo desplagar para los 3 aviones.*/
		System.out.println(naveAerea1.desplegar());
		System.out.println();
		System.out.println(naveAerea2.desplegar());
		System.out.println();
		System.out.println(naveAerea3.desplegar());
		
		/*Ahora que ya se imprimieron todos, se pregunta si desea imprimir la info de un solo avion o salir del programa.*/
		System.out.println("Ingrese si desea solo desplegar la informacion del avion 1, del avion 2 o del avion 3. (1,2, 3 o 4 para salir.)");
		int resp = leer.nextInt();
		if (resp==1){
			System.out.println(naveAerea1.desplegar());
		}
		else if (resp==2){
			System.out.println(naveAerea2.desplegar());
		}
		else if (resp==3){
			System.out.println(naveAerea3.desplegar());
		}
		System.out.println("Gracias por usar el programa.");
			
		
}

}