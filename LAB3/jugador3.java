/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 161018
	LAB3
  Archivo jugador.java*/
 
 /*Importamos el scanner y las librerias necesarias.*/ 
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.util.Random;
import java.util.ArrayList;

/*Clase jugador*/ 
public abstract class jugador extends combatiente{
	/*Propiedades
	Son las mismas que para todos los combatiente mas los items.*/
	protected arma tipoarma ;
	protected String nombrearma;
	/*Metodos*/
	/*Instancia un nuevo jugador.*/
	public jugador(String nom){
		nombre=nom;
		tipo="jugador";
		poderataque=6;
		puntosvida=20;
	}
	
	/*Accion de turno atacar .*/
	public String turno(combatiente enem){
		String tur;
		tur=atacar(enem);
		return tur;
	}
	
	/*Accion de turno item .*/
	public abstract String turnoitems();
}