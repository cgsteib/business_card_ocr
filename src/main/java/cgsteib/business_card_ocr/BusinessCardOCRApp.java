package cgsteib.business_card_ocr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Main class for the Business Card OCR Application.
 *
 */
public class BusinessCardOCRApp 
{
    public static void main( String[] args )
    {
    	String document = "";
    	System.out.println("Enter in text from business card:");
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String line;
    	try {
    		while((line = br.readLine()) != null) {
    			if(line.isEmpty()) {
    				break;
    			}
    			document += line + "\n";
    		}
    		br.close();

        	ContactInfo contactInfo = BusinessCardParser.getContactInfo(document);
        	System.out.println(contactInfo);
    	}
    	catch(IOException e) {
    		e.printStackTrace(System.err);
    	}
    }
}
