import java.util.Scanner;

public class PrimVsObj {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		System.out.println(i);
		String s = input.nextLine();
		System.out.println(s);
		input.close();
	}
}
