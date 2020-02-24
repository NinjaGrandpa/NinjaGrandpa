import java.util.Scanner;

public class Biljele {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] example = { 1, 1, 2, 2, 2, 8 };
		int[] set = new int[6];
		int[] add = new int[6];

		for (int i = 0; i < set.length; i++) {
			set[i] = input.nextInt();
		}

		for (int i = 0; i < example.length; i++) {

			if (set[i] == example[i]) {
				add[i] = 0;
			}

			else if (set[i] < example[i]) {
				while (add[i] + set[i] < example[i]) {
					add[i]++;
				}
			}

			else if (set[i] > example[i]) {
				while (add[i] + set[i] > example[i]) {
					add[i]--;
				}

			}

		}

		for (int i = 0; i < add.length; i++) {
			System.out.print(add[i] + " ");
		}
	}

}
