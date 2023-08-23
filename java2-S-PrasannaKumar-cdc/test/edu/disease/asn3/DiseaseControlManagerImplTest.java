package edu.disease.asn3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

import org.junit.jupiter.api.Test;


class DiseaseControlManagerImplTest {

	@Test
	void testDiseaseControlManagerImpl() {
		DiseaseControlManagerImpl pt=new DiseaseControlManagerImpl(20,20);
		pt=new DiseaseControlManagerImpl(0,0);
		pt=new DiseaseControlManagerImpl(-2,-2);
		pt=new DiseaseControlManagerImpl(2,-2);
		pt=new DiseaseControlManagerImpl(-2,2);
		pt=new DiseaseControlManagerImpl(0,2);
		pt=new DiseaseControlManagerImpl(2,0);
		pt=new DiseaseControlManagerImpl(0,-2);
		pt=new DiseaseControlManagerImpl(-2,0);
	}

	@Test
	void testAddDisease() {
		DiseaseControlManagerImpl pt=new DiseaseControlManagerImpl(20,20);
		pt.addDisease("Malariya",true);
		pt=new DiseaseControlManagerImpl(1,1);
		pt.addDisease("Dengu",false);
		pt.addDisease("COVID",true);
	}

	@Test
	void testGetDisease1() {
		Disease d;
		UUID u=UUID.randomUUID();
		UUID u1=UUID.randomUUID();
		DiseaseControlManagerImpl pt=new DiseaseControlManagerImpl(1,1);
		Disease d1=pt.addDisease("Dengu",false);
		d1.setDiseaseId(u);
		d=pt.getDisease(u);
		d=pt.getDisease(u1);
		d=pt.addDisease("COVID",true);
		
	}

	@Test
	void testAddPatient() {
		DiseaseControlManagerImpl pt=new DiseaseControlManagerImpl(1,1);
		pt.addPatient("Ganesh", "S", 1, 1);
		pt.addPatient("sreelash", "v", 2, 2);
	}

	@Test
	void testGetPatient1() {
		Patient d;
		UUID u=UUID.randomUUID();
		UUID u1=UUID.randomUUID();
		DiseaseControlManagerImpl pt=new DiseaseControlManagerImpl(1,1);
		d=pt.addPatient("Ganesh", "S", 1, 1);
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
		DiseaseControlManagerImpl pt=new DiseaseControlManagerImpl(1,1);
		d=pt.addDisease("Dengu",false);
		d.setDiseaseId(u);
		p=pt.addPatient("Ganesh", "S", 1, 1);
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
		DiseaseControlManagerImpl pt=new DiseaseControlManagerImpl(1,1);
		p=pt.addPatient("Ganesh", "S", 1, 1);
		p.setPatientId(u1);
		pt.addExposureToPatient(u1, e);
		pt.addExposureToPatient(u, e);
		
	}

	@Test
	void testGetDisease() {
		DiseaseControlManagerImpl d=new DiseaseControlManagerImpl(20,20);
		d.getDisease();
	}

	@Test
	void testGetPatient() {
		DiseaseControlManagerImpl d=new DiseaseControlManagerImpl(20,20);
		d.getPatient();
	}

}
