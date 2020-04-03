/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 071018
  Ejercicio 9
  Archivo explorador.java*/
 
 /*Importamos el scanner y las librerias necesarias.*/ 
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.util.Random;
import java.util.ArrayList;

/*Clase explorador*/ 
public class explorador extends jugador{
	/*Propiedades
	Son las mismas que para todos los combatiente mas los items.*/
	/*Metodos*/
	/*Instancia un nuevo jugador.*/
	public explorador(String nom){
		super(nom);
		tipo="jugador explorador";
		tipoarma= new bomba();
	}
	
	/*Accion de emergencia de un guerrero*/
	public String accionemergencia(){
		String resp="";
		if(puntosvida<=5 && acc!=1){
			puntosvida=puntosvida+15;
			resp="\nAccion de emergencia "+ tipo +"activada vida +15";
			acc=1;
		}
		return resp;
	}
	

	
	/*Accion de turno item .*/
	public String turnoitems(){
		String tur;
		int a = randint(1,6);
			/*Dara un item random de 1 a 5.*/
			if(a==1){
				tur="\nHa sacado un item 1 su poder de ataque ha aumentado en 4";
				poderataque=poderataque+4;
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
			}else if(a==4){
				tur="\nHa sacado un item 1 su poder de ataque ha aumentado en 2";
				poderataque=poderataque+2;
			}else if(a==5){
				tur="\nHa sacado un item 2 su vida ha aumentado en 2";
				puntosvida=puntosvida+2;
			}else{
				tur="\nHa sacado un item vacio.";
			}
		return tur;
	}
}