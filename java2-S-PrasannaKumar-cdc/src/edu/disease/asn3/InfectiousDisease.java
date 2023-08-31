package edu.disease.asn3;

/**
 * Represents a subclass of Disease for infectious diseases.
 */
public class InfectiousDisease extends Disease {
	/**
	 * Get example names of infectious diseases.
	 *
	 * @return An array of example infectious disease names.
	 */
	@Override
	String[] getExamples() {
		String str[] = { "HIV", "Corona", "Malaria", "Typhoid" };
		return str;
	}

}