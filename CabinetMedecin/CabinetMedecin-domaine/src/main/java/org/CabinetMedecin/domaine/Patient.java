package org.CabinetMedecin.domaine;

public class Patient extends Personne {

	private Medecin medecin;
	private String symptomes;
	private String sexe;

	public Patient(int idPersonne, String nom, String prenom, String email, String adresse, String symptomes,
			String sexe) {
		super(idPersonne, nom, prenom, email, adresse);
		this.symptomes = symptomes;
		this.sexe = sexe;
	}

	public Medecin getMedecin() {
		return medecin;
	}

	public String getSexe() {
		return sexe;
	}

	public String getSymptomes() {
		return symptomes;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public void setSymptomes(String symptomes) {
		this.symptomes = symptomes;
	}

	@Override
	public String toString() {
		return "Patient [medecin=" + medecin + ", symptomes=" + symptomes + ", sexe=" + sexe + "]";
	}

	/**
	 * @param nom
	 * @param prenom
	 */

}