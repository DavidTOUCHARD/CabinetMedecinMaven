package org.CabinetMedecin.domaine;

/**
 * @author David
 *
 */
public class Personne {

	private int idPersonne;
	private String nom;
	private String prenom;
	private String email;
	private String adresse;

	public Personne(int idPersonne, String nom, String prenom, String email, String adresse) {
		super();
		this.idPersonne = idPersonne;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
	}

	/**
	 * @param idPersonne
	 * @param nom
	 * @param prenom
	 */

	public String getAdresse() {
		return adresse;
	}

	public String getEmail() {
		return email;
	}

	public int getIdPersonne() {
		return idPersonne;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Personne [idPersonne=" + idPersonne + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ ", adresse=" + adresse + "]";
	}

}
