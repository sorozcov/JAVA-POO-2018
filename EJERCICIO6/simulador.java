/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 23082018
  Ejercicio6
  Archivo simulador.java*/
 
/*Importamos las librerias necesarias.*/ 
import java.util.*;
import java.text.*;

/*Clase simulador.*/
public class simulador{	
	/*Propiedades
	
	
	/*Metodo que genera numeros aleatoriamentre entre un valor maximo y minimo.*/
	public static int randint(int min, int max) {
		Random rand = new Random();
		int numerorandom = rand.nextInt((max - min) + 1) + min;
		return numerorandom;
	}
	
	
	public cliente nuevocliente(){
		cliente cnuevo;
		int aleatorio= randint(1,100);
		if (aleatorio=>60){
			int articulos= randint(1,11);
			cnuevo = new cliente(articulos);
		}else
			cnuevo=null;
		}
		return cnuevo;
	}
	
