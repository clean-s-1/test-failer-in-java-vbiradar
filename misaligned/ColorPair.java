
public class ColorPair {
	private Integer pairNumber;
	private String majorColor;
	private String minorColor;

	public Integer getPairNumber() {
		return pairNumber;
	}

	public void setPairNumber(Integer pairNumber) {
		this.pairNumber = pairNumber;
	}

	public String getMajorColor() {
		return majorColor;
	}

	public void setMajorColor(String majorColor) {
		this.majorColor = majorColor;
	}

	public String getMinorColor() {
		return minorColor;
	}

	public void setMinorColor(String minorColor) {
		this.minorColor = minorColor;
	}

	@Override
	public String toString() {
		return "ColorPair [pairNumber=" + pairNumber + ", majorColor=" + majorColor + ", minorColor=" + minorColor
				+ "]";
	}

}
