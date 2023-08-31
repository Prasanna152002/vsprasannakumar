package edu.disease.asn4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

import org.junit.jupiter.api.Test;

import edu.disease.asn3.DiseaseControlManager;
import edu.disease.asn3.DiseaseControlManagerImpl;
import edu.disease.asn3.Exposure;
import edu.disease.asn3.Patient;

class ContactTraceTest {

	@Test
	void testContactTrace() {
		DiseaseControlManager ds=new DiseaseControlManagerImpl(12, 12);
		ContactTrace ct=new ContactTrace(ds);
	}

	@Test
	void testFindPatientZero() {
		DiseaseControlManager ds=new DiseaseControlManagerImpl(12, 12);
		Exposure e=new Exposure(UUID.randomUUID());
		e.setExposureType("D");
		Exposure e1=new Exposure(UUID.randomUUID());
		e.setExposureType("I");
		Exposure e2=new Exposure(UUID.randomUUID());
		e.setExposureType("D");
		Exposure e3=new Exposure(UUID.randomUUID());
		e.setExposureType("I");
		Exposure e4=new Exposure(UUID.randomUUID());
		e.setExposureType("D");
		Patient p=new Patient(2, 2);
		p.addExposure(e);
		ds.addPatient("Prasanna", "Kumar", 1, 1).addExposure(e);
		ds.addPatient("Gokul", "Kumar", 1, 1).addExposure(e1);
		ds.addPatient("Guru", "Kumar", 1, 1).addExposure(e2);
		ds.addPatient("Prashant", "Kumar", 1, 1).addExposure(e3);
		ContactTrace ct=new ContactTrace(ds);
		ct.findPatientZero(p);
		
		
	}

}
