package modelo;


// Clase padre de personajes de la cual heredarán el bueno y los enemigos

public abstract class Personaje {
	
	protected int posx;
	protected int posy;
	
//Constructor clase padre
	
	public Personaje(int posX,int posY) {
		posx=posX;
		posy=posY;
	}
	
	//Metodo para sobrecargar
	
public void moverPersonaje() {
	
}

	public int getPosX() {
		return posx;
	}

	public int getPosY() {
		return posy;
	}

	public void setPosY(int posy) {
		this.posy = posy;
	}

	public void setPosX(int posx) {
		
		this.posx = posx;
	}

	
	
	
	
}