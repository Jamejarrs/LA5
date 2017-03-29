package edu.wmich.cs1120.la5;

public class Literal implements IExpression {

	private int value;
	
	public Literal(int value){
		this.value = value;
	}
	/**
	 * Returns the value for the expression
	 * @return value - the value for the expression
	 */
	@Override
	public int getValue() {
		return value;
	}

}
