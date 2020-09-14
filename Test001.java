package testcases;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Samples.*;

public class Test001 {
	 @Test
	 public void testA() {
			assertEquals(1, FloorSquareRoot.floorSqrt(3));
	 }

	 @Test
	 public void testB() {
			assertEquals(5, FloorSquareRoot.floorSqrt(20));
	 }
}

