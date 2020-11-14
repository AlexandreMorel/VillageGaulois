package potion;

import village.Habitant;
import village.Village;

import java.util.*;

public class Taverne {

	private Map<String, Potion> potions = new HashMap<> ();
	private final Village village;

	public Taverne(Village village) {
		this.village = village;
	}

	public int getDoseTheorique(String nnig, String nomPotion) {
		Habitant habitant = this.village.getHabitants(nnig);
		Potion potion = this.potions.get(nomPotion);

		if (potion == null || habitant == null) throw new IllegalArgumentException("L'habitant ou la potion n'existe pas.");
		return potion.getDoseTheorique(habitant.getPoids(), habitant.getAge());
	}

	public void enregistrerPrisePotion(String nnig, String nomPotion, int dose) {
		Habitant habitant = Objects.requireNonNull(this.village.getHabitants(nnig), "L'habitant n'existe pas !");
		PriseTheorique priseTheorique = Objects.requireNonNull(this.potions.get(nomPotion), "La potion n'existe pas !")
											   .getPriseTheorique(habitant.getPoids(), habitant.getAge());
		PriseRelle priseReelle = new PriseRelle(priseTheorique, dose);
		habitant.prendrePotion(priseReelle);
	}

	public int getInterval(String nomPotion1, String nomPotion2) {
		Potion potion1 = Objects.requireNonNull(this.potions.get(nomPotion1), "La potion 1 n'existe pas");
		Potion potion2 = Objects.requireNonNull(this.potions.get(nomPotion2), "La potion 2 n'existe pas");

		return potion1.getInterval(potion2);
	}



}
