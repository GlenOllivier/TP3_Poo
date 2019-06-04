package tpjava;

public class Voiture extends Vehicule {
	protected boolean hasRadio;

	public Voiture(String modele, String immat, int annee, float price, char permis, boolean hasRadio) {
		super(modele, immat, annee, price, permis);
		this.hasRadio = hasRadio;
	}

	public void ajouterAutoradio() {
		hasRadio = true;
	}

	public void enleverAutoradio() {
		hasRadio = false;
	}

	@Override
	public String toString() {
		return super.toString() + ((hasRadio) ? " Equipe d'un autoradio" : " Sans autoradio");
	}
}
