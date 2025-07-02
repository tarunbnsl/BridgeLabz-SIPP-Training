package Day1_ProgrammingElements;

public class earthVolume {
	    public static void main(String[] args) {
	        // Radius of Earth in kilometers
	        double radiusKm = 6378.0;

	        // Conversion factor from kilometers to miles (1 km = 0.621371 miles)
	        double kmToMiles = 0.621371;

	        // Volume formula: (4/3) * π * r^3
	        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

	        // Convert radius to miles
	        double radiusMiles = radiusKm * kmToMiles;

	        // Compute volume in cubic miles
	        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

	        // Print the result
	        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3);
	        System.out.println("The volume of Earth in cubic miles is " + volumeMiles3);
	    
	}

}
