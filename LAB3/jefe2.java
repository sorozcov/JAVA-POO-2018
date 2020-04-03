/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 071018
  Ejercicio 9
  Archivo jefe2.java*/
 
 /*Importamos el scanner y las librerias necesarias.*/ 
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.util.Random;
import java.util.ArrayList;

/*Clase jefe2*/ 
public class jefe2 extends enemigo2{
	/*Propiedades
	Son las mismas que para todos los enemigos.*/
	/*Metodos*/
	/*Instancia un nuevo jugador jefe2.*/
	public jefe2(){
		nombre="FantasmaJefe";
		tipo="enemigo2jefe";
		poderataque=6;
		puntosvida=15;
		
	}
	
	/*Accion de emergencia de este enemigo hace que el jugador gane 8 puntos de ataque cuando va a morir.*/
	public String accionemergencia(){
		String resp="";
		if(puntosvida<=3 && acc!=1){
			poderataque=poderataque+8;
			resp="\nAccion de emergencia "+ tipo +"activada vida jugador poder de ataque+8";
			acc=1;
		}
		return resp;
	}
	
	/*La habilidad especial le permite  perder un punto de vida pero su poder de ataque aumenta en 3*/
	public String habilidadespecial(jugador jug){
		String resp="\nHabilidad especial de "+tipo;
		poderataque=poderataque+3;		
		return resp;
	}
	
}