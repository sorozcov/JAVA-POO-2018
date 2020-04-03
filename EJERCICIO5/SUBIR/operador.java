/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 23082018
  Ejercicio6
  Archivo arreglodinamico.java/
 
/*Importamos las librerias necesarias.*/ 
import java.util.*;
import java.text.*;

/*Clase arregloclientes.*/
public class arregloclientes{	
	/*Propiedades*/
	private cliente[] arr;
	
	/*Constructor, agregar,eliinar con indice, consulta y modificacion para cambiarla.*/
	public arreglodinamico(int taminicial){
		arr= new cliente[taminicial];
		for (int x=0; x<taminicial; x++){
			arr[x]=x;
			System.out.println(x);
		}
	}
	
	
	/*Agregar elemento.*/
	public void agregar(cliente elemento){
		int tamaanterior=arr.length;
		int tamnuevo=tamaanterior+1;
		System.out.println(tamnuevo);
		cliente[] arrnuevo=new cliente[tamnuevo];
		for(int x=0;x<tamaanterior; x++){
		    arrnuevo[x]=arr[x];
		}
		arrnuevo[tamaanterior]=elemento; 
	}
	
	/*Eliminar elemento.*/
	public String eliminar(int indice){
		clientefuera=arr[indice];
		String fuera=(clientefuera.fuera());
		int tamaanterior=arr.length;
		int tamnuevo=tamaanterior-1;
		int[] arrnuevo = new cliente[tamnuevo];
		for (int x=0; x<arr.length; x++){
			if (x==indice){
				continue;
			}
			if (x<indice){
				arrnuevo[x]=arr[x];
			}else{
				arrnuevo[x-1]=arr[x];
			}
		}
		arr=arrnuevo;
		return fuera;
	}
	
	/*Modificar elemento.*/
	public void modificar(int indice, cliente cliente1){
		arr[indice]=nuevovalor;
	}
	
	public void cambiar(int indice, cliente cmenosarticulos, int indice2, cliente cmasarticulos){
		
	}

	
	/*Consultar elemento.*/
	public int consultar(int indice){
		int resultado=arr[indice];
		return resultado;
	}
	
	/*Consultar tamano.*/
	public int consultartamano(){
		int tamano=arr.length;
		return tamano;
	}
	

}
	
