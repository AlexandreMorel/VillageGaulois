import java.util.UUID;

public class Casque {
	String grade;
	String forme;
	String etat;
	Combat combat;
	boolean presentAuMusee;
	Habitant habitant;
	UUID uuid;
	
	public Casque(String grade, String forme, String etat, Combat combat, boolean presentAuMusee) {
		super();
		this.grade = grade;
		this.forme = forme;
		this.etat = etat;
		this.combat = combat;
		this.presentAuMusee = presentAuMusee;
		this.uuid = UUID.randomUUID();
	}

	public void setPresentAuMusee(boolean presentAuMusee) {
		this.presentAuMusee = presentAuMusee;
	}

	public UUID getUuid() {
		return uuid;
	}

}
