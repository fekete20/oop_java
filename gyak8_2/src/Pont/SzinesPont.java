package Pont;

import java.awt.Color;

import Szinezheto.ISzinezheto;

public class SzinesPont extends Pont implements ISzinezheto {
	private Color color;
	
	public SzinesPont(Color color){
		super(0,0); //inicializálom az x,y koordinátákat, 0,0 értékkel
		this.color = color;
	}
	
	public SzinesPont(int x, int y, Color color) {
		super(x,y);
		this.color = color;
	}
	
	public String toString(){
		return "A szinespont adata: " + this.color;
	}

	@Override
	public void setColor(Color colorIn) {
		
		this.color = colorIn;
	}

	@Override
	public Color getColor() {
		return this.color;
	}

}
