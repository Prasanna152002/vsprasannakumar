package edu.disease.asn6;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import edu.disease.asn3.Disease;
/**
 * The DiseaseFileRepository class provides methods for saving and initializing Disease and Patient data
 * using serialization and deserialization to/from files.
 */
public class DiseaseFileRepository {
	private String Diseasefile;
	private String Patientfile;
	/**
     * Saves the Disease and Patient data to files using serialization.
     *
     * @param disease An array of Disease objects to be serialized and saved.
     * @param patient An array of Patient objects to be serialized and saved.
     * @throws Exception If an error occurs during file operations or serialization.
     */
	public void save(List<Disease> disease,List<Patient> patient) throws Exception
	{
		if(Diseasefile==null||Patientfile==null)
		{
			throw new IllegalArgumentException("The path is empty");
		}
		else {
			FileOutputStream fl=new FileOutputStream(Diseasefile);
			FileOutputStream f2=new FileOutputStream(Patientfile);
			ObjectOutputStream of=new ObjectOutputStream(fl);
			of.writeObject(disease);
			ObjectOutputStream od=new ObjectOutputStream(f2);
			od.writeObject(patient);
		}
	}
	/**
     * Initializes a DiseaseAndPatient object by deserializing Disease and Patient data from files.
     *
     * @param folderPath The path to the folder containing the serialized files.
     * @return A DiseaseAndPatient object containing the deserialized Disease and Patient data.
     * @throws Exception If an error occurs during file operations or deserialization.
     */
	public DiseaseAndPatient init(String FolderPath) throws Exception {
		this.Diseasefile=FolderPath+"diseases.dat";
		this.Patientfile=FolderPath+"Patient.dat";
		DiseaseAndPatient dp=null;
		if(FolderPath==null)
		{
			throw new IllegalArgumentException("The path is empty");
		}
		else {
			FileInputStream fl=new FileInputStream(Diseasefile);
			FileInputStream f2=new FileInputStream(Patientfile);
			ObjectInputStream of=new ObjectInputStream(fl);
			List<Disease> d=(List<Disease>)of.readObject();
			ObjectInputStream od=new ObjectInputStream(f2);
			List<Patient> p=(List<Patient>)od.readObject();
			dp=new DiseaseAndPatient();
			dp.setDisease(d);
			dp.setPatient(p);
		}
		return dp;
	}
	public void setDiseasefile(String diseasefile) {
		Diseasefile = diseasefile;
	}
	public void setPatientfile(String patientfile) {
		Patientfile = patientfile;
	}
	
}
