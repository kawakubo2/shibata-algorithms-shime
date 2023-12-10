package review_kawakubo;

import java.util.Scanner;

public class Ex164_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		GameCharacter character1 = new GameCharacter(a, b, "高橋");
		GameCharacter character2 = new GameCharacter(c, d, "青木");

		String result = "No";

		while (true) {
			character1.attack(character2);
			if (character2.getHealthPower() <= 0) {
				result = "Yes";
				break;
			}

			character2.attack(character1);
			if (character1.getHealthPower() <= 0) {
				result = "No";
				break;
			}
		}
		System.out.println(result);

		sc.close();
	}

}
