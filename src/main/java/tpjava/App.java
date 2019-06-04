package tpjava;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Voiture v1 = new Voiture("Twingo", "1234-AZ-49", 2019, 10_000.0f, 'B', true);
		Camion v2 = new Camion("J9", "987-BCD-75", 2014, 20_000.0f, 'B', 25_000.0f);
		Autocar v3 = new Autocar("FRI", "4567-WX-01", 2005, 90_000.0f, 'D', 3_000.0f, 53);

		v1.afficher();
		v2.afficher();
		System.out.println(v2.peuxTransporterVolume(7_000.0f));
		System.out.println("prix location twingo : " + v1.coutLocation());
		System.out.println("prix location camion : " + v2.coutLocation());
		v3.afficher();
		System.out.println(v3.peutTransporterPassagers(40) && v3.peuxTransporterVolume(40 * 100));
	}
}
