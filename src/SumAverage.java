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
    double result;
    while (true){
      result = (lowerBound + upperBound) / 2d;
      break;}
    return result;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return average of integers
   */
  public static double average(int[] numbers) {
    Double result;
    int counter;
    do {
      result = (numbers[0] + numbers [numbers.length -1]) / 2d;
      counter = 1;
    } while (counter != 1);

    return result;
  }
}