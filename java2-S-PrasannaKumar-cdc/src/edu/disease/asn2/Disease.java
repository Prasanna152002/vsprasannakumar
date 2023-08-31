package edu.disease.asn2;

import java.util.UUID;

/**
 * Represents an abstract class for a disease.
 */
abstract class Disease {
	private UUID diseaseId;
	private String name;

	/**
	 * Get the unique identifier for the disease.
	 *
	 * @return The disease's unique identifier.
	 */
	public UUID getDiseaseId() {
		return diseaseId;
	}

	/**
	 * Set the unique identifier for the disease.
	 *
	 * @param diseaseId The unique identifier to set.
	 */
	public void setDiseaseId(UUID diseaseId) {
		this.diseaseId = diseaseId;
	}

	/**
	 * Get the name of the disease.
	 *
	 * @return The name of the disease.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name of the disease.
	 *
	 * @param name The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Generates a hash code for the Disease object based on the disease ID.
	 *
	 * @return The hash code for the object.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diseaseId == null) ? 0 : diseaseId.hashCode());
		return result;
	}

	/**
	 * Generates a string representation of the Disease object.
	 *
	 * @return A string representation of the object.
	 */
	@Override
	public String toString() {
		return "Disease [diseaseId=" + diseaseId + ", name=" + name + "]";
	}

	/**
	 * Checks if two Disease objects are equal based on disease ID.
	 *
	 * @param obj The object to compare with.
	 * @return True if the objects are equal, false otherwise.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disease other = (Disease) obj;
		if (diseaseId == null) {
			if (other.diseaseId != null)
				return false;
		} else if (!diseaseId.equals(other.diseaseId))
			return false;
		return true;
	}

	/**
	 * Abstract method to get examples of diseases.
	 *
	 * @return An array of example disease names.
	 */
	abstract String[] getExamples();
}

/**
 * Represents a subclass of Disease for infectious diseases.
 */
class InfectiousDisease extends Disease {
	/**
	 * Get example names of infectious diseases.
	 *
	 * @return An array of example infectious disease names.
	 */
	@Override
	String[] getExamples() {
		String str[] = { "HIV", "Corona", "Malaria", "Typhoid" };
		return str;
	}

}

/**
 * Represents a subclass of Disease for non-infectious diseases.
 */
class NonInfectiousDisease extends Disease {
	/**
	 * Get example names of non-infectious diseases.
	 *
	 * @return An array of example non-infectious disease names.
	 */
	@Override
	String[] getExamples() {
		String str[] = { "Diabetes", "Hypertension", "Cancer", "Alzheimer" };
		return str;
	}

}