import java.util.Date;

public class PriseRelle {
	Date dateDePrise;
	int dose;
	PriseTheorique prise;

	public PriseRelle(Date dateDePrise, PriseTheorique prise, int dose) {
		super();
		this.dateDePrise = dateDePrise;
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
