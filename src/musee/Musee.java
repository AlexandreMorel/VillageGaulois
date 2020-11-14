package musee;

import village.Habitant;

import java.util.ArrayList;

public class Musee {
	ArrayList<Casque> listeCasques = new ArrayList<Casque>();

	public void ajouterCasque(Casque casque, Habitant hab) {
		listeCasques.add(casque);
	}

	public void retirerCasque(Casque casque) {
		if(listeCasques.contains(casque))
		{
			listeCasques.remove(casque);
		}
		else
		{
			System.out.println("Ce casque n'est pas au mus�e");
		}
	}

}
