package edu.disease.asn1;

import java.util.Arrays;
import java.util.UUID;

/**
 * The `Patient` class represents a patient with information about their
 * diseases and exposures.
 */
public class Patient {
	private UUID patientId;
	private String firstname;
	private String lastname;
	private Exposure[] exposures;
	private UUID[] diseaseIds;
	int md, me;
	int i = 0, j = 0;

	/**
	 * Constructs a new `Patient` object with the specified maximum number of
	 * diseases and exposures.
	 *
	 * @param maxDiseases  The maximum number of diseases that can be added to the
	 *                     patient.
	 * @param maxExposures The maximum number of exposures that can be added to the
	 *                     patient.
	 * @throws IllegalArgumentException if either `maxDiseases` or `maxExposures` is
	 *                                  non-positive.
	 */
	public Patient(int maxDiseases, int maxExposures) {
		try {
			if (maxDiseases <= 0 || maxExposures <= 0) {
				throw new IllegalArgumentException("Invalid Data");
			} else {
				md = maxDiseases;
				me = maxExposures;
				diseaseIds = new UUID[maxDiseases];
				exposures = new Exposure[maxExposures];
			}
		} catch (IllegalArgumentException e) {

		}
	}

	/**
	 * Adds a disease ID to the patient's list of disease IDs.
	 *
	 * @param id The UUID of the disease to be added.
	 * @throws IndexOutOfBoundsException if the maximum number of diseases has been
	 *                                   reached.
	 */
	public void addDiseaseId(UUID id) {
		try {
			if (i >= md) {
				throw new IndexOutOfBoundsException("Array Range Exceeds");
			} else {
				diseaseIds[i++] = id;
			}
		} catch (IndexOutOfBoundsException I) {

		}
	}

	/**
	 * Adds an exposure to the patient's list of exposures.
	 *
	 * @param ex The `Exposure` object representing the exposure to be added.
	 * @throws IndexOutOfBoundsException if the maximum number of exposures has been
	 *                                   reached.
	 */
	public void addExposure(Exposure ex) {
		try {
			if (j >= me) {
				throw new IndexOutOfBoundsException("Array Range Exceeds");
			} else {
				exposures[j++] = ex;
			}
		} catch (IndexOutOfBoundsException I) {

		}
	}

	/**
	 * Gets the unique identifier of the patient.
	 *
	 * @return The UUID representing the patient's identifier.
	 */
	public UUID getPatientId() {
		return patientId;
	}

	/**
	 * Sets the unique identifier of the patient.
	 *
	 * @param patientId The UUID to set as the patient's identifier.
	 */
	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}

	/**
	 * Gets the first name of the patient.
	 *
	 * @return The first name of the patient.
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * Sets the first name of the patient.
	 *
	 * @param firstname The first name to set for the patient.
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * Gets the last name of the patient.
	 *
	 * @return The last name of the patient.
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * Sets the last name of the patient.
	 *
	 * @param lastname The last name to set for the patient.
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	

	public Exposure[] getExposures() {
		return exposures;
	}


	public UUID[] getDiseaseIds() {
		return diseaseIds;
	}


	/**
	 * Generates the hash code for the `Patient` object based on its unique
	 * identifier.
	 *
	 * @return The hash code of the `Patient` object.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
		return result;
	}

	/**
	 * Compares this `Patient` object to another object for equality.
	 *
	 * @param obj The object to compare with.
	 * @return `true` if the objects are equal, `false` otherwise.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Patient other = (Patient) obj;
		if (patientId == null) {
			if (other.patientId != null) {
				return false;
			}
		} else if (!patientId.equals(other.patientId)) {
			return false;
		}
		return true;
	}

	/**
	 * Returns a string representation of the `Patient` object.
	 *
	 * @return A string containing the patient's identifier, first name, last name,
	 *         exposures, and disease IDs.
	 */
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", exposures=" + Arrays.toString(exposures) + ", diseaseIds=" + Arrays.toString(diseaseIds) + "]";
	}
}
