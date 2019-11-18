package org.CabinetMedecin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.CabinetMedecin.domaine.Patient;

public class MedecinDao implements IMedecinDao {

	// ConnectionDao conn = new ConnectionDao();

	public boolean connect(String login, String password) {
		// TODO Auto-generated method stub
		Statement stm = null;
		boolean rs = false;
		stm = ConnectionDao.getConnection();

		try {
			String sql = "SELECT * from `medecin` where `login`=" + login + "and `password`=" + password + ";";
			rs = stm.execute(sql);

			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectionDao.closeConnection();
		return rs;
	}

	public List<Patient> getAllPatients() {
		// TODO Auto-generated method stub
		Statement stm = null;
		List<Patient> listPatients = new ArrayList<Patient>();
		Patient patient = null;

		stm = ConnectionDao.getConnection();

		try {
			String sql = "SELECT * from `patient`;";
			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {
				int index = rs.getInt("idPatient");
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				String email = rs.getString("email");
				String adresse = rs.getString("adresse");
				String symptomes = rs.getString("symptomes");
				String sexe = rs.getString("sexe");
				patient = new Patient(index, nom, prenom, email, adresse, symptomes, sexe);
				listPatients.add(patient);

			}
			return listPatients;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectionDao.closeConnection();
		return null;
	}

	public Patient readPatientByID(int index) {
		// TODO Auto-generated method stub

		Patient patient = null;
		Statement stm = null;

		stm = ConnectionDao.getConnection();

		try {
			String sql = "SELECT * from `patient` where patient.idPatient=" + index + ";";
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {

				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				String email = rs.getString("email");
				String adresse = rs.getString("adresse");
				String symptomes = rs.getString("symptomes");
				String sexe = rs.getString("sexe");
				patient = new Patient(index, nom, prenom, email, adresse, symptomes, sexe);
			}
			return patient;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectionDao.closeConnection();
		return null;
	}

}
