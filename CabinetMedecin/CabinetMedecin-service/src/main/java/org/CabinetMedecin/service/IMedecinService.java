package org.CabinetMedecin.service;

import java.util.List;

import org.CabinetMedecin.domaine.Patient;

public interface IMedecinService {

	public boolean authentification(String login, String motdepasse);

	public boolean diagnostiquer(Patient patient);

	public boolean donnerRDV(Patient patient);

	public Patient lirePatient(Patient patient);

	public List<Patient> listePatients();
}
