package servlet;

import org.CabinetMedecin.service.MedecinService;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MedecinService serv = new MedecinService();
		boolean test = serv.authentification("FOBERLAY", "test");
		System.out.println(test);
	}

}
