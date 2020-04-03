/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 071018
  Ejercicio 9
  Archivo enemigo.java*/
 
 /*Importamos el scanner y las librerias necesarias.*/ 
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.util.Random;
import java.util.ArrayList;

/*Clase enemigo*/ 
public abstract class enemigo extends combatiente{
	/*Propiedades
	Son las mismas que para todos los combatiente.*/

	/*Metodos*/
	/*Instancia un nuevo jugador.*/
	public enemigo(){
		
	}
	
	/*Accion de turno.*/
	public String turno(jugador jug){
		int a= randint(1,2);
		String resp="";
		resp=resp+accionemergencia();
		if (a==1){
			resp=atacar(jug);
		}else{
			resp=habilidadespecial(jug);
		}
		return resp;
	}
	/*Accion de habilidad especial.*/
	public abstract String habilidadespecial(jugador jug);
}	
	
	