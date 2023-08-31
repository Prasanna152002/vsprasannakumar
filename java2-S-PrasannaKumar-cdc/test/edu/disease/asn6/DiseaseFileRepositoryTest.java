package edu.disease.asn6;

import static org.junit.Assert.assertThrows;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import edu.disease.asn3.Disease;
import edu.disease.asn3.InfectiousDisease;
import edu.disease.asn5.Container;

import org.junit.jupiter.api.Test;

class DiseaseFileRepositoryTest {

	@Test
	void testSave() {
		Disease d=new InfectiousDisease();
		Disease d1=new InfectiousDisease();
		Disease d2=new InfectiousDisease();
		Disease d3=new InfectiousDisease();
		Patient p=new Patient();
		Patient p1=new Patient();
		Patient p2=new Patient();
		Patient p3=new Patient();
		List<Disease> ds= Arrays.asList(d,d1,d2,d3);
		List<Patient> pt= Arrays.asList(p,p1,p2,p3);
		DiseaseFileRepository df=new DiseaseFileRepository();
		df.setDiseasefile("dis.dat");
		df.setPatientfile("pat.dat");
		try {
			df.save(ds, pt);
			df.setDiseasefile(null);
			assertThrows(IllegalArgumentException.class, () -> { df.save(ds, pt);});
			df.setPatientfile(null);
			assertThrows(IllegalArgumentException.class, () -> { df.save(ds, pt);});
			df.setDiseasefile("dis.dat");
			assertThrows(IllegalArgumentException.class, () -> { df.save(ds, pt);});
		} 
		catch(Exception e) {
			
		}
		
	}

	@Test
	void testInit() {
		Disease d=new InfectiousDisease();
		Disease d1=new InfectiousDisease();
		Disease d2=new InfectiousDisease();
		Disease d3=new InfectiousDisease();
		Patient p=new Patient();
		Patient p1=new Patient();
		Patient p2=new Patient();
		Patient p3=new Patient();
		List<Disease> ds= Arrays.asList(d,d1,d2,d3);
		List<Patient> pt= Arrays.asList(p,p1,p2,p3);
		DiseaseFileRepository df=new DiseaseFileRepository();
		df.setDiseasefile("diseases.dat");
		df.setPatientfile("Patient.dat");
		try {
			df.save(ds, pt);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		try {
			DiseaseAndPatient dp=df.init("C:\\Users\\DELL\\Downloads\\vsprasannakumar-main\\vsprasannakumar-main\\java2-S-PrasannaKumar-cdc\\");
			
			df.setDiseasefile(null);
			df.setPatientfile(null);
			IllegalArgumentException f=assertThrows(IllegalArgumentException.class, () -> { DiseaseAndPatient dt=df.init(null);});
			//System.out.println(f.getMessage());
			assertEquals("The path is empty", f.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
