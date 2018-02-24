public class QueueID {
	private int ID;
	private int triage;
	public QueueID (int ID_in, int triage_in) {
		ID = ID_in;
		triage = triage_in;
	}
	public void setID (int ID_in) {
		ID = ID_in;
	}
	public void setTriage (int triage_in) {
		triage = triage_in;
	}
	public int getID () {
		return ID;
	}
	public int getTriage () {
		return triage;
	}
}
