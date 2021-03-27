package program;

import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FibonacciFunctional implements Fibonacci{

  @Override
  public int fibonacci(int position) {
    if(position < 0) {
      throw new RuntimeException("Invalid Number: " + position);
    }

    return Stream.iterate(new int[]{1, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
        .limit(position + 1)
        .map(n -> n[0])
        .collect(toList()).get(position);
  }
}
