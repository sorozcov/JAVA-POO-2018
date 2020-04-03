/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 071018
  Ejercicio 9
  Archivo jefe1.java*/
 
 /*Importamos el scanner y las librerias necesarias.*/ 
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.util.Random;
import java.util.ArrayList;

/*Clase enemigo3*/ 
public class jefe1 extends enemigo1{
	/*Propiedades
	Son las mismas que para todos los enemigos.*/
	/*Metodos*/
	/*Instancia un nuevo jugador jefe 1.*/
	public jefe1(){
		nombre="EsqueletoJefe";
		tipo="enemigo3jefe";
		poderataque=4;
		puntosvida=20;
		
	}
	

	/*La habilidad especial le permite  ganar un punto de vida pero su poder y ataca al mismo tiempo con 1 menos.*/
	public String habilidadespecial(jugador jug){
		String resp="\nHabilidad especial de "+tipo;
		jug.puntosmenos(poderataque-1);
		puntosvida=puntosvida+1;		
		return resp;
	}
	
}