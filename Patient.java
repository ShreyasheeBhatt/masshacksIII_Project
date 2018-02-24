public class Patient {
	//Data
	private String name;
	private String phonenumber;
	
	//Constructor
	/*
	 * Empty constructor
	 */
	public Patient () {
	}
	
	/*
	 * Constructor with name_in field and phonenumber_in field
	 */
	public Patient (String name_in, String phonenumber_in) {
		name = name_in;
		phonenumber = phonenumber_in;
	}
	
	/*
	 * 
	 */
	public void setName(String name_in) {
		name = name_in;
	}
	
	public void setPhone(String phonenumber_in) {
		phonenumber = phonenumber_in;
	}
	
	
	//Methods
	
}
