/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 05082018
  Laboratorio 1
  Archivo aeropuerto.java*/
  
/*Clase aeropuerto*/
public class aeropuerto {
	/*Propiedades*/
	private String nombre;
	private String ubicacion;
	
	/*Metodos*/
	/*Constructor con todos los parametros*/
	/*Pide los datos para crear un nuevo aeropuerto. Es decir nombre y ubicacion.*/
	public aeropuerto(String nom, String ub ){
		nombre=nom;
		ubicacion=ub;
		return;
	}
	
	/*Desplegar regresara todos los datos del aeropuerto.*/
	public String desplegarinfo() {
		String mensaje=("Datos Avion \n Nombre: "+nombre +"\n Ubicacion: "+ ubicacion);
		return mensaje;
	}
	
	/*toString de un aeropuerto*/
	public String toString() {
		String mensaje=("Soy un aeropuerto");
		return mensaje;
	}
	
	/*Mensaje de bienvenida*/
	public String mensajebienvenida(){
		String m=("Bienvenidos al aeropuerto.");
		return m;
	}

}

	
