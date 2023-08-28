package edu.disease.asn6;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import edu.disease.asn3.DiseaseControlManager;
import edu.disease.asn3.Exposure;
import edu.disease.asn3.Patient;
import edu.disease.asn4.PatientZero;

public class ContactTrace {
	static PatientZero pz;
	static List<Patient> p;

	public ContactTrace(DiseaseControlManager diseasecontrolmanager) {
		this.p = Arrays.asList(diseasecontrolmanager.getPatient());
	}

	public PatientZero findPatientZero(Patient patient) {
		for (Exposure s : patient.getExposures()) {
			if (s.getExposureType().equalsIgnoreCase("D")) {
				for (Patient pt : p) {
					for (Exposure e : pt.getExposures()) {
						if (e.getExposureType().equalsIgnoreCase("D")) {
							if (e.getDateTime().isBefore(s.getDateTime())) {
								pz = new PatientZero();
								pz.setPatient(pt);
								pz.setExposureDateTime(e.getDateTime());
								pz.setExposed(true);
								return findPatientZero(pt);
							}
						}
					}
				}
			}
		}
		return pz;
	}
}
