package edu.disease.asn3;
/**
 * The DiseaseAndPatient class represents a container for managing arrays of Disease and Patient objects.
 * It allows for storing and retrieving disease and patient information.
 */
public class DiseaseAndPatient {
	/** An array of Disease objects */
	private Disease[] disease;
	/** An array of Patient objects */
	private Patient[] patient;
	/**
     * Get the array of Disease objects.
     *
     * @return The array of Disease objects.
     */
	public Disease[] getDisease() {
		return disease;
	}
	/**
     * Set the array of Disease objects.
     *
     * @param disease The array of Disease objects to set.
     */
	public void setDisease(Disease[] disease) {
		this.disease = disease;
	}
	/**
     * Get the array of Patient objects.
     *
     * @return The array of Patient objects.
     */
	public Patient[] getPatient() {
		return patient;
	}
	/**
     * Set the array of Patient objects.
     *
     * @param patient The array of Patient objects to set.
     */
	public void setPatient(Patient[] patient) {
		this.patient = patient;
	}
	
}
