package program;

public class FibonacciImperative implements Fibonacci{

  @Override
  public int fibonacci(int position) {
    if(position < 0) {
      throw new RuntimeException("Invalid Number: " + position);
    }

    int previous = 1;
    int current = 1;
    int fibonacci = previous;

    for (int i = 1; i < position; i++) {
      fibonacci = previous + current;
      previous = current;
      current = fibonacci;
    }

    return fibonacci;
  }
}
