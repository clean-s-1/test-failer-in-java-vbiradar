public class alerter {
	static int alertFailureCount = 0;

	static float convertFarenheitToCelcius(final float farenheit) {
		return (farenheit - 32) * 5 / 9;

	}
	static void alertInCelcius(final float farenheit, final IAlerter alertStub) {
		float celcius = convertFarenheitToCelcius(farenheit);
		// int returnCode = networkAlertStub(celcius);
		int returnCode = alertStub.sendRequset(celcius);
		if (returnCode != 200) {
			// non-ok response is not an error! Issues happen in life!
			// let us keep a count of failures to report
			// However, this code doesn't count failures!
			// Add a test below to catch this bug. Alter the stub above, if needed.
			alertFailureCount += 1;
		}
	}

	public static void main(String[] args) {
		IAlerter alertStub = new NetworkAlertStub();
		alertInCelcius(400.5f, alertStub);
		alertInCelcius(303.6f, alertStub);
		assert (alertFailureCount != 0);
		System.out.printf("%d alerts failed.\n", alertFailureCount);
		System.out.println("All is well (maybe!)\n");
	}
}
