package controlador;

import java.awt.EventQueue;

import Pantallas.Difficulty;
import Pantallas.Menu;
import Pantallas.Score;

public class Inicio {

	static Menu menu = new Menu();
	static Difficulty difficulty = new Difficulty();
	
	public static void ShowDifficulty(){		
		
		difficulty.setVisible(true);
		
	}
	
	
	public static void HideMenu(){		
		
		menu.setVisible(false);
		
	}
	
	
	public static void main(String[] args) {
		
		menu.setVisible(true);
		
	}
}
