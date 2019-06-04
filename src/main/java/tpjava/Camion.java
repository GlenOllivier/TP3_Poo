package tpjava;

public class Camion extends Vehicule {
	protected float volume;

	public Camion(String modele, String immat, int annee, float price, char permis, float volume) {
		super(modele, immat, annee, price, permis);
		this.volume = volume;
	}

	@Override
	public String toString() {
		return super.toString() + " Volume utile : " + volume + "l";
	}

	public boolean peuxTransporterVolume(float volume) {
		return (volume <= this.volume);
	}
}
