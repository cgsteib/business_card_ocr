package cgsteib.business_card_ocr;

import java.util.HashMap;
import java.util.regex.Pattern;

public class BusinessCardParser {
	private static final Pattern PHONE_PATTERN = 
			Pattern.compile("^[0-9]{10}");
	private static final Pattern EMAIL_PATTERN =
			Pattern.compile("^[A-Z0-9]+([A-Z0-9.])*@[A-Z0-9]+\\.[A-Z]+$", Pattern.CASE_INSENSITIVE);
	
	/**
	 * Method for parsing a String containing the text captured from Optical
	 * Character Recognition (OCR) of a business card and returning a
	 * ContactInfo object containing the individual's name, phone number, and
	 * email address.
	 * 
	 * @param document
	 * @return
	 */
	public static ContactInfo getContactInfo(String document) {
		String name = "";
		String phoneNumber = "";
		String emailAddress = "";
		
		HashMap<String, String> tokenMap = new HashMap<>();
		
		String[] lines = document.split("\n");
		
		for(String line : lines) {
			if(EMAIL_PATTERN.matcher(line).find()) {
				emailAddress = line;
				continue;
			}
			
			String phoneLine = line.replaceAll("[^0-9@]", "");
			if(PHONE_PATTERN.matcher(phoneLine).find() && !line.toLowerCase().contains("fax")) {
				phoneNumber = phoneLine;
				continue;
			}
			
			String[] tokens = line.split("\\W");
			for(String token : tokens) {
				tokenMap.put(token, line);
			}
		}
		
		for(String token : tokenMap.keySet()) {
			String userName = emailAddress.split("@")[0];
			if(userName.toLowerCase().contains(token.toLowerCase())) {
				name = tokenMap.get(token);
				continue;
			}
		}
		
		return new ContactInfo(name, phoneNumber, emailAddress);
	}
}
