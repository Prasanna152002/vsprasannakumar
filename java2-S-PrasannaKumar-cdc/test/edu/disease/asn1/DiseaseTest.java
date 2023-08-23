package edu.disease.asn1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

import org.junit.jupiter.api.Test;

class DiseaseTest {

	@Test
	void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDiseaseId() {
		Disease d=new Disease();
		UUID diseaseId=UUID.randomUUID();
		d.setDiseaseId(diseaseId);
		UUID b=d.getDiseaseId();
	}

	@Test
	void testSetDiseaseId() {
		Disease d=new Disease();
		UUID diseaseId=UUID.randomUUID();
		d.setDiseaseId(diseaseId);
		UUID b=d.getDiseaseId();
	}

	@Test
	void testGetName() {
		fail("Not yet implemented");
	}

	@Test
	void testSetName() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testEqualsObject() {
		fail("Not yet implemented");
	}

}
