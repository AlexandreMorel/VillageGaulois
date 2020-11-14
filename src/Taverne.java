
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
		PriseRelle priseReelle = new PriseRelle(Calendar.getInstance().getTime(), priseTheorique, dose);
		habitant.prendrePotion(priseReelle);
	}

	public int getInterval(String nnig, String nomPotion) {
		Potion potion = Objects.requireNonNull(this.potions.get(nomPotion), "La potion n'existe pas");

		return Optional.ofNullable(this.village.getHabitants(nnig))
				.map(Habitant::getPotionActive)
				.map(PriseRelle::getPrise)
				.map(prise -> prise.getInterval(potion))
				.orElse(0);
	}



}
