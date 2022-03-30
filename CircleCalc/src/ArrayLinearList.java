public class ArrayLinearList<G> {

	public int size = 0;
	protected G[] elementData;

	public int size() {
		return size;
	}

	public void addElement(G[] ob) {
		this.elementData = ob;
		size = elementData.length;

	}

	public void toString1() {
		if (size != 0) {
			for (int i = 0; i < size; i++) {
				System.out.println(i + ". " + elementData[i]);
			}
		} else {
			System.out.println("Массив хоосон байна");
		}
	}

	public int indexOf(int element) {
		for (int i = 0; i < size; i++) {
			if ((int) elementData[i] == element) {
				return i;
			}
		}
		return -1;
	}
	public G get(int indexE) {
		G result = null;
		if (indexE > -1 && indexE < size) {
			for (int i = 0; i < elementData.length; i++) {
				if (elementData[indexE].equals(elementData[i])) {
					result = elementData[indexE];
				}
			}
		}
		else
		{
			return result;
		}
		return result;
	}

	public void remove(int index) {
		elementData[index] = null;
		for (int i = index; i < size - 1; i++) {
			elementData[i] = elementData[i + 1];
		}
		size = size - 1;
		System.out.println("Амжилттай");
	}
}
