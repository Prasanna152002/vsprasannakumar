package edu.disease.asn3;


import java.util.UUID;

/**
 * Represents an interface for managing diseases and patients.
 */
public interface DiseaseControlManager {
	/**
	 * Add a disease to the management system.
	 *
	 * @param name       The name of the disease.
	 * @param infectious True if the disease is infectious, false otherwise.
	 * @return The created Disease object.
	 */
	public Disease addDisease(String Name, boolean infectious);

	/**
	 * Retrieve a disease based on its unique identifier.
	 *
	 * @param diseaseId The unique identifier of the disease.
	 * @return The Disease object if found, null otherwise.
	 */
	public Disease getDisease(UUID diseaseld);

	/**
	 * Add a patient to the management system.
	 *
	 * @param firstName    The first name of the patient.
	 * @param lastName     The last name of the patient.
	 * @param maxDiseases  The maximum number of diseases the patient can have.
	 * @param maxExposures The maximum number of exposures the patient can have.
	 * @return The created Patient object.
	 */
	public Patient addPatient(String fistName, String lastName, int maxDiseases, int maxExposures);

	/**
	 * Retrieve a patient based on their unique identifier.
	 *
	 * @param patientId The unique identifier of the patient.
	 * @return The Patient object if found, null otherwise.
	 */
	public Patient getPatient(UUID patientld);

	/**
	 * Add a disease to a specific patient.
	 *
	 * @param patientId The unique identifier of the patient.
	 * @param diseaseId The unique identifier of the disease.
	 */
	public void addDiseaseToPatient(UUID patientld, UUID diseaseld);

	/**
	 * Add an exposure event to a specific patient.
	 *
	 * @param patientId The unique identifier of the patient.
	 * @param exposure  The Exposure object representing the exposure event.
	 */
	public void addExposureToPatient(UUID patientld, Exposure exposure);
	 /**
     * Get the array of Disease objects.
     *
     * @return An array of Disease objects stored within the container.
     */
	public Disease[] getDisease();
	/**
     * Get the array of Patient objects.
     *
     * @return An array of Patient objects stored within the container.
     */
	public Patient[] getPatient();
}

