/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 23082018
  Ejercicio6
  Archivo cola.java/
 
/*Importamos las librerias necesarias.*/ 
import java.util.*;
import java.text.*;

/*Clase cola que sera un arreglo dinamico de tipo clientes.*/
public class cola{	
	/*Propiedades*/
	private cliente[] arr;
	
	/*Constructor, agregar,eliinar con indice, consulta y modificacion para cambiarla.*/
	public cola(int taminicial){
		arr= new cliente[taminicial];
	}
	
	
	/*Agregar elemento.*/
	public void agregar(cliente elemento){
		int tamaanterior=arr.length;
		int tamnuevo=tamaanterior+1;
		cliente[] arrnuevo=new cliente[tamnuevo];
		for(int x=0;x<tamaanterior; x++){
		    arrnuevo[x]=arr[x];
		}
		arrnuevo[tamaanterior]=elemento; 
		arr=arrnuevo;
	}
	
	/*Eliminar elemento.*/
	public void eliminar(int indice){
		cliente clientefuera=arr[indice];
		int tamaanterior=arr.length;
		int tamnuevo=tamaanterior-1;
		cliente[] arrnuevo = new cliente[tamnuevo];
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
	}
	
	/*Modificar elemento luego del paso del tiempo. El setarticulos0 elimina 1 articulo del cliente, al pasar una iteracion.*/
	public boolean modificarpaso(){
		int a= consultartamano();
		boolean fuera;
		if (a>=1){
			cliente client=arr[0];
			fuera=(client.setarticulos0());
		}else{
			fuera=false;
		}
		return fuera;
	}
	
	public void cambiar(int indice, cliente cmenosarticulos, int indice2, cliente cmasarticulos){
		arr[indice]=cmasarticulos;
		arr[1]=cmenosarticulos;
	}

	
	/*Consultar articulos de un elemento*/
	public int consultar(int indice){
		cliente clienteconsultado=arr[indice];
		int resultado=clienteconsultado.getarticulos();
		return resultado;
	}
	
	/*Consultar un cliente.*/
	public cliente consultarcliente(int indice){
		cliente clienteconsultado=arr[indice];
		return clienteconsultado;
	}
	
	/*Consultar tamano.*/
	public int consultartamano(){
	
		int tamano=arr.length;
		return tamano;
	}
	

}
	
