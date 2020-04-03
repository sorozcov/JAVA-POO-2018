/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 17082018
  Ejercicio5
  Archivo sistema.java*/
 
/*Importamos las librerias necesarias.*/ 
import java.util.*;
import java.text.*;

/*Clase sistemasimulador.*/
public class sistemasimulador{	
	/*Propiedades
	/*Todas las variables se especifican en el analisis.*/ 
	int edificios,niveles,operadores,filas=3;
	operador[] trabajadores;
	int[][][][] sistema;
	int totaloperadores=0;
	int minutos=0;
	
	/*Metodo que genera numeros aleatoriamentre entre un valor maximo y minimo.*/
	public static int randint(int min, int max) {
		Random rand = new Random();
		int numerorandom = rand.nextInt((max - min) + 1) + min;
		return numerorandom;
	}
	
	

	
	/*Metodos*/
	/*Constructor con todos los parametros*/
	/*Se crea un arreglo dimensional con las cantidades de edificios,
	niveles, prioridadades y operadores. Con ello se imprime el dato que se ha inicializado el sistema.*/
	public sistemasimulador(int ed, int niv, int oper){
			edificios=ed;
			niveles=niv;
			operadores=oper;
			trabajadores=new operador[(operadores*3*(niveles-2)*edificios)];
			sistema = new int[edificios][niveles][3][operadores];
			System.out.println("El sistema ha sido inicializado de esta forma.");
			/*Se hacen ciclos for hasta cantidades del sistema, para crear los datos y posteriormente los operadores con identificadores.*/
			for(int edificio=0;edificio<sistema.length; edificio++){
				System.out.println("Edificio "+(edificio+1));
				for (int nivel=0;nivel<(sistema[edificio]).length; nivel++){
					System.out.println("\tNivel "+(nivel+1));
					if((nivel==0) ||(nivel==(sistema[edificio].length-1))){
						System.out.println("\t \t Nivel sin personas.");
					}else{
						for (int fila=0;fila<(sistema[edificio][nivel]).length; fila++){
							System.out.println("\t \tFila "+ (fila+1));
							for (int operador=0;operador<(sistema[edificio][nivel][fila]).length; operador++){
								System.out.println("\t\t\t Operador "+ (operador+1));
								trabajadores[totaloperadores]= new operador(edificio+1,nivel+1,fila+1,operador+1);
								totaloperadores=totaloperadores+1;
					}}}}}
	}
	
	/*Imprime los datos de un operador para ser mostrados en el programa principal.*/
	public void mostraroperadores(){
		for(int x=0;x<totaloperadores; x++){
			System.out.println(trabajadores[x].info());
		}
	}
	
	/*Se simula el paso de un minuto. Generando aleatoriamente los datos de una llamada y a quien se asignara.
	Ademas se realizan todas las verificiones para saber si la llamada puede asignarse o no.*/
	public String simularminuto(){
			minutos++;	
			boolean randomsi=false;
			boolean alguienpuedetomarllamada=false;
			String pasotiempo;
			/*Si todos estuvieran tomando llamadas y tuviesen llamadas en espera, la llamada se rechazaria.*/

			for(int trabajador=0;trabajador<trabajadores.length;trabajador++){
					operador trabajo = trabajadores[trabajador];
					boolean puede=((trabajo.getllamadaactual()<4 && trabajo.getllamadaespera()==0)|| trabajo.getllamadaactual()==0);
					alguienpuedetomarllamada=(alguienpuedetomarllamada||puede);
			}
			if (alguienpuedetomarllamada==false){
					System.out.println("La llamada ha sido rechazada todos los agentes estan cargados de llamada y llamada en espera. Se ha dicho que llame despues.");
					randomsi=true;
			}
			int aleatorioedificio;
			int aleatorionivel;
			int aleatoriodificultad;
			int aleatoriooperador;
			int aleatoriominutosllamada;
			/*Mientras el operador no tengo ninguna llamada en linea, se le asignara la llamada como actual sino si su llamada termina en 3 minutos o menos
			se le asigna a llamada en espera, sino se busca otra operador de manera random, que pueda tomar la llamada.*/
			while(randomsi==false){
				/*Aleatorios de asignacion.*/
				aleatorioedificio=randint(1,edificios);
				aleatorionivel=randint(2,niveles-1);
				aleatoriooperador=randint(1,operadores);
				/*Aleatorio del tiempo de llamada y dificultad.*/
				aleatoriominutosllamada= randint(1,10);
				aleatoriodificultad=randint(1,3);
				String idrandom=(aleatorioedificio+"."+aleatorionivel+"."+aleatoriodificultad+"."+aleatoriooperador);
				for(int trabajador=0;trabajador<trabajadores.length;trabajador++){
					operador operadorrandom = trabajadores[trabajador];
					/*Se hacen las verificaciones necesarias.*/
					if (operadorrandom.getidentificacion().equals(idrandom)){
						if (operadorrandom.getllamadaactual()==0){
							System.out.println(operadorrandom.setllamadaactual(aleatoriominutosllamada));
							randomsi=true;
						}else if (operadorrandom.getllamadaactual()<4 && operadorrandom.getllamadaespera()==0){
							System.out.println(operadorrandom.setllamadaespera(aleatoriominutosllamada));
							randomsi=true;
						}else{
							randomsi=false;
				}}}

			}
			
			/*Se simula el minuto en los trabajadores.*/
			for(int trabajador=0;trabajador<trabajadores.length;trabajador++){
					operador trabajo = trabajadores[trabajador];
					trabajo.operadorminuto();
				}
			pasotiempo=("\nHan pasado "+ minutos+ " minutos desde el inicio de la simulacion.\n ");
			return pasotiempo;
	}
}
	
