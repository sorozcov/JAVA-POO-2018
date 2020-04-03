/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 090918
  Laboratorio 2
  Archivo carta.java*/

/*Importamos el scanner y las librerias necesarias.*/ 
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.util.Random;
import java.util.ArrayList;
  
 /*Clase carta*/
 public class carta{
	 /*Propiedades:
	 La unica propiedad que tiene es el numero de carta.*/
	 private int numero;
	 
	 /*Metodos.*/
	 /*Instanciar una nueva carta.*/
	 public carta(int num){
		 /*Asigna valor a la carta al ser creada*/
		 numero=num;
	 }
	 
	 /*Obtiene el valor de la carta para la baraja..*/
	 public int getnumero(){
		 /*Regresa el valor del numero de la carta.*/
		 return numero;
	 }
	 
	 /*Obtiene informacion de la carta.*/
	 public String infocarta(){
		int num=numero;
		String instruccion;
		/*Segun el numero de carta de informacion sobre la misma.*/
		switch(num){
			case 1:
				instruccion="1: puedes mover un peón desde el inicio o avanzar 1 espacio.";
				break;
			case 2:
				instruccion="2: puedes mover un peón desde el inicio o avanzar dos espacios. Debes extraer otra tarjeta.";
				break;
			case 3:
				instruccion="3: avanza 3 espacios.";
				break;	
			case 4:
				instruccion="4: retrocede 4 espacios.";
				break;	
			case 5:
				instruccion="5: avanza 5 espacios.";
				break;	
			case 7:
				instruccion="7: avanza 7 espacios o divídelos entre 2 peones (por ejemplo, 3 espacios para un peón y 4 espacios para el otro).";
				break;	
			case 8:
				instruccion="8: avanza 8 espacios.";
				break;	
			case 10:
				instruccion="10: avanza 10 espacios o retrocede 1 espacio.";
				break;		
			case 11:
				instruccion="11: avanza 11 espacios";
				break;		
			case 12:
				instruccion="12: avanza 12 espacios.";
				break;	
			case 13:
				instruccion="Sorry!: puedes guardar esta tarjeta para usarla después o puedes usarla para enviar el peón de un oponente a INICIO.";
				break;	
			default:
				instruccion="Este numero de carta no existe.";
				break;	
		}
		return instruccion;
	 }
	 
	 
	 
 }
 
  