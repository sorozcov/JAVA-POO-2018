/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 281018
  Laboratorio 4
  Archivo gerente.java*/
 
 /*Importamos el scanner y las librerias necesarias.*/ 
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.util.Random;
import java.util.ArrayList;

/*Clase gerente*/ 
public class gerente extends usuario implements administrador{
	/*Propiedades
	Son las mismas que para todos los usuarios.*/
	protected String departamento;
	
	/*Metodos*/
	/*Instancia un nuevo empleado con las propiedades necesarias.*/
	public gerente(String nom,String id, String depar){
		nombre=nom;
		tipo="Gerente";
		ID=id;
		departamento=depar;
		menu=menu+tipo+op1+op2+op3+op4+op5;
	}
	/*Fichado si falla el reto tres veces*/ 
	public String fichado(){
		String fich;
		fich="Usted ha sido fichado por fallar su reto tres veces.";
		fich=(fich+"\n Nombre:" +nombre +"\n ID:" +ID+"\n Departamento:" +departamento);  
		return fich;
	}
	/*Muestra el reto*/ 
	public String reto(){
		String r="Su reto es acertar la contraseña de 4 digitos mas sencilla de todas.";
		return r;
	}
	/*Verifica si el reto fue acertado o no.*/ 
	public boolean retoacertado(String valor){
		boolean reto=false;
		if(valor.equals("1234")){
			reto=true;
		}
		return reto;
	}
	
	public boolean modificarDatos(int pos){
		boolean mod=false;
		mod=true;
		return mod;
	}
	
	public boolean consultarDatos(int pos){
		boolean mod=false;
		mod=true;
		return mod;
	}

	
}