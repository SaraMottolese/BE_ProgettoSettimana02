package Class;

public class Noir extends Articolo {
	
	private String descrizione;

	public Noir(String titolo, String data, String testo, Autore autore,Tags tag) {
		super(titolo, data, testo, testo, autore,tag);
		this.categoria="Noir";
		this.descrizione="Noir è quel tipo di storia d'intrattenimento che ci dice: \"è accaduto un delitto, sembra irrisolvibile,\n"
				+ " ma un investigatore è lì per scoprire il colpevole e come diavolo abbia fatto a commetterlo senza lasciare prove.\"";
		
	}
	
	/*******************		GETTERS E SETTERS		*************************/
	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
}
