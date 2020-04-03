/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 071018
  Ejercicio 9
  Archivo enemigo3.java*/
 
 /*Importamos el scanner y las librerias necesarias.*/ 
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.util.Random;
import java.util.ArrayList;

/*Clase enemigo3*/ 
public class enemigo3 extends enemigo{
	/*Propiedades
	Son las mismas que para todos los enemigos.*/
	/*Metodos*/
	/*Instancia un nuevo jugador enemigo2.*/
	public enemigo3(){
		nombre="Animal";
		tipo="enemigo3";
		poderataque=3;
		puntosvida=15;
		
	}
	
	/*Accion de emergencia de este enemigo hace que el jugador gane 3 puntos de vida cuando va a morir.*/
	public String accionemergencia(){
		String resp="";
		if(puntosvida<=5 && acc!=1){
			puntosvida=puntosvida+3;
			resp="\nAccion de emergencia "+ tipo +"activada vida enemigo +3";
			acc=1;
		}
		return resp;
	}
	
	/*La habilidad especial le permite aumentar su vida en 3*/
	public String habilidadespecial(jugador jug){
		String resp="\nHabilidad especial de "+tipo;
		puntosvida=puntosvida+3;		
		return resp;
	}
	
}