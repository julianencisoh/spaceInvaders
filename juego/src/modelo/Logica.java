package modelo;

import java.util.ArrayList;
import processing.core.PApplet;

public class Logica {
	
//Declaracion de Variables
	
PApplet app5;
private int posx;
private int posye=100;
private int posxe=50;
private int contador = 0;
ArrayList<Personaje> personajes;

// Constructor Clase Logica
public Logica(PApplet app5) {
personajes = new ArrayList <Personaje>();
nuevoArray();
posx = personajes.get(0).getPosX();
	
}

//Metodo para crear arreglo de Malos y el Bueno

private void nuevoArray() {
	personajes.add(new Buenos(250,450));
	
	for(int i=1; i<25; i++) {
		
		personajes.add(new Malos(posxe,posye));
		posxe = posxe+80;
		contador+=1;
		
		if(contador == 6) {
			
			posye+=50;
			posxe = 50;
			contador=0;
			
		}	
	}
}

//Metoco para hacer Balar
public void nuevaBala() {
	app5.fill(0);
	
}

// Metodo para el movimiento de los enemigos
	public void mover(int i) {
		
		if(posx>40 && posx<560) {
		posx=posx+i;	
		}
		if(posx>=560 && i==-40) {
		posx=posx+i;
		}
		if (posx<=40 && i==40) {
		posx=posx+i;
		}
	}
	
	

	public int getPosX() {
		
		return posx;
	}

	public void posYEnemigo(int posy) {
		
		posye=personajes.get(posy).getPosY();
		
	}
	
	
	public int posYE() {
		return posye;
		
	}

	
	public void posXEnemigo(int posx2) {
		posxe=personajes.get(posx2).getPosX();
		
	}

	public int posXE() {
	
		return posxe;
	}
	
	//Metodo para el movimiento de los enemigos

	public void movimiento() {
		for(int i=1;i<25;i++) {
		personajes.get(i).moverPersonaje();
		}
		
	}
















}
