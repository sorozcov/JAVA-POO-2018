/*Silvio Orozco Vizquerra
  Carne 18282
  Fecha 090918
  Laboratorio 2
  Archivo tablero.java*/
 
 /*Importamos el scanner y las librerias necesarias.*/ 
import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.util.Random;
import java.util.ArrayList;

/*Clase tablero propio heredado.
El cambio con esta version del juego es que si el turno es impar este se mueve de distinta manera al reves del juego.*/ 
public class tableropropio extends tableroj{
	/*Hereda todas los metodos y propiedades de tableroj.
	Solo el conscttor no se hereda.*/
	public tableropropio(){
		super();
	}
	
	/*Hereda todas los metodos y propiedades de tableroj.
	Solo el constructor no se hereda.
	Si su turno es impar se mueve al revez.*/
	public void mover(String peon, int movs, int turno){
		if ((turno%2)==0){
			super.mover(peon,movs);
		}else{
			moveralrevez(peon, movs);
		}		
	}
	
	/*Su propio mover al revez. */
	public void moveralrevez(String peon, int movs){
				int corx=0;
		int cory=0;
		int mov=movs;
		/*Primero se encuentra la posicion.*/
		for (int x=0;x<tablero.length;x++){
			for(int y=0;y<tablero[x].length;y++){
				if (tablero[x][y].equals(peon)){
		            if ((x==2||x==3 ||x==4||x==5 )&&(y==4)){
						corx=1;
						cory=3;
						
					}else if((y==11||y==12 ||y==13||y==14 )&&(x==4)){
						corx=3;
						cory=15;
						
					}else if ((x==11||x==12 ||x==13||x==14 )&&(y==12)){
						corx=15;
						cory=13;
						
					}else if((y==2||y==3 ||y==4||y==5 )&&(x==12)){
						corx=13;
						cory=1;
						
					}else{
						corx=x;
						cory=y;
					}
					tablero[x][y]="0  ";
					break;
				}
			}		
		}
		/*Se crea un bool entra para ver si ya dio la vuelta completa.*/
		boolean entra=false;
		while(movs>0){					
								/*Para moverse hacia la izquierda*/
								while (movs>0 && corx==1 &&cory!=1){
									if(cory-movs<1){
										movs=movs-cory+1;
										cory=1;
									}else{
										corx=corx;
										if ((peon.equals("N1 ") || peon.equals("N2 ")|| peon.equals("N3 ")|| peon.equals("N4 "))&& (cory-movs<4)&&(cory>3)&&(mov!=4)){
											if(peon.equals("N1 ")){
												tablero[2][3]=peon;
											}else if(peon.equals("N2 ")){
												tablero[3][3]=peon;
											}else if(peon.equals("N3 ")){
												tablero[4][3]=peon;
											}else if(peon.equals("N4 ")){
												tablero[5][3]=peon;
											}
											entra=true;
											movs=0;
										}else{
											cory=cory-movs;
											movs=0;
										}
								    }
								}
								/*Para moverse hacia arriba*/
								while (movs>0&& corx!=1 &&cory==15){
									if(corx-movs<1){
										movs=movs-corx+1;
										corx=1;
									}else{
										cory=cory;
										if ((peon.equals("R1 ") || peon.equals("R2 ")|| peon.equals("R3 ")|| peon.equals("R4 "))&& (corx-movs<4)&&(corx>3)&&(mov!=4)){
											if(peon.equals("R1 ")){
												tablero[3][14]=peon;
											}else if(peon.equals("R2 ")){
												tablero[3][13]=peon;
											}else if(peon.equals("R3 ")){
												tablero[3][12]=peon;
											}else if(peon.equals("R4 ")){
												tablero[3][11]=peon;
											}
											entra=true;
											movs=0;
										}else{
											corx=corx-movs;
											movs=0;
										}
									}
								}
								
								/*Para moverse hacia la derecha*/
								while (movs>0 && corx==15 &&cory!=15){
									if(cory+movs>15){
										movs=movs+cory-15;
										cory=1;
									}else{
										corx=corx;
										if ((peon.equals("V1 ") || peon.equals("V2 ")|| peon.equals("V3 ")|| peon.equals("V4 "))&& (cory+movs>12)&&(cory<13)&&(mov!=4)){
											if(peon.equals("V1 ")){
												tablero[14][13]=peon;
											}else if(peon.equals("V2 ")){
												tablero[13][13]=peon;
											}else if(peon.equals("V3 ")){
												tablero[12][13]=peon;
											}else if(peon.equals("V4 ")){
												tablero[11][13]=peon;
											}
											entra=true;
											movs=0;
										}else{
											cory=cory+movs;
											movs=0;
										}
									}
								}
								
								/*Para moverse hacia abajo.*/
								while (movs>0 && corx!=15 &&cory==1){
									if(corx+movs>15){
										movs=movs+corx-15;
										corx=15;
									}else{
										cory=cory;
										if ((peon.equals("A1 ") || peon.equals("A2 ")|| peon.equals("A3 ")|| peon.equals("A4 "))&& (corx+movs>12)&&(corx<13)&&(mov!=4)){
											if(peon.equals("A1 ")){
												tablero[13][2]=peon;
											}else if(peon.equals("A2 ")){
												tablero[13][3]=peon;
											}else if(peon.equals("A3 ")){
												tablero[13][4]=peon;
											}else if(peon.equals("A4 ")){
												tablero[13][5]=peon;
											}
											entra=true;
											movs=0;
										}else{
											corx=corx+movs;
											movs=0;
										}
									}
								}
		}
		/*Slide*/
		if(tablero[1][2]==peon || tablero[1][10]==peon || tablero[2][15]==peon || tablero[10][15]==peon || tablero[15][14]==peon || tablero[15][6]==peon || tablero[14][1]==peon || tablero[6][1]==peon){
				slide(peon);
			} 
		
		/*Si no entra, se actualiza el tablero.*/
		if (entra==false){
			String ant=tablero[corx][cory];
			if((peon.substring(0,1)).equals(ant.substring(0,1))){
				tablero[corx][cory]=peon; 
				moveruno(corx,cory,ant,peon);
			}else if (ant.equals("0  ")){
				tablero[corx][cory]=peon; 
			}else{
				enviarc(ant);
				tablero[corx][cory]=peon;
			}
		}
	}
}