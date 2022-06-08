public class Misaligned {
  
	public static void main(String[] args) { 
    	String majorColors[] = {"White", "Red", "Black", "Yellow", "Violet"};
        String minorColors[] = {"Blue", "Orange", "Green", "Brown", "Slate"};
        int result = ColorParService.printColourMapAndreturnColorCodeNumber(majorColors, minorColors);
        
       assert(result == 25);
       System.out.println("All is well (maybe!)");
    }
}
