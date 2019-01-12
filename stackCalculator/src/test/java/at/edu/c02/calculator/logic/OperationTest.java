package at.edu.c02.calculator.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import at.edu.c02.calculator.CalculatorException;
import at.edu.c02.calculator.MathOperation;
import at.edu.c02.calculator.logic.operations.Add;
import at.edu.c02.calculator.logic.operations.Div;
import at.edu.c02.calculator.logic.operations.Mul;

public class OperationTest {

	@Test
	public void testAdd() throws CalculatorException {
		//setup
		MathOperation add = new Add();
		
		//execute
		double result = add.calculate(3, 4);
		
		//verify
		assertEquals(7, result, 0.0001);
	}

	@Test 
	public void testMult() throws CalculatorException {
		//setup
		MathOperation mult = new Mul();
		
		//execute 
		double result = mult.calculate(50, 3);
		
		//verify
		assertEquals(150, result, 3);
		
		double result2 = mult.calculate(-30, 30);
		assertEquals(-900, result2, 3);

		double result3 = mult.calculate(-30, -2);
		assertEquals(60, result3, 3);
	}
	
	@Test
	public void testDiv() throws CalculatorException {
		MathOperation div = new Div();
		
		double result = div.calculate(22, 5.5);
		
		assertEquals(4, result, 0.0001);
		
		try {
			double result2 = div.calculate(23, 0);
		
			fail("Exception expected");
		} catch (CalculatorException e) {
			assertEquals("Division by zero", e.getMessage());
		}
	}
	
}
