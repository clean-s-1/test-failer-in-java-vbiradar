/**
 * 
 */

public class NetworkAlertStub {

	public int sendRequset(float celcius) {

		System.out.println("ALERT: Temperature is " + celcius + " celcius");
		int responseCode = 0;
		// Return 200 for ok
		// Return 500 for not-ok
		// stub always succeeds and returns 200
		if (celcius > 200) {
			responseCode = 500;
		} else {
			responseCode = 200;
		}
		return responseCode;
	}

}
