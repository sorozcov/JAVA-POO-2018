/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 17082018
  Ejercicio5
  Archivo Operador.java*/
 
/*Importamos el scanner y las librerias necesarias.*/ 
import java.util.*;
import java.text.*;
/*Clase operador*/
public class operador{
	/*Propiedades
	Del analisis, se utilizan las siguientes propiedades.
	El numero de identifacion que sera una mezcla del edificio,nivel,fila y posicion en que se encuentra.
	Llamadaactual que es igual al tiempo en la llamada, si es 0 no tiene llamadada, llamadaespera es igual al tiempo de la llamada en espera,
	Las llamadas en linea, en espera, total de operadores y total de llamadas terminadas nos sirven para llevar control del sistema, por ello
    son static pues provienen del conjunto de todas los operadores.	
	Prioridad identifica que tipo de prioridad tiene nuestro operador.*/ 
	private int edificio;
	private int nivel;
	private int prioridad;
	private int numero;
	private String identificacion;
	private int llamadaactual=0;
	private int llamadaespera=0;
	private int minutostotales;
	private int llamadasterminadas=0;
	static int llamadastotales=0;
	static int llamadasenlinea=0;
	static int llamadasespera=0;
	static int totaloperadores=0;
	
	/*Metodos*/
	/*Constructor con todos los parametros*/
	/*Pide los datos para crear un operador*/
	public operador(int ed,int niv,int fila,int num){
			edificio=ed;
			nivel=niv;
			prioridad=fila;
			numero=num;
			identificacion=(ed+"."+nivel+"."+prioridad+"."+numero);
			totaloperadores=totaloperadores+1;
			System.out.println("\t\t\t\t Operador "+ identificacion+" creado.");
			
	}
	
	/*Retorna el valor de minutos de la llamada actual. Si este es igual a 0, quiere decir que no tiene ninguna llamada.*/
	public int getllamadaactual(){
			return llamadaactual;
	}
	
	/*Asigna una llamada nueva, un valor de llamada mas, etc. Imprime el mensaje de a quien se le ha asignado y la cantidad de minutos de la llamada.*/
	public String setllamadaactual(int actual){
		llamadaactual=actual;
		String asignado=( "Se ha asignado una nueva llamada al operador "+identificacion + " de duracion "+ actual+ " minutos.");
		minutostotales=minutostotales+actual;
		llamadasterminadas=llamadasterminadas+1;
		llamadastotales=llamadastotales+1;
		return asignado;
	}
	
	/*Retorna el valor de identificacion del operador.
	Este se constituye de edificio, nivel, fila y por ultimo numero de operador en dicha fila. 
	La fila es tambien la prioridad de la llamada/*/
	public String getidentificacion(){
		return identificacion;
	}
	
	/*Retorna el valor de minutos de la llamada espera Si este es igual a 0, quiere decir que no tiene ninguna llamada en espera.*/
	public int getllamadaespera(){
			return llamadaespera;
	}
	
	/*Se asigna un valor de llamada de espera, solo se puede tener una.*/
	public String setllamadaespera(int espera){
		llamadaespera=espera;
		String asignado=( "Se ha asignado una nueva llamada en espera al operador "+identificacion + " de duracion "+ espera+ " minutos.");
		return asignado;
	}
	
	
	/*Muestra la informacion sobre el operador con su id, status, promedio de tiempo por llamada y porcentaje del total atendidos.*/
	public String info(){
		String id, status, promedio,porcentaje, datos;
		id=("Operador con Identificacion " +identificacion +"\n");
		if(llamadaactual>0){
			status=("\tEste operador se encuentra en un llamada actualmente restando " +llamadaactual + " minutos para terminarla.\n");
		}else{
			status=("\tEste operador no se encuentra en una llamada actualmente.\n");
		}
		if (llamadaespera>0){
			status=status+("\tEste operador tiene una llamada en espera de duracion " +llamadaespera + " minutos. \n");
		}else{
			status=status+("\tEste operador no tiene llamadas en espera.\n");
		}
		double prom;
		try{
			prom=(double)(minutostotales/llamadasterminadas);
		}catch(java.lang.ArithmeticException e){
			prom=0;
		}
		DecimalFormat df = new DecimalFormat("0.00");
		String pro=df.format(prom);
		promedio=("\tEl promedio de minutos por llamada del operador es "+pro+ ". \n");
		double porc=(double)(llamadasterminadas*100/llamadastotales);
		String por=df.format(porc);
		porcentaje=("\tEl porcentaje de llamadas tomadas del operador es "+por+ "%. \n");
		datos=id+status+promedio+porcentaje;
		return datos;
	}
	
	/*Simula el tiempo del paso de un minuto en el operador. Si hay llamada en espera, se asigna al operador. Y ademas, se le resta un minuto a la llamada actual.*/
	public void operadorminuto(){
		if (llamadaactual>0){
			llamadaactual=llamadaactual-1;
		}
		if (llamadaactual==0 && llamadaespera>0){
			setllamadaactual(llamadaespera);
			llamadaespera=0;
		}
		
	}
}
	
