package Class;

import interfacce.Blogs;

public class BlogImpl implements Blogs {

	private Articolo[] articoli;

	/******************* COSTRUTTORE *************************/
	public BlogImpl(Articolo[] articoli) {
		this.articoli = articoli;
		for (int i = 0; i < articoli.length; i++) {
			articoli[i].setId(i + 1);
		}
		this.articoli=articoli;
		}
	
	/******************* METODI *************************/

public void setIdArticolo(Articolo[] articoli) {
	for (int i = 0; i < articoli.length; i++) {
		articoli[i].setId(i + 1);
	}
}
	/******************* GETTERS E SETTERS *************************/

	public Articolo[] getArticoli() {
		return articoli;
	}

	public void setArticoli(Articolo[] articoli) {
		this.articoli = articoli;
	}

	/******************* OVERRIDE *************************/
	@Override
	public String stampaArticoliPerId(int id) {
		String articolo = "Non ci sono articoli con questo id";
		if (articoli != null) {
			for (int i = 0; i < articoli.length; i++) {
				if (articoli[i].getId() == id) {
					articolo = "\n***************\n" + "\n\nTitolo: " + articoli[i].getTitolo() + "\nData : "
							+ articoli[i].getData() + "\nCategoria: " + articoli[i].getCategoria() + "\nTesto: "
							+ articoli[i].getTesto() + "\nAutore: " + articoli[i].getAutore() + "\nTags: "
							+ articoli[i].getTag();
				
				}
			}
		}
		return articolo;
	}

	@Override
	public String StampaArticoli() {

		String articolo = "";
		if (articoli != null) {
			for (int i = 0; i < articoli.length; i++) {
				articolo += articoli[i].getId()+"\nTITOLO: " + articoli[i].getTitolo() + "\nData : " + articoli[i].getData() + "\nCategoria: "
						+ articoli[i].getCategoria();
				if(articoli[i] instanceof Fantasy) {
					articolo += "\nDescrizione categoria: " + ((Fantasy)articoli[i]).getDescrizione();
				} else if(articoli[i] instanceof Noir) {
					articolo += "\nDescrizione: " + ((Noir)articoli[i]).getDescrizione();
				} else {
					articolo += "\n";
				}
				articolo+= "\nTesto: " + articoli[i].getTesto() + "\n"
						+ articoli[i].getAutore() + "\nTags: " + articoli[i].getTag() 
						+ "\n***************\n";
			}
		} else {
			articolo = "non sono presenti articoli in questo blog";
		}
		return articolo;
	}
}