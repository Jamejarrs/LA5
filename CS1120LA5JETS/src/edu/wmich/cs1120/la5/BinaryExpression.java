package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression {

	private IOperation op;
	private IExpression left;
	private IExpression right;
	
	
	public BinaryExpression(IExpression left, IExpression right, IOperation op) {
		this.left = left;
		this.right = right;
		this.op = op;
	}
	
	@Override
	public int getValue() {

		return op.perform(left, right);

	}

}
