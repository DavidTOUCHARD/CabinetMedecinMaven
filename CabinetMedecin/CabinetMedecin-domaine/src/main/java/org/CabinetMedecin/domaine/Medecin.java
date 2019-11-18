package org.CabinetMedecin.domaine;

/**
 * Hello world!
 *
 */
public class Medecin extends Personne {

	private Patient patient;
	private String specialite;

	public Medecin(int idPersonne, String nom, String prenom, Patient patient, String email, String adresse,
			String specialite) {
		super(idPersonne, nom, prenom, email, adresse);
		this.patient = patient;
		this.specialite = specialite;
	}

	public Patient getPatient() {
		return patient;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	@Override
	public String toString() {
		return "Medecin [patient=" + patient + ", specialite=" + specialite + "]";
	}

	/**
	 * @param nom
	 * @param prenom
	 */

}