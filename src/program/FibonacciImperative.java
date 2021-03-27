package program;

public class FibonacciImperative {
  public int imperativeIteration(int number) {
    if(number < 0) {
      throw new RuntimeException("Invalid Number: " + number);
    }

    int fibOne = 1;
    int fibTwo = 1;
    int fibonacci = fibOne;

    for (int i = 1; i < number; i++) {
      fibonacci = fibOne + fibTwo;
      fibOne = fibTwo;
      fibTwo = fibonacci;
    }

    return fibonacci;
  }
}
