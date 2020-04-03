/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 071018
  Ejercicio 9
  Archivo enemigo2.java*/
 
 /*Importamos el scanner y las librerias necesarias.*/ 
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.util.Random;
import java.util.ArrayList;

/*Clase enemigo2*/ 
public class enemigo2 extends enemigo{
	/*Propiedades
	Son las mismas que para todos los enemigos.*/
	/*Metodos*/
	/*Instancia un nuevo jugador enemigo2.*/
	public enemigo2(){
		nombre="Fantasma";
		tipo="enemigo2";
		poderataque=4;
		puntosvida=10;
		
	}
	
	/*Accion de emergencia de este enemigo hace que el jugador gane 8 puntos de ataque cuando va a morir.*/
	public String accionemergencia(){
		String resp="";
		if(puntosvida<=5 && acc!=1){
			poderataque=poderataque+8;
			resp="\nAccion de emergencia "+ tipo +" activada vida jugador -3";
			acc=1;
		}
		return resp;
	}
	
	/*La habilidad especial le permite  perder un punto de vida pero su poder de ataque aumenta en 1*/
	public String habilidadespecial(jugador jug){
		String resp="\nHabilidad especial de "+tipo;
		jug.puntosmenos(poderataque+1);
		puntosvida=puntosvida-1;		
		return resp;
	}
	
}