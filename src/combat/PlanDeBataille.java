package combat;

import java.util.ArrayList;

public class PlanDeBataille {
	ArrayList<String> listeAvis = new ArrayList<String>();

	public void donnerAvis(String str)
	{
		listeAvis.add(str);
	}

}
