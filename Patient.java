import java.util.HashMap;
public class Patient {
	//Data
	private String name;
	private String phonenumber;
	private int age;
	private HashMap <String, Symptom> symptoms;
	private int ID;
	private int triage;
	private double time;
	private QueueID queueID;
	//Constructor
	/*
	 * Empty constructor
	 */
	public Patient () {
	}
	
	/*
	 * Constructor with name_in field and phonenumber_in field
	 */
	public Patient (String name_in, int ID_in, int triage_in, String phonenumber_in, int age_in, HashMap <String, Symptom> symptoms_in) {
		name = name_in;
		ID = ID_in;
		phonenumber = phonenumber_in;
		age = age_in;
		symptoms = symptoms_in;
	}
	public Patient (String name_in, int ID_in, int triage_in) {
		name = name_in;
		ID = ID_in;
		triage = triage_in;
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
	
	public int getAge () {
		return age;
	}
	
	public void setAge (int age_in) {
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
	
	public void setQueueID () {
		queueID.setID(getID());
		queueID.setTriage(getTriage());
	}
	public QueueID getQueueID () {
		setQueueID();
		return queueID;
	}
	
}
