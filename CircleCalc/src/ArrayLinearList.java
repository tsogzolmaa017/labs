public class ArrayLinearList<G> {

	public int size = 0;
	protected G[] elementData;

	public int size() {
		return size;
	}

	public void addElement(G[] ob) {
		this.elementData = ob;
		size = size + 1;
	}

	public void toString1() {
		if (size != 0) {
			for (int i = 0; i < elementData.length; i++) {
				System.out.println(i + ". " + elementData[i]);
			}
		}
		else {
			System.out.println("Массив хоосон байна");
		}
	}

	public int indexOf(int element) {
		for (int i = 0; i < elementData.length; i++) {
			if ((int) elementData[i] == element) {
				return i;
			}
		}
		return -1;
	}

	public G get(int indexE) {
		G result = null;
		for (int i = 0; i < elementData.length; i++) {
			if (elementData[indexE].equals(elementData[i])) {
				result = elementData[indexE];
			}
		}
		return result;
	}
	
	public void remove(int index) {
		if (get(index) != null) {
			for (int i = index + 1; i < elementData.length ; i++)
				elementData[i - 1] = elementData[i];
			//size = size - 1;
			elementData[--size] = null; // enable garbage collection
			System.out.println("Амжилттай устгалаа !");
		}
	}
}
