/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 17082018
  Ejercicio5
  Archivo Operador.java*/
 
/*Importamos el scanner y las librerias necesarias.*/ 
import java.util.*;
import java.text.*;
/*Clase IsotopoSimulador*/
public class IsotopoSimulador{
	/*Propiedades
	Del analisis, se utilizan doubles en lugar de float en las variables numericas.*/
	/*Todas las variables se especifican en el analisis.*/ 
	private String nombreisotopo;
	private double vidamedia;
	private double porcentajeporhora;
	private String porcentaje;
	private int totalprobabilidad;
	private double masamolar;
	private double cantatomos;
	private double cantidadinicial;
	private double cantidadendim;
	private String dimensionalu;
	private double horassimulador=0;
	private double valorecuacion;
	private String notacioncientifica;
	private boolean exitosa;
	Locale locall = new Locale("es", "US");
	
	/*Metodos*/
	/*Constructor con todos los parametros*/
	/*Pide los datos para crear un isotopo simulador. Se crearan el isotopo segun se ingrese el dato del nombre con las instancias dadas por la compania de shucos.*/
	public IsotopoSimulador(String nombre,double masam,double vidam){
			nombreisotopo=nombre;
			vidamedia=vidam;
			masamolar=masam;
			porcentajeporhora=1/vidamedia;
			totalprobabilidad= (int)(Math.ceil((1/porcentajeporhora)));
/* 			DecimalFormat porcentaje=new DecimalFormat("#00.00%");
			porcentajeporhora=String.valueof(porcentajehora);
			porcentajeporhora=porcentaje.format(porcentajeporhora); */
			porcentaje=((porcentajeporhora*100)+"%");
	}
	
	/*Esta clase convertir recibe los parametros de isotopo y cantidad en el main, para hacer las 
	verificaciones que toda esta correcto. Separa la dimensional de la magnitud de la cantidad, 
	y si todo esta correcto regresa un boolean con error igual falso. Tambien asignara los valores
	al isotopo tales como cantidad de atomos, dimensional y valor de la cantidad en su dimensional.*/
	public boolean convertir(String isotopo, String cantidad){
		boolean error=false;
		/*Aqui se lee la longitud de la cantidad ingresada.*/
		/*Por lo menos debe tener 3 substrings, ya que las ultimas 2 seran la dimensional y necesita de una cantidad anteriormente.*/
		int len=cantidad.length();
		/*Si no cumple con lo establecido, tal como la cantidad de substrings, que cuando se separa el primer string pueda
		convertirse a double y que el segundo string sea una cantidad valida, se establecera un error en el sistema. De lo 
		contrario, se podra proseguir en el programa principal.*/
		if (len>=3){
			try {
				double valornum=(Double.parseDouble(cantidad.substring(0, len-2)));
				valornum=Math.abs(valornum);
				String dimensional=(cantidad.substring(len -2, len));
				DecimalFormatSymbols nuevo = new DecimalFormatSymbols(locall);
				nuevo.setExponentSeparator("*10^");
				DecimalFormat notacionc=new DecimalFormat("0.0#####E00",nuevo);
				notacioncientifica=(notacionc.format(valornum));
				if (dimensional.equals("gr")){
					dimensionalu="gramos";
					cantidadendim=valornum;
					cantatomos=cantidadendim*(1/masamolar)*((6.022E+23));
					cantidadinicial=cantatomos;
				}else if (dimensional.equals("mo")){
					dimensionalu="moles";
					cantidadendim=valornum;
					cantatomos=cantidadendim*((6.022E+23));
					cantidadinicial=cantatomos;
				}else if(dimensional.equals("na")){
					dimensionalu="numero de atomos";
					cantidadendim=valornum;
					cantatomos=cantidadendim;
					cantidadinicial=cantatomos;
				}else{
					error=true;
				}
			}catch(java.lang.NumberFormatException e ){
				error=true;
			}
		}else{
			error=true;
		}
		return error;
	}
	
	/*Esta clase sirve para sacar el valor de la ecuacion segun las horas dadas por el simulador.
	Es private porque el metodo simulador llama a este proceso.*/
	private void ecuacionycomparar(){
		double exponente= (horassimulador/vidamedia);
		double base=0.5;
		double valor1=(Math.pow(base,exponente));
		valorecuacion=((cantidadinicial)*valor1);

		if ((valorecuacion)<=1){
			exitosa=true;
		}else{
			exitosa=false;
		}		
	}
	
	/*Esta es el metodo qeu sirve como simulador de manera que el se encarga
	que todo se de de manera correcta.Aqui se hacen los ciclos para calcular la cantidad
	de horas a partir de probabilidades y que la cantidad de atomos sea mayor a 0. Por
	ello es que finalmente genera el mensaje de la simulacion con toda la informacion
	disponible.*/
	int a;
	public String simulacion(){
		int aleatorio;
		while (cantatomos>=0){
			for (int atomo=1; atomo<=cantatomos+1;atomo++){
				aleatorio=new Random().nextInt(totalprobabilidad+1); 
				if (aleatorio==totalprobabilidad){
					cantatomos=cantatomos-1;
				}
			}
			horassimulador=horassimulador+1;
		}
		ecuacionycomparar();
		/*Luego de comparar la ecuacion regresa e imprime los datos solicitados. 
		Haciendo un toString mas grande, de todos los datos y luego lo retorna al
		main.*/
		String datos=("Se ingresaron "+ notacioncientifica +" "+dimensionalu+ " de "+ nombreisotopo +".\n");
		String probabilidaddec=("Este isotopo tiene una probabilidad de decaimiento por hora de "+ porcentaje +".\n \n");
		String tiempo=("El tiempo obtenido de la simulacion fue de " +horassimulador + "horas.\n");
		String formula=("Segun la formula, el numero de atomos que quedan luego de "+ horassimulador+" es de "+valorecuacion+".\n");
		String exito;
		if (exitosa==true){
			exito="La simulacion fue exitosa.";
		}else{
			exito="La simulacion no fue exitosa.";
		}
		String operacionsimulador=datos+probabilidaddec+tiempo+formula+exito;
		return operacionsimulador;
	}


}
	
