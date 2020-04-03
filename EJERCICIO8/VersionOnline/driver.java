/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 090918
  Laboratorio 2
  Archivo driver.java*/
 
/*Importamos el scanner y las librerias necesarias.*/ 
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.util.Random;
import java.util.ArrayList;

/*Clase driversuper que sera nuestro driver program*/
/*Aqui se ejecutaran las funcionalidades de nuestro programa y sus clases.*/

public class driver{
	public static void main(String args[]) {
	/*Primero creamos un scanner para pedir el nombre de nuestros 4 jugadores.*/
	Scanner leer = new Scanner(System.in);
	/*Se crean los jugadores de Sorry.*/
	ArrayList<jugador> jugadores= new ArrayList<jugador>(4);
	/*Se piden los datos para instanciar 4 jugadores.*/
	for(int x=1;x<=4;x++){
		System.out.println("Ingrese el nombre del jugador "+ x +" (Si desea que sea un bot escriba 'Bot'. El primer jugador debe ser necesariamente humano.): ");
		String nom= leer.next();
		String tipo="Real";
		while(x==1 && (nom.equals("Bot")|| nom.equals("bot"))){
			System.out.println("El primer jugador debe ser necesariamente humano.");
			System.out.println("Ingrese el nombre del jugador "+ x +" (Si desea que sea un bot escriba 'Bot'.): ");
			nom= leer.next();
			tipo="Real";
		}
		if (x>1 && (nom.equals("Bot") || nom.equals("bot")) ){
			nom="Jugador " +x;
			tipo="Bot";
		}
		jugador j = new jugador(nom,x,tipo);
		jugadores.add(j);
	}
	/*Se crea un nuevo tablero.*/
	
	/*Crear listas para bots.*/
	String [] negros = new String[4];
	negros[0]="N1 ";negros[1]="N2 ";negros[2]="N3 ";negros[3]="N4 ";
	String [] rojos = new String[4];
	rojos[0]="R1 ";rojos[1]="R2 ";rojos[2]="R3 ";rojos[3]="R4 ";
	String [] azul = new String[4];
	azul[0]="A1 ";azul[1]="A2 ";azul[2]="A3 ";azul[3]="A4 ";
	String [] verdes= new String[4];
	verdes[0]="V1 ";verdes[1]="V2 ";verdes[2]="V3 ";verdes[3]="V4 ";
	tableroj juego = new tableroj();
	System.out.println(juego.vertablero());
	/*Se crea una variable ganador y turno.*/
	int ganador=0;
	int turno=0;
	/*Se crea una baraja de dados.*/
	barajadados baraja= new barajadados();
	/* juego.mover("N1 ",56);
	System.out.println(juego.vertablero()); */
	/*Mientras no exista ganador seguira el ciclo.*/
	while (ganador==0){
		/*Se hace una variable tur para contabilizar turnos*/
		int tur=turno%4;
		/*Existe un color, un jugador y segun el turno se se saca una dado.*/
		String col;
		jugador jug= jugadores.get(tur);
		System.out.println(jug.verjugador());
		String l;
		String peon;
		/*Se saca la dado*/
		boolean ver;
		/*Muestra dados sorry y hace todas
		las verificaciones necesarias para 
		obtener un peon valido y respuestas 
		validas.*/
		if (jug.gettipo().equals("Bot")==false){
			if (jug.getcartassorry()>0){
					System.out.println("Usted tiene " +jug.getcartassorry() +" dados Sorry.");
					System.out.println("Desea utilizarla? 1 para si y 2 para no.");
					l= leer.next();
					while(!l.equals("1") && !l.equals("2")){
						System.out.println("Su respuesta no fue valida. Desea utilizarla? 1 para si y 2 para no.");
						l= leer.next();
					}
					if(l.equals("1")){
						System.out.println("Ingrese el peon que desea regresar: ");
						peon= leer.next();
						peon=peon+" ";
						while (!peon.equals("A1 ")&&!peon.equals("A2 ")&&!peon.equals("A3 ")&&!peon.equals("A4 ") &&!peon.equals("N1 ")&&!peon.equals("N2 ")&&!peon.equals("N3 ")&&!peon.equals("N4 ") &&!peon.equals("R1 ")&&!peon.equals("R2 ")&&!peon.equals("R3 ")&&!peon.equals("R4 ")&& !peon.equals("V1 ")&&!peon.equals("V2 ")&&!peon.equals("V3 ")&&!peon.equals("V4 ")){
							
							System.out.println("El peon ingresado no es valido. ");
							System.out.println("Ingrese el peon que desea regresar: ");
							peon= leer.next();
							peon=peon+" ";
						}
						ver=juego.verificaradentro(peon);
						while(ver==true){
							System.out.println("El peon ingresado ya entro a zona segura. ");
							System.out.println("Ingrese el peon que desea regresar: ");
							peon= leer.next();
							peon=peon+" ";	
							ver=juego.verificaradentro(peon);
						}
						juego.enviarcasa(peon);
						jug.mcartassorry();
			}}
		}
		int car= baraja.sacardado();
		int ran;
		/*Se ve el turno*/
		if (tur==0){

			/*Muestra dados sorry y hace todas
			las verificaciones necesarias para 
			obtener un peon valido y respuestas 
			validas.*/
			/*Se si es bot o es real.*/
			if (jug.gettipo().equals("Bot")==false){
				if (car==13){
					jugadores.get(tur).cartassorry();
					System.out.println("Usted ha conseguido una dado Sorry.");
					System.out.println("Desea utilizarla? 1 para si y 2 para no.");
					l= leer.next();
					while(!l.equals("1") && !l.equals("2")){
						System.out.println("Su respuesta no fue valida. Desea utilizarla? 1 para si y 2 para no.");
						l= leer.next();
					}
					if(l.equals("1")){
						System.out.println("Ingrese el peon que desea regresar: ");
						peon= leer.next();
						peon=peon+" ";
						while (!peon.equals("A1 ")&&!peon.equals("A2 ")&&!peon.equals("A3 ")&&!peon.equals("A4 ") &&!peon.equals("N1 ")&&!peon.equals("N2 ")&&!peon.equals("N3 ")&&!peon.equals("N4 ") &&!peon.equals("R1 ")&&!peon.equals("R2 ")&&!peon.equals("R3 ")&&!peon.equals("R4 ")&& !peon.equals("V1 ")&&!peon.equals("V2 ")&&!peon.equals("V3 ")&&!peon.equals("V4 ")){
							System.out.println("El peon ingresado no es valido. ");
							System.out.println("Ingrese el peon que desea regresar: ");
							peon= leer.next();
							peon=peon+" ";	
						}
						ver=juego.verificaradentro(peon);
						while(ver==true){
							System.out.println("El peon ingresado ya entro a zona segura. ");
							System.out.println("Ingrese el peon que desea regresar: ");
							peon= leer.next();
							peon=peon+" ";	
							ver=juego.verificaradentro(peon);
						}
						juego.enviarcasa(peon);
						jug.mcartassorry();
					}
				}else{
					/*Muestra la dado y verifica el peon a mover.*/
					System.out.println("Has sacado una dado "+ car);
					System.out.println("Que peon suyo desea mover?");
					peon= leer.next();
					peon=peon+" ";
					while (!peon.equals("N1 ")&&!peon.equals("N2 ")&&!peon.equals("N3 ")&&!peon.equals("N4 ")){
						System.out.println("Recuerda que debes ingresar un peon valido.");
						System.out.println("Que peon suyo desea mover?");
						peon= leer.next();
						peon=peon+" ";
					}
					ver=juego.verificaradentro(peon);
						while(ver==true){
							System.out.println("El peon ingresado ya entro a zona segura. ");
							System.out.println("Ingrese el peon que desea regresar: ");
							peon= leer.next();
							peon=peon+" ";	
							ver=juego.verificaradentro(peon);
						}
					if (car==4){
						car=52;
					}
					juego.mover(peon,car);
				}
			}else{
				/*Muestra la dado y verifica el peon a mover.*/
					System.out.println("Has sacado una dado "+ car);
					System.out.println("Que peon suyo desea mover?");
					ran= barajadados.randint(0,3);
					peon= negros[ran];
					ver=juego.verificaradentro(peon);
						while(ver==true){
							ran= barajadados.randint(0,3);
							peon= negros[ran];
							ver=juego.verificaradentro(peon);
						}
					System.out.println(peon);
					if (car==4){
						car=52;
					}
					juego.mover(peon,car);
			}
		}else if (tur==1){
			/*Muestra dados sorry y hace todas
			las verificaciones necesarias para 
			obtener un peon valido y respuestas 
			validas.*/
			/*Se si es bot o es real.*/
			if (jug.gettipo().equals("Bot")==false){
				if (car==13){
					jugadores.get(tur).cartassorry();
					System.out.println("Usted ha conseguido una dado Sorry.");
					System.out.println("Desea utilizarla? 1 para si y 2 para no.");
					l= leer.next();
					while(!l.equals("1") && !l.equals("2")){
						System.out.println("Su respuesta no fue valida. Desea utilizarla? 1 para si y 2 para no.");
						l= leer.next();
					}
					if(l.equals("1")){
						System.out.println("Ingrese el peon que desea regresar: ");
						peon= leer.next();
						peon=peon+" ";
						while (!peon.equals("A1 ")&&!peon.equals("A2 ")&&!peon.equals("A3 ")&&!peon.equals("A4 ") &&!peon.equals("N1 ")&&!peon.equals("N2 ")&&!peon.equals("N3 ")&&!peon.equals("N4 ") &&!peon.equals("R1 ")&&!peon.equals("R2 ")&&!peon.equals("R3 ")&&!peon.equals("R4 ")&& !peon.equals("V1 ")&&!peon.equals("V2 ")&&!peon.equals("V3 ")&&!peon.equals("V4 ")){
							System.out.println("El peon ingresado no es valido. ");
							System.out.println("Ingrese el peon que desea regresar: ");
							peon= leer.next();
							peon=peon+" ";
						}
						ver=juego.verificaradentro(peon);
						while(ver==true){
							System.out.println("El peon ingresado ya entro a zona segura. ");
							System.out.println("Ingrese el peon que desea regresar: ");
							peon= leer.next();
							peon=peon+" ";	
							ver=juego.verificaradentro(peon);
						}
						juego.enviarcasa(peon);
						jug.mcartassorry();
					}
				}else{
					/*Muestra la dado y verifica el peon a mover.*/
					System.out.println("Has sacado una dado "+ car);
					System.out.println("Que peon suyo desea mover?");
					peon= leer.next();
					peon=peon+" ";
					while (!peon.equals("R1 ")&&!peon.equals("R2 ")&&!peon.equals("R3 ")&&!peon.equals("R4 ")){
						System.out.println("Recuerda que debes ingresar un peon valido.");
						System.out.println("Que peon suyo desea mover?");
						peon= leer.next();
						peon=peon+" ";
					}
					ver=juego.verificaradentro(peon);
						while(ver==true){
							System.out.println("El peon ingresado ya entro a zona segura. ");
							System.out.println("Ingrese el peon que desea regresar: ");
							peon= leer.next();
							peon=peon+" ";	
							ver=juego.verificaradentro(peon);
						}
					if (car==4){
						car=52;
					}
					juego.mover(peon,car);
				}
			}else{
				/*Muestra la dado y verifica el peon a mover.*/
					System.out.println("Has sacado una dado "+ car);
					System.out.println("Que peon suyo desea mover?");
					ran= barajadados.randint(0,3);
					peon= rojos[ran];
					ver=juego.verificaradentro(peon);
						while(ver==true){
							ran= barajadados.randint(0,3);
							peon= rojos[ran];
							ver=juego.verificaradentro(peon);
						}
					System.out.println(peon);
					if (car==4){
						car=52;
					}
					juego.mover(peon,car);
			}
		}else if(tur==2){
			/*Muestra dados sorry y hace todas
			las verificaciones necesarias para 
			obtener un peon valido y respuestas 
			validas.*/
			/*Se si es bot o es real.*/
			if (jug.gettipo().equals("Bot")==false){
				if (car==13){
					jugadores.get(tur).cartassorry();
					System.out.println("Usted ha conseguido una dado Sorry.");
					System.out.println("Desea utilizarla? 1 para si y 2 para no.");
					l= leer.next();
					while(!l.equals("1") && !l.equals("2")){
						System.out.println("Su respuesta no fue valida. Desea utilizarla? 1 para si y 2 para no.");
						l= leer.next();
					}
					if(l.equals("1")){
						System.out.println("Ingrese el peon que desea regresar: ");
						peon= leer.next();
						peon=peon+" ";
						while (!peon.equals("A1 ")&&!peon.equals("A2 ")&&!peon.equals("A3 ")&&!peon.equals("A4 ") &&!peon.equals("N1 ")&&!peon.equals("N2 ")&&!peon.equals("N3 ")&&!peon.equals("N4 ") &&!peon.equals("R1 ")&&!peon.equals("R2 ")&&!peon.equals("R3 ")&&!peon.equals("R4 ")&& !peon.equals("V1 ")&&!peon.equals("V2 ")&&!peon.equals("V3 ")&&!peon.equals("V4 ")){
							System.out.println("El peon ingresado no es valido. ");
							System.out.println("Ingrese el peon que desea regresar: ");
							peon= leer.next();
							peon=peon+" ";
						}
						ver=juego.verificaradentro(peon);
						while(ver==true){
							System.out.println("El peon ingresado ya entro a zona segura. ");
							System.out.println("Ingrese el peon que desea regresar: ");
							peon= leer.next();
							peon=peon+" ";	
							ver=juego.verificaradentro(peon);
						}
						juego.enviarcasa(peon);
						jug.mcartassorry();
					}
				}else{
					/*Muestra la dado y verifica el peon a mover.*/
					System.out.println("Has sacado una dado "+ car);
					System.out.println("Que peon suyo desea mover?");
					peon= leer.next();
					peon=peon+" ";
					while (!peon.equals("V1 ")&&!peon.equals("V2 ")&&!peon.equals("V3 ")&&!peon.equals("V4 ")){
						System.out.println("Recuerda que debes ingresar un peon valido.");
						System.out.println("Que peon suyo desea mover?");
						peon= leer.next();
						peon=peon+" ";
					}
					ver=juego.verificaradentro(peon);
						while(ver==true){
							System.out.println("El peon ingresado ya entro a zona segura. ");
							System.out.println("Ingrese el peon que desea regresar: ");
							peon= leer.next();
							peon=peon+" ";	
							ver=juego.verificaradentro(peon);
						}
					if (car==4){
						car=52;
					}
					juego.mover(peon,car);
				}
			}else{
				/*Muestra la dado y verifica el peon a mover.*/
					System.out.println("Has sacado una dado "+ car);
					System.out.println("Que peon suyo desea mover?");
					ran= barajadados.randint(0,3);
					peon= verdes[ran];
					ver=juego.verificaradentro(peon);
						while(ver==true){
							ran= barajadados.randint(0,3);
							peon= verdes[ran];
							ver=juego.verificaradentro(peon);
						}
					System.out.println(peon);
					if (car==4){
						car=52;
					}
					juego.mover(peon,car);
			}
		}else if(tur==3){
			/*Muestra dados sorry y hace todas
			las verificaciones necesarias para 
			obtener un peon valido y respuestas 
			validas.*/
			/*Se si es bot o es real.*/
			if (jug.gettipo().equals("Bot")==false){
				if (car==13){
					jugadores.get(tur).cartassorry();
					System.out.println("Usted ha conseguido una dado Sorry.");
					System.out.println("Desea utilizarla? 1 para si y 2 para no.");
					l= leer.next();
					while(!l.equals("1") && !l.equals("2")){
						System.out.println("Su respuesta no fue valida. Desea utilizarla? 1 para si y 2 para no.");
						l= leer.next();
					}
					if(l.equals("1")){
						System.out.println("Ingrese el peon que desea regresar: ");
						peon= leer.next();
						peon=peon+" ";
						while (!peon.equals("A1 ")&&!peon.equals("A2 ")&&!peon.equals("A3 ")&&!peon.equals("A4 ") &&!peon.equals("N1 ")&&!peon.equals("N2 ")&&!peon.equals("N3 ")&&!peon.equals("N4 ") &&!peon.equals("R1 ")&&!peon.equals("R2 ")&&!peon.equals("R3 ")&&!peon.equals("R4 ")&& !peon.equals("V1 ")&&!peon.equals("V2 ")&&!peon.equals("V3 ")&&!peon.equals("V4 ")){
							System.out.println("El peon ingresado no es valido. ");
							System.out.println("Ingrese el peon que desea regresar: ");
							peon= leer.next();
							peon=peon+" ";
						}
						ver=juego.verificaradentro(peon);
						while(ver==true){
							System.out.println("El peon ingresado ya entro a zona segura. ");
							System.out.println("Ingrese el peon que desea regresar: ");
							peon= leer.next();
							peon=peon+" ";	
							ver=juego.verificaradentro(peon);
						}
						juego.enviarcasa(peon);
						jug.mcartassorry();
					}
				}else{
					/*Muestra la dado y verifica el peon a mover.*/
					System.out.println("Has sacado una dado "+ car);
					System.out.println("Que peon suyo desea mover?");
					peon= leer.next();
					peon=peon+" ";
					while (!peon.equals("A1 ")&&!peon.equals("A2 ")&&!peon.equals("A3 ")&&!peon.equals("A4 ")){
						System.out.println("Recuerda que debes ingresar un peon valido.");
						System.out.println("Que peon suyo desea mover?");
						peon= leer.next();
						peon=peon+" ";
					}
					ver=juego.verificaradentro(peon);
						while(ver==true){
							System.out.println("El peon ingresado ya entro a zona segura. ");
							System.out.println("Ingrese el peon que desea regresar: ");
							peon= leer.next();
							peon=peon+" ";	
							ver=juego.verificaradentro(peon);
						}
					if (car==4){
						car=52;
					}
					juego.mover(peon,car);
				}
			
		}else{
				/*Muestra la dado y verifica el peon a mover.*/
					System.out.println("Has sacado una dado "+ car);
					System.out.println("Que peon suyo desea mover?");
					ran= barajadados.randint(0,3);
					peon= azul[ran];
					ver=juego.verificaradentro(peon);
						while(ver==true){
							ran= barajadados.randint(0,3);
							peon= azul[ran];
							ver=juego.verificaradentro(peon);
						}
					System.out.println(peon);
					if (car==4){
						car=52;
					}
					juego.mover(peon,car);
					
		}
		}
		/*Se verifica si el juego termino.*/
		ganador = juego.terminoj();
		/*Se imprime el tablero luego de cada turno.*/
		System.out.println(juego.vertablero());
		/*Si saca dado 2, tiene otro turno.*/
		if(car==6){
			System.out.println("Usted tiene otro turno por haber sacado un dado 6.");
			turno=turno;
		}else{
			turno=turno+1;
		}
	}
	/*Segun el ganador, se imprime el mensaje.*/
	if(ganador==1){
		jugador j =jugadores.get(0);
		System.out.println(j.gano());
	}else if (ganador==2){
		jugador j =jugadores.get(1);
		System.out.println(j.gano());
	}else if (ganador==3){
		jugador j =jugadores.get(2);
		System.out.println(j.gano());
	}else if (ganador==4){
		jugador j =jugadores.get(3);
		System.out.println(j.gano());
	}
}}