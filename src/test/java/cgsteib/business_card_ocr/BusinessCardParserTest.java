package cgsteib.business_card_ocr;

import static org.junit.Assert.*;

import org.junit.Test;

public class BusinessCardParserTest {

	private static final String testInput1 =
        	"ASSYMMETRIK LTD\n" +
        	"Mike Smith\n" +
        	"Senior Software Engineer\n" +
        	"(410)555-1234\n" +
        	"msmith@asymmetrik.com";
	private static final String expectedResult1 =
			"Name: Mike Smith\n" +
	        "Phone: 4105551234\n" +
			"Email: msmith@asymmetrik.com\n";

    private static final String testInput2 =
        	"Foobar Technologies\n" +
        	"Analytic Developer\n" +
        	"Lisa Haung\n" +
        	"1234 Sentry Road\n" +
        	"Columbia, MD 12345\n" +
        	"Phone: 410-555-1234\n" +
        	"Fax: 410-555-4321\n" +
        	"lisa.haung@foobartech.com";
    private static final String expectedResult2 =
    		"Name: Lisa Haung\n" +
            "Phone: 4105551234\n" +
    		"Email: lisa.haung@foobartech.com\n";
        	
    private static final String testInput3 =	 
        	"Arthur Wilson\n" +
        	"Software Engineer\n" +
        	"Decision & Security Technologies\n" +
        	"ABC Technologies\n" +
        	"1234 North 11th Street\n" +
        	"Suite 229\n" +
        	"Arlington, VA 22209\n" +
        	"Tel: +1 (703) 555-1259\n" +
        	"Fax: +1 (703) 555-1200\n" +
        	"awilson@abctech.com";
    private static final String expectedResult3 =
    		"Name: Arthur Wilson\n" +
    		"Phone: 17035551259\n" +
    		"Email: awilson@abctech.com\n";
	
	@Test
	public void test() {
		ContactInfo testObj1 = BusinessCardParser.getContactInfo(testInput1);
		ContactInfo testObj2 = BusinessCardParser.getContactInfo(testInput2);
		ContactInfo testObj3 = BusinessCardParser.getContactInfo(testInput3);
		
		assertEquals(expectedResult1, testObj1.toString());
		assertEquals(expectedResult2, testObj2.toString());
		assertEquals(expectedResult3, testObj3.toString());
	}

}
