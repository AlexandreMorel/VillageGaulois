package potion;

public class PriseTheorique {
	int poids;
	int age;
	int doseTheorique;

	public PriseTheorique(int poids, int age, int doseTheorique) {
		super();
		this.poids = poids;
		this.age = age;
		this.doseTheorique = doseTheorique;
	}

	public int getPoids() {
		return poids;
	}

	public int getAge() {
		return age;
	}

	public int getDoseTheorique() {
		return doseTheorique;
	}
}
