package edu.disease.asn3;

import java.util.UUID;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Represents an exposure event related to a disease.
 */
public class Exposure implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UUID patientId;
	private LocalDateTime dateTime;
	private String exposureType;

	/**
	 * Constructor to create an Exposure object with a given date and exposure type.
	 *
	 * @param dateTime     Date and time of the exposure event.
	 * @param exposureType Type of exposure, either "D" (Direct) or "I" (Indirect).
	 */
	public Exposure(UUID patient) {
		this.patientId=patient;
	}

	/**
	 * Set the patient's unique identifier.
	 *
	 * @param patientId Unique identifier for the patient.
	 */
	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}

	/**
	 * Get the patient's unique identifier.
	 *
	 * @return Unique identifier for the patient.
	 */
	public UUID getPatientId() {
		return patientId;
	}

	/**
	 * Get the date and time of the exposure event.
	 *
	 * @return Date and time of the exposure event.
	 */
	public LocalDateTime getDateTime() {
		return dateTime;
	}

	/**
	 * Set the date and time of the exposure event.
	 *
	 * @param dateTime Date and time of the exposure event.
	 */
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	/**
	 * Get the type of exposure (either "D" for Direct or "I" for Indirect).
	 *
	 * @return Type of exposure.
	 */
	public String getExposureType() {
		return exposureType;
	}

	/**
	 * Set the type of exposure, with input validation.
	 *
	 * @param exposureType Type of exposure, either "D" (Direct) or "I" (Indirect).
	 * @throws IllegalArgumentException If an invalid exposure type is provided.
	 */
	public void setExposureType(String exposureType) {
		try {
			if (exposureType != "D" && exposureType != "I") {
				throw new IllegalArgumentException("Enter the Right Value");
			} else {
				this.exposureType = exposureType;
			}
		} catch (IllegalArgumentException e) {

		}
	}

	/**
	 * Generates a hash code for the Exposure object based on patient ID and
	 * date/time.
	 *
	 * @return Hash code for the object.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateTime == null) ? 0 : dateTime.hashCode());
		result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
		return result;
	}

	/**
	 * Checks if two Exposure objects are equal based on patient ID and date/time.
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
		Exposure other = (Exposure) obj;
		if (dateTime == null) {
			if (other.dateTime != null)
				return false;
		} else if (!dateTime.equals(other.dateTime))
			return false;
		if (patientId == null) {
			if (other.patientId != null)
				return false;
		} else if (!patientId.equals(other.patientId))
			return false;
		return true;
	}

	/**
	 * Generates a string representation of the Exposure object.
	 *
	 * @return A string representation of the object.
	 */
	@Override
	public String toString() {
		return "Exposure [patientId=" + patientId + ", dateTime=" + dateTime + ", exposureType=" + exposureType + "]";
	}

}
