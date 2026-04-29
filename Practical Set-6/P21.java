public class PR21 {

    public void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        PR21 obj = new PR21();

        try {
            obj.checkEligibility(16);
            obj.checkEligibility(20);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Validation process completed");
        }
    }
}