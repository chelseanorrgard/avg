# Average Calculator

A Java program for calculating the average of an array of integers and printing information about invalid numbers in the array.

## Description

This program provides methods for calculating the average of an array of integers and printing information about invalid numbers. It includes the following features:

- Calculation of the average of non-negative numbers in an array.
- Detection of invalid numbers (negative numbers) in an array and printing of corresponding messages.

## Task

The original task is to modify the `avg` method to only accept arrays composed of non-negative numbers. If the array contains negative numbers, the method informs the client of all the indices where there are negative numbers in the array.

### Examples

Example 1:

Input:
[ 1, -2, -3, 4 ]

Output:
The 2nd number -2 in your array is invalid
The 3rd number -3 in your array is invalid


Example 2:

Input:
[ 1, 2, 3 ]

Output:
2.0


## Usage

To use the `AverageCalculator` class, follow these steps:

1. Instantiate an `AverageCalculator` object.
2. Call the `printInvalidNumbers` method with an array of integers to check for invalid numbers. This method returns `true` if the array contains invalid numbers.
3. If `printInvalidNumbers` returns `false`, call the `avg` method with the same array to calculate the average.

Here's an example of how to use the `AverageCalculator` class:

```java
AverageCalculator calculator = new AverageCalculator();

int[] nums = { 1, 2, -3, 4 };
boolean hasInvalidNumbers = calculator.printInvalidNumbers(nums);
if (!hasInvalidNumbers) {
    try {
        float average = calculator.avg(nums);
        System.out.println("Average: " + average);
    } catch (AverageCalculator.EmptyArray e) {
        System.out.println("No average can be calculated due to invalid inputs.");
    }
} else {
    System.out.println("No average can be calculated due to invalid inputs.");
}

## Documentation
The AverageCalculator class includes the following methods:

printInvalidNumbers(int[] nums): Prints information about invalid numbers in the input array.
avg(int[] nums) throws EmptyArray: Calculates the average of non-negative numbers in the input array.
For detailed documentation of each method, refer to the source code.
