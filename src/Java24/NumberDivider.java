package Java24;

public class NumberDivider {
    public static void main(String[] args) {
        String[] numbers = {"1","0"};
        if (numbers.length == 2) {
            int result = 0;
            try {
                result = Integer.parseInt(numbers[0]) /
                        Integer.parseInt(numbers[1]);
                System.out.println(numbers[0] + " divided by " +
                        numbers[1] + " equals " + result);
            } catch (NumberFormatException e) {
                System.out.println("Both arguments must be integers.");
            } catch (ArithmeticException e) {
                System.out.println("You cannot divide by zero.");
            }
        }
    }
}
