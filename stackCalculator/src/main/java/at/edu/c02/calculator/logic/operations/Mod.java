package at.edu.c02.calculator.logic.operations;

import at.edu.c02.calculator.CalculatorException;
import at.edu.c02.calculator.MathOperation;

public class Mod implements MathOperation {
	
	@Override
	public double calculate(double a, double b) throws CalculatorException {

		if (b == 0) {
			throw new CalculatorException("Division by zero");
		}
		
		return a % b;
	}
}
