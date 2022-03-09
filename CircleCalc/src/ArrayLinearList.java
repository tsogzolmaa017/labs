
public class ArrayLinearList {
	//array - ийн хэмжээг оноох
	public int size;
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		if(size()== 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public int getElement(int[] arr, int index) {
		int element;
		element = arr[index];
		return element;
	}
	public int indexOf(int[] arr, int elements) {
		for(int i = 0; i < size; i++) {
			if(arr[i] == elements) {
				return i;
			}
		}
		return -1;
	}
	public void add(int arr[], int index) {
		arr[size()] = index;
		size = size + 1;
	}
	public void toString(int arr[]) {
		System.out.println("Массивт байгаа утга: ");
		for(int i = 0; i < this.size(); i++) {
			System.out.println("Индекс: "+i+ " Элемэнт: " + this.getElement(arr, i ) + " ");
		}
	}
	public void delete(int arr[], int index) {
		for(int i = index; i<size; i++) {
			arr[i] = arr[i - 1];
		}
		size = size - 1;
	}
	public int sum(int arr[]) {
		int sum = 0;
		for(int i = 0; i < this.size(); i++) {
			sum = sum + this.getElement(arr, i);
		}
		return sum;
	}
}