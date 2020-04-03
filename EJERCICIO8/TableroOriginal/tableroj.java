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

/*Clase tablero*/ 
public class tableroj{
	/*Propiedades
	Una de ellas es el string tablero que muestra el estado del tablero.*/
	protected String[][] tablero = new String [17][17];
	/*Metodos*/
	/*Instancia un nuevo tablero para el juego.*/
	public tableroj(){	
		for (int x=0;x<tablero.length;x++){
			for(int y=0;y<tablero[x].length;y++){
				if(x==0 || x==16){
					/*Bordes*/
					tablero[x][y]=("-  ");
				}else if(y==0 || y==16){
					/*Bordes*/
					tablero[x][y]=("-  ");
				}else if(x==1 || x==15){
					/*Tablero general*/
					tablero[x][y]=("0  ");
				}else if(y==1 || y==15){
					/*Tablero general*/
					tablero[x][y]=("0  ");
				}else if(x==13 && (y==2 || y==3 || y==4 || y==5 || y==6)){
					/*Safe Azul*/
					if (y==6){
						tablero[x][y]=("AH ");
					}else{
						tablero[x][y]=("S  ");
					}
				}else if(x==12 && (y==2 || y==3 || y==4 || y==5)){
					/*Color Azul*/
					tablero[x][2]=("A1 ");
					tablero[x][3]=("A2 ");
					tablero[x][4]=("A3 ");
					tablero[x][5]=("A4 ");
				}else if(x==3 && (y==10||y==11 || y==12 || y==13 || y==14)){
					/*Safe Rojo*/
					if (y==10){
						tablero[x][y]=("RH ");
					}else{
						tablero[x][y]=("S  ");
					}
				}else if(x==4 && (y==11 || y==12 || y==13 || y==14)){
					/*Color Rojo*/
					tablero[x][14]=("R1 ");
					tablero[x][13]=("R2 ");
					tablero[x][12]=("R3 ");
					tablero[x][11]=("R4 ");
				}else if(y==13 && (x==10||x==11 || x==12 || x==13 || x==14)){
					/*Safe Verde*/
					if (x==10){
						tablero[x][y]=("VH ");
					}else{
						tablero[x][y]=("S  ");
					}
				}else if(y==12 && (x==11 || x==12 || x==13 || x==14)){
					/*Color Verde*/
					tablero[14][y]=("V1 ");
					tablero[13][y]=("V2 ");
					tablero[12][y]=("V3 ");
					tablero[11][y]=("V4 ");
				}else if(y==3 && (x==2 || x==3 || x==4 || x==5 || x==6)){
					/*Safe Negro*/
					if (x==6){
						tablero[x][y]=("NH ");
					}else{
						tablero[x][y]=("S  ");
					}
				}else if(y==4 && (x==2 || x==3 || x==4 || x==5)){
					/*Color Negro*/
					tablero[2][y]=("N1 ");
					tablero[3][y]=("N2 ");
					tablero[4][y]=("N3 ");
					tablero[5][y]=("N4 ");
				}else if(x==8 && y==6){
					/*Juego SORRY S*/
					tablero[x][y]=("S  ");
				}else if(x==8 && y==7){
					/*Juego SORRY O*/
					tablero[x][y]=("O  ");
				}else if(x==8 && y==8){
					/*Juego SORRY R*/
					tablero[x][y]=("R  ");
				}else if(x==8 && y==9){
					/*Juego SORRY R*/
					tablero[x][y]=("R  ");
				}else if(x==8 && y==10){
					/*Juego SORRY S*/
					tablero[x][y]=("Y  ");
				}else{
					tablero[x][y]=("   ");
				}
			}
		/*Slide 1/8 */	
		tablero[0][2]="S  ";
		tablero[0][3]="L  ";
		tablero[0][4]="I  ";
		tablero[0][5]="D  ";
		tablero[0][6]="E  ";
		/*Slide 2/8 */	
		tablero[0][10]="S  ";
		tablero[0][11]="L  ";
		tablero[0][12]="I  ";
		tablero[0][13]="D  ";
		tablero[0][14]="E  ";
		/*Slide 3/8 */	
		tablero[2][16]="S  ";
		tablero[3][16]="L  ";
		tablero[4][16]="I  ";
		tablero[5][16]="D  ";
		tablero[6][16]="E  ";
		/*Slide 4/8 */	
		tablero[10][16]="S  ";
		tablero[11][16]="L  ";
		tablero[12][16]="I  ";
		tablero[13][16]="D  ";
		tablero[14][16]="E  ";
		/*Slide 5/8 */	
		tablero[16][2]="S  ";
		tablero[16][3]="L  ";
		tablero[16][4]="I  ";
		tablero[16][5]="D  ";
		tablero[16][6]="E  ";
		/*Slide 6/8 */	
		tablero[16][10]="S  ";
		tablero[16][11]="L  ";
		tablero[16][12]="I  ";
		tablero[16][13]="D  ";
		tablero[16][14]="E  ";
		/*Slide 7/8 */	
		tablero[10][0]="S  ";
		tablero[11][0]="L  ";
		tablero[12][0]="I  ";
		tablero[13][0]="D  ";
		tablero[14][0]="E  ";
		/*Slide 8/8 */	
		tablero[2][0]="S  ";
		tablero[3][0]="L  ";
		tablero[4][0]="I  ";
		tablero[5][0]="D  ";
		tablero[6][0]="E  ";
		}
	}
	
	/*Retorna el estado del tablero para ser impreso en el driver.*/
	public String vertablero(){
		String tab="Tablero: \n";
		for (int x=0;x<tablero.length;x++){
			for(int y=0;y<tablero[x].length;y++){
				tab=(tab+tablero[x][y])	;
			}		
			tab=(tab+" \n");
		}
		return tab;	
	}	
	
	/*Sirve para mover un jugador, segun el peon ingresado y los movimientos.*/
	public void mover(String peon, int movs){
		int corx=0;
		int cory=0;
		int mov=movs;
		/*Primero se encuentra la posicion.*/
		for (int x=0;x<tablero.length;x++){
			for(int y=0;y<tablero[x].length;y++){
				if (tablero[x][y].equals(peon)){
		            if ((x==2||x==3 ||x==4||x==5 )&&(y==4)){
						corx=1;
						cory=4;
						
					}else if((y==11||y==12 ||y==13||y==14 )&&(x==4)){
						corx=4;
						cory=15;
						
					}else if ((x==11||x==12 ||x==13||x==14 )&&(y==12)){
						corx=15;
						cory=12;
						
					}else if((y==2||y==3 ||y==4||y==5 )&&(x==12)){
						corx=12;
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
								/*Para moverse hacia la derecha*/
								while (movs>0 && corx==1 &&cory!=15){
									if(cory+movs>15){
										movs=movs+cory-15;
										cory=15;
									}else{
										corx=corx;
										if ((peon.equals("N1 ") || peon.equals("N2 ")|| peon.equals("N3 ")|| peon.equals("N4 "))&& (cory+movs>3)&&(cory<3)&&(mov!=4)){
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
											cory=cory+movs;
											movs=0;
										}
								    }
								}
								/*Para moverse hacia abajo*/
								while (movs>0&& corx!=15 &&cory==15){
									if(corx+movs>15){
										movs=movs+corx-15;
										corx=15;
									}else{
										cory=cory;
										if ((peon.equals("R1 ") || peon.equals("R2 ")|| peon.equals("R3 ")|| peon.equals("R4 "))&& (corx+movs>3)&&(corx<3)&&(mov!=4)){
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
											corx=corx+movs;
											movs=0;
										}
									}
								}
								
								/*Para moverse hacia la izquierda*/
								while (movs>0 && corx==15 &&cory!=1){
									if(cory-movs<1){
										movs=movs-cory+1;
										cory=1;
									}else{
										corx=corx;
										if ((peon.equals("V1 ") || peon.equals("V2 ")|| peon.equals("V3 ")|| peon.equals("V4 "))&& (cory-movs<13)&&(cory>13)&&(mov!=4)){
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
											cory=cory-movs;
											movs=0;
										}
									}
								}
								
								/*Para moverse hacia arriba.*/
								while (movs>0 && corx!=1 &&cory==1){
									if(corx-movs<1){
										movs=movs-corx+1;
										corx=1;
									}else{
										cory=cory;
										if ((peon.equals("A1 ") || peon.equals("A2 ")|| peon.equals("A3 ")|| peon.equals("A4 "))&& (corx-movs<13)&&(corx>13)&&(mov!=4)){
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
											corx=corx-movs;
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
	
	/*Sirve para hacer un slide.*/
	public void slide(String peon){
		mover(peon,4);
		System.out.println("SLIDE WOOO");
	}
	
	/*Sirve para realizar un unico movimiento.*/
	public void moveruno(int corx, int cory,String ant, String peon){
		mover(peon,1);
		tablero[corx][cory]=ant;
	}
	
	/*Sirve para enviar un peon a su casa con carta sorry.*/
	public void enviarcasa(String peon){
		System.out.println(peon.length());
		int corx=0;
		int cory=0;
		for (int x=0;x<tablero.length;x++){
			for(int y=0;y<tablero[x].length;y++){
				if (tablero[x][y].equals(peon)){
		            if ((x==2||x==3 ||x==4||x==5 )&&(y==4)){
						corx=1;
						cory=4;
						
					}else if((y==11||y==12 ||y==13||y==14 )&&(x==4)){
						corx=4;
						cory=15;
						
					}else if ((x==11||x==12 ||x==13||x==14 )&&(y==12)){
						corx=15;
						cory=12;
						
					}else if((y==2||y==3 ||y==4||y==5 )&&(x==12)){
						corx=12;
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
		if(peon.equals("N1 ")){
			tablero[2][4]=peon;
		}else if(peon.equals("N2 ")){
			tablero[3][4]=peon;
		}else if(peon.equals("N3 ")){
			tablero[4][4]=peon;
		}else if(peon.equals("N4 ")){
			tablero[5][4]=peon;
		}else if(peon.equals("R1 ")){
			tablero[4][14]=peon;
		}else if(peon.equals("R2 ")){
			tablero[4][13]=peon;
		}else if(peon.equals("R3 ")){
			tablero[4][12]=peon;
		}else if(peon.equals("R4 ")){
			tablero[4][11]=peon;
		}else if(peon.equals("V1 ")){
			tablero[14][12]=peon;
		}else if(peon.equals("V2 ")){
			tablero[13][12]=peon;
		}else if(peon.equals("V3 ")){
			tablero[12][12]=peon;
		}else if(peon.equals("V4 ")){
			tablero[11][12]=peon;
		}else if(peon.equals("A1 ")){
			tablero[12][2]=peon;
		}else if(peon.equals("A2 ")){
			tablero[12][3]=peon;
		}else if(peon.equals("A3 ")){
			tablero[12][4]=peon;
		}else if(peon.equals("A4 ")){
			tablero[12][5]=peon;
		}
	}	
	
	/*Sirve para enviar un peon a su casa si topan en el mismo lugar.*/
	public void enviarc(String peon){
		if(peon.equals("N1 ")){
			tablero[2][4]=peon;
		}else if(peon.equals("N2 ")){
			tablero[3][4]=peon;
		}else if(peon.equals("N3 ")){
			tablero[4][4]=peon;
		}else if(peon.equals("N4 ")){
			tablero[5][4]=peon;
		}else if(peon.equals("R1 ")){
			tablero[4][14]=peon;
		}else if(peon.equals("R2 ")){
			tablero[4][13]=peon;
		}else if(peon.equals("R3 ")){
			tablero[4][12]=peon;
		}else if(peon.equals("R4 ")){
			tablero[4][11]=peon;
		}else if(peon.equals("V1 ")){
			tablero[14][12]=peon;
		}else if(peon.equals("V2 ")){
			tablero[13][12]=peon;
		}else if(peon.equals("V3 ")){
			tablero[12][12]=peon;
		}else if(peon.equals("V4 ")){
			tablero[11][12]=peon;
		}else if(peon.equals("A1 ")){
			tablero[12][2]=peon;
		}else if(peon.equals("A2 ")){
			tablero[12][3]=peon;
		}else if(peon.equals("A3 ")){
			tablero[12][4]=peon;
		}else if(peon.equals("A4 ")){
			tablero[12][5]=peon;
		}
	}
	
	
	public boolean verificaradentro(String peon){
		boolean ver=false;
		if(tablero[2][3].equals(peon)){
			ver=true;
		}else if(tablero[3][3].equals(peon)){
			ver=true;
		}else if(tablero[4][3].equals(peon)){
			ver=true;
		}else if(tablero[5][3].equals(peon)){
			ver=true;
		}else if(tablero[3][11].equals(peon)){
			ver=true;
		}else if(tablero[3][12].equals(peon)){
			ver=true;
		}else if(tablero[3][13].equals(peon)){
			ver=true;
		}else if(tablero[3][14].equals(peon)){
			ver=true;
		}else if(tablero[11][13].equals(peon)){
			ver=true;
		}else if(tablero[12][13].equals(peon)){
			ver=true;
		}else if(tablero[13][13].equals(peon)){
			ver=true;
		}else if(tablero[14][13].equals(peon)){
			ver=true;
		}else if(tablero[13][2].equals(peon)){
			ver=true;
		}else if(tablero[13][3].equals(peon)){
			ver=true;
		}else if(tablero[13][4].equals(peon)){
			ver=true;
		}else if(tablero[13][5].equals(peon)){
			ver=true;
		}
		return ver;
	}
	/*Retorna un boolean si alguien ha ganado, cuando esto es verdadero se acaba el juego.*/
	public int terminoj(){
		int termino;
		int x=0;
		if(tablero[2][3].equals("S  ")==false &&tablero[3][3].equals("S  ")==false&&tablero[4][3].equals("S  ")==false&&tablero[5][3].equals("S  ")==false){
			termino=1;
		}else if(tablero[13][2].equals("S  ")==false &&tablero[13][3].equals("S  ")==false&&tablero[13][4].equals("S  ")==false&&tablero[13][5].equals("S  ")==false){
			termino=4;
		}else if(tablero[3][11].equals("S  ")==false &&tablero[3][12].equals("S  ")==false&&tablero[3][13].equals("S  ")==false&&tablero[3][14].equals("S  ")==false){
			termino=2;
		}else if(tablero[11][13].equals("S  ")==false && tablero[12][13].equals("S  ")==false && tablero[13][13].equals("S  ")==false &&tablero[14][13].equals("S  ")==false){
			termino=3;
		}else{
			termino=0;
		}
		return termino;
	}	
}