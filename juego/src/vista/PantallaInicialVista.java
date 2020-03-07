package vista;

import processing.core.PApplet;
import processing.core.PConstants;

public class PantallaInicialVista {

	private PApplet app;
	private int pantalla;

	//Constructor de la Clase Pantalla de Inicio en Vista
	
	public PantallaInicialVista(PApplet app) {
		this.app = app;
		
		
	}
	//Metodo para pintar pantalla de Start Completa
	
public void dibujarPantallaInicial() {
		app.background(0);
		dibujarInicio();
		dibujarBoton();
		
	}
//Metodo para pintar Boton de Start
	
private void dibujarBoton() {
		app.fill(255);
		app.textSize(30);
		app.rectMode(PConstants.CENTER);
		app.rect(300, 400, 120, 50);
		app.fill(0);
		app.textAlign(PConstants.CENTER);
		app.text("INICIAR",300,400);
		
		
	}

// Metodo para pintarfondo y mensaje de Start
	private void dibujarInicio() {
	app.textSize(30);	
	app.fill(255);	
	app.textAlign(PConstants.CENTER);
	app.text("INICIO DEL JUEGO SPACE INVADERS",300,300);	
		
	}
	
	// Metodo para pasar pantallas desde el Main
	public int pasarPantalla() {
		
		if(app.mouseX > 240 && app.mouseX < 361 && app.mouseY > 380 && app.mouseY < 430) {
			pantalla=1;
		}
		return pantalla;
	}
	
	

	
	
}
