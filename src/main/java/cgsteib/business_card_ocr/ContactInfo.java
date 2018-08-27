package cgsteib.business_card_ocr;

/**
 * 
 * @author Chris Steib
 *
 */
public class ContactInfo {
	private String name;
	private String phoneNumber;
	private String emailAddress;
	
	/**
	 * Constructor for ContactInfo.
	 * 
	 * @param name
	 * @param phoneNumber
	 * @param emailAddress
	 */
	public ContactInfo(String name, String phoneNumber, String emailAddress) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	
	/**
	 * 
	 * @return The individual's name.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @return The individual's phone number in the format of all digits. 
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * 
	 * @return The individual's email address.
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	
	/**
	 * @return A string containing the pretty print format of object:<p>
	 *     Name: (Name)<br>
	 *     Phone: (Phone)<br>
	 *     Email: (Email)<br>
	 */
	public String toString() {
		return "Name: " + name + "\n" + 
				"Phone: " + phoneNumber + "\n" +
				"Email: " + emailAddress + "\n";
	}
}
