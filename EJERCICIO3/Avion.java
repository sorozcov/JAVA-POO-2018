/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 26072018
  EJERCICIO 3
  Archivo Avion.java*/
  
/*Clase Avion*/
public class Avion {
	/*Propiedades*/
	private String fabricante;
	private String modelo;
	private double alcance;
	private static String dueno="DUENO";
	private int helices;
	private int vueltashelices;
	
	/*Metodos*/
	/*Constructor con todos los parametros
	Si no hay helices el valor será cero, 
	al igual que el numero de vueltas, sino
	especifica valor de vueltas, el predeterminado
	serán 5 vueltas.*/
	/*Pide los datos para crear un nuevo avion fabrica, modelo, alcance, helices y vuelta de helices.*/
	public Avion(String fab, String mod, double alc, int hel, int vuelt){
		fabricante=fab;
		modelo=mod;
		alcance=alc;
		helices=hel;
		vueltashelices=vuelt;
		return;
	}
	
	/*Desplegar regresara todos los datos del avion.*/
	public String desplegar() {
		String mensaje=("Fabricante: "+fabricante +"\nModelo: "+ modelo + "\nAlcance: "+ alcance +"\n ");
		/*Si tiene helices da vueltas y si no tiene helices no da vueltas.*/
		if ((helices>0) && (vueltashelices>0)){
			String m=(girarHelices());
			mensaje=mensaje+m;
		}
		return mensaje;
	}
	
	/*toString de un avion*/
	public String toString() {
		String mensaje=("Soy un avion.");
		return mensaje;
	}
	
	/*girarHelices si las tiene y muestra las vueltas.*/
	public String girarHelices(){
		String m=("El avion tiene helices y giran "+ vueltashelices + " veces.");
		return m;
	}

}
