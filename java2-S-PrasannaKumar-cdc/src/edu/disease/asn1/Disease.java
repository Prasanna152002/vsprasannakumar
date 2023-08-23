package edu.disease.asn1;

import java.util.UUID;

/**
 * The `Disease` class represents a disease with a unique identifier and a name.
 */
public class Disease {
	private UUID diseaseId;
	private String name;

	/**
	 * Gets the unique identifier of the disease.
	 *
	 * @return The UUID representing the disease's identifier.
	 */
	public UUID getDiseaseId() {
		return diseaseId;
	}

	/**
	 * Sets the unique identifier of the disease.
	 *
	 * @param diseaseId The UUID to set as the disease's identifier.
	 */
	public void setDiseaseId(UUID diseaseId) {
		this.diseaseId = diseaseId;
	}

	/**
	 * Gets the name of the disease.
	 *
	 * @return The name of the disease.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the disease.
	 *
	 * @param name The name to set as the disease's name.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Generates the hash code for the `Disease` object based on its unique
	 * identifier.
	 *
	 * @return The hash code of the `Disease` object.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diseaseId == null) ? 0 : diseaseId.hashCode());
		return result;
	}

	/**
	 * Returns a string representation of the `Disease` object.
	 *
	 * @return A string containing the disease's identifier and name.
	 */
	@Override
	public String toString() {
		return "Disease [diseaseId=" + diseaseId + ", name=" + name + "]";
	}

	/**
	 * Compares this `Disease` object to another object for equality.
	 *
	 * @param obj The object to compare with.
	 * @return `true` if the objects are equal, `false` otherwise.
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
}
