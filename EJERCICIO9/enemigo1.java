/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 071018
  Ejercicio 9
  Archivo enemigo1.java*/
 
 /*Importamos el scanner y las librerias necesarias.*/ 
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.util.Random;
import java.util.ArrayList;

/*Clase enemigo1*/ 
public class enemigo1 extends enemigo{
	/*Propiedades
	Son las mismas que para todos los enemigos.*/
	/*Metodos*/
	/*Instancia un nuevo jugador.*/
	public  enemigo1(){
		nombre="Esqueleto";
		tipo="enemigo1";
		poderataque=3;
		puntosvida=12;
		
	}
	
	/*Accion de emergencia de este enemigo subre su vida en 5 cuando va a morir.*/
	public String accionemergencia(){
		String resp="";
		if(puntosvida<=5 && acc!=1){
			puntosvida=puntosvida+5;
			resp="\nAccion de emergencia "+ tipo +" activada vida +5";
			acc=1;
		}
		return resp;
	}
	
	/*La habilidad especial le permite  ganar un punto de vida pero su poder de ataque se reduce a 1.*/
	public String habilidadespecial(jugador jug){
		String resp="\nHabilidad especial de "+tipo;
		jug.puntosmenos(poderataque-2);
		puntosvida=puntosvida+1;		
		return resp;
	}
	
}
