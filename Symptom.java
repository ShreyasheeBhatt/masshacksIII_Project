public class Symptom {
//Data
	private String name;
	private int intensity;
//Constructor
	/*
	 * Empty Constructor
	 */
	public Symptom () {
	}
	/*
	 * Constructor with name_in field and intensity_in field
	 */
	public Symptom (String name_in, int intensity_in) {
		name = name_in;
		intensity = intensity_in;
	}
//Methods

	public void setName (String name_in) {
		name = name_in;
	}
	public void setIntensity (int intensity_in) {
		intensity = intensity_in;
	}
	public String getName () {
		return name;
	}
	
	public int getIntensity () {
		return intensity;
	}
	
}
