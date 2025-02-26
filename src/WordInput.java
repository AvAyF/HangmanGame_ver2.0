import java.util.Scanner;

public class WordInput {
    private static final Scanner scanner = new Scanner(System.in); // Один Scanner для всего класса

    public static String inputWord() {
        String word;

        while (true) {
            System.out.println("Введите слово для игры (только буквы):");
            word = scanner.nextLine().trim();

            // Проверка на наличие только букв (русские и английские)
            if (word.matches("[a-zA-Zа-яА-ЯёЁ]+")) {
                return word.toUpperCase(); // Приводим к верхнему регистру для единообразия
            } else {
                System.out.println("Неверный ввод. Пожалуйста, введите только буквы.");
            }
        }
    }

    public static String inputLetter(String guessedLetters, boolean isRussian) {
        String letter;
        String regex = isRussian ? "[А-ЯЁ]" : "[A-Z]"; // Проверяем язык

        while (true) {
            System.out.println("Введите букву:");
            letter = scanner.nextLine().trim().toUpperCase();

            // Проверка на одиночный символ, его отсутствие в уже угаданных буквах и соответствие алфавиту
            if (letter.matches(regex) && !guessedLetters.contains(letter)) {
                return letter;
            } else {
                System.out.println("Неверный ввод. Введите ОДНУ букву, которую вы еще не вводили.");
            }
        }
    }

    public static void closeScanner() {
        scanner.close();
    }
}
