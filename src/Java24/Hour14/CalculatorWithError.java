package Java24.Hour14;

public class CalculatorWithError {
    public static void main(String[] args) {
        String[] numbers = {"1","2","e"};
        float sum = 0;
        for (String number : numbers) {
            try
            {
                sum = sum + Float.parseFloat(number);
            }
            catch (NumberFormatException e) {
                System.out.println(number + " is not a number.");
            }
        }
        System.out.println("Those numbers add up to " + sum);
    }
}
