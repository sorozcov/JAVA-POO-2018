/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 071018
  Ejercicio 9
  Archivo jugador.java*/
 
 /*Importamos el scanner y las librerias necesarias.*/ 
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.util.Random;
import java.util.ArrayList;

/*Clase jugador*/ 
public class jugador extends combatiente{
	/*Propiedades
	Son las mismas que para todos los combatiente mas los items.*/
	/*Metodos*/
	/*Instancia un nuevo jugador.*/
	public jugador(){
		nombre="Dave";
		tipo="jugador";
		poderataque=6;
		puntosvida=20;
	}
	
	/*Accion de emergencia de un jugador.*/
	public String accionemergencia(){
		String resp="";
		if(puntosvida<=5 && acc!=1){
			puntosvida=puntosvida+15;
			resp="\nAccion de emergencia "+ tipo +"activada vida +15";
			acc=1;
		}
		return resp;
	}
	
	/*Accion de turno atacar .*/
	public String turno(enemigo enem){
		String tur;
		tur=atacar(enem);
		return tur;
	}
	
	/*Accion de turno item .*/
	public String turnoitems(){
		String tur;
		int a = randint(1,5);
			/*Dara un item random de 1 a 5.*/
			if(a==1){
				tur="\nHa sacado un item 1 su poder de ataque ha aumentado en 3";
				poderataque=poderataque+3;
			}else if(a==2){
				tur="\nHa sacado un item 2 su vida ha aumentado en 4";
				puntosvida=puntosvida+4;
			}else if (a==3){
				tur="\nHa sacado un item 3 su vida ha aumentado en 7 pero su poder de ataque se ha reducido en 2";
				if (poderataque-2<1){
					poderataque=1;
				}else{
					poderataque=poderataque-2;
				}
				puntosvida=puntosvida+7;
			}else{
				tur="\nHa sacado un item vacio.";
			}
		return tur;
	}
}
