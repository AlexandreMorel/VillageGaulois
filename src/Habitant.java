import java.util.Calendar;

public class Habitant {
	String NNIG;
	String nom;
	String specialite;
	int dateDeNaissance;
	String statusCivique;
	String voie;
	String numeroVoie;
	int poids;
	int force;
	int endurance;
	int intelligence;
	Potion potionActive;
	

	public Habitant(String nNIG, String nom, String specialite, int dateDeNaissance, String statusCivique, String voie,
					String numeroVoie, int poids, int force, int endurance, int intelligence) {
		super();
		this.NNIG = nNIG;
		this.nom = nom;
		this.specialite = specialite;
		this.dateDeNaissance = dateDeNaissance;
		this.statusCivique = statusCivique;
		this.voie = voie;
		this.numeroVoie = numeroVoie;
		this.poids = poids;
		this.force = force;
		this.endurance = endurance;
		this.intelligence = intelligence;
	}
	
	public void convoquer(Combat combat) {
		 System.out.println("Tu es convoqué pour le combat: " + combat.getNom());
	}
	
	public void prendrePotion(PriseRelle priseReelle) {
		// A faire 
		System.out.println("J'ai pris la potion");
	}
	public void prevenirProchainCombat(Combat combat) {
		System.out.println("Le prochain combat à lieu dans peu de temps");
	}
	public void RecevoirPlan(Combat combat, PlanDeBataille plan) {
		// Méthode qui permet à un habitant de recevoir le plan de bataille pour un combat donné 
	}

	public int getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(int dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public Potion getPotionActive() {
		return potionActive;
	}

	public void setPotionActive(Potion potionActive) {
		this.potionActive = potionActive;
	}
	
	public int getAge() {
		return Calendar.getInstance().get(Calendar.YEAR) - this.dateDeNaissance;
	}
	
}
