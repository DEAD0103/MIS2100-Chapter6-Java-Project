package Cook.Brendon.Chapter6.Java.Project;

public class SimpleMath {
	public double divide(double numerator, double denominator) {
		if(denominator == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		double result = numerator/denominator;
		return result;
	}
	public double multiply(double number1, double number2) {
		double result2 = number1*number2;
				return result2;
		
	}
}
