package vista;

import processing.core.PApplet;
import vista.PantallaInicialVista;
import vista.PantallaFinalVista;
import vista.PantallaJuegoVista;

public class Main extends PApplet {
	
	//Declaracion de elementos para relacionar entidades del MVC
	
	public int pantallas;
	PantallaInicialVista pantallaInicialVista;
	PantallaFinalVista pantallaFinalVista;
	PantallaJuegoVista pantallaJuegoVista;

	public static void main(String[] args) {
		PApplet.main("vista.Main");

	}
	
	public void settings() {
		size(600,600);
		
	}
	
    public void setup() {
    	
    	//Asignacion de valores para entidades
		pantallas = 0;
		pantallaFinalVista = new PantallaFinalVista();
		pantallaInicialVista = new PantallaInicialVista(this);
		pantallaJuegoVista = new PantallaJuegoVista(this);
	}
	
    public void draw() {
	background(255);
	
	//Switch para cambiar de pantallas
	
	switch (pantallas){
	case 0: 
		pantallaInicialVista.dibujarPantallaInicial();
		
		//fill(255);
		//textSize(30);
		//text("X :"+mouseX+" Y: "+mouseY,mouseX,mouseY);
		
		
		break;
		
	case 1: 
		pantallaJuegoVista.pintarPantallaJuego();
		
		break;
		
	case 2: 
		break;
	}
		
	
	}
	
	public void mouseClicked() {
		
		switch(pantallas) {
		
		case 0: 
			pantallas = pantallaInicialVista.pasarPantalla();
			break;
		
		case 1: 
			break;
			
		case 2:
			break;
		}
	
			
	}
	
	public void keyPressed() {
		switch(pantallas) {
		case 1:
			
			pantallaJuegoVista.flechasLados();
		break;
		
		}
		
	}
	
	
    }

	
	
	
	
	
	
	
	
	
	
	
	

