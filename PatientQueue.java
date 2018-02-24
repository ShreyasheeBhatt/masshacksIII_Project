import java.util.ArrayList;

public class PatientQueue {
	//Data
	private ArrayList<Patient> queue;
	private ArrayList <Patient> sortedqueue;
	//Constructors
	public PatientQueue () {
		queue = new ArrayList<Patient> ();
		sortedqueue = new ArrayList<Patient>();
	}
	//Methods	
	public void addPatient (Patient patient_in) {
		queue.add(patient_in);
	}
	public void removePatient (int ID_in) {
		queue.remove(ID_in);
	}
	
	public void sortPatients () {
		/**Set set = queue.entrySet();
		Iterator i = set.iterator();
		while (i.hasNext()) {
			Map.Entry current = (Map.Entry)i.next();
			sortedqueue.add(queue.get(current));
		}
		
		**/
			sortedqueue.clear();
			for (int i=1;i<=5;i++) {
				for (int j=0;j<queue.size();j++) {
					if (queue.get(j).getTriage()==i) {
					sortedqueue.add(queue.get(j));
					}
			}
		}
	}
	
	public ArrayList <Patient> getSortedQueue () {
		sortPatients();
		return sortedqueue;
	}
	
}
