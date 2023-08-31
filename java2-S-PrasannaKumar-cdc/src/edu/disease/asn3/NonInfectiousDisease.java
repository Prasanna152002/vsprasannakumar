package edu.disease.asn3;

/**
 * Represents a subclass of Disease for non-infectious diseases.
 */
public class NonInfectiousDisease extends Disease {
	/**
	 * Get example names of non-infectious diseases.
	 *
	 * @return An array of example non-infectious disease names.
	 */
	@Override
	String[] getExamples() {
		String str[] = { "Diabetes", "Hypertension", "Cancer", "Alzheimer" };
		return str;
	}

}