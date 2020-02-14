package Collections;
import java.util.Scanner;


public class ScannerBubbleSort {
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);

		String[] values;

		int temp = 0;

		System.out.println("What are your values? Seperate with commas (no spaces) please!");
		values = read.nextLine().split(",");
		int[] valuesToInt = new int[values.length];  
		System.out.print("Unsorted:");
		System.out.print("[ ");

		for (int i = 0; i < values.length; i++) {
			valuesToInt[i] = Integer.parseInt(values[i]);

			System.out.print(valuesToInt[i] + " ");
		}
		System.out.print("]");
		read.close();
		System.out.println();
		System.out.println("-----");

		int[] sortedValues = valuesToInt;

		for (int i = 0; i < sortedValues.length - 1; i++) {

			if (sortedValues[i] > sortedValues[i + 1]) {
				temp = sortedValues[i];
				sortedValues[i] = sortedValues[i + 1];
				sortedValues[i + 1] = temp;
			}
			for (int j = 0; j < sortedValues.length - 2; j++) {

				if (sortedValues[j] > sortedValues[j + 1]) {
					temp = sortedValues[j];
					sortedValues[j] = sortedValues[j + 1];
					sortedValues[j + 1] = temp;
				}
			}

		}

		System.out.print("Sorted Values: [");

		for (int i = 0; i < sortedValues.length; i++) {
			System.out.print(sortedValues[i] + " ");
		}
		System.out.print("]");

	}

}
