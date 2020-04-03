/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 05082018
  Laboratorio 1
  Archivo avion.java*/
  
/*Clase avion*/
public class avion {
	/*Propiedades*/
	private String fabricante;
	private String modelo;
	private double alcance;
	private static String dueno="Guatemala";
	
	/*Metodos*/
	/*Constructor con todos los parametros*/
	/*Pide los datos para crear un nuevo avion fabrica, modelo, alcance.*/
	public avion(String fab, String mod, double alc){
		fabricante=fab;
		modelo=mod;
		alcance=alc;
		return;
	}
	
	/*Desplegar regresara todos los datos del avion.*/
	public String desplegarinfo() {
		String mensaje=("Datos Avion\n Fabricante: "+fabricante +"\n Modelo: "+ modelo + "\n Alcance: "+ alcance +"\n");
		return mensaje;
	}
	
	/*toString de un avion*/
	public String toString() {
		String mensaje=("Soy un avion.");
		return mensaje;
	}
	
	/*Volar el avion como metodo*/
	public String volar(){
		String m=("El avion ha volado gracias a que se ha ejecutado en vuelo.");
		return m;
	}

}
