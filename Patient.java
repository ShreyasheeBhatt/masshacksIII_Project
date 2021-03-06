import java.util.HashMap;

public class Patient {
	//Data
	private String name;
	private String phonenumber;
	private String age;
	private HashMap <String, Symptom> symptoms;
	private int ID;
	private int triage;
	private double time;
	private double urgency;
	//Constructor
	/*
	 * Empty constructor
	 */
	public Patient () {
	}
	
	/*
	 * Constructor with name_in field and phonenumber_in field
	 */
	public Patient (String name_in, int ID_in, int triage_in, String phonenumber_in, String age_in, HashMap <String, Symptom> symptoms_in, double time_in, int queueposition) {
		name = name_in;
		ID = ID_in;
		phonenumber = phonenumber_in;
		age = age_in;
		symptoms = symptoms_in;
		time_in = time;
	}
	public Patient (String name_in, int ID_in, int triage_in, double time_in) {
		name = name_in;
		ID = ID_in;
		triage = triage_in;
		time_in = time;
		}
	
	//Methods
	
	public void setName(String name_in) {
		name = name_in;
	}
	
	public void setPhone(String phonenumber_in) {
		phonenumber = phonenumber_in;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhone () {
		return phonenumber;
	}
	
	public String getAge () {
		return age;
	}
	
	public void setAge (String age_in) {
		age = age_in;
	}
	
	public void setSymptoms (HashMap <String, Symptom> symptoms_in) {
		symptoms = symptoms_in;
	}
	
	public HashMap <String, Symptom> getSymptoms () {
		return symptoms;
		
	}
	
	public void setID (int ID_in) {
		ID = ID_in;
	}
	
	public int getID () {
		return ID;
	}
	
	public void setTriage (int triage_in) {
		triage = triage_in;
	}

	public int getTriage () {
		return triage;
	}
	
	public void setTime (double time_in) {
		time = time_in;
	}
	
	public double getTime () {
		return time;
	}
	
	public double getUrgency () {
		double z = (getTime())/(90);
		double urgency = 4*(0.8*(5-getTriage()) + 0.2*(z*5));
		return urgency;
	}
	
}
