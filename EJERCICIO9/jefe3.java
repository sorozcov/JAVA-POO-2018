/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 071018
  Ejercicio 9
  Archivo jefe3.java*/
 
 /*Importamos el scanner y las librerias necesarias.*/ 
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.util.Random;
import java.util.ArrayList;

/*Clase enemigo3*/ 
public class jefe3 extends enemigo3{
	/*Propiedades
	Son las mismas que para todos los enemigos.*/
	/*Metodos*/
	/*Instancia un nuevo jugador enemigo2.*/
	public jefe3(){
		nombre="AnimalJefe";
		tipo="enemigo3jefe";
		poderataque=5;
		puntosvida=18;
		
	}
	
	/*Accion de emergencia de este enemigo hace que el jugador gane 3 puntos de vida cuando va a morir. Tiene 2 veces la accion d eemergencia*/
	public String accionemergencia(){
		String resp="";
		if(puntosvida<=3 && acc<2){
			puntosvida=puntosvida+2;
			resp="\nAccion de emergencia "+ tipo +" vida enemigo +3";
			acc=acc+1;
		}
		return resp;
	}
	
	/*La habilidad especial le permite aumentar su vida en 4*/
	public String habilidadespecial(jugador jug){
		String resp="\nHabilidad especial de "+tipo;
		puntosvida=puntosvida+4;		
		return resp;
	}
}