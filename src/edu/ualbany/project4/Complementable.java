package edu.ualbany.project4;

/**
 * Generic Interface with a method to get the compliment of the object
 * @param <T> - the object
 */
public interface Complementable<T> {

	/**
	 * Gets the compliment of the given object
	 * @return the compliment object
	 */
	T complement();
}
