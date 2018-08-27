package fr.testfx.personnes.model;

public enum Sexe {
	MASCULIN("Masculin"),
	FEMININ("Féminin"),
	INCONNU("Inconnu");
	
	private String name = "";
	
	Sexe(String n){name = n;}
	public String toString() {return name;}
}