/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 161018
  LAB3
  Archivo guerrero.java*/
 
 /*Importamos el scanner y las librerias necesarias.*/ 
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.util.Random;
import java.util.ArrayList;

/*Clase guerrero*/ 
public class guerrero extends jugador{
	/*Propiedades
	Son las mismas que para todos los combatiente mas los items.*/
	/*Metodos*/
	/*Instancia un nuevo jugador.*/
	public guerrero(String nom){
		super(nom);
		tipo="jugador guerrero";
		poderataque=10;
		puntosvida=20;
		tipoarma= new altoimpacto();
	}
	
	/*Accion de emergencia de un guerrero*/
	public String accionemergencia(){
		String resp="";
		if(puntosvida<=5 && acc!=1){
			puntosvida=puntosvida+10;
			resp="\nAccion de emergencia "+ tipo +"activada vida +10";
			acc=1;
		}
		return resp;
	}
	
	
	/*Accion de turno item .*/
	public String turnoitems(){
		String tur;
		int a = randint(1,4);
			/*Dara un item random de 1 a 5.*/
			if(a==1){
				tur="\nHa sacado un item 1 su poder de ataque ha aumentado en 2";
				poderataque=poderataque+2;
			}else if(a==2){
				tur="\nHa sacado un item 2 su vida ha aumentado en 2";
				puntosvida=puntosvida+2;
			}
			else{
				tur="\nHa sacado un item vacio.";
			}
		return tur;
	}
}
