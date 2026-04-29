public class PR20 {
    public static void main(String[] args) {
        try {
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            int result = numerator / denominator;

            System.out.println("Result: " + result);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide two arguments");
        } 
        catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } 
        catch (Exception e) {
            System.out.println("Some error occurred");
        }
    }
}