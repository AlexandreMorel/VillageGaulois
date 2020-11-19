package combat;

import village.Habitant;

import java.util.ArrayList;
import java.util.Date;

public class Combat {
	ArrayList<Habitant> combattants = new ArrayList<Habitant>();
	String lieu;
	Date dateDuDebut;
	Date dateDeFin;
	String nom;

	public Combat(String lieu, Date dateDuDebut, Date dateDeFin, String nom) {
		super();
		this.lieu = lieu;
		this.dateDuDebut = dateDuDebut;
		this.dateDeFin = dateDeFin;
		this.nom = nom;
	}

	public void inscrire(Habitant hab) {

		if (combattants.contains(hab))
		{
			System.out.println("Cette personne est d�j� enregistr�e");
		}
		else
		{
			combattants.add(hab);
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	public void convoquerMembre() {
		for(Habitant hab : this.combattants) {
			hab.convoquer(this);
		}
	}
	
	public void envoyerPlan(PlanDeBataille plan) {
		for(Habitant hab : this.combattants) {
			hab.recevoirPlan(this, plan);
		}
	}
	
}
