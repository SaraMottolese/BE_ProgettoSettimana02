package Class;

public class Articolo {
	
	protected int id;
	protected String titolo;
	protected String data;
	protected String categoria;
	protected String testo;
	protected Autore autore;
	protected Tags tag;

	
	/*******************		COSTRUTTORE		*************************/
	
	public Articolo() {}
	
	public Articolo(String titolo, String data, String categoria, String testo, Autore autore,Tags tag) {
		this.id = 0;
		this.titolo = titolo;
		this.data = data;
		this.categoria = categoria;
		this.testo = testo;
		this.autore = autore;
		this.tag = tag;
	}
	public Articolo(String titolo, String data, String categoria, String testo, Tags tag) {
		this.id = 0;
		this.titolo = titolo;
		this.data = data;
		this.categoria = categoria;
		this.testo = testo;
		this.autore = null;
		this.tag = tag;
	}
	
	/*******************		METODO		*************************/
	
	public String toString() {
		String s = "";
		s += "ARTICOLO: \nID: "+id+"\nTITOLO:" + titolo +"\nDATA: " + data + "\nCATEGORIA: " + categoria + "\nTESTO: " + testo +"\nAUTORE: "+ autore+ "\nTAGS: "+tag;
		return s;
	}
	
	
	/*******************		GETTERS E SETTERS		*************************/
	
	

	public int getId() {
		return id;
	}

	public String getTitolo() {
		return titolo;
	}

	public String getData() {
		return data;
	}

	public String getCategoria() {
		return categoria;
	}

	public String getTesto() {
		return testo;
	}

	public Autore getAutore() {
		return autore;
	}

	public Tags getTag() {
		return tag;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}

	public void setAutore(Autore autore) {
		this.autore = autore;
	}

	public void setTag(Tags tag) {
		this.tag = tag;
	}
	
	
	
	
}
