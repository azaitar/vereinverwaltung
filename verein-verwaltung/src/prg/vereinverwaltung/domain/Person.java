package prg.vereinverwaltung.domain;
import java.time.LocalDate;

/**
 * Diese Klasse bildet eine Person ab.
 * 
 * @author azenuni
 * @version 1.0
 */
public class Person {
	private int personenNummer;
	private String vorname;
	private String name;
	private LocalDate geburtsdatum; 
	private Kontakt kontakt;
	private Adresse adresse;
	
	
	
	public Person(String vorname, String name, LocalDate geburtsdatum, int plz, String strasse, String ort, String land, int telefon, String email){
		this.vorname=vorname;
		this.name=name;
		this.geburtsdatum=geburtsdatum;
	
		this.kontakt = new Kontakt(telefon, email);
		this.adresse = new Adresse(plz, strasse, ort,land);
		
	}
	
	public int getPersonenNummer() {
		return personenNummer;
	}
	
	public void setPersonenNummer(int personenNummer) {
		this.personenNummer = personenNummer;
	}
	
	public void setVorname(String vorname) {
		this.vorname=vorname;
	}
	
	public String getVorname() {
		return vorname;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setGeburtsdatum(LocalDate geburtsdatum) {
		this.geburtsdatum=geburtsdatum;
	}
	
	public LocalDate getGeburtsdatum() {
		return geburtsdatum;
	}
	
	public Kontakt getKontakt() {
		return kontakt;
	}

	public void setKontakt(Kontakt kontakt) {
		this.kontakt = kontakt;
	}
	
	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	
	
	@Override
	//Ueberschreiben der Methode um besser loggen zu koennen
	//Wenn direkt aufgerufen falsche Ausgabe 
	//Hier toString
	public String toString() {
		return "Name: " + name + ", Vorname: " + vorname + ", Geburtstag: " + geburtsdatum + 
				", Kontakt: " + kontakt + ", Adresse=" + adresse;
	}
	
	
}
