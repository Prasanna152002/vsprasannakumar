package edu.disease.asn6;

import static org.junit.jupiter.api.Assertions.*;


import java.util.UUID;

import org.junit.jupiter.api.Test;

import edu.disease.asn3.Disease;
import edu.disease.asn3.Exposure;


class DiseaseControlManagerImplTest {

	@Test
	void testDiseaseControlManagerImpl() {
		DiseaseControlManagerImpl pt=new DiseaseControlManagerImpl();
		pt=new DiseaseControlManagerImpl();
		pt=new DiseaseControlManagerImpl();
		pt=new DiseaseControlManagerImpl();
		pt=new DiseaseControlManagerImpl();
		pt=new DiseaseControlManagerImpl();
		pt=new DiseaseControlManagerImpl();
		pt=new DiseaseControlManagerImpl();
		pt=new DiseaseControlManagerImpl();
	}

	@Test
	void testAddDisease() {
		DiseaseControlManagerImpl pt=new DiseaseControlManagerImpl();
		pt.addDisease("Malariya",true);
		pt=new DiseaseControlManagerImpl();
		pt.addDisease("Dengu",false);
		pt.addDisease("COVID",true);
	}

	@Test
	void testGetDisease1() {
		Disease d;
		UUID u=UUID.randomUUID();
		UUID u1=UUID.randomUUID();
		DiseaseControlManagerImpl pt=new DiseaseControlManagerImpl();
		Disease d1=pt.addDisease("Dengu",false);
		d1.setDiseaseId(u);
		d=pt.getDisease(u);
		d=pt.getDisease(u1);
		d=pt.addDisease("COVID",true);
		
	}

	@Test
	void testAddPatient() {
		DiseaseControlManagerImpl pt=new DiseaseControlManagerImpl();
		pt.addPatient("Ganesh", "S");
		pt.addPatient("sreelash", "v");
	}

	@Test
	void testGetPatient1() {
		Patient d;
		UUID u=UUID.randomUUID();
		UUID u1=UUID.randomUUID();
		DiseaseControlManagerImpl pt=new DiseaseControlManagerImpl();
		d=pt.addPatient("Ganesh", "S");
		d.setPatientId(u);
		d=pt.getPatient(u);
		d=pt.getPatient(u1);
	}

	@Test
	void testAddDiseaseToPatient() {
		Disease d;
		Patient p;
		UUID u=UUID.randomUUID();
		UUID u1=UUID.randomUUID();
		DiseaseControlManagerImpl pt=new DiseaseControlManagerImpl();
		d=pt.addDisease("Dengu",false);
		d.setDiseaseId(u);
		p=pt.addPatient("Ganesh", "S");
		p.setPatientId(u1);
		pt.addDiseaseToPatient(u, u1);
		pt.addDiseaseToPatient(u1, u);
		pt.addDiseaseToPatient(u, u);
		pt.addDiseaseToPatient(u1, u1);
	}

	@Test
	void testAddExposureToPatient() {
		Patient p;
		Exposure e=new Exposure(UUID.randomUUID());
		UUID u=UUID.randomUUID();
		UUID u1=UUID.randomUUID();
		DiseaseControlManagerImpl pt=new DiseaseControlManagerImpl();
		p=pt.addPatient("Ganesh", "S");
		p.setPatientId(u1);
		pt.addExposureToPatient(u1, e);
		pt.addExposureToPatient(u, e);
		
	}

	@Test
	void testGetDisease() {
		DiseaseControlManagerImpl d=new DiseaseControlManagerImpl();
		d.getDisease();
	}

	@Test
	void testGetPatient() {
		DiseaseControlManagerImpl d=new DiseaseControlManagerImpl();
		d.getPatient();
	}

}
