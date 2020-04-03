/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 090918
  Laboratorio 2
  Archivo jugador.java*/
  
 /*Importamos el scanner y las librerias necesarias.*/ 
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.util.Random;
import java.util.ArrayList;

 /*Clase jugador*/
public class jugador{
	 /*Propiedades
	 El nombre y el color que utilizara.*/
	String color;
	String nombre;
	int turno;
	String tipo;
	int cartassorry=0;
	
	 /*Metodos.*/
	 /*Instanciar un nuevo jugador*/
	public jugador(String nom, int tur,String tip){
		nombre=nom;
		turno=tur;
		tipo=tip;
		if(turno==1){
			color="Negro";
		}else if(turno==2){
			color="Rojo";
		}else if(turno==3){
			color="Verde";
		}else if(turno==4){
			color="Azul";
		} 
	 }
	 
	/*Ver info del jugador*/ 
	public String verjugador(){
		 String jug;
		 jug="Turno Jugador "+turno+ ":\n\tNombre: "+nombre + "\n\tColor: "+color+"\n\tCartas Sorry: "+cartassorry;
		 return jug;
	 }
	 
	/*Ver cuantas cartas sorry tiene.*/ 
	public int getcartassorry(){
		 return cartassorry;
	 }
	
	/*Sumar una carta sorry.*/
	public void cartassorry(){
		 cartassorry++;
	 }
	
	/*Restar una carta sorry.*/	
	public void mcartassorry(){
		cartassorry--;
	}
	
	/*Ver si gano.*/	
	public String gano(){
		 String gan;
		 gan=(nombre+ "ha ganado el juego. Felicidades.");
		 return gan;
	 }
	
	/*Ver tipo.*/	
	public String gettipo(){
		return tipo;
	}
}