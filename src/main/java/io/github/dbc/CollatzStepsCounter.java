package io.github.dbc;

public class CollatzStepsCounter {
    /**
     * This method returns the number of steps required to reach 1 from the given number.
     *
     * @param number the number to count the steps for.
     * @return the number of steps required to reach 1 OR Integer.MIN_VALUE if the number is negative.
     */
    public int countStepsToReachOne(int number) {
        int numberOfSteps = 0;
        int tempNumber = number;
        if (number < 0) {
            return Integer.MIN_VALUE;
        } else {
            while (tempNumber > 1) {
                if (tempNumber % 2 == 0) {
                    tempNumber /= 2;
                    numberOfSteps += 1;
                } else {
                    tempNumber = (3 * tempNumber) + 1;
                    numberOfSteps += 1;
                }
            }
            return numberOfSteps;
        }
    }
}
