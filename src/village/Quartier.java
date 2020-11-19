package village;

import village.Habitant;

import java.util.ArrayList;

import combat.Combat;

public class Quartier {
	String drapeau;//photo
	String nom;
	ArrayList<Habitant> habitants = new ArrayList<Habitant>();

	public Quartier(String drapeau, String nom) {
		super();
		this.drapeau = drapeau;
		this.nom = nom;
	}

	public void prevenirProchainCombat(Combat combat) {
	
		for(Habitant hab : this.habitants) {
			hab.prevenirProchainCombat(combat);
		}

	}


}
