package potion;

import java.util.Calendar;
import java.util.Date;

public class PriseRelle {
	Date dateDePrise;
	int dose;
	PriseTheorique prise;

	public PriseRelle(PriseTheorique prise, int dose) {
		this.dateDePrise = Calendar.getInstance().getTime();
		this.prise = prise;
		this.dose = dose;
	}

	public Date getDateDePrise() {
		return dateDePrise;
	}

	public int getDose() {
		return dose;
	}

	public PriseTheorique getPrise() {
		return prise;
	}
}
