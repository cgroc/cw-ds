/**
 * An implementation of the List interface based on Arrays. Written as part
 * of coursework 2 for the 2015 Programming in Java module at Birkbeck.
 *
 * @author Chris Grocott
 */
public class ArrayList implements List {
	private Object[] objArray;
	
	public ArrayList() {
		this.objArray = new Object[5];
	}

	/**
	 * Returns true if the list is empty, false otherwise. 
	 * 
	 * @return true if the list is empty, false otherwise. 
	 */
	public boolean isEmpty() {
		if(this.size() == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * Returns the number of items currently in the list.
	 * 
	 * @return the number of items currently in the list
	 */
	public int size() {
		int objArraySize = this.objArray.length();
		int listSize = 0;
		for(int i=0; i < objArraySize; i++) {
			if(objArray[i] == null) {
				break;
			}
			else {
				listSize++;
			}
		}
		return listSize;
	}

	/**
	 * Returns the elements at the given position. 
	 * 
	 * If the index is negative or greater or equal than the size of
	 * the list, then an appropriate error must be returned.
	 * 
	 * @param index the position in the list of the item to be retrieved
	 * @return the element or an appropriate error message, 
	 *         encapsulated in a ReturnObject
	 */
	public ReturnObject get(int index) {
		ReturnObject getReturn;
		if((index < 0) || (index >= this.size())) {
			getReturn = new ReturnObject(null, ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}
		else {
			getReturn = new ReturnObject(this.objArray[index], ErrorMessage.NO_ERROR);
		}
		return getReturn;
	}

	/**
	 * Returns the elements at the given position and removes it
	 * from the list. The indeces of elements after the removed
	 * element must be updated accordignly.
	 * 
	 * If the index is negative or greater or equal than the size of
	 * the list, then an appropriate error must be returned.
	 * 
	 * @param index the position in the list of the item to be retrieved
	 * @return the element or an appropriate error message, 
	 *         encapsulated in a ReturnObject
	 */
	public ReturnObject remove(int index);

	/**
	 * Adds an element to the list, inserting it at the given
	 * position. The indeces of elements at and after that position
	 * must be updated accordignly.
	 * 
	 * If the index is negative or greater or equal than the size of
	 * the list, then an appropriate error must be returned.
	 * 
	 * If a null object is provided to insert in the list, the
	 * request must be ignored and an appropriate error must be
	 * returned.
	 * 
	 * @param index the position at which the item should be inserted in
	 *              the list
	 * @param item the value to insert into the list
	 * @return an ReturnObject, empty if the operation is successful
	 *         the item added or containing an appropriate error message
	 */
	public ReturnObject add(int index, Object item);

	/**
	 * Adds an element at the end of the list.
	 * 
	 * If a null object is provided to insert in the list, the
	 * request must be ignored and an appropriate error must be
	 * returned.
	 * 
	 * @param item the value to insert into the list
	 * @return an ReturnObject, empty if the operation is successful
	 *         the item added or containing an appropriate error message
	 */
	public ReturnObject add(Object item);
}
