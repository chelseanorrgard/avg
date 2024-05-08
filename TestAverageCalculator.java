public class TestAverageCalculator {
    public static void main(String[] args) {
        AverageCalculator calculator = new AverageCalculator();

        int[] nums1 = { 1, -2, -3, 4 };
        System.out.println("Output for nums1:");
        boolean invalid1 = calculator.printInvalidNumbers(nums1);
        if (!invalid1) {
            try {
                float result1 = calculator.avg(nums1);
                System.out.println(result1);
            } catch (AverageCalculator.EmptyArray e) {
                System.out.println("No average can be calculated due to invalid inputs.");
            }
        } else {
            // No need to handle the EmptyArray exception here since it's already handled
            // above
        }

        int[] nums2 = { 1, 2, 3 };
        System.out.print("\nOutput for nums2:"); // Remove the println and add print here
        boolean invalid2 = calculator.printInvalidNumbers(nums2);
        if (!invalid2) {
            try {
                float result2 = calculator.avg(nums2);
                System.out.println(result2);
            } catch (AverageCalculator.EmptyArray e) {
                System.out.println("No average can be calculated due to invalid inputs.");
            }
        } else {
            // No need to handle the EmptyArray exception here since it's already handled
            // above
        }
    }
}
