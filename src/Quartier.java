import java.util.ArrayList;

public class Quartier {
	String drapeau;//photo
	String nom;
	ArrayList<Habitant> habitants = new ArrayList<Habitant>();
	
	public Quartier(String drapeau, String nom) {
		super();
		this.drapeau = drapeau;
		this.nom = nom;
	}

	public void prevenirProchainCombat() {
		// a faire 
		System.out.println("Il y a un combat dans pas longtemps !!");
		
	}
	

}
