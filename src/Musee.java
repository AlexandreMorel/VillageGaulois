import java.util.ArrayList;
import java.util.UUID;

public class Musee {
	ArrayList<Casque> listeCasques = new ArrayList<Casque>(); 

	public void ajouterCasque(Casque casque,Habitant hab) {
		listeCasques.add(casque);
	}
	
	public void retirerCasque(Casque casque) {
		if(listeCasques.contains(casque)) 
		{
			listeCasques.remove(casque);
		}
		else 
		{
			System.out.println("Ce casque n'est pas au musée");
		}
	}

	public Casque getCasque(UUID numSerie) {
		for(Casque casque : this.listeCasques) {
			if(casque.getUuid() == numSerie) {
				return casque;
			}
		}
		return null;
	}
}
