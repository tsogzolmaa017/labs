
public class ArrayLinearList {

	public Object[] elements;
	public int size;

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size();
	}

	public void checkIndex(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("index: " + index + "size: " + size);
		}
	}

	public Object get(int index) {
		if (isEmpty() == false) {
			checkIndex(index);
			return elements[index];
		}
		return -1;
	}

	public int indexOf(Object theElement) {
		for (int i = 0; i < size; i++) {
			if (elements[i].equals(theElement)) {
				return i;
			}
		}
		return -1;
	}

	public void add(int index, Object theElement) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("index " + index + "size" + size);
		}
		if (size == elements.length) {
			size = size++;
			for (int i = size - 1; i >= index; i--) {
				elements[index] = theElement;
				size++;
			}
		}
	}

	public String toString() {
		StringBuffer str = new StringBuffer("[");
		for (int i = 0; i < size; i++) {
			if(elements[i] == null) {
				str.append("null, ");
			}
			else {
				str.append(elements[i].toString());
			}
		}
		if(size > 0) {
			str.delete(str.length()-2, str.length());
		}
		str.append("]");
		return new String(str);
	}
}