package tpjava;

public class Autocar extends Camion {
	protected int nbPassagers;

	public Autocar(String modele, String immat, int annee, float price, char permis, float volume, int nbPassagers) {
		super(modele, immat, annee, price, permis, volume);
		this.nbPassagers = nbPassagers;
	}

	@Override
	public String toString() {
		return super.toString() + " Places passager : " + nbPassagers;
	}

	boolean peutTransporterPassagers(int nbPassagers) {
		return (nbPassagers < this.nbPassagers);
	}
}
