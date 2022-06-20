package Class;

public class Fantasy extends Articolo {
	
	private String descrizione;

	public Fantasy(String titolo, String data, String testo, Autore autore,Tags tag) {
		super(titolo, data, testo, testo, autore,tag);
		this.categoria="Fantasy";
		this.descrizione="Genere Narrativo caratterizzato dalla dominante presenza di contesti ed elementi altamente immaginativi.\n "
				+ "Magia, esseri soprannaturali, mondi immaginari, superpoteri, da sempre caratterizzano e distinguono le storie Fantasy.";
		
	}

	
	/*******************		GETTERS E SETTERS		*************************/
	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	
}
