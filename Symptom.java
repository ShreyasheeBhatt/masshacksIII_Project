public class Symptom {
//Data
	private String name;
	private int intensity;
	private String category;
	private String history;
//Constructor
	/*
	 * Empty Constructor
	 */
	public Symptom () {
	}
	/*
	 * Constructor with name_in field and intensity_in field
	 */
	public Symptom (String name_in, String category_in, int intensity_in) {
		name = name_in;
		intensity = intensity_in;
		category = category_in;
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
	
	public void setCategory (String category_in) {
		category = category_in;
	}
	
	public String getCategory () {
		return category;
	}
	
	public void setHistory (String history_in) {
		history = history_in;
	}
	public String getHistory () {
		return history;
	}
	
}
