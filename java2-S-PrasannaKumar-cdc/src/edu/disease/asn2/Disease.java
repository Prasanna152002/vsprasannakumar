package edu.disease.asn2;

import java.util.UUID;
abstract class Disease {
	UUID diseaseId;
	String name;
	/**
	 * 
	 * @return
	 */
	public UUID getDiseaseId() {
		return diseaseId;
	}
	/**
	 * 
	 * @param diseaseId
	 */
	public void setDiseaseId(UUID diseaseId) {
		this.diseaseId = diseaseId;
	}
	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diseaseId == null) ? 0 : diseaseId.hashCode());
		return result;
	}
	@Override
	public String toString() {
		return "Disease [diseaseId=" + diseaseId + ", name=" + name + "]";
	}
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
	abstract String[] getExamples();
}

class InfectiousDisease extends Disease{
	@Override
	String[] getExamples() {
		String str[]= {"HIV","Corona","Malaria","Typhoid"};
		return str;
	}
	
}
class NonInfectiousDisease extends Disease{
	@Override
	String[] getExamples() {
		String str[]= {"Diabetes","Hypertension","Cancer","Alzheimer"};
		return str;
	}
	
}