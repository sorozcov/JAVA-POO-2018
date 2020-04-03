/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 23082018
  Ejercicio6
  Archivo cliente.java*/
 
/*Importamos el scanner y las librerias necesarias.*/ 
import java.util.*;
import java.text.*;

/*Clase cliente*/
public class cliente{
	/*Propiedades
	Las propiedades necesarias son la cantidad de articulos inicial 
	para ser atendido y la clase llevara un conteo de numero de clientes
	que han utilizado el sistema.*/ 
	private int articulos;
	static int nodecliente=0;

	
	/*Metodos*/
	/*Constructor que pide el parametro sobre cuantos articulos tiene.*/
	/*Pide los datos para crear un cliente*/
	/*Unicamente asigna el valor de articulos inicial para el cliente.*/
	public cliente(int noarticulos){
			articulos=noarticulos;
			nodecliente++;
	}
	
	/*Metodo para recibir la cantidad de articulos de un cliente.*/
	public int getarticulos(){
		return articulos;
	}
	
	/*Metodo para recibir si la cantidaddearticulos es mayor a 9.*/
	public boolean articulosmayora9(){
		boolean mayora9;
		if (articulos>=9){
			mayora9=true;
		}else{
			mayora9=false;
		}
		return mayora9;
	}
	
	/*Metodo para  cambiar el numero de articulos de un cliente en una iteracion.*/
	public boolean setarticulos0(){
		articulos=articulos-1;
		boolean cobrado;
		if (articulos<=0){
			cobrado=true;
		}else{
			cobrado=false;
		}
		return cobrado;
	}
	

}
	
