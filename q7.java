// 7. Write a Program to compute the volume of Earth in km^3 and miles^3
// Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
// O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____
 
public class q7 {
    public static void main(String[] args) {
    
        double radiusKm = 6378;               
        double pi = Math.PI;                    
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);
        double conversionFactor = Math.pow(0.621371, 3);
        double volumeMiles3 = volumeKm3 * conversionFactor;

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +" and cubic miles is " + volumeMiles3);
    }
}

