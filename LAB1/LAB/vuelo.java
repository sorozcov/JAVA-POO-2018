/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 05082018
  Laboratorio 1
  Archivo vuelo.java*/
  

/*Clase vuelo*/
public class vuelo{
	/*Propiedades*/
	/*Cada uno de los atributos es necesario para realizar reportes sobre los vuelos y ejecutar sus funciones.*/
	private int cantidadhombres;
	private int cantidadmujeres;
	private int cantidadninos;
	private int cantidadvuelo;
	private static int totalvuelos=0;
	private int numerovuelo;
	private piloto pilot;
	private piloto copilot;
	private avion nave;
	private aeropuerto puerto;
		
	/*Metodos*/
	
	/*Constructor con todos los parametros se piden en el 
	driver program para instanciar un objeto de tipo vuelo.*/
	/*Pide los datos para crear un nuevo vuelo cantidad de hombres, mujeres y ninios. P
	Pide un piloto, un copiloto, un avion y un aeropuerto.*/
	public vuelo(int canth, int cantm, int cantn,int numvuelo,piloto pil, piloto cop,avion nav, aeropuerto puer){
		cantidadhombres=canth;
		cantidadmujeres=cantm;
		cantidadninos=cantn;
		cantidadvuelo=cantidadhombres+cantidadmujeres+cantidadninos;
		totalvuelos=totalvuelos+cantidadvuelo;
		numerovuelo=numvuelo;
		pilot=pil;
		copilot=cop;
		nave=nav;
		puerto=puer;
		return;
	}
	
	
	/*Mostrara la informacion de las cantidades a traves de un mensaje.*/
	public String mostrarcantidades() {
		String mensaje=("Las cantidades son las siguientes: "+ "\n Hombres: "+ cantidadhombres+ "\n Mujeres: " +cantidadmujeres+"\n Ninos: " +cantidadninos +"\nTotal vuelo: " +cantidadvuelo);
		/*Si tiene mas de 8 ninos, mostrara un mensaje advertencia.*/
		if (cantidadninos>8) {
			mensaje=(mensaje+"\n Mensaje de advertencia: Preocupacion media para este vuelo, cantidad de ninos mayor a 8 :(.");
		}
		return mensaje;
	}
	
	/*Mostrara la informacion de los porcentajes por grupo a traves de un mensaje.*/
	public String mostrarporcentajes() {
		/*Convertimos cantidades a %.*/
		float porh;
		porh=((float)cantidadhombres/cantidadvuelo)*100;
		double porm;
		porm=((float)cantidadmujeres/cantidadvuelo)*100;
		double porn;
		porn=((float)cantidadninos/cantidadvuelo)*100;
		String mensaje=("Los porcentajes son las siguientes: "+ "\n Hombres: "+ porh+ "%\n Mujeres: " +porm+"%\n Ninos: " +porn +"%\n Total vuelo: 100%");
		return mensaje;
	}
	
	/*Mostrara los datos del vuelo y de cada uno de los objetos instanciados en el.*/
	public String mostrardatosvuelos() {
		String mensaje=("Datos del vuelo"+"\n No. de vuelo:"+ numerovuelo+"\n");
		mensaje=(mensaje+pilot.desplegarinfo()+copilot.desplegarinfo()+nave.desplegarinfo()+puerto.desplegarinfo());		
		return mensaje;
	}
	
	/*Muestra el total de deportados del dia.*/
	public static String  totaldeldia(){
		String mensaje=("El numero total de deportados de todos los vuelos del dia es "+ totalvuelos);
		return mensaje;
	}
	
	/*Regresara el copiloto del avion.*/
	public piloto getCopiloto(){
		piloto cop=copilot;
		return cop;
	}
	
	/*Cambia de copiloto.*/
	public String setCopiloto(piloto newcop){
		copilot=newcop;
		String mensaje=("El nuevo copiloto del No. de vuelo "+ numerovuelo+ " es: \n " +copilot.desplegarinfo());
		return mensaje;
	}
	
	/*Mostrara Reporte de estado.*/
	public String mostrarreporte(){
		String reporte=("Estado de reporte\n El vuelo con numero "+ numerovuelo+ " se encuentra en buen estado.");
		return reporte;
	}
	
	/*Ejecutar funciones de avion a traves del avion del vuelo. El avion ejecutara funciones de mostrar info y volar.*/
	public String utilizaravion(){
		String funciones=(nave.desplegarinfo()+nave.volar());
		return funciones;
	}
	
	/*Regresara la cantidad de hombres para ser comparada con otro vuelo.*/
	public int gethombres(){
		int cant=cantidadhombres;
		return cant;
	}

	/*Regresara la cantidad de mujeres para ser comparada con otro vuelo.*/
	public int getmujeres(){
		int cant=cantidadmujeres;
		return cant;
	}
	
	/*Regresara la cantidad de ninos para ser comparada con otro vuelo.*/
	public int getninos(){
		int cant=cantidadninos;
		return cant;
	}
	
	/*Comparar 2 vuelos por medio de parametros de vuelos.*/
	public static String comparar(vuelo vuelo1, vuelo vuelo2, int opcion){
		String mensaje="";
		switch(opcion){
		case 1:
			if (vuelo1.cantidadhombres>vuelo2.cantidadhombres){
				mensaje="La cantidad de hombres del vuelo 1 es mayor.";
			}else {
			mensaje="La cantidad de hombres del vuelo 2 es mayor.";}
			break;
		case 2:
			if (vuelo1.cantidadmujeres>vuelo2.cantidadmujeres){
				mensaje="La cantidad de mujeres del vuelo 1 es mayor.";
			}else {
			mensaje="La cantidad de mujeres del vuelo 2 es mayor.";}
			break;
		case 3:
			if (vuelo1.cantidadninos>vuelo2.cantidadninos){
				mensaje="La cantidad de ninios del vuelo 1 es mayor.";
			}else {
			mensaje="La cantidad de ninios del vuelo 2 es mayor.";}
			break;
		}
		return mensaje;
		}
		
	/*Comparar 3 vuelos por medio de parametros de vuelos.*/
	public static String comparar(vuelo vuelo1, vuelo vuelo2, vuelo vuelo3,int opcion){
		String mensaje="";
		switch(opcion){
		case 1:
			if ((vuelo1.cantidadhombres>=vuelo2.cantidadhombres)&&(vuelo1.cantidadhombres>=vuelo3.cantidadhombres)){
				mensaje="La cantidad de hombres del vuelo 1 es mayor.";
			}else if ((vuelo1.cantidadhombres<=vuelo2.cantidadhombres)&&(vuelo2.cantidadhombres>=vuelo3.cantidadhombres)){
				mensaje="La cantidad de hombres del vuelo 2 es mayor.";
			}else if ((vuelo1.cantidadhombres<=vuelo3.cantidadhombres)&&(vuelo3.cantidadhombres>=vuelo2.cantidadhombres)){
			mensaje="La cantidad de hombres del vuelo 3 es mayor.";	}
			break;
		case 2:
			if ((vuelo1.cantidadmujeres>=vuelo2.cantidadmujeres)&&(vuelo1.cantidadmujeres>=vuelo3.cantidadmujeres)){
				mensaje="La cantidad de mujeres del vuelo 1 es mayor.";
			}else if ((vuelo1.cantidadmujeres<=vuelo2.cantidadmujeres)&&(vuelo2.cantidadmujeres>=vuelo3.cantidadmujeres)){
				mensaje="La cantidad de mujeres del vuelo 2 es mayor.";
			}else if ((vuelo1.cantidadmujeres<=vuelo3.cantidadmujeres)&&(vuelo3.cantidadmujeres>=vuelo2.cantidadmujeres)){
			mensaje="La cantidad de mujeres del vuelo 3 es mayor.";	}
			break;
		case 3:
			if ((vuelo1.cantidadninos>=vuelo2.cantidadninos)&&(vuelo1.cantidadninos>=vuelo3.cantidadninos)){
				mensaje="La cantidad de ninios del vuelo 1 es mayor.";
			}else if ((vuelo1.cantidadninos<=vuelo2.cantidadninos)&&(vuelo2.cantidadninos>=vuelo3.cantidadninos)){
				mensaje="La cantidad de ninios del vuelo 2 es mayor.";
			}else if ((vuelo1.cantidadninos<=vuelo3.cantidadninos)&&(vuelo3.cantidadninos>=vuelo2.cantidadninos)){
			mensaje="La cantidad de ninios del vuelo 3 es mayor.";}
			break;
		}
		return mensaje;
		}
	
	/*Comparar 2 vuelos por medio de valores numericos con get.*/
	public static String comparar(int cant1, int cant2, int opcion){
		String mensaje="";
		switch(opcion){
		case 1:
			if (cant1>cant2){
				mensaje="La cantidad de hombres del vuelo 1 es mayor.";
			}else {
			mensaje="La cantidad de hombres del vuelo 2 es mayor.";}
			break;
		case 2:
			if (cant1>cant2){
				mensaje="La cantidad de mujeres del vuelo 1 es mayor.";
			}else {
			mensaje="La cantidad de mujeres del vuelo 2 es mayor.";}
			break;
		case 3:
			if (cant1>cant2){
				mensaje="La cantidad de ninios del vuelo 1 es mayor.";
			}else {
			mensaje="La cantidad de ninios del vuelo 2 es mayor.";}
			break;
		}
		return mensaje;
		}	
		
	/*Comparar 3 vuelos por medio de valores numericos con get.*/		
	public static String comparar(int cant1, int cant2,int cant3, int opcion){
		String mensaje="";
		switch(opcion){
		case 1:
			if ((cant1>=cant2)&&(cant1>=cant3)){
				mensaje="La cantidad de hombres del vuelo 1 es mayor.";
			}else if ((cant1<=cant2)&&(cant2>=cant3)){
				mensaje="La cantidad de hombres del vuelo 2 es mayor.";
			}else if ((cant1<=cant3)&&(cant3>=cant2)){
			mensaje="La cantidad de hombres del vuelo 3 es mayor.";	}
			break;
		case 2:
			if ((cant1>=cant2)&&(cant1>=cant3)){
				mensaje="La cantidad de mujeres del vuelo 1 es mayor.";
			}else if ((cant1<=cant2)&&(cant2>=cant3)){
				mensaje="La cantidad de mujeres del vuelo 2 es mayor.";
			}else if ((cant1<=cant3)&&(cant3>=cant2)){
			mensaje="La cantidad de mujeres del vuelo 3 es mayor.";	}
			break;
		case 3:
			if ((cant1>=cant2)&&(cant1>=cant3)){
				mensaje="La cantidad de ninios del vuelo 1 es mayor.";
			}else if ((cant1<=cant2)&&(cant2>=cant3)){
				mensaje="La cantidad de ninios del vuelo 2 es mayor.";
			}else if ((cant1<=cant3)&&(cant3>=cant2)){
			mensaje="La cantidad de ninios del vuelo 3 es mayor.";	}
			break;
		}
		return mensaje;
		}
}

