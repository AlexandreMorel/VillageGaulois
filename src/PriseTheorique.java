import java.util.HashMap;
import java.util.Map;

public class PriseTheorique {
	int poids;
	int age;
	int doseTheorique;
	private Map<Potion, Integer> intervalle = new HashMap<>();
	
	public PriseTheorique(int poids, int age, int doseTheorique) {
		super();
		this.poids = poids;
		this.age = age;
		this.doseTheorique = doseTheorique;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getDoseTheorique() {
		return doseTheorique;
	}

	public void setDoseTheorique(int doseTheorique) {
		this.doseTheorique = doseTheorique;
	}
	
	
	
}