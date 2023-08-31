package edu.disease.asn2;

import static org.junit.jupiter.api.Assertions.*;
import edu.disease.asn2.Patient;
import edu.disease.asn1.Exposure;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.UUID;

import org.junit.jupiter.api.Test;

//import edu.disease.asn1.Patient;

class PatientTest {

	@Test
	void testHashCode() {
		Patient pt=new Patient(20,20);
		UUID gfg1 = UUID.randomUUID();
		pt.setPatientId(gfg1);
		int d=pt.hashCode();
		pt.setPatientId(null);
		int d1=pt.hashCode();
	}

	@Test
	void testPatient() {
		Patient pt=new Patient(20,20);
		pt=new Patient(0,0);
		pt=new Patient(-2,-2);
		pt=new Patient(2,-2);
		pt=new Patient(-2,2);
		pt=new Patient(0,2);
		pt=new Patient(2,0);
		pt=new Patient(0,-2);
		pt=new Patient(-2,0);
		
	}

	@Test
	void testAddDiseaseId() {
		Patient pt=new Patient(20,20);
		UUID gfg1 = UUID.randomUUID();
		pt.addDiseaseId(gfg1);
		pt=new Patient(1,1);
		UUID gfg2 = UUID.randomUUID();
		pt.addDiseaseId(gfg1);
		pt.addDiseaseId(gfg2);
	}

	@Test
	void testAddExposure() {
		Patient pt=new Patient(20,20);
		LocalDateTime datetime=LocalDateTime.now();
		String exposure="D";
		Exposure e=new Exposure(UUID.randomUUID());
		Exposure e1=new Exposure(UUID.randomUUID());
		pt.addExposure(e);
		Patient pt1=new Patient(1,1);
		pt1.addExposure(e);
		pt1.addExposure(e1);
	}

	@Test
	void testGetPatientId() {
		Patient pt=new Patient(20,20);
		UUID pd;
		pd=pt.getPatientId();
	}

	@Test
	void testSetPatientId() {
		Patient pt=new Patient(20,20);
		UUID gfg1 = UUID.randomUUID();
		pt.setPatientId(gfg1);
	}

	@Test
	void testGetFirstname() {
		Patient pt=new Patient(20,20);
		String str=pt.getFirstname();
	}

	@Test
	void testSetFirstname() {
		Patient pt=new Patient(20,20);
		pt.setFirstname("Prasanna");
	}

	@Test
	void testGetLastname() {
		Patient pt=new Patient(20,20);
		String str=pt.getLastname();
	}

	@Test
	void testSetLastname() {
		Patient pt=new Patient(20,20);
		pt.setLastname("S");
	}

	@Test
	void testEqualsObject() {
		Patient pt=new Patient(20,20);
		Exposure e1=new Exposure(null);
		boolean b=pt.equals(pt);
		boolean r=pt.equals(null);
		Patient pe=new Patient(20,20);
		UUID gfg1 = UUID.randomUUID();
		pe.setPatientId(gfg1);
		Patient pd=new Patient(20,20);
		pd.setPatientId(null);
		b=pd.equals(pe);
		b=pe.equals(pd);
		Patient pn=new Patient(20,20);
		UUID gfg2 = gfg1;
		pn.setPatientId(gfg2);
		b=pe.equals(pn);
		b=pe.equals(e1);
		pd.setPatientId(null);
		pn.setPatientId(null);
		b=pd.equals(pn);
		
	}

	@Test
	void testToString() {
		Patient pt=new Patient(20,20);
		String str=pt.toString();
	}

	@Test
	void testCompareTo() {
		Patient p=new Patient(5, 5);
		p.setLastname("S");
		p.setFirstname("PrasannaKumar");
		Patient p1=new Patient(5, 5);
		p1.setLastname("G");
		p1.setFirstname("Loganathan");
		p.compareTo(p1);
		p.setLastname("S");
		p.setFirstname("PrasannaKumar");
		p1=new Patient(5, 5);
		p1.setLastname("S");
		p1.setFirstname("Loganathan");
		p.compareTo(p1);
		
	}
	
	@Test
	void testGetExposures() {
		Patient pt=new Patient(20,20);
		Exposure []str=pt.getExposures();
	}
	
	@Test
	void testgetDiseaseIds() {
		Patient pt=new Patient(20,20);
		UUID[] str=pt.getDiseaseIds();
	}
}
