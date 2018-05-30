package edu.ualbany.project4;

import java.util.Collection;

/**
 * Absract Generic class that has an operator, and a combine method 
 * @param <T> the type of object
 */
public abstract class Semigroup<T> {

	/**
	 * Performs an operation on the object and the passed in object
	 * @param - the object passed in
	 * @return - A new object with a value from the operation
	 */
	public abstract T operator(T t);
	
	/**
	 * Combines all of the objects in the collection using the
	 * operator method
	 * @param collection - a collection of objects
	 * @return - one object that contains the result of operator call on every object in the collection
	 */
	public static<T> T combine(Collection<T> collection) {
		//need to initialize object in case collection is empty
		Semigroup<T> object = null;
				
		for(T t: collection) {
			if(object == null) {
				object = (Semigroup<T>) t;
			} else {
				object = (Semigroup<T>) object.operator(t);
			}
		}
		return (T) object;
	}
}
