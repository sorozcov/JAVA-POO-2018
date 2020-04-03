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
		/*Imprimimos la historia*/
		String n=	"        	JUEGO DAVE VS MUNDO                    ";
		String game=("---------------------------------------------\n"         + n           +     "\n---------------------------------------------\n		  ");
		System.out.println(game);
		String historia=("Nuestro heroe Dave se encuentra en un mundo lleno de enemigos y necesita que lo controles para vencerlo.");
		historia=historia+("\nPara ello tendras 3 batallas que debes jugar para ganar el juego.");
		System.out.println(historia);
		
		/*Nuestro contador de turnos Y batallas ganadas.*/
		int gan=0;
		int tur=0;
		String res;
		String menu=("Menu de opciones: \n 1. Atacar \n 2. Item Aleatorio \n Ingrese su respuesta:");
		
		/*---------------------------------------------------------------------------------------------------
		Batalla 1
		Dave vs 1 enemigo facil.*/
		n="      		  BATALLA 1                   ";
		game=("---------------------------------------------\n"         + n           +     "\n---------------------------------------------\n		  ");
		System.out.println(game);
		jugador dave1= new jugador();
		enemigo1 ene1= new enemigo1();
		/*Dan la bienvenida nuestros combatietes.*/
		System.out.println(dave1.bienvenida());
		System.out.println(ene1.bienvenida());
		/*Vamos por turnos*/
		while(dave1.getvida()>0 && ene1.getvida()>0){
			System.out.println("-------------------------------------");
			/*Si el turno es del jugador entonces se despliega su infomacion y de igual manera se pide ingresar si desea atacar o un item.
			Por el contrario si el turno es de los enemigos la maquina lo hara aleatoriamente. Si hay mas de un enemigo el jugador ataca a todos.*/
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
					System.out.println(dave1.turno(ene1));
				}else if (res.equals("2")){
					System.out.println(dave1.turnoitems());
				}
			}else{
				System.out.println(ene1.info());
				System.out.println(ene1.turno(dave1));
			}
			tur=tur+1;
		}
		/*Ademas se verifica quien ha ganado la batalla y se lleva un contador, luego se reinicia la batalla a una nueva con nuevos enemigos.*/
		if(dave1.getvida()>0){
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
		System.out.println(game);
		dave1= new jugador();
		jefe2 ene2= new jefe2();
		enemigo3 ene3= new enemigo3(); 
		/*Dan la bienvenida nuestros combatietes.*/
		System.out.println(dave1.bienvenida());
		System.out.println(ene2.bienvenida());
		System.out.println(ene3.bienvenida());
		/*Vamos por turnos*/
		while(dave1.getvida()>0 && (ene2.getvida()>0 || ene3.getvida()>0 )){
			System.out.println("-------------------------------------");
			/*Si el turno es del jugador entonces se despliega su infomacion y 
			de igual manera se pide ingresar si desea atacar o un item.
			Por el contrario si el turno es de los enemigos la maquina lo hara 
			aleatoriamente. Si hay mas de un enemigo el jugador ataca a todos.*/
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
					System.out.println(dave1.turno(ene2));
					System.out.println(dave1.turno(ene3));
				}else if (res.equals("2")){
					System.out.println(dave1.turnoitems());
				}
			}else{
				System.out.println(ene2.info());
				System.out.println(ene2.turno(dave1));
				System.out.println("-------------------------------------");
				System.out.println(ene3.info());
				System.out.println(ene3.turno(dave1));
			}
			tur=tur+1;
		}
		/*Ademas se verifica quien ha ganado la batalla y se lleva un contador, luego se reinicia la batalla a una nueva con nuevos enemigos.*/
		if(dave1.getvida()>0){
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
		dave1= new jugador();
		jefe1 ene4= new jefe1();
		jefe2 ene5= new jefe2();
		jefe3 ene6= new jefe3();
		
		/*Dan la bienvenida nuestros combatietes.*/
		System.out.println(dave1.bienvenida());
		System.out.println(ene4.bienvenida());
		System.out.println(ene5.bienvenida());
		System.out.println(ene6.bienvenida());
		/*Vamos por turnos*/
		while(dave1.getvida()>0 && (ene4.getvida()>0 || ene6.getvida()>0 || ene5.getvida()>0 )){
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
			}else{
				System.out.println(ene4.info());
				System.out.println(ene4.turno(dave1));
				System.out.println("-------------------------------------");
				System.out.println(ene5.info());
				System.out.println(ene5.turno(dave1));
				System.out.println("-------------------------------------");
				System.out.println(ene6.info());
				System.out.println(ene6.turno(dave1));
			}
			tur=tur+1;
		}
		/*Ademas se verifica quien ha ganado la batalla y se lleva un contador, luego se reinicia la batalla a una nueva con nuevos enemigos.*/
		if(dave1.getvida()>0){
			System.out.println("Ha ganado la batalla 3");
			gan=gan+1;
		}else{
			System.out.println("Ha perdido la batalla 3");
		}
		/*Se muestra un mensaje final sobre el juego.*/
		System.out.println("Gracias por jugar. Gano "+ gan + " de 3 batallas.");
		
	}
}