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
		Exposure e=new Exposure(UUID.randomUUID());
		d=e.hashCode();
		e=new Exposure(UUID.randomUUID());
		e.setDateTime(datetime);
		d=e.hashCode();
		e=new Exposure(null);
		e.setDateTime(null);
		d=e.hashCode();
		UUID pat=UUID.randomUUID();
		e=new Exposure(pat);
		d=e.hashCode();
	}

	@Test
	void testExposure() {
		LocalDateTime datetime=LocalDateTime.now();
		String exposure="D";
		Exposure e=new Exposure(UUID.randomUUID());
	}
	
	


	@Test
	void testGetPatientId() {
		LocalDateTime datetime=LocalDateTime.now();
		String exposure="D";
		Exposure e=new Exposure(UUID.randomUUID());
		UUID pat=e.getPatientId();
	}

	@Test
	void testGetDateTime() {
		LocalDateTime datetime=LocalDateTime.now(),tim;
		String exposure="D";
		Exposure e=new Exposure(UUID.randomUUID());
		tim=e.getDateTime();
	}

	@Test
	void testSetDateTime() {
		LocalDateTime datetime=LocalDateTime.now();
		String exposure="D";
		Exposure e=new Exposure(UUID.randomUUID());
		e.setDateTime(datetime);
	}

	@Test
	void testGetExposureType() {
		LocalDateTime datetime=LocalDateTime.now();
		String exposure="D",ex;
		Exposure e=new Exposure(UUID.randomUUID());
		ex=e.getExposureType();
	}

	@Test
	void testSetExposureType() {
		LocalDateTime datetime=LocalDateTime.now();
		String exposure="D";
		Exposure e=new Exposure(UUID.randomUUID());
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
		Exposure e=new Exposure(UUID.randomUUID());
		Exposure e1=new Exposure(UUID.randomUUID());
		Exposure e2=new Exposure(UUID.randomUUID());
		Patient pt=new Patient(20,20);
		b=e.equals(e);
		r=e.equals(null);
		b=e.equals(e1);
		b=e1.equals(e);
		e.setDateTime(null);
		e1.setDateTime(datetime);
		//e.equals(e1);
		//e1=new Exposure(null);
		
		b=e.equals(e1);
		e1.setDateTime(null);
		b=e.equals(e1);
		e.setDateTime(datetime);
		e1.setDateTime(datetime);
		b=e.equals(e1);
		b=e.equals(pt);
		b=e1.equals(e2);
		e=new Exposure(pat);
		e2=new Exposure(UUID.randomUUID());
		b=e.equals(e2);
		e1=new Exposure(pat);
		b=e.equals(e1);
		e1.hashCode();
		e=new Exposure(null);
		e.equals(e2);
		e2=new Exposure(null);
		e2.equals(e);
		
		
	}

	@Test
	void testToString() {
		LocalDateTime datetime=LocalDateTime.now();
		String exposure="D",ex;
		Exposure e=new Exposure(UUID.randomUUID());
		ex=e.toString();
	}

}
