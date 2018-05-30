package edu.ualbany.project4;

import java.util.BitSet;

/**
 *  Class that contains a bitSet with a length and implements compliment from Complementable
 */
public class BinaryWord implements Complementable<BinaryWord> {

	private BitSet bitSet;		//the set of bits
	private int length;			//the length of the bits
	
	/**Constructor that takes a String of just "1"s and "0"s and 
	 * creates a bitSet out of it
	 * @param bitString - the String to turn into a bitSet
	 * ex bitString "001100"
	 */
	public BinaryWord(String bitString) {
		bitSet = new BitSet(bitString.length());
		length = bitString.length();
		//set the bitSet
		for(int i = 0; i < length; i++) {
			//only set if it == 1. this prevents bad strings
			//because a bad String will = 00000
			if(bitString.charAt(i) == '1')
				bitSet.set(i);
		}
	}
	
	/**Accessor
	 * @return the bitSet
	 */
	public BitSet getBitSet() {
		return bitSet;
	}
	
	/** Accessor
	 * @return the length
	 */
	public int getLength() {
		return length;
	}
	
	/* Creates a compliment of the bitString
	 * ex - "0011" would return "1100"
	 * @return the compliment of bitSet
	 */
	@Override
	public BinaryWord complement() {
		StringBuffer compliment = new StringBuffer();
		//flip all the bits
		for(int i = 0; i < length; i++) {
			if(bitSet.get(i)) {
				compliment.append("0");
			} else {
				compliment.append("1");
			}
		}
		//return as a new BinaryWord
		return new BinaryWord(compliment.toString());
	}
	
	/* Returns a String representation of the bitSet
	 * @return - the String
	 */
	public String toString() {
		StringBuffer string = new StringBuffer();
		for(int i = 0; i < length; i++) {
			if(bitSet.get(i)) {
				string.append("1");
			} else {
				string.append("0");
			}
		}
		return string.toString();
	}
	
	/**Determines if the given BinaryWord is equal to this by comparing bitSet
	 * @param other - the BinaryWord to compare
	 * @return - true for equal and false for not equal
	 */
	public boolean equals(BinaryWord other) {
		return bitSet.equals(other.getBitSet());
	}
}
