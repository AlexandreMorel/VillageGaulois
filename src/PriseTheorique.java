import java.util.HashMap;
import java.util.Map;

public class PriseTheorique {
	int poids;
	int age;
	int doseTheorique;
	private Map<Potion, Integer> interval = new HashMap<>();

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

	public int getInterval(Potion potion) {
		return this.interval.getOrDefault(potion, 0);
	}
}
