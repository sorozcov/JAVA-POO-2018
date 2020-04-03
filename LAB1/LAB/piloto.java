/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 05082018
  Laboratorio 1
  Archivo piloto.java*/
  
/*Clase piloto*/
public class piloto {
	/*Propiedades*/
	private String nombre;
	private int edad;
	private int horasdevuelo;
	private String tipo;
	
	/*Metodos*/
	/*Constructor con todos los parametros*/
	/*Pide los datos para crear un nuevo piloto. Estos son nombre, edad y horas de vuelo.*/
	public piloto(String nom, int ed, int hor, String tip){
		nombre=nom;
		edad=ed;
		horasdevuelo=hor;
		tipo=tip;
		return;
	}
	
	/*Desplegar regresara todos los datos del piloto.*/
	public String desplegarinfo() {
	String mensaje=("Datos " +tipo +": \n Nombre: "+nombre +"\n Edad: "+ edad + "\n Horas de vuelo: "+ horasdevuelo +"\n ");
		return mensaje;
	}
	
	/*toString de un piloto*/
	public String toString() {
		String mensaje=("Soy un piloto.");
		return mensaje;
	}
	
	/*Intercambia copilotos de 2 aviones.*/
	public String intercambiarpilotos(vuelo vuelo1, vuelo vuelo2){
		piloto cop1=vuelo1.getCopiloto();
		piloto cop2=vuelo2.getCopiloto();
		String a=vuelo1.setCopiloto(cop2);
		String b=vuelo2.setCopiloto(cop1);
		String mensaje=a+b;
		return mensaje;
	}
	
	/*Entrena un nuevo piloto.*/
	public piloto entrenarpiloto(String nomb, int ed,String tipo){
		int hor=0;
		piloto pilotoentrenado= new piloto(nomb,ed,hor,tipo);
		return pilotoentrenado;
	}
	
	/*Mensaje de bienvenida*/
	public String mensajebienvenida(){
		String m=("Bienvenidos al vuelo por su aviador.");
		return m;
	}

}
	
