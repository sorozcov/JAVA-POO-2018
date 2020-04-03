/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 300918
  Ejercicio8
  Archivo barajadados.java*/
 
/*Importamos el scanner y las librerias necesarias.*/ 
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.util.Random;
import java.util.ArrayList;
 
 /*Clase baraja dados heredada de baraja cartas solo que se cambia la probabilidad a dados.*/
 public class barajadados extends barajacartas{
	 
	/*Metodo*/
	/*Construcutor para instanciar una baraja de 6 posibilidades como si fuera un dado. */
	public barajadados(){
		 this.resetearbaraja();
	 }

	
	/*Se resetea la baraja como que fueran 6 cartas que siempre tienen la misma probabilidad y tienden a ser un dado.*/
	public void resetearbaraja(){
		/*Se resetea una baraja con 6 posibilidades como si fuera un dado.*/
		baraja.clear();
		 for(int x=1; x<=6;x++){
					 carta c = new carta(x);
					 baraja.add(c);
		 }
	}
	
	/*Sacar dado como carta.*/
	public int sacardado(){
		return super.sacarcarta();
	} 
 }