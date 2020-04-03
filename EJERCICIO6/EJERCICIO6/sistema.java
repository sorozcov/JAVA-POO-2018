/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 23082018
  Ejercicio6
  Archivo sistema.java*/
 
/*Importamos las librerias necesarias.*/ 
import java.util.*;
import java.text.*;

/*Clase sistema.*/
public class sistema{	
	/*Propiedades
	/*Todas las variables se especifican en el analisis.*/ 
	private cola colageneral;
	private cola[] cajas;
	private int cantidadcajas;
	private static int min=0;
	
	/*Metodo que genera numeros aleatoriamentre entre un valor maximo y minimo.*/
	public static int randint(int min, int max) {
		Random rand = new Random();
		int numerorandom = rand.nextInt((max - min) + 1) + min;
		return numerorandom;
	}
	
	
	/*Metodos*/
	/*Constructor con todos los parametros*/
	/*Se crea un sistema que opere en el supermercado. 
	Se necesita saber la cantidad de cajas para ello.*/
	public sistema(int cantcajas){
			 colageneral =new cola(0);
			cantidadcajas=cantcajas;
			cajas=new cola[cantidadcajas];
			for(int x=0; x<cantidadcajas; x++){
				cajas[x]= new cola(0);
			}
			/*Se crean las cajas para ser operadas.*/
	}
	
	/*Imprime los datos de un operador para ser mostrados en el programa principal.*/
	public String mostrarsistema(){
		String sis = ("Supermercado Cajas Rapidas\nCola General: \t");
		for (int y=0; y<colageneral.consultartamano();y++){
			sis=(sis+(y+1)+"|"+colageneral.consultar(y)+"|\t");
		}
		sis=(sis+"\n");
		for(int x=0;x<cantidadcajas; x++){
			sis=(sis+"Caja "+(x+1)+": \t");
			cola subcaja=cajas[x];
			for (int z=0; z<subcaja.consultartamano();z++){
				sis=(sis+(z+1)+"|"+subcaja.consultar(z)+"|\t");
			}
			sis=(sis+"\n");
		}
		return sis;
	}
	
	
	/*Este es el metodo que se encarga de operar luego de cada minuto y generacion de un nuevo cliente.
	Es la funcionalidad del sistema para obtener las cantidades de datos sobre la cola general y las cajas
	para finalmente hacer funcionar el problema.*/	
	public void operar(cliente cnuevo){
		cliente cn=cnuevo;
		/*Primero en cada iteracion del programa, se ejecuta este codigo para modificar el cliente numero 1 en fila, para que pasen ciertos articulos por caja.*/
		for(int x=0;x<cantidadcajas; x++){
			boolean sale=(cajas[x].modificarpaso());
			/*Si todos los articulos son cobrados, entonces el cliente sale de la caja y es eliminado del sistema.*/
			if (sale==true){
			cajas[x].eliminar(0);}
		}
		/*Se toma al nuevo cliente y se analiza si es valido para el sistema de cajas rapidas.*/
		if (cnuevo!=null){
			if(cnuevo.getarticulos()>10){
				System.out.println("El nuevo cliente tiene mas de 10 articulos y ha sido enviado a las cajas normales.");
			}else{
				colageneral.agregar(cnuevo);
			}
		}
		/*Se encuentra el tamano de la cola general y se vera si es necesario distribuir.
		El primer paso para que se necesite distribuir es si la cola general es mayor a 0.*/
		int tamcolageneral=colageneral.consultartamano();
		boolean distribuir=(tamcolageneral>0);
		while (distribuir==true){
			boolean dis;
			boolean disparejo=false;
			/*Luego se debera distribuir si la cola general tiene una mayor cantidad de clientes, que cada una de las cajas. 
			Ademas, si la cantidad de clientes en las cajas esta dispareja tambien se optara por distribuir, a la caja que 
			tenga el menor numero de clientes. Si hay dos cajas con un minimo de clientes entonces se hace a la caja mas 
			cercana de la cola general.*/
			for(int x=0;x<cantidadcajas; x++){
				if (colageneral.consultartamano()>(cajas[x].consultartamano())){
					dis=true;
				}else{
					dis=false;
				}
				distribuir=distribuir&&dis;
			}
			for(int x=0;x<cantidadcajas; x++){
				for(int y=0;y<cantidadcajas; y++){
					if (cajas[x].consultartamano()>cajas[y].consultartamano()){
						disparejo=true;
						break;
				}
			}}
			distribuir=((distribuir||disparejo)&&tamcolageneral>0);
			/*Aqui se rompe el ciclo en caso no se necesite  distribuir.*/
			if (distribuir==false){
				break;
			}
			/*Luego si no se rompe el ciclo, entonces se hace la distribucion optima
			apropiada para el sistema, eliminando los ellemtnos de la cola general y 
			anadiendoles a una caja para que ya esten en fila para ser atendidos.
			Ademas, aleatoriamente cada cierto tiempo una persona que tenga el menor
			numero de articulos en la fila intercambiara lugar con quien este a punto de pasar, 
			para ser atendido inmediatamente y mejorar el flujo de las colas.*/
			for(int x=0;x<tamcolageneral;x++){
				int min=(cajas[0].consultartamano());
				for(int y=0;y<cantidadcajas;y++){
					min=Math.min(min,cajas[y].consultartamano());
				}
				for(int z=0;z<cantidadcajas;z++){
					if (min==cajas[z].consultartamano()){
						cliente c= colageneral.consultarcliente(x);
						cajas[z].agregar(c);
						break;
					}
				}
			}
			for(int x=0;x<tamcolageneral;x++){ 
				colageneral.eliminar(0);
			 } 
			break;
		}	
		
	}
	


}
	
