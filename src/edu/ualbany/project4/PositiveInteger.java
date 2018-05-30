package edu.ualbany.project4;

/** Class that extends Semigroup, stores a postive integer,
 *and implements operator
 */
public class PositiveInteger extends Semigroup<PositiveInteger> {

	private int positiveInt;
	
	/**Constructor that sets the positive int
	 * Sets positive int to 0 if the given number is < 0
	 * @param positiveInt
	 */
	public PositiveInteger(int positiveInt) {
		if(positiveInt >= 0) {
			this.positiveInt = positiveInt;
		} else {
			//given negative int so set to 0
			this.positiveInt = 0;
		}
	}
	
	/**Accessor
	 * @return - positiveInt
	 */
	public int getPositiveInt() {
		return positiveInt;
	}
	
	/* Adds both positive integer values and returns as a new PositiveInteger object
	 * @return - the PositiveInteger
	 */
	public PositiveInteger operator(PositiveInteger other) {
		return new PositiveInteger(positiveInt + other.getPositiveInt());
	}
	
	/* Creates a String representation of the number
	 * @return - the String
	 */
	public String toString() {
		return "" + this.positiveInt;
	}
	
	/**Compares this to the other PositiveInteger using the postiveInt value
	 * @param other - the Other positiveInteger
	 * @return - true for equal, false otherwise
	 */
	public boolean equals(PositiveInteger other) {
		return (this.positiveInt == other.getPositiveInt());
	}
}
