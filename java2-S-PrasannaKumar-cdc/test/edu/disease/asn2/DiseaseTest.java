package edu.disease.asn2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

import org.junit.jupiter.api.Test;

import edu.disease.asn1.Exposure;

class DiseaseTest {

	@Test
	void testHashCode() {
		Disease pt=new InfectiousDisease();
		UUID gfg1 = UUID.randomUUID();
		pt.setDiseaseId(gfg1);
		int d=pt.hashCode();
		pt.setDiseaseId(null);
		int d1=pt.hashCode();
	}

	@Test
	void testGetDiseaseId() {
		Disease d=new InfectiousDisease();
		UUID diseaseId=UUID.randomUUID();
		d.setDiseaseId(diseaseId);
		UUID b=d.getDiseaseId();
	}

	@Test
	void testSetDiseaseId() {
		Disease d=new InfectiousDisease();
		UUID diseaseId=UUID.randomUUID();
		d.setDiseaseId(diseaseId);
		UUID b=d.getDiseaseId();
	}

	@Test
	void testGetName() {
		Disease d=new InfectiousDisease();
		String str=d.getName();
	}

	@Test
	void testSetName() {
		Disease d=new InfectiousDisease();
		d.setName("COVID-19");
	}

	@Test
	void testToString() {
		Disease d=new InfectiousDisease();
		d.toString();
	}

	@Test
	void testEqualsObject() {
		Disease d=new InfectiousDisease();
		Disease d1=new InfectiousDisease();
		Exposure e1=new Exposure(null);
		boolean b=d.equals(d);
		boolean r=d.equals(null);
		boolean s=d.equals(e1);
		UUID gfg1 = UUID.randomUUID();
		d.setDiseaseId(gfg1);
		d1.setDiseaseId(gfg1);	
		d.setDiseaseId(null);
		b=d.equals(d1);
		UUID gfg2 = UUID.randomUUID();
		d.setDiseaseId(gfg1);
		b=d.equals(d1);
		d1.setDiseaseId(gfg2);
		b=d1.equals(d);
		d.setDiseaseId(null);
		d1.setDiseaseId(null);
		d.equals(d1);
	}

	@Test
	void testGetExamples() {
		Disease d=new InfectiousDisease();
		String arr[]=d.getExamples();
		d=new NonInfectiousDisease();
		arr=d.getExamples();
	}

}
