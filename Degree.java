public class Degree {
    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
    
    public static void main(String[] args) {
        // Declare the Celsius temperature
        double celsius = 29.0;
        
        // Convert to Fahrenheit
        double fahrenheit = celsiusToFahrenheit(celsius);
        
        // Print the result
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
    }
}