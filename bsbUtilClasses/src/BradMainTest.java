import java.util.Calendar;
import java.util.GregorianCalendar;

import com.bsb.validators.AgeValidator;;


public class BradMainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Calendar date = new GregorianCalendar();		
		date.set(1981, 4, 28);
		
		String cc = "US";
		String name = "Bradley S Bouchard";
		
		AgeValidator.ageValidator(date, cc, name);
	}

}
