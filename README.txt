Requirements:
 * Java 1.7 or later
 * JUnit 4
 * Maven 3.5
 
To compile:
 * In a terminal:
 *   Navigate to the directory with pom.xml
 *   Enter: mvn compile
 
To test:
 *  In a terminal:
 *    Navigate to the directory with pom.xml
 *    Enter: mvn test

To run:
 * In a terminal:
 *   Navigate to the directory with pom.xml
 *   Enter: mvn -exec:java -Dexec.mainClass="cgsteib.business_card_ocr.BusinessCardOCRApp"
 
Execution details:
 * The program will ask for input similar to what would appear on a business
 * card. Simply enter in text line by line, and hit enter on an empty line to
 * complete the entry. The program will parse the input and display back to the
 * user the name, phone number, and email address provided.
 * 
 * Input format expectations:
 *  - Phone number expects 10 or more digits with the word "fax" not appearing
 *    in the same line.
 *  - Email address expects <mailbox>@<host>.<tld> format.
 *  - Name expects either part of the individual's name to appear in the
 *    mailbox portion of the email address.
 *
 * Example input:
 * Foobar Technologies
 * Analytic Developer
 * Lisa Haung
 * 1234 Sentry Road
 * Columbia, MD 12345
 * Phone: 410-555-1234
 * Fax: 410-555-4321
 * lisa.haung@foobartech.com
 *
 * Example output:
 * Name: Lisa Haung
 * Phone: 4105551234
 * Email: lisa.haung@foobartech.com