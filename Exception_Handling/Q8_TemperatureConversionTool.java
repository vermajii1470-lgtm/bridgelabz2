public class Q8_TemperatureConversionTool {
    static class InvalidTemperatureException extends Exception { public InvalidTemperatureException(String m){ super(m);} }

    static double cToF(double c) { return c * 9/5 + 32; }
    static double fToC(double f) { return (f - 32) * 5/9; }

    static void convert(double value, char unit) throws InvalidTemperatureException {
        if(unit == 'C' || unit == 'c') {
            if(value < -273.15) throw new InvalidTemperatureException("Temperature below absolute zero is not possible!");
            System.out.printf("%.2f°C = %.2f°F%n", value, cToF(value));
        } else if(unit == 'F' || unit == 'f') {
            if(value < -459.67) throw new InvalidTemperatureException("Temperature below absolute zero is not possible!");
            System.out.printf("%.2f°F = %.2f°C%n", value, fToC(value));
        } else {
            System.out.println("Unknown unit. Use 'C' or 'F'.");
        }
    }

    public static void main(String[] args) {
        try {
            convert(-300, 'C');
        } catch (InvalidTemperatureException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
