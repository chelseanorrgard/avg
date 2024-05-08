/**
 * A class that provides methods for calculating the average of an array of
 * integers and
 * printing information about invalid numbers in the array.
 */
public class AverageCalculator {

    /**
     * An exception class indicating that the input array is empty.
     */
    static class EmptyArray extends Exception {
        public EmptyArray() {
            super("Empty Array");
        }
    }

    /**
     * Prints information about invalid numbers in the input array.
     * 
     * @param nums The array of integers to be checked for invalid numbers.
     * @return true if the array contains invalid numbers, false otherwise.
     */
    boolean printInvalidNumbers(int[] nums) {
        StringBuilder message = new StringBuilder();
        boolean hasInvalidNumbers = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                message.append("The ").append(i + 1).append(getOrdinalSuffix(i + 1))
                        .append(" number ").append(nums[i])
                        .append(" in your array is invalid\n");
                hasInvalidNumbers = true;
            }
        }

        System.out.println(message.toString());
        return hasInvalidNumbers;
    }

    /**
     * Calculates the average of non-negative numbers in the input array.
     * If the array contains negative numbers, an EmptyArray exception is thrown.
     * 
     * @param nums The array of integers for which the average is to be calculated.
     * @return The average of non-negative numbers in the array.
     * @throws EmptyArray if the input array is empty or contains negative numbers.
     */
    float avg(int[] nums) throws EmptyArray {
        int sum = 0;
        int count = 0;

        if (nums == null || nums.length == 0) {
            throw new EmptyArray();
        }

        StringBuilder message = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                sum += nums[i];
                count++;
            } else {
                message.append("The ").append(i + 1).append(getOrdinalSuffix(i + 1))
                        .append(" number ").append(nums[i])
                        .append(" in your array is invalid\n");
            }
        }

        if (message.length() > 0) {
            System.out.println(message.toString());
            return 0;
        }

        return (float) sum / count;
    }

    /**
     * Gets the ordinal suffix for a given number.
     * 
     * @param number The number for which the ordinal suffix is to be determined.
     * @return The ordinal suffix (e.g., "st", "nd", "rd", or "th").
     */
    private String getOrdinalSuffix(int number) {
        if (number >= 11 && number <= 13) {
            return "th";
        }
        switch (number % 10) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }
    }

    /**
     * Main method for testing the AverageCalculator class.
     * 
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
    }
}
