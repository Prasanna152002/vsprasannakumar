package edu.disease.asn5;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.disease.asn1.Disease;

class ContainerTest {

	@Test
	void testContainer() {
		//Container<Disease> s1;
		Disease d=new Disease();
		Disease []arr=new Disease[0];
		Container<Disease> s=new Container<>(d);
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> { Container<Disease> s1=new Container<>(arr);});
		assertEquals("No arguments provided.", exception.getMessage());
	}

	@Test
	void testSize() {
		Disease d=new Disease();
		Container<Disease> s=new Container<>(d);
		assertEquals(s.size(),1);
	}

	@Test
	void testGet() {
		Disease d=new Disease();
		Container<Disease> s=new Container<>(d);
		//Disease []arr=new Disease[0];
		//Container<Disease> s1=new Container<>(arr);
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> { s.get(-1);});
		assertEquals("Invalid index.", exception.getMessage());
		IllegalArgumentException exception1 = assertThrows(IllegalArgumentException.class, () -> { s.get(2);});
		assertEquals("Invalid index.", exception1.getMessage());

		assertEquals(s.get(0),d);
	}

}
