package edu.disease.asn2;

import java.util.UUID;

import edu.disease.asn1.Exposure;

public class DiseaseControlManagerImpl implements DiseaseControlManager {
	private Disease[] disease;
	private Patient[] patient;
	int md, me, indexd = 0, indexp = 0;

	public DiseaseControlManagerImpl(int maxDiseases, int maxPatient) {
		try {
			if (maxDiseases <= 0 || maxPatient <= 0) {
				throw new IllegalArgumentException("Invalid Data");
			} else {
				md = maxDiseases;
				me = maxPatient;
				disease = new Disease[maxDiseases];
				patient = new Patient[maxPatient];
			}
		} catch (IllegalArgumentException e) {

		}
	}

	@Override
	public Disease addDisease(String Name, boolean infectious) {
		if (md <= indexd) {
			throw new IllegalStateException("No more Disease can be added");
		} else {
			if (infectious) {
				return disease[indexd++] = new InfectiousDisease();
			} else {
				return disease[indexd++] = new NonInfectiousDisease();
			}
		}
	}

	@Override
	public Disease getDisease(UUID diseaseld) {
		for (Disease d : disease) {
			if (d.getDiseaseId() == diseaseld) {
				return d;
			}
		}
		return null;
	}

	@Override
	public Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures) {
		if (me <= indexp) {
			throw new IllegalStateException("No more Patients can be added");
		} else {
			patient[indexp]=new Patient(maxDiseases, maxExposures);
			patient[indexp].setLastname(lastName);
			patient[indexp].setFirstname(firstName);
			return patient[indexp++];
		}
	}

	@Override
	public Patient getPatient(UUID patientld) {
		for (Patient p : patient) {
			if (p.getPatientId() == patientld) {
				return p;
			}
		}
		return null;
	}

	@Override
	public void addDiseaseToPatient(UUID patientld, UUID diseaseld) {
		Disease ds=null;
		Patient ps=null;
		int dg=0,pg=0;
		for (Disease d : disease) {
			if (d.getDiseaseId() == diseaseld) {
				ds=d;
				dg=1;
			}
		}
		if(dg==0)
		{
			throw new IllegalArgumentException("Disease not Found");
		}
		for (Patient p : patient) {
			if (p.getPatientId()== patientld) {
				ps=p;
				pg=1;
			}
		}
		if(pg==0)
		{
			throw new IllegalArgumentException("Patient not Found");
		}
		if(dg==1&&pg==1)
		{
			ps.addDiseaseId(ds.getDiseaseId());
		}
		

	}

	@Override
	public void addExposureToPatient(UUID patientld, Exposure exposure) {
		int pg=0;
		Patient ps=null;
		for (Patient p : patient) {
			if (p.getPatientId() == patientld) {
				ps=p;
				pg=1;
			}
		}
		if(pg==0)
		{
			throw new IllegalArgumentException("Patient not Found");
		}
		else {
			ps.addExposure(exposure);
		}
	}

}
