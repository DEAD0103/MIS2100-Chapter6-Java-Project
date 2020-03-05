package Cook.Brendon.Chapter6.Java.Project;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleMathTest {

	@Test
	public void testThatZeroNumeratorReturnsZero() {
		SimpleMath test1 = new SimpleMath();
		assertEquals(0,test1.divide(0,7),0.01);
	}
	@Test
	public void testThatSmallerNumeratorReturnsDecimalValue() {
		SimpleMath test2 = new SimpleMath();
		assertEquals(.25,test2.divide(1,4),0.01);
	}
	@Test(expected=ArithmeticException.class)
	public void testThatZeroDenominatorThrowsException() {
		SimpleMath test3 = new SimpleMath(); 
		test3.divide(6,0);
	}
	

}
