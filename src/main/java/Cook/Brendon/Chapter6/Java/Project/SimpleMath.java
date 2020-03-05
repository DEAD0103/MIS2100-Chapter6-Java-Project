package Cook.Brendon.Chapter6.Java.Project;

public class SimpleMath {
	public double divide(double numerator, double denominator) {
		if(denominator == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		double result = numerator/denominator;
		return result;
	}

}
