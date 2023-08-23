package edu.disease.asn1;

import static org.junit.jupiter.api.Assertions.*;


import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.jupiter.api.Test;

class ExposureTest {
	
	@Test
	void testHashCode() {
		LocalDateTime datetime=LocalDateTime.now();
		String exposure="D";
		int d;
		Exposure e=new Exposure(datetime,exposure);
		d=e.hashCode();
		e=new Exposure(null,exposure);
		d=e.hashCode();
		e.setPatientId(null);
		d=e.hashCode();
		UUID pat=UUID.randomUUID();
		e.setPatientId(pat);
		d=e.hashCode();
	}

	@Test
	void testExposure() {
		LocalDateTime datetime=LocalDateTime.now();
		String exposure="D";
		Exposure e=new Exposure(datetime,exposure);
		//fail("Not yet implemented");
	}
	
	@Test
	void testSetPatientId() {
		LocalDateTime datetime=LocalDateTime.now();
		String exposure="D";
		UUID pat=UUID.randomUUID();
		Exposure e=new Exposure(datetime,exposure);
		e.setPatientId(pat);
	}

	@Test
	void testGetPatientId() {
		LocalDateTime datetime=LocalDateTime.now();
		String exposure="D";
		Exposure e=new Exposure(datetime,exposure);
		UUID pat=e.getPatientId();
	}

	@Test
	void testGetDateTime() {
		LocalDateTime datetime=LocalDateTime.now(),tim;
		String exposure="D";
		Exposure e=new Exposure(datetime,exposure);
		tim=e.getDateTime();
	}

	@Test
	void testSetDateTime() {
		LocalDateTime datetime=LocalDateTime.now();
		String exposure="D";
		Exposure e=new Exposure(datetime,exposure);
		e.setDateTime(datetime);
	}

	@Test
	void testGetExposureType() {
		LocalDateTime datetime=LocalDateTime.now();
		String exposure="D",ex;
		Exposure e=new Exposure(datetime,exposure);
		ex=e.getExposureType();
	}

	@Test
	void testSetExposureType() {
		LocalDateTime datetime=LocalDateTime.now();
		String exposure="D";
		Exposure e=new Exposure(datetime,exposure);
		e.setExposureType(exposure);
		e.setExposureType("I");
		e.setExposureType("H");
		
	}

	@Test
	void testEqualsObject() {
		LocalDateTime datetime=LocalDateTime.now();
		boolean b,r;
		String exposure="D",ex;
		UUID pat=UUID.randomUUID();
		UUID pat1=UUID.randomUUID();
		Exposure e=new Exposure(datetime,exposure);
		Exposure e1=new Exposure(null,exposure);
		Exposure e2=new Exposure(null,exposure);
		Patient pt=new Patient(20,20);
		b=e.equals(e);
		r=e.equals(null);
		b=e.equals(e1);
		b=e1.equals(e);
		e.setPatientId(null);
		e1=new Exposure(datetime,exposure);
		e1.setPatientId(pat);
		b=e.equals(e1);
		e.setPatientId(pat);
		b=e.equals(e1);
		e.setPatientId(pat1);
		b=e.equals(e1);
		b=e.equals(pt);
		b=e1.equals(e2);
		e.setPatientId(null);
		e2.setPatientId(null);
		b=e.equals(e2);
		e1=new Exposure(null,exposure);
		b=e1.equals(e2);
		e1.hashCode();
		
	}

	@Test
	void testToString() {
		LocalDateTime datetime=LocalDateTime.now();
		String exposure="D",ex;
		Exposure e=new Exposure(datetime,exposure);
		ex=e.toString();
	}

}
