/**
 * Compute the sum and average for running integers using loop.
 */
public class SumAverage {

  /**
   * Computes sum of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return sum of integers
   */
  public static int sum(int lowerBound, int upperBound) {
    int result = 0;
    for (int i = lowerBound; i != upperBound + 1; i++){
      result = result + i;
    }
    return result;
  }

  /**
   * Computes sum of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return sum of integers
   */
  public static int sum(int[] numbers) {
    int result = 0;
    for (int num : numbers){
      result = result + num;
    }
    return result;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return average of integers
   */
  public static double average(int lowerBound, int upperBound) {
    double result = 0, stepper = lowerBound, counter = 0;

    while (stepper <= upperBound){
        result += stepper;
        stepper++;
        counter++;
    }
    return result / counter;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return average of integers
   */
  public static double average(int[] numbers) {
    Double result = 0d;
    int counter = 0;
    do {
      result += numbers[counter];
      counter++;
    } while (counter < numbers.length);

    return result / numbers.length;
  }
}