package org.CabinetMedecin.dao;

import java.util.List;

import org.CabinetMedecin.domaine.Patient;

public interface IMedecinDao {

	public boolean connect(String login, String password);

	public List<Patient> getAllPatients();

	public Patient readPatientByID(int index);

}
