package programmingelements;

public class volume_of_earth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r = 6378.0;
		double pie = 3.14159;
		double vol_in_cubic_kms = (4.0/3.0) * pie * Math.pow(r, 3);
		double r_miles = r * 0.621371;
		double vol_in_cubic_miles = (4.0/3.0) * pie * Math.pow(r_miles,  3);
		System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f", vol_in_cubic_kms, vol_in_cubic_miles);
	}

}
