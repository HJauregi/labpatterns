package observer;

import java.util.Observable;

import domain.Covid19Pacient;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Observable	pacient1=new	Covid19Pacient("aitor",	35);
		new	PacientObserverGUI(pacient1);
		new	PacientSymptomGUI( (Covid19Pacient) pacient1);
		new PacientThermometerGUI(pacient1);
		new SemaphorGUI(pacient1);

		Observable	pacient2=new	Covid19Pacient("hodei",	21);
		new	PacientObserverGUI(pacient2);
		new	PacientSymptomGUI( (Covid19Pacient) pacient2);
		new PacientThermometerGUI(pacient2);
		new SemaphorGUI(pacient2);

		Observable	pacient3=new	Covid19Pacient("mikel",	25);
		new	PacientObserverGUI(pacient3);
		new	PacientSymptomGUI( (Covid19Pacient) pacient3);
		new PacientThermometerGUI(pacient3);
		new SemaphorGUI(pacient3);

	}


}
