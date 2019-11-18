package org.CabinetMedecin.service;

import java.util.List;

import org.CabinetMedecin.dao.MedecinDao;
import org.CabinetMedecin.domaine.Patient;

/**
 * Hello world!
 *
 */
public class MedecinService implements IMedecinService {

	MedecinDao medecindao = new MedecinDao();

	public boolean authentification(String login, String motdepasse) {
		// TODO Auto-generated method stub
		return medecindao.connect(login, motdepasse);
	}

	public boolean diagnostiquer(Patient patient) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean donnerRDV(Patient patient) {
		// TODO Auto-generated method stub
		return false;
	}

	public Patient lirePatient(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Patient> listePatients() {
		// TODO Auto-generated method stub
		return null;
	}

}
