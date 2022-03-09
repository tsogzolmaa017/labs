import java.util.Scanner;

public class Main {

	public static void main(String arr[]) {
		ArrayLinearList arrlist = new ArrayLinearList();
		int[] array = new int[10];
		arrlist.add(array, 0);
		arrlist.add(array, 2);
		arrlist.add(array, 7);
		arrlist.add(array, 5);
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("1. isString\n2. Size\n3. Add\n4. IndexOf\n5. Delete\n6. Sum");
			System.out.println("Та сонголтоо оруулна уу?");
			int songolt = sc.nextInt();
			while (songolt != 0) {
				switch (songolt) {
				case 1: {
					if (arrlist.isEmpty() == false) {
						arrlist.toString(array);
					} else {
						System.out.println("Массив хоосон байна");
					}
				}
					break;
				case 2:
					System.out.println("Массивийн урт: " + arrlist.size());
					break;
				case 3:
					System.out.println("Массивт нэмэх утга: ");
					int elements = sc.nextInt();
					arrlist.add(array, elements);
					System.out.println("Амжилттай нэмсэн. Жагсаалт: ");
					arrlist.toString(array);
					break;
				case 4:
					System.out.println("Элемент оруулна уу?");
					int element = sc.nextInt();
					int index = arrlist.indexOf(array, element);
					if(index == -1) 
					{
						System.out.println("Энэ утга массивт алга");
					}else {
					System.out.println("Таны оруулсан элемент нь " + index + " байрлаж байна");}
					break;
				case 5:
					System.out.println("Хэддүгээр элемэнт устгах вэ. Индекс оруулна уу?");
					int deleteIndex = sc.nextInt();
					arrlist.delete(array, deleteIndex);
					System.out.println("Устгалаа. Жагсаалт: ");
					arrlist.toString(array);
					break;
				case 6:
					System.out.println("Элементүүдийн нийлбэр: " + arrlist.sum(array));
					break;
				default:
					System.out.println("Та буруу тоо оруулсан байна");
					break;
				}
				System.out.println("Дахин сонголт оруулна уу?");
				songolt = sc.nextInt();
			}
		}
		catch(Exception e){
			System.out.println("Та тоо оруулна уу!!!");
		}
	}
}
