package semester1.Tutorium;

public class Smartphone {
	// Attribute der Klasse Smartphone
	String hersteller;
	String modell;
	int speicherplatz;

	private static int anzahl;

	// Konstruktor f�r die Klasse Smartphone
	public Smartphone(String hersteller, String modell, int speicherplatz) {
		this.hersteller = hersteller;
		this.modell = modell;
		// Aufrufen des setters f�r den Speicherplatz
		this.setSpeicherplatz(speicherplatz);

		anzahl += 1;
	}

	public static int getAnzahl(){
		return anzahl;
	}

	// Getter-Methode f�r den Hersteller
	public String getHersteller() {
		return hersteller;
	}

	// Getter-Methode f�r das Modell
	public String getModell() {
		return modell;
	}

	// Getter-Methode f�r den Speicherplatz
	public int getSpeicherplatz() {
		return speicherplatz;
	}

	// Setter f�r den Speicherplatz
	public void setSpeicherplatz(int speicherplatz) {
		this.speicherplatz = Math.abs(speicherplatz);
	}

	// main-Methode zum testen unserer Klasse
	public static void main(String args[]) {

		// Objekte der Klasse "Smartphone" anlegen
		Smartphone nexus5 = new Smartphone("LG", "Nexus 5", 16);
		Smartphone s4 = new Smartphone("Samsung", "Galaxy S4", 8);
		Smartphone note3 = new Smartphone("Samsung", "Galaxy Note 2", 32);
		Smartphone iphone6 = new Smartphone("Apple", "iPhone 6", 35);

		// Versuchen den Speicherplatz f�r das Nexus 5 auf -99 zu setzen -->
		// Betrag wird gesetzt
		nexus5.setSpeicherplatz(-99);

		// Neue Variable der Klasse "Smartphone" (max) definieren.
		// Und in diesen das objekt "nexus5" "Kopieren"
		Smartphone max = nexus5;

		// Vergleiche um das Smartphone mit dem gr��ten Speicherplatz zu finden
		if (max.getSpeicherplatz() < s4.getSpeicherplatz())
			max = s4;
		if (max.getSpeicherplatz() < note3.getSpeicherplatz())
			max = note3;
		if (max.getSpeicherplatz() < iphone6.getSpeicherplatz())
			max = iphone6;

		// Ausgabe des Modells mit dem gr��ten Speicher
		System.out.println("Gr��ten Speicherplatz: " + max.getModell());

		// min-Methode mit unseren Smartphones aufrufen
		min(nexus5, s4, note3, iphone6);
	}

	public static void min(Smartphone smart1, Smartphone smart2,
			Smartphone smart3, Smartphone smart4) {

		// Array vom typ "Smartphone" erstellen, mit allen objekten, die
		// �bergeben wurden
		Smartphone[] smartArray = { smart1, smart2, smart3, smart4 };

		// Neue Variable der Klasse "Smartphone" (min) definieren.
		// Und in diesen das 0. Objekt des Arrays "Kopieren"
		Smartphone mini = smartArray[0];

		// for-schleife um durch das Array zu iterieren
		for (int i = 1; i < smartArray.length; i++) {

			// das Kleinste Smartphone raussuchen
			if (mini.getSpeicherplatz() > smartArray[i].getSpeicherplatz())
				mini = smartArray[i];
		}

		// Ausgabe des Smartphones mit dem kleinsten Speicherplatz
		System.out.println("Kleinsten Speicherplatz: " + mini.getModell());
	}
}
