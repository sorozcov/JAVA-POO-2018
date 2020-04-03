/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 071018
  Ejercicio 9
  Archivo combatiente.java*/
 
 /*Importamos el scanner y las librerias necesarias.*/ 
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.util.Random;
import java.util.ArrayList;

/*Clase combatiente*/ 
public abstract class combatiente{
	/*Propiedades
	Todas ellas son protected al ser parte de un tipo de herencia y que a su vez son para una clase abstracta.
	Estas permitiran darle nombre al combatiente, puntos de vida y poder de ataque.*/
	protected String nombre;
	protected String tipo;
	protected int puntosvida;
	protected int poderataque;
	protected int acc=0;
	/*Metodos*/
	/*Instancia un nuevo combatiente para el juego.*/
	public combatiente(){
		
	}
	
	/*Devuelve el nombre*/
	public String getnombre(){
		return nombre;
	}
	
	/*Devuelve la vida*/
	public int getvida(){
		return puntosvida;
	}
	/*Devuelve la info de un combatiente.*/
	public String info(){
		String inf;
		inf=("Nombre "+ nombre +"\n"+"Puntos de vida "+ puntosvida +"\n"+"Ataque "+ poderataque +"\n");
		return inf;
	}
	
	/*Ataca a otro combatiente.*/
	public String atacar(combatiente combatacar){
		String resp;
		resp=(getnombre()+" ha atacado a "+ combatacar.getnombre());
		resp=resp+combatacar.puntosmenos(poderataque);
		return resp;
	}
	
	/*Resta puntos si el oponente fue atacado.*/
	public String puntosmenos(int ataque){
		String resp="";
		puntosvida=puntosvida-ataque;
		if (puntosvida<=0){
			resp=resp+muerte();
		}
		return resp;
	}
	
	/*Despliega un mensaje si ha muerto.*/
	public String muerte(){
		String resp= (".\n"+ getnombre() +" ha muerto. Adios Mundo Cruel.");
		return resp;
	}
	
	/*Despliega un mensaje de bienvenida.*/
	public String bienvenida(){
		String resp= ("El "+ tipo + " llamdo "+ nombre + " ha comenzado su vida con ataque " +poderataque+ " y vida "+ puntosvida+". Hola Mundo.");
		return resp;
	}
	
	/*Metodo que genera numeros aleatoriamentre entre un valor maximo y minimo.*/
	public static int randint(int min, int max) {
		Random rand = new Random();
		int numerorandom = rand.nextInt((max - min) + 1) + min;
		return numerorandom;
	}
	
	
	/*Metodos abstractos de accion de emergencia y turno que seran diferentes para el jugador o para el enemigo.*/
	public abstract String accionemergencia();
}
