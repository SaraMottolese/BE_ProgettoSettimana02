import java.util.Scanner;

import Class.Articolo;
import Class.Autore;
import Class.BlogImpl;
import Class.Fantasy;
import Class.Noir;
import Class.Tags;

public class Main {

	public static void main(String[] args) {

		Autore autore1 = new Autore("Sara", "Mott");
		Tags tag1 = new Tags(new String[] { "viaggio", "Molise", "viaggiare", "ilMoliseNonEsiste" });
		Articolo articolo1 = new Articolo("Conoscere il Molise", "02/06/22", "viaggi",
				"Il Molise è una regione montuosa italiana con un tratto di costa che si affaccia  "
						+ "sul Mar Adriatico. Include una parte del Parco nazionale d'Abruzzo \nnella Catena montuosa dell'Appennino, con una ricca fauna selvatica "
						+ "e sentieri. Il capoluogo regionale, Campobasso, è noto per il Castello Monforte, \nsituato su un monte, e per le chiese romaniche. "
						+ "A nord si trova l'area archeologica di Pietrabbondante con un antico teatro e un tempio sannita. ",
				autore1, tag1);

		Autore autore2 = new Autore("J. R. R.", "Tolkien");
		Tags tag2 = new Tags(new String[] { "fantasy", "TheLordOfTheRings", "leggereFaBene", "ILoveLibri", "hobbit",
				"elfi", "nani", "MagoBianco" });
		Articolo articolo2 = new Fantasy("Il Signore degli Anelli", "1954",
				"Un giovane hobbit e un variegato gruppo, composto da umani, un nano, un elfo "
						+ "e altri hobbit, partono per un delicata missione, guidati dal potente mago \nGandalf. Devono distruggere un anello magico e sconfiggere il "
						+ "malvagio Sauron.",
				autore2, tag2);

		Autore autore3 = new Autore("Giulia", "Rossi");
		Tags tag3 = new Tags(new String[] { "Noir", "indagare", "leggereFaBene", "ILoveLibri" });
		Articolo articolo3 = new Noir("Una piccola questione di cuore", "2016",
				"la Sistemi Integrati, l’agenzia di investigazioni privata di Oscar Falcone "
						+ "e Agatina Cirrielli, si rivolge al quasi socio Carlo Monterossi per il ritrovamento \ndi una donna scomparsa. Una volta chiuso il caso se ne"
						+ " apre immediatamente un altro: la donna stessa li ingaggia per un incarico anomalo e un po’ a rischio. \nVuole combinare un incontro con "
						+ "Mino Sanfilippo, un boss con cui è in debito. Ha perso una cosa preziosa che apparteneva a lui e ora ne teme le reazioni. "
						+ "\nLe cose si complicano quando in un anonimo appartamento di periferia viene ritrovato il cadavere di Federico Bastiani, "
						+ "\nun uomo della finanza collegato ad Anna e a Mino Sanfilippo. ",
				autore3, tag3);

		Autore autore4 = new Autore("Markus", "Zusak");
		Tags tag4 = new Tags(new String[] { "storico", "libri", "leggereFaBene", "ILoveLibri" });
		Articolo articolo4 = new Articolo("Una piccola questione di cuore", "2013", "storico",
				"la Sistemi Integrati, l’agenzia di investigazioni privata di Oscar Falcone "
						+ "e Agatina Cirrielli, si rivolge al quasi socio Carlo Monterossi per il ritrovamento \ndi una donna scomparsa. Una volta chiuso il caso se ne"
						+ " apre immediatamente un altro: la donna stessa li ingaggia per un incarico anomalo e un po’ a rischio. \nVuole combinare un incontro con "
						+ "Mino Sanfilippo, un boss con cui è in debito. Ha perso una cosa preziosa che apparteneva a lui e ora ne teme le reazioni. "
						+ "Le cose si complicano quando in un anonimo appartamento di periferia viene ritrovato il cadavere di Federico Bastiani, "
						+ "un uomo della finanza collegato ad Anna e a Mino Sanfilippo. ",
				tag4);
		autore4.scriviArticolo(articolo4);

		Articolo[] articoli = { articolo1, articolo2, articolo3, articolo4 };
		BlogImpl blog = new BlogImpl(articoli);

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Opzioni di stampa: " + "\n" + "1 per stampare tutti gli articoli" + "\n"
					+ "2 per stampare gli articoli in base all'ID selezionato");
			int opzione = Integer.parseInt(scanner.nextLine());
			if (opzione == 1) {
				System.out.println(blog.StampaArticoli());
			} else if (opzione == 2) {
				System.out.println("Scegli l'ID dell'articolo che vuoi visualizzare: " + "\n");
				int id = Integer.parseInt(scanner.nextLine());
				System.out.println(blog.stampaArticoliPerId(id));
			}
		}

	}

}
