package welcome_message;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {

		System.out.print("Введите ваше имя: ");
		String name = sc.next();
		String years = years();
		System.out.print("Добро пожаловать " + name + "! Рад видеть вас здесь. " + "\r"
		+ years);
		sc.close();
	}

	public static String years() {
		String years = null;
		boolean loop = true;
		do {
			System.out.print("Введите ваш возраст: ");
			try {
				int alt = sc.nextInt();
				if (alt < 1) {
					System.out.print("Возраст должен быть положительным числом. ");
				} else if (alt >= 18) {
					years = "Вам " + alt + " лет. " + "Вы совершеннолетний. "; 
					loop = false;
				}else {
					years = "Вам " + alt + " лет.";
					loop = false;
				}
			} catch (InputMismatchException e) {
				System.out.print("Введите число! ");
				sc.next();
			}
		} while (loop);
		sc.close();
		return years;
	}
}
