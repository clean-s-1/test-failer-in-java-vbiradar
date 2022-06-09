/**
 * 
 */


public class ColorPairService {
	
	public int printColourMapAndreturnColorCodeNumber(String[] majorColors, String[] minorColors) {

		System.out.println(+majorColors.length * minorColors.length + " pair color code");
		System.out.println("Pair no|Major color|Minor color");
		for (int i = 0; i < majorColors.length; i++) {
			for (int j = 0; j < minorColors.length; j++) {

				ColorPair colorPair = new ColorPair();
				colorPair.setPairNumber(i * 5 + j + 1);
				colorPair.setMajorColor(majorColors[i]);
				colorPair.setMinorColor(minorColors[j]);
				System.out.printf(getFormattedColorPair(colorPair));

			}

		}
		return majorColors.length * minorColors.length;
	}

	public String getFormattedColorPair(ColorPair colorPair) {

		return String.format("%d %s %s %n", colorPair.getPairNumber(), colorPair.getMajorColor(),
				colorPair.getMinorColor());
	}

}
