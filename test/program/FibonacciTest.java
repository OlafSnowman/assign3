package program;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

  FibonacciImperative fibonacciImperative;

  @BeforeEach
  public void init() {
    fibonacciImperative = new FibonacciImperative();
  }

  @Test
  public void Canary() {
    assertTrue(true);
  }

  @Test
  public void imperativeFibonacciOf0() {
    assertEquals(1, fibonacciImperative.imperativeIteration(0));
  }

  @Test
  public void imperativeFibonacciOf1() {
    assertEquals(1, fibonacciImperative.imperativeIteration(1));
  }

  @Test
  public void imperativeFibonacciOf2() {
    assertEquals(2, fibonacciImperative.imperativeIteration(2));
  }

  @Test
  public void imperativeFibonacciOf3() {
    assertEquals(3, fibonacciImperative.imperativeIteration(3));
  }
  
  @Test
  public void imperativeFibonacciOf5() {
    assertEquals(8, fibonacciImperative.imperativeIteration(5));
  }

  @Test
  public void imperativeFibonacciOf9() {
    assertEquals(55, fibonacciImperative.imperativeIteration(9));
  }

  @Test
  public void imperativeFibonacciOfNegativeNumber() {
    var exception = assertThrows(RuntimeException.class, () -> fibonacciImperative.imperativeIteration(-2));

    assertEquals("Invalid Number: -2", exception.getMessage());
  }

}
