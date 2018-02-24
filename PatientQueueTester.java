import java.util.ArrayList;
public class PatientQueueTester {
	public static void main (String args []) {
		PatientQueue pq = new PatientQueue();
		Patient p1 = new Patient ("John",1,5);
		pq.addPatient(p1);
		Patient p2 = new Patient("Susy",2,2);
		pq.addPatient(p2);
		Patient p3 = new Patient("Billy",2,2);
		pq.addPatient(p2);
		pq.sortPatients();
		ArrayList <Patient> sortedQueue = pq.getSortedQueue();
		for (int i=0;i<sortedQueue.size();i++) {
			System.out.println("PATIENT ID: " + sortedQueue.get(i).getID());
			System.out.println("PATIENT TRIAGE: " + sortedQueue.get(i).getTriage());
		}
	}
}
