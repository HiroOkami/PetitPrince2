package sujet;

import asteroide.console.*;

/**
 * 
 */
public class PetitPrince implements Sujet {
	private String nom;
	private int argent;
	private ConsoleJavaBoy console;
	
	public PetitPrince(String nom, int argent, ConsoleJavaBoy console) {
		this.nom = nom;
		this.argent = argent;
		this.console = console;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	public void run() {
		
	}
	
}
