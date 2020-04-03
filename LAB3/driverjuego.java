/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 071018
  Ejercicio 9
  Archivo driverjuego.java*/
 
/*Importamos el scanner y las librerias necesarias.*/ 
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.util.Random;
import java.util.ArrayList;

/*Clase driverjuego que sera nuestro driver program*/
/*Aqui se ejecutaran las funcionalidades de nuestro programa y sus clases.*/

public class driverjuego{
	public static void main(String args[]) {
		/*Primero creamos un scanner para pedir datos.*/
		Scanner leer = new Scanner(System.in);
		String res;
		String tipo="\nBienvenido al juego. Desea jugar multijugador versus o multijugador equipo.\n 1. Multijugador \n 2. Versus.\nIngrese su opcion: ";
		System.out.println(tipo);
		res= leer.next();
		while (res.equals("1")==false && res.equals("2")==false ){
					System.out.println("Ingrese una opcion valida.");
					System.out.println(tipo);
					res= leer.next();
		}
		/*MODO MULTIJUGADOR*/
		if(res.equals("1")){
			/*Imprimimos la historia*/
			String n=	"        JUEGO DAVE Y CARL VS MUNDO                    ";
			String game=("---------------------------------------------\n"         + n           +     "\n---------------------------------------------\n		  ");
			System.out.println(game);
			String historia=("Nuestro heroe Dave  y Carl se encuentra en un mundo lleno de enemigos y necesita que lo controles para vencerlo.");
			historia=historia+("\nPara ello tendras 3 batallas que debes jugar para ganar el juego.");
			System.out.println(historia);
			
			/*Nuestro contador de turnos Y batallas ganadas.*/
			int gan=0;
			int tur=0;
			
			String menu=("Menu de opciones: \n 1. Atacar \n 2. Item Aleatorio \n Ingrese su respuesta:");
			
			/*---------------------------------------------------------------------------------------------------
			Batalla 1
			Dave vs 1 enemigo facil.*/
			n="      		  BATALLA 1                   ";
			game=("---------------------------------------------\n"         + n           +     "\n---------------------------------------------\n		  ");
			System.out.println(game);
			jugador dave1;
			jugador dave2;
			dave1= new guerrero("Dave");
			dave2= new guerrero("Carl");
			enemigo ene4;
			enemigo ene5;
			enemigo ene6;
			/*Dan la bienvenida nuestros combatietes.*/
			System.out.println(game);
			dave1= new guerrero("Dave");
			dave2= new explorador("Carl");
			ene4= new jefe1();
			ene5= new jefe1();
			ene6= new jefe1();
			
			/*Dan la bienvenida nuestros combatietes.*/
			System.out.println(dave1.bienvenida());
			System.out.println(dave2.bienvenida());
			System.out.println(ene4.bienvenida());
			System.out.println(ene5.bienvenida());
			System.out.println(ene6.bienvenida());
			/*Vamos por turnos*/
			while((dave1.getvida()>0 || dave2.getvida()>0) && (ene4.getvida()>0 || ene6.getvida()>0 || ene5.getvida()>0 )){
				/*Si el turno es del jugador entonces se despliega su infomacion y 
				de igual manera se pide ingresar si desea atacar o un item.
				Por el contrario si el turno es de los enemigos la maquina lo hara 
				aleatoriamente. Si hay mas de un enemigo el jugador ataca a todos.*/
				System.out.println("-------------------------------------");
				if (tur%2==0){
					System.out.println(dave1.info());
					System.out.println(menu);
					res= leer.next();
					while (res.equals("1")==false && res.equals("2")==false ){
						System.out.println("Ingrese una opcion valida.");
						System.out.println(menu);
						 res= leer.next();
					}
					if(res.equals("1")){
						System.out.println(dave1.turno(ene4));
						System.out.println(dave1.turno(ene5));
						System.out.println(dave1.turno(ene6));
					}else if (res.equals("2")){
						System.out.println(dave1.turnoitems());
					}
				}else if (tur%2==1){
					System.out.println(dave2.info());
					System.out.println(menu);
					res= leer.next();
					while (res.equals("1")==false && res.equals("2")==false ){
						System.out.println("Ingrese una opcion valida.");
						System.out.println(menu);
						 res= leer.next();
					}
					if(res.equals("1")){
						System.out.println(dave2.turno(ene4));
						System.out.println(dave2.turno(ene5));
						System.out.println(dave2.turno(ene6));
					}else if (res.equals("2")){
						System.out.println(dave2.turnoitems());
					}
				}else{
					System.out.println(ene4.info());
					System.out.println(ene4.turno(dave1));
					System.out.println(ene4.turno(dave2));
					System.out.println("-------------------------------------");
					System.out.println(ene5.info());
					System.out.println(ene5.turno(dave1));
					System.out.println(ene6.turno(dave2));
					System.out.println("-------------------------------------");
					System.out.println(ene6.info());
					System.out.println(ene6.turno(dave1));
					System.out.println(ene6.turno(dave2));
				}
				tur=tur+1;
			}
			/*Ademas se verifica quien ha ganado la batalla y se lleva un contador, luego se reinicia la batalla a una nueva con nuevos enemigos.*/
			if(dave1.getvida()>0 && dave2.getvida()>0){
				System.out.println("Ha ganado la batalla 1");
				gan=gan+1;
			}else{
				System.out.println("Ha perdido la batalla 1");
			}
			
			tur=0;
			/*---------------------------------------------------------------------------------------------------
			Batalla 2
			Dave vs 1 enemigo dificil mas un enemigo facil.*/
			n="      		  BATALLA 2                   ";
			game=("---------------------------------------------\n"         + n           +     "\n---------------------------------------------\n		  ");
					/*Dan la bienvenida nuestros combatietes.*/
			System.out.println(game);
			dave1= new guerrero("Dave");
			dave2= new explorador("Carl");
			ene4= new jefe2();
			ene5= new jefe1();
			ene6= new jefe2();
			
			/*Dan la bienvenida nuestros combatietes.*/
			System.out.println(dave1.bienvenida());
			System.out.println(dave2.bienvenida());
			System.out.println(ene4.bienvenida());
			System.out.println(ene5.bienvenida());
			System.out.println(ene6.bienvenida());
			/*Vamos por turnos*/
			while((dave1.getvida()>0 || dave2.getvida()>0) && (ene4.getvida()>0 || ene6.getvida()>0 || ene5.getvida()>0 )){
				/*Si el turno es del jugador entonces se despliega su infomacion y 
				de igual manera se pide ingresar si desea atacar o un item.
				Por el contrario si el turno es de los enemigos la maquina lo hara 
				aleatoriamente. Si hay mas de un enemigo el jugador ataca a todos.*/
				System.out.println("-------------------------------------");
				if (tur%2==0){
					System.out.println(dave1.info());
					System.out.println(menu);
					res= leer.next();
					while (res.equals("1")==false && res.equals("2")==false ){
						System.out.println("Ingrese una opcion valida.");
						System.out.println(menu);
						 res= leer.next();
					}
					if(res.equals("1")){
						System.out.println(dave1.turno(ene4));
						System.out.println(dave1.turno(ene5));
						System.out.println(dave1.turno(ene6));
					}else if (res.equals("2")){
						System.out.println(dave1.turnoitems());
					}
				}else if (tur%2==1){
					System.out.println(dave2.info());
					System.out.println(menu);
					res= leer.next();
					while (res.equals("1")==false && res.equals("2")==false ){
						System.out.println("Ingrese una opcion valida.");
						System.out.println(menu);
						 res= leer.next();
					}
					if(res.equals("1")){
						System.out.println(dave2.turno(ene4));
						System.out.println(dave2.turno(ene5));
						System.out.println(dave2.turno(ene6));
					}else if (res.equals("2")){
						System.out.println(dave2.turnoitems());
					}
				}else{
					System.out.println(ene4.info());
					System.out.println(ene4.turno(dave1));
					System.out.println(ene4.turno(dave2));
					System.out.println("-------------------------------------");
					System.out.println(ene5.info());
					System.out.println(ene5.turno(dave1));
					System.out.println(ene6.turno(dave2));
					System.out.println("-------------------------------------");
					System.out.println(ene6.info());
					System.out.println(ene6.turno(dave1));
					System.out.println(ene6.turno(dave2));
				}
				tur=tur+1;
			}
			/*Ademas se verifica quien ha ganado la batalla y se lleva un contador, luego se reinicia la batalla a una nueva con nuevos enemigos.*/
			if(dave1.getvida()>0 && dave2.getvida()>0){
				System.out.println("Ha ganado la batalla 2");
				gan=gan+1;
			}else{
				System.out.println("Ha perdido la batalla 2");
			}
			
					tur=0;
			/*---------------------------------------------------------------------------------------------------
			Batalla 3
			Dave vs 3 enemigo dificiles */
			n="      		  BATALLA 3                   ";
			game=("---------------------------------------------\n"         + n           +     "\n---------------------------------------------\n		  ");
			System.out.println(game);
			dave1= new guerrero("Dave");
			dave2= new explorador("Carl");
			ene4= new jefe1();
			ene5= new jefe2();
			ene6= new jefe3();
			
			/*Dan la bienvenida nuestros combatietes.*/
			System.out.println(dave1.bienvenida());
			System.out.println(dave2.bienvenida());
			System.out.println(ene4.bienvenida());
			System.out.println(ene5.bienvenida());
			System.out.println(ene6.bienvenida());
			/*Vamos por turnos*/
			while((dave1.getvida()>0|| dave2.getvida()>0) && (ene4.getvida()>0 || ene6.getvida()>0 || ene5.getvida()>0 )){
							/*Si el turno es del jugador entonces se despliega su infomacion y 
				de igual manera se pide ingresar si desea atacar o un item.
				Por el contrario si el turno es de los enemigos la maquina lo hara 
				aleatoriamente. Si hay mas de un enemigo el jugador ataca a todos.*/
				System.out.println("-------------------------------------");
				if (tur%2==0){
					System.out.println(dave1.info());
					System.out.println(menu);
					res= leer.next();
					while (res.equals("1")==false && res.equals("2")==false ){
						System.out.println("Ingrese una opcion valida.");
						System.out.println(menu);
						 res= leer.next();
					}
					if(res.equals("1")){
						System.out.println(dave1.turno(ene4));
						System.out.println(dave1.turno(ene5));
						System.out.println(dave1.turno(ene6));
					}else if (res.equals("2")){
						System.out.println(dave1.turnoitems());
					}
				}else if (tur%2==1){
					System.out.println(dave2.info());
					System.out.println(menu);
					res= leer.next();
					while (res.equals("1")==false && res.equals("2")==false ){
						System.out.println("Ingrese una opcion valida.");
						System.out.println(menu);
						 res= leer.next();
					}
					if(res.equals("1")){
						System.out.println(dave2.turno(ene4));
						System.out.println(dave2.turno(ene5));
						System.out.println(dave2.turno(ene6));
					}else if (res.equals("2")){
						System.out.println(dave2.turnoitems());
					}
				}else{
					System.out.println(ene4.info());
					System.out.println(ene4.turno(dave1));
					System.out.println(ene4.turno(dave2));
					System.out.println("-------------------------------------");
					System.out.println(ene5.info());
					System.out.println(ene5.turno(dave1));
					System.out.println(ene6.turno(dave2));
					System.out.println("-------------------------------------");
					System.out.println(ene6.info());
					System.out.println(ene6.turno(dave1));
					System.out.println(ene6.turno(dave2));
				}
				tur=tur+1;
			}
			/*Ademas se verifica quien ha ganado la batalla y se lleva un contador, luego se reinicia la batalla a una nueva con nuevos enemigos.*/
			if(dave1.getvida()>0 && dave2.getvida()>0){
				System.out.println("Ha ganado la batalla 3");
				gan=gan+1;
			}else{
				System.out.println("Ha perdido la batalla 3");
			}
			/*Se muestra un mensaje final sobre el juego.*/
			System.out.println("Gracias por jugar. Gano "+ gan + " de 3 batallas.");
		/*MODO VERSUS*/
		}else{
			/*Imprimimos la historia*/
			String n=	"        JUEGO DAVE VS CARL                    ";
			String game=("---------------------------------------------\n"         + n           +     "\n---------------------------------------------\n		  ");
			System.out.println(game);
			String historia=("Nuestro heroe Dave  y Carl se encuentra en un mundo donde deben enfrentarse. El jugador 1 sera Dave y el 2 sera Karl.\n Ahora a pelear.");
			System.out.println(historia);
			
			/*Nuestro contador de turnos Y batallas ganadas.*/
			int gan=0;
			int tur=0;
			
			String menu=("Menu de opciones: \n 1. Atacar \n 2. Item Aleatorio \n Ingrese su respuesta:");
			
			/*---------------------------------------------------------------------------------------------------
			Batalla 1
			Dave vs 1 enemigo facil.*/
			n="      		  BATALLA UNICA                   ";
			game=("---------------------------------------------\n"         + n           +     "\n---------------------------------------------\n		  ");
			System.out.println(game);
			jugador dave1;
			jugador dave2;

			/*Dan la bienvenida nuestros combatietes.*/
			
			dave1= new guerrero("Dave");
			dave2= new explorador("Carl");

			
			/*Dan la bienvenida nuestros combatietes.*/
			System.out.println(dave1.bienvenida());
			System.out.println(dave2.bienvenida());
			/*Vamos por turnos*/
			while((dave1.getvida()>0 && dave2.getvida()>0)){
				/*Si el turno es del jugador entonces se despliega su infomacion y 
				de igual manera se pide ingresar si desea atacar o un item.
				Por el contrario si el turno es de los enemigos la maquina lo hara 
				aleatoriamente. Si hay mas de un enemigo el jugador ataca a todos.*/
				System.out.println("-------------------------------------");
				if (tur%2==0){
					System.out.println(dave1.info());
					System.out.println(menu);
					res= leer.next();
					while (res.equals("1")==false && res.equals("2")==false ){
						System.out.println("Ingrese una opcion valida.");
						System.out.println(menu);
						 res= leer.next();
					}
					if(res.equals("1")){
						System.out.println(dave1.turno(dave2));
					}else if (res.equals("2")){
						System.out.println(dave1.turnoitems());
					}
				}else if (tur%2==1){
					System.out.println(dave2.info());
					System.out.println(menu);
					res= leer.next();
					while (res.equals("1")==false && res.equals("2")==false ){
						System.out.println("Ingrese una opcion valida.");
						System.out.println(menu);
						 res= leer.next();
					}
					if(res.equals("1")){
						System.out.println(dave2.turno(dave1));
					}else if (res.equals("2")){
						System.out.println(dave2.turnoitems());
					}
				}
				tur=tur+1;
			}
			/*Ademas se verifica quien ha ganado la batalla y se lleva un contador, luego se reinicia la batalla a una nueva con nuevos enemigos.*/
			if(dave1.getvida()>0) {
				System.out.println("Ha ganado la batalla Dave: el jugador 1");
				gan=gan+1;
			}else{
				System.out.println("Ha perdido la batalla Carl: el jugador 2");
			}
		}
	}
}