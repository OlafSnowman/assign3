package program;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

  Fibonacci fibonacci;

  @Test
  public void Canary() {
    assertTrue(true);
  }

  @Test
  public void imperativeFibonacciAtDifferentPositions() {
    fibonacci = new FibonacciImperative();

    assertAll(
      () -> assertEquals(1, fibonacci.fibonacci(0)),
      () -> assertEquals(1, fibonacci.fibonacci(1)),
      () -> assertEquals(2, fibonacci.fibonacci(2)),
      () -> assertEquals(3, fibonacci.fibonacci(3)),
      () -> assertEquals(8, fibonacci.fibonacci(5)),
      () -> assertEquals(55, fibonacci.fibonacci(9))
    );
  }

  @Test
  public void imperativeFibonacciOfNegativeNumber() {
    fibonacci = new FibonacciImperative();
    var exception = assertThrows(RuntimeException.class, () -> fibonacci.fibonacci(-2));

    assertEquals("Invalid Number: -2", exception.getMessage());
  }

  @Test
  public void functionalFibonacciAtDifferentPositions() {
    fibonacci = new FibonacciFunctional();

    assertAll(
        () -> assertEquals(1, fibonacci.fibonacci(0)),
        () -> assertEquals(1, fibonacci.fibonacci(1)),
        () -> assertEquals(2, fibonacci.fibonacci(2)),
        () -> assertEquals(3, fibonacci.fibonacci(3)),
        () -> assertEquals(8, fibonacci.fibonacci(5)),
        () -> assertEquals(55, fibonacci.fibonacci(9))
    );
  }

  @Test
  public void functionalFibonacciOfNegativeNumber() {
    fibonacci = new FibonacciFunctional();
    var exception = assertThrows(RuntimeException.class, () -> fibonacci.fibonacci(-2));

    assertEquals("Invalid Number: -2", exception.getMessage());
  }
}
