package adapter;

import domain.Covid19Pacient;

public class Main {

	public static void main(String[] args) {
		
		Covid19Pacient pacient = new Covid19Pacient("aitor", 21);
		
		pacient.addSymptomByName("disnea", 2);
		pacient.addSymptomByName("cefalea", 3);
		pacient.addSymptomByName("fiebre", 1);
		pacient.addSymptomByName("nauseas", 3);
		pacient.addSymptomByName("astenia", 2);
		
		
	}

}
