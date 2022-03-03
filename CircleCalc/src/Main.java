import java.util.Scanner;

public class Main {

	public static void main() {
		ArrayLinearList arrlist = new ArrayLinearList();
		arrlist.add(0, new Integer(1));
		arrlist.add(1, new Integer(1));
		arrlist.add(2, new Integer(1));
		arrlist.add(3, new Integer(1));
		Scanner sc = new Scanner(System.in);
		System.out.println("1. isString\n2. isEmpty\n3. Size\n4. Get\n5. indexOf\n6. Add");
	}
}
