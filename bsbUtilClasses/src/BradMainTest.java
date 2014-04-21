import java.util.Calendar;
import java.util.GregorianCalendar;

import com.bsb.validators.AgeValidator;;


public class BradMainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Calendar date = new GregorianCalendar();		
		date.set(1993, 3, 19);
		
		String cc = "US";
		String name = "Nigel";
		
		AgeValidator.ageValidator(date, cc, name);
	}

}
