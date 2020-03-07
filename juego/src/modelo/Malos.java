package modelo;

public class Malos extends Personaje {

	//Declaracion de Variables
	
	private int direccion=5;
	public Malos(int posX, int posY) {
		
		super(posX, posY);
	
	}
	
	//Metodo para el movimiento de los enemigos y cambiar direccion cuando llegue a las paredes
	
	public void moverPersonaje() {
			posx=posx+direccion;
			if(posx>=560) {
				direccion*=-1;
				posy=posy+5;
			}
			if (posx<=40) {
				direccion*=-1;
				posy=posy+5;
			}
		
	}
	
	
}