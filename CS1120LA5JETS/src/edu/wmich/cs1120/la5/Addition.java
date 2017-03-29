package edu.wmich.cs1120.la5;

public class Addition implements IOperation {

	/**
	 * Performs addition for the two literal values from the .dat file and returns the result
	 * @param left Object holding literal for left value
	 * @param right Object holding literal for right value
	 * @return Sum of left and right values
	 */
	public Integer perform(IExpression left, IExpression right) {
		return (left.getValue() + right.getValue());
	}



}
