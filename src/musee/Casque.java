package musee;

import combat.Combat;
import village.Habitant;

public class Casque {
	String grade;
	String forme;
	String etat;
	Combat combat;
	boolean presentAuMusee;
	Habitant habitant;

	public Casque(String grade, String forme, String etat, Combat combat, boolean presentAuMusee) {
		super();
		this.grade = grade;
		this.forme = forme;
		this.etat = etat;
		this.combat = combat;
		this.presentAuMusee = presentAuMusee;
	}

}
