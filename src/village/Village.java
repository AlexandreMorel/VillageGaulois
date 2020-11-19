package village;

import combat.Combat;
import combat.PlanDeBataille;
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
		Quartier quartier = this.quartiers.get(nomQuartier);
		Combat combat = this.combats.get(nomCombat);
		quartier.prevenirProchainCombat(combat);
	}

	public Habitant getHabitants(String nnig) {
		return this.habitants.get(nnig);
	}

	public Combat getCombats(String nom) {
		return this.combats.get(nom);
	}

	public void inscrireCombat(String nnig, String nomCombat) {
		Habitant hab = this.habitants.get(nnig);
		Combat combat = this.combats.get(nomCombat);
		combat.inscrire(hab);
	}
	
	public void envoyerPlanDeBataille(PlanDeBataille plan, String nomCombat) {
		Combat combat = this.combats.get(nomCombat);
		combat.envoyerPlan(plan);
	}

	public void convoquerMembresCombat(String nomCombat) {
		Combat combat = this.combats.get(nomCombat);
		combat.convoquerMembre();
	}

}
