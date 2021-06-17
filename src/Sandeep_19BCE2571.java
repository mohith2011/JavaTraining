
import java.util.Scanner;

public class Sandeep_19BCE2571 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int march2021[][] = new int[3][2];
		int feb2021[][] = new int[3][2];
		System.out.println(
				"enter the sleep duration and play duration of children of age 5 ,4 and 3 respectivily in for feb 2021");
		for (int[] innerArr : feb2021) {
			for (int i = 0; i < innerArr.length; i++) {
				innerArr[i] = scanner.nextInt();
			}
		}
		System.out.println(
				"enter the sleep duration and play duration of children of age 5 ,4 and 3 respectivily in for march 2021");
		for (int[] innerArr : march2021) {
			for (int i = 0; i < innerArr.length; i++) {
				innerArr[i] = scanner.nextInt();
			}
		}
		int arr[] = new int[3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 1; j++) {
				arr[i] = march2021[i][j] + feb2021[i][j];
			}
		}

		int a = arr[0];
		for (int b : arr) {
			if (b > a) {
				a = b;
			}
		}
		System.out.println(
				" the  better sleep, based on the average sleep of a kid for the\n" + "two months." + (float) a / 2);

	}
}