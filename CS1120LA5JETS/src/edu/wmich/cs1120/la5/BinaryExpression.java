package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression {

	private IOperation op;
	private IExpression left;
	private IExpression right;
	
	/**
	 * Sets attributes of object from parameters
	 * @param left Literal object holding left value
	 * @param right Literal object holding right value
	 * @param op Object holding corresponding operation based on .dat character
	 */
	public BinaryExpression(IExpression left, IExpression right, IOperation op) {
		this.left = left;
		this.right = right;
		this.op = op;
	}
	
	/**
	 * Gets value of operation based on operator in .dat file
	 * @return Value of operation using left and right values
	 */
	public int getValue() {
		return op.perform(left, right);
	}

}
