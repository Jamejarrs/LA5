package edu.wmich.cs1120.la5;

public class ExpressionFactory {
	
	/**
	 * Sets values and character from .dat file to objects of IExpression and IOperation classes and uses these to perform
	 * a function based on the character
	 * @param operator Character from .dat file determining whether process done is addition or subtraction
	 * @param val1 Left value from .dat file
	 * @param val2 Right value from .dat file
	 * @return Object containing value of binary expression
	 */
	public static IExpression getExpression(char operator,int val1,int val2) {
		IExpression left = new Literal(val1);
		IExpression right = new Literal(val2);
		IOperation op;
		if (operator == '+')
			op = new Addition();
		else
			op = new Subtraction();
		return new BinaryExpression(left, right, op);
	}
}
