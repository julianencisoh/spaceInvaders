package controlador;

import processing.core.PApplet;
import processing.core.PConstants;
import modelo.Logica;


public class PantallaJuegoControlador {
	
	private PApplet app3;
	Logica logica;
	
	public PantallaJuegoControlador (PApplet app3) {
		this.app3 = app3;
		this.logica = new Logica(app3);
		
	}
	
	
	public void flechas() {
		
		if(app3.keyCode == 32) {
			logica.nuevaBala();
		}
		
		if(app3.keyCode == PConstants.RIGHT) {
			logica.mover(50);
		}
		
		if(app3.keyCode == PConstants.LEFT) {
			logica.mover(-50);
		}
	}
	
public int getPosX() {
	return logica.getPosX();
}

public int getPosYE() {
	return logica.posYE();
}
	
public void  setPosY(int posy) {
	
	logica.posYEnemigo(posy);
}

public int getPosXE() {
	return logica.posXE();
}

public void  setPosX(int posx) {
	
	logica.posXEnemigo(posx);
}

public void movimientoEnemigo() {
	logica.movimiento();
	
}
	
	
	
	
	

}
