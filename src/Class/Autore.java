package Class;

import interfacce.Scrittore;

public class Autore implements Scrittore{
	private int id;
	private String nome;
	private String cognome;
	
	
/*******************		COSTRUTTORE		*************************/
	public Autore( String nome, String cognome) {
		this.id = 0;
		this.nome = nome;
		this.cognome = cognome;
	}
	
	/*******************		METODI		*************************/
	
	

	/*******************		GETTERS E SETTERS		*************************/
	public int getId() {
		return id;
	}



	public String getNome() {
		return nome;
	}



	public String getCognome() {
		return cognome;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	
	
	/*******************		OVERRIDE		*************************/
	@Override
	public Articolo scriviArticolo(Articolo articolo) {
		articolo.setAutore(this);
		return articolo;
		
	}
	
	
	
	public String toString() {
		String s = "";
		s += "AUTORE: \nNome:" + nome +"\nCognome': " + cognome;
		return s;
	}

	
	

}
