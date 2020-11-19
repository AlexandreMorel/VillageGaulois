package village;

import combat.Combat;
import musee.Musee;
import potion.Taverne;

import java.util.HashMap;
import java.util.Map;

public class Village {
	Musee musee;
	Taverne taverne;
	Map<String, Quartier> quartiers = new HashMap<>();
	Map<String, Habitant> habitants = new HashMap<>();
	Map<String, Combat> combats = new HashMap<>();

	public Village() {
		super();
	}

	public void prevenirProchainCombat(String nomQuartier, String nomCombat) {

	}

	public Habitant getHabitants(String nnig) {
		return this.habitants.get(nnig);
	}

	public Combat getCombats(String nom) {
		return this.combats.get(nom);
	}





}
