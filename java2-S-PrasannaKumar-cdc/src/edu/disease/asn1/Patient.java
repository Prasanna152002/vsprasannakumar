package edu.disease.asn1;
import java.util.Arrays;
import java.util.UUID;
/**
 * 
 * @author DELL
 *
 */
public class Patient{
	private UUID patientId;
	private String firstname;
	private String lastname;
	Exposure[] exposures;
	UUID[] diseaseIds;
	int md,me;
	int i=0,j=0;
	/**
	 * 
	 * @param maxDiseases
	 * @param maxExposures
	 */
	public Patient(int maxDiseases,int maxExposures)
	{
		try {
		if(maxDiseases<=0||maxExposures<=0)
		{
			throw new IllegalArgumentException("Invalid Data");
		}
		else {
			md=maxDiseases;
			me=maxExposures;
			diseaseIds=new UUID[maxDiseases];
			exposures=new Exposure[maxExposures];
		}
		}
		catch(IllegalArgumentException e)
		{
			
		}
	}
	/**
	 * 
	 * @param id
	 */
	public void addDiseaseId(UUID id)
	{
		try {
		if(i>=md)
		{
			throw new IndexOutOfBoundsException("Array Range Exceeds");
		}
		else {
			diseaseIds[i++]=id;
		}
		}
		catch(IndexOutOfBoundsException I)
		{
			
		}
	}
	/**
	 * 
	 * @param ex
	 */
	public void addExposure(Exposure ex)
	{
		try {
		if(j>=me)
		{
			throw new IndexOutOfBoundsException("Array Range Exceeds");
		}
		else {
			exposures[j++]=ex;
		}
		}
		catch(IndexOutOfBoundsException I)
		{
			
		}
	}
	/**
	 * 
	 * @return
	 */
	public UUID getPatientId() {
		return patientId;
	}
	/**
	 * 
	 * @param patientId
	 */
	public void setPatientId(UUID patientId) {
		this.patientId = patientId;
	}
	/**
	 * 
	 * @return
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * 
	 * @param firstname
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * 
	 * @return
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * 
	 * @param lastname
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patientId == null) ? 0 : patientId.hashCode());
		return result;
	}
	/**
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (getClass() != obj.getClass())
		{
			return false;
		}
		Patient other = (Patient) obj;
		if (patientId == null) {
			if (other.patientId != null)
			{
				return false;
			}
		} else if (!patientId.equals(other.patientId)) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", exposures=" + Arrays.toString(exposures) + ", diseaseIds=" + Arrays.toString(diseaseIds) + "]";
	}
}
