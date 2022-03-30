import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayLinearList<Integer> list = new ArrayLinearList<Integer>();

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("1. isString\n2. Size\n3. Add\n4. IndexOf\n5. Delete\n6. Get");
			System.out.println("Та сонголтоо оруулна уу?");
			int songolt = sc.nextInt();
			while (songolt != -1) {
				switch (songolt) {
				case 1:
					list.toString1();
					break;
				case 2:
					System.out.println("Массивын урт: " + list.size());
					break;
				case 3:
					System.out.println("Массивын хэмжээ оруулна уу?");
					int size = sc.nextInt();
					Integer[] newarray = new Integer[size];
					System.out.println("Массивын утга оруулна уу?");
					for (int i = 0; i < newarray.length; i++) {
						newarray[i] = sc.nextInt();
					}
					list.addElement(newarray);
					break;
				case 4:
					System.out.println("Элемент оруулна уу?");
					int searchElement = sc.nextInt();
					int save = list.indexOf(searchElement);
					if (save == -1) {
						System.out.println("Энэ элемэнт массивт алга");
					} else {
						System.out.println(searchElement + " элемэнтийн индекс: " + list.indexOf(searchElement));
					}
					break;
				case 5:
					System.out.println("Устгах элемэнтийн индекс оруулна уу?");
					int deleteIndex = sc.nextInt();
					if (list.get(deleteIndex) == null) {
						System.out.println("Энэ индекст утга алга");
					} else {
						list.remove(deleteIndex);
					}
					break;
				case 6:
					System.out.println("Индеск оруулна уу?");
					int searchIndex = sc.nextInt();
					list.get(searchIndex);
					if (list.get(searchIndex) == null) {
						System.out.println("Уг индескт элемент алга байна");
					} else {
						System.out.println(searchIndex + " индеск дэх элемэнт нь " + list.get(searchIndex));
					}
					break;
				case 7:
					break;
				default:
					System.out.println("Та буруу тоо оруулсан байна");
					break;
				}
				System.out.println("Дахин сонголт оруулна уу?");
				songolt = sc.nextInt();
			}
		} catch (Exception e) {
			System.out.println(" ALDAA !");
		}

	}

}
