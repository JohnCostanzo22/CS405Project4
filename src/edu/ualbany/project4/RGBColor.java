package edu.ualbany.project4;

/** Class that stores red, green, and blue values
 * Implements compliment method and operator method
 */
public class RGBColor extends Semigroup<RGBColor> implements Complementable<RGBColor> {

	private int red;
	private int green;
	private int blue;
	
	/**Constructor that sets values red, green, and blue
	 * all values must be between 0-255 or it defaults to 0
	 * @param red
	 * @param green
	 * @param blue
	 */
	public RGBColor(int red, int green, int blue) {
		if(red >= 0 && red < 256) {
			this.red = red;
		} else {
			//bad value given
			this.red = 0;
		}
		if(blue >= 0 && blue < 256) {
			this.blue = blue;
		} else {
			//bad value given
			this.blue = 0;
		}
		if(green >= 0 && green < 256) {
			this.green = green;
		} else {
			//bad value given
			this.green = 0;
		}
	}

	/** Accessor
	 * @return red
	 */
	public int getRed() {
		return red;
	}

	/** Accessor
	 * @return green
	 */
	public int getGreen() {
		return green;
	}

	/** Accessor
	 * @return blue
	 */
	public int getBlue() {
		return blue;
	}
	
	/* Sums each red, green, and blue value of this and other
	 * and divides by two to get the average value for each
	 * @return RGBColor object containing average values
	 */
	public RGBColor operator(RGBColor other) {
		int tempRed, tempGreen, tempBlue;
		tempRed = (this.red + other.getRed())/2;
		tempGreen = (this.green + other.getGreen())/2;
		tempBlue = (this.blue + other.getBlue())/2;
		return new RGBColor(tempRed, tempGreen, tempBlue);
	}
	
	/* Gets the compliments (255-value) for each red, green, and blue
	 * @return RGBColor object containing the compliment values
	 */
	public RGBColor complement() {
		return new RGBColor(255-red, 255-green, 255-blue);
	}
	
	/* Creates a String representation of the object
	 * @return the String
	 */
	public String toString() {
		return ("red: " + this.red + " green: " + this.green + " blue: " + this.blue);
	}
	
	/** Compares this to the other object by comparing each value
	 * @param other - object to compare to this
	 * @return true if all values are equals, false otherwise
	 */
	public boolean equals(RGBColor other) {
		return (this.red == other.getRed() && this.green == other.getGreen()
				&& this.blue == other.getBlue());
	}
}
