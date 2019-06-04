package tpjava;

public class Vehicule {
	protected String modele, immat;
	protected int annee;
	protected float prix;
	protected char permis;

	public Vehicule(String modele, String immat, int annee, float prix, char permis) {
		this.modele = modele;
		this.immat = immat;
		this.annee = annee;
		this.prix = prix;
		this.permis = permis;
	}

	public int age() {
		return 2019 - this.annee;
	}

	@Override
	public String toString() {
		return modele + " " + annee + " " + immat + " " + prix + " " + permis;
	}

	public void afficher() {
		System.out.println(this.toString());
	}

	public float coutLocation() {
		return (age() < 1) ? prix / 200 : prix / 250;
	}
}
