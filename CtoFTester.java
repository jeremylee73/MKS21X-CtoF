public class CtoFTester {
  public static double celsiusToFahrenheit(double temp) {
    return ((temp * 1.8) + 32);
  }

  public static double fahrenheitToCelsius(double temp) {
    return ((temp - 32) / 1.8);
  }

  public static void main(String[] args) {
    System.out.println(celsiusToFahrenheit(0));
    System.out.println(fahrenheitToCelsius(32));
  }
}
