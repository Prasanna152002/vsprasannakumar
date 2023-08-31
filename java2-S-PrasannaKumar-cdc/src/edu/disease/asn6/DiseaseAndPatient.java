package edu.disease.asn6;

import java.util.List;

import edu.disease.asn3.Disease;

/**
 * The DiseaseAndPatient class represents a container for managing arrays of Disease and Patient objects.
 * It allows for storing and retrieving disease and patient information.
 */
public class DiseaseAndPatient {
	/** An array of Disease objects */
	private List<Disease> disease;
	/** An array of Patient objects */
	private List<Patient> patient;
	/**
     * Get the array of Disease objects.
     *
     * @return The array of Disease objects.
     */
	public List<Disease> getDisease() {
		return disease;
	}
	/**
     * Set the array of Disease objects.
     *
     * @param disease The array of Disease objects to set.
     */
	public void setDisease(List<Disease> disease) {
		this.disease = disease;
	}
	/**
     * Get the array of Patient objects.
     *
     * @return The array of Patient objects.
     */
	public List<Patient> getPatient() {
		return patient;
	}
	/**
     * Set the array of Patient objects.
     *
     * @param patient The array of Patient objects to set.
     */
	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}
	
}
