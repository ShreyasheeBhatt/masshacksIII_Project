import java.util.ArrayList;
public class PatientQueueTester {
	public static void main (String args []) {
		PatientQueue pq = new PatientQueue();
		Patient p1 = new Patient ("John",1,5,10);
		p1.setTime(30);
		pq.addPatient(p1);
		Patient p2 = new Patient("Susy",2,2,9);
		p2.setTime(60);
		pq.addPatient(p2);
		Patient p3 = new Patient("Billy",2,2,8);
		p3.setTime(90);
		pq.addPatient(p3);
		pq.sortPatients();
		ArrayList <Patient> sortedQueue = pq.getSortedQueue();
		for (int i=0;i<sortedQueue.size();i++) {
			System.out.println("PATIENT NAME: " + sortedQueue.get(i).getName());
			System.out.println("PATIENT TRIAGE: " + sortedQueue.get(i).getTriage());
			System.out.println("PAIENT TIME: " + sortedQueue.get(i).getTime());
			System.out.println("URGENCY: " + sortedQueue.get(i).getUrgency());
			System.out.println();
		}
	}
}
