import java.util.HashMap;
public class SymptomForm {
	//Data
	private HashMap <String, Symptom> symptoms; 
	//Constructors
	public SymptomForm (HashMap <String, Symptom> symptoms_in) {
		symptoms = symptoms_in;
	}
	public SymptomForm () {
	}
	//Methods
	public void addSymptom (HashMap <String,Symptom> symptoms, Symptom symptom_in) {
		symptoms.put(symptom_in.getName(),symptom_in);
	}
	public void removeSymptom (HashMap<String,Symptom> symptoms, Symptom symptom_in) {
		symptoms.remove(symptom_in.getName(),symptom_in);
	}
	public HashMap <String, Symptom> getSymptomForm () {
		return symptoms;
	}
}
