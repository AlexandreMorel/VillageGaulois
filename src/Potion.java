import java.util.ArrayList;
import java.util.HashMap;

public class Potion {
	String nom;
	String effet; //Temps durant laquelle la potion est active
	String prises;
	HashMap<String, String> prisePotion = new HashMap<String, String>();
	ArrayList <PriseTheorique> listePriseTheorique = new ArrayList<>();
	
	public Potion(String nom, String effet, String prises) {
		super();
		this.nom = nom;
		this.effet = effet;
		this.prises = prises;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEffet() {
		return effet;
	}

	public void setEffet(String effet) {
		this.effet = effet;
	}

	public PriseTheorique getPriseTheorique(int poids, int age) {
		for(PriseTheorique prise : this.listePriseTheorique) {
			if((prise.getAge() == age) && (prise.getPoids() == poids)) {
				return prise;
			}
		}
		return null;
	}
	
	public int getDoseTheorique(int poids, int age) {
		return this.listePriseTheorique.stream()
				.filter(prise -> prise.getAge()==age)
				.filter(prise -> prise.getPoids()==poids)
				.findFirst()
				.map(PriseTheorique::getDoseTheorique)
				.orElse(0);
		
	}

	public void setPrises(String prises) {
		this.prises = prises;
	}	

}
