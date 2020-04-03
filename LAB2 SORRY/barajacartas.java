/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 090918
  Laboratorio 2
  Archivo baraja.java*/
 
/*Importamos el scanner y las librerias necesarias.*/ 
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.util.Random;
import java.util.ArrayList;
 
 /*Clase baraja.*/
 public class barajacartas{
	 ArrayList<carta> baraja = new ArrayList<carta> ();
	/*Metodo*/
	/*Construcutor para instanciar una baraja de 45 cartas. */
	public barajacartas(){
		 resetearbaraja();
	 }
	
	/*Metodo que genera numeros aleatoriamentre entre un valor maximo y minimo.*/
	public static int randint(int min, int max) {
		Random rand = new Random();
		int numerorandom = rand.nextInt((max - min) + 1) + min;
		return numerorandom;
	}
	
	/*Se resetea la baraja de 45 cartas iniciales. Esto al inicio y cuando el numero de cartas sea 0.*/
	public void resetearbaraja(){
		/*Se resetea una baraja con 5 unos y 4 de todas las demas cartas.*/
		 for(int x=1; x<=13;x++){
			 if(x==6 || x==9){
				 continue;
			 }else if (x==1){
				 for (int y=0;y<5;y++){
					 carta c = new carta(x);
					 baraja.add(c);
				 }
			 }else{
				 for (int y=0;y<4;y++){
					 carta c = new carta(x);
					 baraja.add(c);
				 }				 
			 }
		 }
	}
	
	 /*Sacar una carta de la baraja y asignarla a un jugador.*/
	public int sacarcarta(){
		int numero=0;
		if (baraja.size()>0){
			int sacar= randint(0,baraja.size()-1);
			carta card= baraja.get(sacar);
			numero=(card.getnumero());
			baraja.remove(sacar);
		}else{
			resetearbaraja();
			sacarcarta();
		}
		return numero;
	 }
	 
 }