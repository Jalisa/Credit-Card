import java.util.Scanner;

public class CardValidation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Credit Card number: ");
		int cardNumber = input.nextInt();
		int sum = getSum(getIntArray(cardNumber));
		if (sum % 10 == 0) {
			System.out.println("Card is valid");
		} else {
			System.out.println("Card is invalid");
		}
	}

	protected static int checkSingleDigit(int i) {
		int num = i * 2;
		if (i >= 10) {
			num = (num - 10) + 1;
		}
		return i;
	}

	private static int[] getIntArray(int i) {
		String newInt = Integer.toString(i);
		int newList[] = new int[newInt.length()];
		for (int n = 0; n < newInt.length(); n++) {
			newList[n] = Character.digit(newInt.charAt(n), 0);
		}
		return newList;
	}

	private static int getSum(int[] numList) {
		int start = numList.length;
		for (int i = (numList.length - 1); i > 0; i--) {
			if ((start - i) % 2 == 0) {
				numList[i] = checkSingleDigit(i);
			}
		}
		int sum = 0;
		for (int i = 0; i < numList.length; i++) {
			sum += numList[i];
		}
		return sum;
	}
}